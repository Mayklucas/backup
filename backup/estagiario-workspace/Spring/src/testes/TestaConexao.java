package testes;

import conexaoHiber.HibernateUtil;

public class TestaConexao {

	public static void main(String[] args) {
			 HibernateUtil.getSessionFactory();
			 HibernateUtil.getSessionFactory().close();

	}

}
