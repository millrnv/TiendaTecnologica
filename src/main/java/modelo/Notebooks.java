package modelo;

public class Notebooks extends Dispositivo {
	private String rPantallaInc;
	private String tipoTeclado;
	private String bateria;

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
}