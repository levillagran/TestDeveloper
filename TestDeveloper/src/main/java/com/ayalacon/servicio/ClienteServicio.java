package com.ayalacon.servicio;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ayalacon.modelo.Cliente;
import com.ayalacon.util.HibernateUtil;

public class ClienteServicio {

	// guardar cliente
	public void guardar(Cliente cliente) {
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();

		try {
			session.save(cliente);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.closeSession(session);
		}
	}

	// editar cliente
	public void editar(Cliente cliente) {

		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();

		try {
			session.update(cliente);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.closeSession(session);
		}
	}

	// buscar cliente
	public Cliente buscar(Long id) {
		Cliente cliente = new Cliente();
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();

		try {
			cliente = (Cliente) session.get(Cliente.class, id);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.closeSession(session);
		}
		return cliente;
	}

	/// eliminar cliente
	public void eliminar(Long id) {
		Cliente cliente = new Cliente();
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();

		try {
			cliente = (Cliente) session.get(Cliente.class, id);
			session.delete(cliente);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.closeSession(session);
		}
	}

	// obtener todos los cliente
	@SuppressWarnings("unchecked")
	public List<Cliente> obtenerClientes() {
		List<Cliente> listaClientes = new ArrayList<>();
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();

		try {
			listaClientes = session.createQuery("Select * FROM cli_clients").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.closeSession(session);
		}
		return listaClientes;
	}

}
