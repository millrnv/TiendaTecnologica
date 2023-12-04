package modelo;

import java.util.ArrayList;
import modelo.Clientes;
import modelo.Dispositivo;

public class TiendaTecnologica {
	private String direccion;
	private ArrayList<Clientes> clientes = new ArrayList<Clientes>();
	private ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();

	public TiendaTecnologica(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Clientes> getClientes() {
		return clientes;
	}

	public ArrayList<Dispositivo> getDispositivos() {
		return dispositivos;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void catalogo() {
		throw new UnsupportedOperationException();
	}

	public void buscarDispositivoPorMarca(String marca) {
		throw new UnsupportedOperationException();
	}

	public void buscarDispositivoPorModelo(String modelo) {
		throw new UnsupportedOperationException();
	}

	public void buscarDispositivoPorTipo(String tipo) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarCliente(Clientes cliente) {
		if(!clienteExiste(cliente)){
			clientes.add(cliente);
			return true;
		}
		return false;
	}

	public boolean clienteExiste(Clientes cliente) {
		for(Clientes c : clientes){
			if(cliente.getRut().equals(c.getRut())){
				return true;
			}

		}
		return false;
	}

	public boolean agregarDispositivo(Dispositivo dispositivo) {
		if(!dispositivoExiste(dispositivo)){
			dispositivos.add(dispositivo);
			return true;
		}
		return false;
	}

	public boolean dispositivoExiste(Dispositivo dispositivo) {
		for(Dispositivo d : dispositivos){
			if(dispositivo.getId().equals(d.getId())){
				return true;
			}

		}
		return false;
	}

	public void realizarVenta() {
		throw new UnsupportedOperationException();
	}
}