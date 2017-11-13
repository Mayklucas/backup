package modeloDAO;

import org.hibernate.Query;
import org.hibernate.Session;
import conexaoHiber.HibernateUtil;
import logica.Usuario;


public class UsuarioDAO {
	public boolean existeUsuario(Usuario usuario){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
        Usuario usuario2 = null;

		try {
			Query consulta = sessao.getNamedQuery("Usuario.existeUsuario");
			consulta.setString("login", usuario.getLogin());
			consulta.setString("senha", usuario.getSenha());
            usuario2 = (Usuario) consulta.uniqueResult(); 

		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();
		}
		if(usuario2 != null) {
			return true;
		}else {
			return false;
		}

	}

}
