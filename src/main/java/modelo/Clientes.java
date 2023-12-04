package modelo;

import java.util.ArrayList;
import modelo.Compra;

public class Clientes {
	private String nombre;
	private String rut;
	private String apellido;
	private String correo;
	private String nContacto;
	private String estadoCivil;
	private String ciudad;

	public Clientes(String nombre, String rut, String apellido, String correo, String nContacto, String estadoCivil, String ciudad) {
		this.nombre = nombre;
		this.rut = rut;
		this.apellido = apellido;
		this.correo = correo;
		this.nContacto = nContacto;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getnContacto() {
		return nContacto;
	}

	public void setnContacto(String nContacto) {
		this.nContacto = nContacto;
	}

	public ArrayList<Compra> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}

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