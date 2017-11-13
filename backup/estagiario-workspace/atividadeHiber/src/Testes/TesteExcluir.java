package Testes;

import controle.ProdutoDAO;
import model.Produto;

public class TesteExcluir {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		Produto p1 = dao.buscarProduto(8L);
		dao.remover(p1);
	}

}
