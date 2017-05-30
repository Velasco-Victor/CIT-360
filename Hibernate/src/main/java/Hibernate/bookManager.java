package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class bookManager {

	protected SessionFactory sessionFactory;

	protected void setup(){
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() 
				.build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		}
		catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	protected void exit() {
		sessionFactory.close();
	}

	protected void create(){
		Book book = new Book();
		book.setTitle("From the Earth to the Moon");
		book.setAuthor("Jules Verne");
		book.setPrice(32.59f);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(book);
		
		session.getTransaction().commit();
		session.close();
	}
	
	protected void read(){
		Session session = sessionFactory.openSession();
		long bookId = 3;
		Book book = session.get(Book.class, bookId);
		
		if(book != null){
			System.out.println("Title: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("Price: " + book.getPrice());
		}else {
			System.out.println("Book could not be found");
		}
	 
		session.close();
	}
	protected void update(){
		Book book = new Book();
		book.setId(2);
		book.setTitle("Around the World in 80 Days");
		book.setAuthor("Jules Verne");
		book.setPrice(20.99f);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.update(book);
		
		session.getTransaction().commit();
		session.close();
	}
	
	protected void delete(){
		Book book = new Book();
		book.setId(4);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.delete(book);
		
		session.getTransaction().commit();
		session.close();
	}
	
	
	public static void main(String[] args) {
		bookManager manager = new bookManager();
		manager.setup();
		
		manager.delete();
		
		manager.exit();
	}

}
