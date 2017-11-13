package Testes;

import conexao.HibernateUtil;

public class TestaConec {
	public static void main(String[] args) {
		 HibernateUtil.getSessionFactory();
		 HibernateUtil.getSessionFactory().close();
	}
}
