package ar.com.juego.artefacto;

import java.util.HashSet;

public class Jugador {
 
	private String nombre;
	private Integer unidadLucha;
	private HashSet<Artefacto> artefactos ;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		iniciarArtefactos();
		//
 // aca esta la cuestion del problema
	
	}
	
	public void agregarArtefactos(Artefacto artefacto ) {
		artefactos.add(artefacto);
		fuerzaTotal();
	}
	
	public Integer numeroArtefactos(){
		return artefactos.size();
	}
	
	public void fuerzaTotal() {
		Integer suma = artefactos.stream().map(x->x.getUnidadDeLucha())
				.reduce(0, (a,b)->a+b);
		setUnidadLucha( suma);
		/*
		Integer suma =0;
		for (Artefacto art: artefactos) {
		 suma += art.getUnidadDeLucha();
		}
		setUnidadLucha( suma);
		*/
	}

	public Integer getUnidadLucha() {
		return unidadLucha;
	}

	public void setUnidadLucha(Integer unidadLucha) {
		this.unidadLucha = unidadLucha;
	}

	public HashSet<Artefacto> getArtefactos() {
		return artefactos;
	}

	public void setArtefactos(HashSet<Artefacto> artefactos) {
		this.artefactos = artefactos;
	}

private void iniciarArtefactos() {
		this.artefactos = new HashSet<Artefacto>();
}
}
