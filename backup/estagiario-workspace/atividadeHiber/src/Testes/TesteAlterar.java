package Testes;

import controle.ProdutoDAO;
import model.Produto;

public class TesteAlterar {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto p = new Produto();
		p.setId(10L);
		p.setNome("CARLA");
		p.setValor(20);
		p.setDescricao("linda");
		p.setCategoria("people");
		dao.alterar(p);
	}

}
