package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Byjus;

public class DataAccessObject {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insert(Byjus byjus)
	{
		entityTransaction.begin();
		entityManager.persist(byjus);
		entityTransaction.commit();
		
		System.out.println("Data inserted successfully");
	}
	
	public void update() {
		Byjus byjus=entityManager.find(Byjus.class,1);
		byjus.setAddress("mangaluru");
		byjus.setName("siddd");
		
		entityTransaction.begin();
		entityManager.merge(byjus);
		entityTransaction.commit();
		
		System.out.println("updated");
		}
	
	public void fetch(int id) {
		Byjus byjus=entityManager.find(Byjus.class,id);//2
		Query query=entityManager.createQuery( "select bs from Byjus bs");
		List<Byjus> lbs=query.getResultList();
		for(Byjus bs:lbs) {
 System.out.println("id:"+bs.getId()+" "+"name:"+bs.getName()+" "+"Address:"+bs.getAddress());
		}
			

		}
	public void delete(int id){
		Byjus byjus=entityManager.find(Byjus.class,id);
		entityTransaction.begin();
		entityManager.remove(byjus);
		entityTransaction.commit();
		
		System.out.println("Data is deleted");
	}
	
	
	
	

}
