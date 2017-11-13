package conexaoHiber;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		 try {
			 Configuration configuration = new Configuration();
			 configuration.configure();
			 
			 ServiceRegistry reg = new StandardServiceRegistryBuilder()
					 .applySettings(configuration.getProperties()).build();
			 
			 SessionFactory fabricaDeSessao = configuration.buildSessionFactory(reg);
			 return  fabricaDeSessao;
	        }
	        catch (Throwable ex) {
	  
	            System.err.println(" erro na cria��o da SessionFactory " + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
		
	}
	
	public static SessionFactory  getSessionFactory() {
		return sessionFactory;
	}
}
