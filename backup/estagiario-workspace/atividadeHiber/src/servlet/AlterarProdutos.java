package servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controle.ProdutoDAO;
import model.Produto;

public class AlterarProdutos implements Logica{
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Produto produto = new Produto();
		produto.setId(Long.parseLong(request.getParameter("id")));
		produto.setNome(request.getParameter("nome"));
		produto.setDescricao(request.getParameter("descricao"));
		produto.setCategoria(request.getParameter("categoria"));
		produto.setValor(Double.parseDouble(request.getParameter("valor")));
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.alterar(produto);
		return "controle?logica=ListarProduto";
	}
}
