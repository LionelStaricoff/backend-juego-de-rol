package ar.com.juego.artefacto;

public class MascaraOscura extends Artefacto{
	
	private Integer nivelOscuridad;
	public MascaraOscura(String nombre, Integer nivelOscuridad) {
		 setNombre(nombre);
		 setNivelOscuridad(nivelOscuridad);
		 calculoDePoder ();
		 
		 
	}
	public Integer getNivelOscuridad() {
		return nivelOscuridad;
	}
	public void setNivelOscuridad(Integer nivelOscuridad) {
		this.nivelOscuridad = nivelOscuridad;
	}

	
	private void calculoDePoder () {
		setUnidadDeLucha(getNivelOscuridad()*2);
	}
}
