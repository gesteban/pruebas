package es.unizar.puto;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HibernateMain {

	public static void main(String[] args) {
		System.out.println("asdfa");
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("asdfa2");
		session.getTransaction().begin();

		Query query = session.createQuery("from newxml where id = :id");
		query.setParameter("id", 1);

		List<?> list = query.list();

		newxml licitacion = (newxml) list.get(0);

		System.out.println(licitacion.toString());

		// Licitacion user2 = new Licitacion();
		// user2.setUserName("Ankita");
		// user2.setUserMessage("Hello world from ankita");

		// ss.beginTransaction();
		// saving objects to session
		// ss.save(user2);
		// ss.getTransaction().commit();
		// ss.close();

	}
}
