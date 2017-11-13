package controle;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import conexao.HibernateUtil;
import model.Produto;

public class ProdutoDAO {
	public void inserirProduto (Produto produto) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		try {
			sessao.save(produto);
		} catch(RuntimeException e) {
			
		}finally {
			sessao.close();
		}

	}

	@SuppressWarnings("unchecked")
	public List<Produto> listar(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Produto> produtos = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Produto.listar");
			produtos = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return produtos;

	}

	public Produto buscarProduto(Long id){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Produto produto = null;

		try {
			Query consulta = sessao.getNamedQuery("Produto.buscarProduto");
			consulta.setLong("id", id);

			produto =  (Produto) consulta.uniqueResult(); 



		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return produto;

	}

	public void remover(Produto produto) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;


		try {
			transacao = sessao.beginTransaction();
			sessao.delete(produto);
			transacao.commit();

		} catch(RuntimeException e) {
			if(transacao != null){
				transacao.rollback();
			}

		}finally {

			sessao.close();
		}

	}

		
	public void alterar(Produto produto) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;


		try {
			
			transacao = sessao.beginTransaction();
			sessao.update(produto);
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
