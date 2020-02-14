package com.example.demo.dao;

import java.util.List;


import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;


@Repository
public class UserDaoImp implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	Transaction t;

	public List<User> getUser() {
        // TODO Auto-generated method stub
		List<User> users;
		Session session = sessionFactory.getCurrentSession();
		String queryString = "From User";
		Query<User> query = session.createQuery(queryString);
		users = query.list();
		return users;
    }
	
	public void addUser(User user){
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
	
		String queryString = "insert into User(id, age, name) values(5,2,'Subha')";
		Query query = session.createQuery(queryString);
		/*query.setParameter("id", user.getId());
		
		query.setParameter("age",user.getAge());
		query.setParameter("name",user.getName());
		session.createQuery(queryString);*/
		int i= query.executeUpdate();
		if(i>0)
			System.out.println("Inserted Successfully");
		else {
			System.out.println("Failed");
		}
		session.close();
	}
	
	}