package servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controle.ProdutoDAO;
import model.Produto;

public class RemoveProdutos implements Logica{
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		 long id = Long.parseLong(request.getParameter("id"));
		     Produto produto = new Produto();
		     produto.setId(id);
		     
		     
		  ProdutoDAO dao = new ProdutoDAO();
		  dao.remover(produto);
		
		 
		 System.out.println("Excluindo contato... ");
		 return "controle?logica=ListarProduto";
	}

}
