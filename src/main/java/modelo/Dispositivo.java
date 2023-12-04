package modelo;

public abstract class Dispositivo {
	protected String marca;
	protected String id;
	protected String ram;
	protected String mAlmacenamiento;
	protected String procesador;
	protected String modelo;
	protected int anioFabricacion;
	protected double precio;
	protected int cantStock;
	private TiendaTecnologica tiendaTecnologica;
	private Compra compra;

	public Dispositivo(String marca, String id,String ram, String mAlmacenamiento, String procesador, String modelo, int anioFabricacion, double precio, int cantStock) {
		this.marca = marca;
		this.id = id;
		this.ram = ram;
		this.mAlmacenamiento = mAlmacenamiento;
		this.procesador = procesador;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.precio = precio;
		this.cantStock = cantStock;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getAnioFabricacion() {
		return this.anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
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

	public abstract String getTipo();

}