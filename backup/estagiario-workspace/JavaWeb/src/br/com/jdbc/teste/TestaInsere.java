package br.com.jdbc.teste;

import java.util.Calendar;

import Dao.ContatoDao;
import br.co.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		//preparando para gravar
		   Contato contato =  new Contato();
		   contato.setNome("mayk");
		   contato.setEmail("mayklucas@gmail.com");
		   contato.setEndereco("rua 12");
		   contato.setDataNascimento(Calendar.getInstance());
		   
		   //garavando nessa conexão
		   ContatoDao dao = new ContatoDao();
		   dao.adiciona(contato);
		   
		   System.out.println("Gravando!");

	}

}
