package ar.com.juego.artefacto;

public class Armadura extends Artefacto{

	
	private Integer cantidadPartes;
	
	public Armadura (String nombre, Integer cantidadPartes) {
		setNombre(nombre);
		setCantidadPartes(cantidadPartes);
		calculoPoder();
	}
	
	

	public Integer getCantidadPartes() {
		return cantidadPartes;
	}

	public void setCantidadPartes(Integer cantidadPartes) {
		this.cantidadPartes = cantidadPartes;
	}
	
	private void calculoPoder() {
		setUnidadDeLucha(10+(Integer)getCantidadPartes()/2);
	}
	
}
