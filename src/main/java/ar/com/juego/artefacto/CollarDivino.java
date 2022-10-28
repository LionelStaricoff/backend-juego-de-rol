package ar.com.juego.artefacto;

public class CollarDivino extends Artefacto{
	private Integer numeroPerlas;
	
	
	public CollarDivino(String nombre, Integer numeroPerlas) {
		 setNombre(nombre);
		 setNumeroPerlas(numeroPerlas);
		 calculoDePoder ();
	}


	public Integer getNumeroPerlas() {
		return numeroPerlas;
	}


	public void setNumeroPerlas(Integer numeroPerlas) {
		this.numeroPerlas = numeroPerlas;
	}
   
	
	private void calculoDePoder() {
		setUnidadDeLucha(getNumeroPerlas());
	}
}
