package modelo;

public class Tablets extends Dispositivo {
	private String rPantalla;


	public Tablets(String marca, String id,String ram, String mAlmacenamiento, String procesador, String modelo, int anioFabricacion, double precio, int cantStock, String rPantalla) {
		super(marca, id,ram, mAlmacenamiento, procesador, modelo, anioFabricacion, precio, cantStock);
		this.rPantalla = rPantalla;
	}

	public String getRPantallaInc() {
		throw new UnsupportedOperationException();
	}

	public void setRPantallaInc(String rPantallaInc) {
		throw new UnsupportedOperationException();
	}

	public String getTipo(){
		return "Tablet. ";
	}

	@Override
	public String toString() {
		return "Tablets{" +
				"rPantalla='" + rPantalla + '\'' +
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