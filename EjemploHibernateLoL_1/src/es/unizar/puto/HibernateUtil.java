package es.unizar.puto;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author nb
 */
public class HibernateUtil {
	private static HibernateUtil instance = null;
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
 
	private HibernateUtil() {
	}
	
	static {
		try {
			Configuration configuration = new Configuration().configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (HibernateException he) {
			System.err.println("Erro ao criar a conexao com o base de dados: " + he);
			throw new ExceptionInInitializerError(he);
		}
	}
 
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public Session getSession(){
		return getSessionFactory().openSession();
	}
 
	
	public static HibernateUtil getInstance(){
        if(instance == null){
            instance = new HibernateUtil();
        }
        return instance;
    }
}
