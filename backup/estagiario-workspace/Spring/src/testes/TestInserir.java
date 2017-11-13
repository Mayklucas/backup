package testes;

import logica.Tarefas;
import modeloDAO.TarefasDAO;

public class TestInserir {
	public static void main(String[] args) {
		   Tarefas tarefa = new Tarefas();
		   tarefa.setDescricao("Castanho");
		   tarefa.setDataFinalizacao(null);
		   tarefa.setFinalizado(false);
		   
		   
		   TarefasDAO dao = new TarefasDAO();
		   dao.adicionar(tarefa);
		   
		}
}
