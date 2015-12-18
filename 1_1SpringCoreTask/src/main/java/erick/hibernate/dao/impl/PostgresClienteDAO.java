package erick.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;


import erick.hiberante.dao.ClienteDAO;
import erick.hibernate.persona.Taller;
import erick.hibernate.util.HibernateUtil;;



@Repository
public class PostgresClienteDAO implements ClienteDAO {

	@Override
	public void Ingresar(Taller taller) {
		Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(taller);
        session.getTransaction().commit();
        session.close();
		
	}

	

	

}
