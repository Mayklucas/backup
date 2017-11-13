package br.com.caelum.tarefas.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import logica.Tarefas;
import modeloDAO.TarefasDAO;

@Controller
public class TarefasController {
	private TarefasDAO dao;
	@Autowired
	public TarefasController(TarefasDAO dao) {
		this.dao = dao;
	}
	@RequestMapping("/novaTarefa")
	public String form() {
		return "tarefa/formulario";
	}

	@RequestMapping("adicionaTarefas")
	public String adicionar(@Valid Tarefas tarefas, BindingResult result) {
		if(result.hasFieldErrors("descricao")) {
			return "tarefa/formulario";
		}
		dao.adicionar(tarefas);
		return "tarefa/adicionada";
	}	

	@RequestMapping("listaTarefas")
	public String lista(Model modelo) {
		modelo.addAttribute("tarefas", dao.listar());
		List<Tarefas> tarefas = dao.listar();
		for(Tarefas tarefas2 : tarefas) {
			System.out.println(tarefas2.getDataFormatada());
		}
		return "tarefa/lista";

	}

	@RequestMapping("removeTarefa")
	public String remove(Tarefas tarefas) {
		dao.remover(tarefas);
		return "redirect:listaTarefas";
	}

	@RequestMapping("mostraTarefa")
	public String mostra(Long id, Model model) {
		model.addAttribute("tarefas", dao.buscarProduto(id));
		return "tarefa/mostra";
	}

	@RequestMapping("alteraTarefa")
	public String altera(Tarefas tarefas) {
		dao.alterar(tarefas);
		return "redirect:listaTarefas";
	}
	
	@RequestMapping("finalizaTarefa")
	public void finaliza(Long id, HttpServletResponse response) throws IOException{
        Tarefas tarefas = dao.buscarProduto(id);
        tarefas.setFinalizado(true); 
        String data = Calendar.getInstance().getTime().toString();
        tarefas.setDataFormatada(data);
        dao.alterar(tarefas);
        response.getWriter().write(tarefas.getDataFormatada());
        response.setStatus(225);
    }
	
}	

	