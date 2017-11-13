package Testes;

import controle.ProdutoDAO;
import model.Produto;

public class TesteBuscar {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO(); 

		Produto p = dao.buscarProduto(2L);
		System.out.println(p);

	}

}
