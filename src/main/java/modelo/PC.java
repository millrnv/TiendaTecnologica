package modelo;

public class PC extends Dispositivo {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;

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
}