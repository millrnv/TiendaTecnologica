package modelo;

import java.util.ArrayList;
import modelo.Clientes;
import modelo.Dispositivo;

public class TiendaTecnologica {
	private String direccion;
	private ArrayList<Clientes> clientes = new ArrayList<Clientes>();
	private ArrayList<Dispositivo> dispositivo = new ArrayList<Dispositivo>();

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

	public boolean agregarCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public boolean clienteExiste(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarDispositivo(Dispositivo dispositivo) {
		throw new UnsupportedOperationException();
	}

	public boolean dispositivoExiste(Dispositivo dispositivo) {
		throw new UnsupportedOperationException();
	}

	public void realizarVenta() {
		throw new UnsupportedOperationException();
	}
}