package br.com.caelum.tarefas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import logica.Usuario;
import modeloDAO.UsuarioDAO;
@Controller
public class LoginController {
    
	@RequestMapping("loginFormulario")
	public String loginFormulario() {
		return "formulario-login";
	}
	
	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		if(new UsuarioDAO().existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "menu";
		}
			return "redirect:loginFormulario";
	}
	
	@RequestMapping("logout")
	 public String logout(HttpSession session) {
	   session.invalidate();
	   return "redirect:LoginFormulario";
	 }
}
