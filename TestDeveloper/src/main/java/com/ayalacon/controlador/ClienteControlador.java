package com.ayalacon.controlador;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.ayalacon.servicio.ClienteServicio;
import com.ayalacon.modelo.Cliente;

@ManagedBean(name = "clienteControlador")
@RequestScoped
public class ClienteControlador {
	
	public String nuevo() {
		Cliente c= new Cliente();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cliente", c);
		return  "/faces/nuevo.xhtml";
	}
	
	public String guardar (Cliente cliente) {
		
		ClienteServicio clienteServicio= new ClienteServicio();
		clienteServicio.guardar(cliente);
		return  "/faces/index.xhtml";
	}

	public List<Cliente> obtenerClientes() {
		ClienteServicio clienteServicio = new ClienteServicio();
		return clienteServicio.obtenerClientes();
	}

	public String editar(Long id) {
		ClienteServicio clienteServicio = new ClienteServicio();
		Cliente c = new Cliente();
		c = clienteServicio.buscar(id);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cliente", c);
		return "/faces/editar.xhtml";
	}

	public String actualizar(Cliente cliente) {
	
		ClienteServicio clienteServicio = new ClienteServicio();
		clienteServicio.editar(cliente);
		return "/faces/index.xhtml";
	}

	public String eliminar(Long id) {
		ClienteServicio clienteServicio = new ClienteServicio();
		clienteServicio.eliminar(id);
		System.out.println("Cliente eliminado..");
		return "/faces/index.xhtml";
	}

}
