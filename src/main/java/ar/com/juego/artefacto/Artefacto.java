package ar.com.juego.artefacto;

public abstract class Artefacto {

	
	protected String nombre;
	protected Integer unidadDeLucha;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getUnidadDeLucha() {
		return unidadDeLucha;
	}
	public void setUnidadDeLucha(Integer unidadDeLucha) {
		this.unidadDeLucha = unidadDeLucha;
	}
	
	
}
