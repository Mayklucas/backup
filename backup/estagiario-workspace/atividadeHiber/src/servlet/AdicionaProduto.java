 package servlet;

import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controle.ProdutoDAO;
import model.Produto;

@WebServlet("/adicionaContato")
public class AdicionaProduto implements Logica{
	
		@Override
		public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			String nome = request.getParameter("nome");
			String descricao = request.getParameter("descricao");
			String categoria = request.getParameter("categoria");
			String valor = request.getParameter("valor");
			
			Produto produto = new Produto();
			produto.setNome(nome);
			produto.setDescricao(descricao);
			produto.setCategoria(categoria);
			produto.setValor(Double.parseDouble(valor));
			
			ProdutoDAO dao = new ProdutoDAO();
			dao.inserirProduto(produto);
			
			return "controle?logica=ListarProduto";
	}

}
