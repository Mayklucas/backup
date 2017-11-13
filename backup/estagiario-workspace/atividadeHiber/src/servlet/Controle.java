package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controle")
public class Controle extends HttpServlet{
	protected void service(HttpServletRequest request,
			HttpServletResponse response ) throws ServletException, IOException{


		String parametro = request.getParameter("logica");
		String nomeDaClasse = "servlet." + parametro;

		try {
			Class classe = Class.forName(nomeDaClasse);
			Logica logica = (Logica) classe.newInstance();

			String pagina = logica.executa(request, response);

			request.getRequestDispatcher(pagina).forward(request, response);
		} catch (Exception e) {
			 throw new ServletException(e);

		}
	}
}