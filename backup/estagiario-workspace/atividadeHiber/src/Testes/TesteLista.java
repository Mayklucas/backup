package Testes;

import java.util.List;

import controle.ProdutoDAO;
import model.Produto;

public class TesteLista {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO(); 
		List<Produto> produtos = dao.listar();

		for(Produto produto: produtos) {
			System.out.println(produto);
		} 

	}

}
