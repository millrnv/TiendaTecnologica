package modelo;

import java.util.ArrayList;
import modelo.Compra;

public class Clientes {
	private String nombre;
	private String apellido;
	private String correo;
	private String nContacto;
	private String estadoCivil;
	private String ciudad;
	private TiendaTecnologica tiendaTecnologica;
	private ArrayList<Compra> compras = new ArrayList<Compra>();

	public void registrarse() {
		throw new UnsupportedOperationException();
	}

	public void crearCuenta() {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNContacto() {
		return this.nContacto;
	}

	public void setNContacto(String nContacto) {
		this.nContacto = nContacto;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}