package modelo;

public class PC extends Dispositivo {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private Pantalla pantallaAsociada ;

	public PC(String marca, String id,String ram, String mAlmacenamiento, String procesador, String modelo, int anioFabricacion, double precio, int cantStock, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantallaAsociada) {
		super(marca, id,ram, mAlmacenamiento, procesador, modelo, anioFabricacion, precio, cantStock);
		this.tarjetaVideo = tarjetaVideo;
		this.fuentePoder = fuentePoder;
		this.chasis = chasis;
		this.pantallaAsociada = pantallaAsociada;
	}

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getTipo(){
		return "PC. ";
	}

	@Override
	public String toString() {
		return "PC{" +
				"tarjetaVideo='" + tarjetaVideo + '\'' +
				", fuentePoder='" + fuentePoder + '\'' +
				", chasis='" + chasis + '\'' +
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