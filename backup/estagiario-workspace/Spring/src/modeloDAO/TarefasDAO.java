package modeloDAO;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import conexaoHiber.HibernateUtil;
import logica.Tarefas;

@Repository
public class TarefasDAO {
	public void adicionar (Tarefas tarefas) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(tarefas);
			transacao.commit();
		} catch(RuntimeException e) {
			if(transacao != null) {
				transacao.rollback();
			}
		}finally {
			sessao.close();
		}

	}

	@SuppressWarnings("unchecked")
	public List<Tarefas> listar(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Tarefas> tarefa = null;

		try {

			Query consulta = sessao.getNamedQuery("Tarefas.listar");
			tarefa = consulta.list();

		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return tarefa;

	}

	public Tarefas buscarProduto(Long id){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Tarefas tarefa = null;

		try {
			Query consulta = sessao.getNamedQuery("Tarefas.buscarProduto");
			consulta.setLong("id", id);

			tarefa = (Tarefas) consulta.uniqueResult(); 



		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return tarefa;

	}

	public void remover(Tarefas tarefas) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;


		try {
			transacao = sessao.beginTransaction();
			sessao.delete(tarefas);
			transacao.commit();

		} catch(RuntimeException e) {
			if(transacao != null){
				transacao.rollback();
			}

		}finally {

			sessao.close();
		}

	}

	public void alterar(Tarefas tarefas) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;


		try {

			transacao = sessao.beginTransaction();
			sessao.update(tarefas);
			transacao.commit();

		} catch(RuntimeException e) {
			if(transacao != null){
				transacao.rollback();
			}

		}finally {

			sessao.close();
		}

	}

}
