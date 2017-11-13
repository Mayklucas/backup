package servlet;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controle.ProdutoDAO;
import model.Produto;

public class ListarProduto  implements Logica{
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception {


		ProdutoDAO dao = new ProdutoDAO();

		List<Produto> produtos = dao.listar();

		request.setAttribute("produtos", produtos);

		return "listarProduto.jsp";

	}
}
