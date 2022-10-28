package ar.com.juegoMain;

import ar.com.juego.artefacto.Armadura;
import ar.com.juego.artefacto.CollarDivino;
import ar.com.juego.artefacto.Espada;
import ar.com.juego.artefacto.Jugador;
import ar.com.juego.artefacto.MascaraOscura;

public class MainJuego {

	public static void main(String[] args) {
		
		Espada espada = new Espada("espada1", 10);
		CollarDivino collar = new CollarDivino("collar1", 5);
		MascaraOscura mascara = new MascaraOscura("mascara1", 8);
		Armadura armadura = new Armadura("armadura1", 3);
		Jugador jugador = new Jugador("jugador1");
		
		jugador.agregarArtefactos(armadura);
		jugador.agregarArtefactos(espada);
		jugador.agregarArtefactos(collar);
		jugador.agregarArtefactos(mascara);
		
		
		//test:

		System.out.println("fuerza del guerrero: "+jugador.getUnidadLucha());
		
		System.out.println("cantidad armas: "+jugador.numeroArtefactos());

	}

}
