package es.unizar.puto;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import es.unizar.objetos.Campeon;
import es.unizar.objetos.Puntuacion;
import es.unizar.objetos.Tipo;

public class HibernateMain {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		
		
		Query query = session.createQuery("from Campeon where id = :id");
		query.setParameter("id", 1);
		List<?> list = query.list();
		Campeon champi = (Campeon) list.get(0);
		System.out.println(champi.toString());
		
		
		
//		champi.getTipo().setNombre("rango22");
//		session.save(champi);
//		session.getTransaction().commit();
		
		
		
		session.disconnect();
		session.close();
		
		

	}
}
