package modelo;

public class Dispositivo {
	private String marca;
	private String ram;
	private String mAlmacenamiento;
	private String procesador;
	private String modelo;
	private int añoFabricacion;
	private double precio;
	private int cantStock;
	private TiendaTecnologica tiendaTecnologica;
	private Compra compra;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getMAlmacenamiento() {
		return this.mAlmacenamiento;
	}

	public void setMAlmacenamiento(String mAlmacenamiento) {
		this.mAlmacenamiento = mAlmacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoFabricacion() {
		return this.añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantStock() {
		return this.cantStock;
	}

	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}
}