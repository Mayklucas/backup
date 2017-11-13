package projetoFinal;

import br.com.bibliotecaConexao.HibernateUtil;

public class TestaHibernate {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}

}
