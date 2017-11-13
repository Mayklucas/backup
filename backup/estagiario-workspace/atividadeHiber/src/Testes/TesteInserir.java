package Testes;

import controle.ProdutoDAO;
import model.Produto;

public class TesteInserir {

	public static void main(String[] args) {
	   Produto produto = new Produto();
	   produto.setCategoria("Laticínios");
	   produto.setDescricao("Preto");
	   produto.setNome("Feijão");
	   produto.setValor(10.00);
	   
	   
	   ProdutoDAO dao = new ProdutoDAO();
	   dao.inserirProduto(produto);
	   
	}

}
