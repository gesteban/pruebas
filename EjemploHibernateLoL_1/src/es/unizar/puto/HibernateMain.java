package es.unizar.puto;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.hibernate.Query;
import org.hibernate.Session;

import es.unizar.objetos.Campeon;
import es.unizar.objetos.Vprueba;


public class HibernateMain {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		//session.getTransaction().begin();
		
		
		
		Query query = session.createQuery("from Campeon where id = :id");
		query.setParameter("id", 1);
		List<?> list = query.list();
		Campeon champi = (Campeon) list.get(0);
		System.out.println(champi.toString());
		
		
	    Query query2 = session.createQuery("from Vprueba where nombre = :nombre");
		query2.setParameter("nombre", "velkoz");
		List<?> list2 = query2.list();
		Vprueba vprueba = (Vprueba) list2.get(0);
		System.out.println(vprueba.toString());
		
		
		Query query3 = session.getNamedQuery("metodoX");
		List<?> list3 = query3.list();
		System.out.println(list3.toString());
		
		Query query4 = session.getNamedQuery("metodoY");
		query4.setParameter("puntuacion", 9);
		List<?> list4 = query4.list();
		System.out.println(list4.toString());
		
		
		session.disconnect();
		session.close();
		
		HibernateUtil.getSessionFactory().close();

	}
}
