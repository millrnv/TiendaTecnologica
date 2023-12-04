package modelo;

public class Notebooks extends Dispositivo {
	private String rPantallaInc;
	private String tipoTeclado;
	private String bateria;

	public Notebooks(String marca, String id, String ram, String mAlmacenamiento, String procesador, String modelo, int anioFabricacion, double precio, int cantStock, String rPantallaInc, String tipoTeclado, String bateria) {
		super(marca, id, ram, mAlmacenamiento, procesador, modelo, anioFabricacion, precio, cantStock);
		this.rPantallaInc = rPantallaInc;
		this.tipoTeclado = tipoTeclado;
		this.bateria = bateria;
	}

	public String getRPantallaInc() {
		return this.rPantallaInc;
	}

	public void setRPantallaInc(String rPantallaInc) {
		this.rPantallaInc = rPantallaInc;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public String getBateria() {
		return this.bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public String getTipo(){
		return "Notebook. ";

	}

	@Override
	public String toString() {
		return "Notebooks{" +
				"rPantallaInc='" + rPantallaInc + '\'' +
				", tipoTeclado='" + tipoTeclado + '\'' +
				", bateria='" + bateria + '\'' +
				", marca='" + marca + '\'' +
				", id='" + id + '\'' +
				", ram='" + ram + '\'' +
				", mAlmacenamiento='" + mAlmacenamiento + '\'' +
				", procesador='" + procesador + '\'' +
				", modelo='" + modelo + '\'' +
				", anioFabricacion=" + anioFabricacion +
				", precio=" + precio +
				", cantStock=" + cantStock +
				'}';
	}
}