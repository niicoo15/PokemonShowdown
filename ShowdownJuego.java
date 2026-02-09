package PokemonShowdown;

import java.util.Scanner;
import java.util.ArrayList;

// HACER EN CSV LOS POKEMONS Y ATAQUES

import java.util.List;

public class ShowdownJuego {

	public static void main(String[] args) {

		// ---------- GENERADORES DE EQUIPOS Y TABLERO -------------

		TableroJuego tablero = new TableroJuego();
		Scanner sc = new Scanner(System.in);
		EquipoPokemon pokemons = new EquipoPokemon();
		Combate combate = new Combate();

		int pokemonActivo1 = 0;
		int pokemonActivo2 = 0;

		List<Pokemon> equipoJugador1 = pokemons.generarEquipo();
		List<Pokemon> equipoJugador2 = pokemons.generarEquipo();

		List<Pokemon> muertosJugador1 = new ArrayList<>();
		List<Pokemon> muertosJugador2 = new ArrayList<>();

		// ------------- LISTA DE TUS POKEMONS --------------

		System.out.println("¡TUS POKEMONS!");
		System.out.println();

		for (Pokemon pokemon1 : equipoJugador1) {
			System.out.println(pokemon1.getNombre() + " -> " + pokemon1.getTipo());
		}
		System.out.println();

		// ------------------ SHOWDOWN --------------------

		// ---------------- IMPRIMIR TABLERO -------------------

		do {
			boolean rivalAtaca = true;
			Pokemon activoJugador1 = equipoJugador1.get(pokemonActivo1);
			Pokemon activoJugador2 = equipoJugador2.get(pokemonActivo2);

			tablero.dibujarTablero(activoJugador1, activoJugador2);

			System.out.println("¿Que quieres hacer?");
			System.out.println("1. Atacar");
			System.out.println("2. Cambiar de pokemon");
			System.out.println("3. Rendirte");
			int opcion = sc.nextInt();

			switch (opcion) {

			// --------------------- ATACAR --------------------------

			case 1 -> {

				System.out.println("Elige el movimiento que quieres hacer (1-4): ");
				int ataque = sc.nextInt() - 1;

				Movimiento movEscogido = activoJugador1.getMovimientos().get(ataque);

				combate.realizarAtaque(activoJugador1, activoJugador2, movEscogido);

				if (!activoJugador2.getEstaVivo()) {
					System.out.println("\n¡El " + activoJugador2.getNombre() + " rival se ha debilitado!");
					muertosJugador2.add(activoJugador2);
					pokemonActivo2++;
					rivalAtaca = false;
				}

				if (muertosJugador2.size() < equipoJugador2.size()) {

					activoJugador2 = equipoJugador2.get(pokemonActivo2);
					System.out.println("El rival envía a " + activoJugador2.getNombre());

				} else {
					System.out.println("¡HAS GANADO! Maquinon");
					return;
				}
			}
			// ------------------------- CAMBIAR ------------------------
			case 2 -> {
				boolean cambioCorrecto = false;

				while (!cambioCorrecto) {

					System.out.println("--- TU EQUIPO ---");
					String estado;
					for (int i = 0; i < equipoJugador1.size(); i++) {
						Pokemon p = equipoJugador1.get(i);
						if (p.getEstaVivo()) {
							estado = "VIDA: " + p.getVidaActual();
						} else {
							estado = "(MUERTO)";
						}
						System.out.println((i + 1) + ". " + p.getNombre() + " - " + estado);
					}
					System.out.println("Elige el numero del Pokémon al que cambiar:");
					int cambio = sc.nextInt() - 1;

					if (cambio >= 0 && cambio < equipoJugador1.size() && equipoJugador1.get(cambio).getEstaVivo()) {
						pokemonActivo1 = cambio;
						System.out.println("¡Adelante " + equipoJugador1.get(cambio).getNombre() + "!");
						cambioCorrecto = true;
					} else {
						System.out.println("Cambio no valido o Pokémon debilitado.");
					}
				}
			}

			// ------------------------- FF ----------------------

			case 3 -> {
				System.out.println("Te has rendido, eres malisimo.");
				return;
			}

			}

			// --------------- ATAQUE RIVAL RANDOM ------------------------

			if (activoJugador2.getEstaVivo() && rivalAtaca) {

				System.out.println("\n--- Turno del Rival ---");

				int ataqueRandom = (int) (Math.random() * 4);
				Movimiento ataqueRival = activoJugador2.getMovimientos().get(ataqueRandom);

				combate.realizarAtaque(activoJugador2, activoJugador1, ataqueRival);

				if (!activoJugador1.getEstaVivo()) {
					System.out.println("\nTu " + activoJugador1.getNombre() + " se ha debilitado");
					muertosJugador1.add(activoJugador1);

					if (muertosJugador1.size() < equipoJugador1.size()) {
						boolean cambioCorrecto = false;

						while (!cambioCorrecto) {

							System.out.println("--- TU EQUIPO ---");
							String estado;
							for (int i = 0; i < equipoJugador1.size(); i++) {
								Pokemon p = equipoJugador1.get(i);
								if (p.getEstaVivo()) {
									estado = "VIDA: " + p.getVidaActual();
								} else {
									estado = "(MUERTO)";
								}
								System.out.println((i + 1) + ". " + p.getNombre() + " - " + estado);
							}
							System.out.println("Elige el numero del Pokémon al que cambiar:");
							int cambio = sc.nextInt() - 1;

							if (cambio >= 0 && cambio < equipoJugador1.size()
									&& equipoJugador1.get(cambio).getEstaVivo()) {
								pokemonActivo1 = cambio;
								System.out.println("¡Adelante " + equipoJugador1.get(cambio).getNombre() + "!");
								cambioCorrecto = true;
							} else {
								System.out.println("Cambio no valido o Pokémon debilitado.");
							}
						}
					} else {
						System.out.println("¡Has perdido! Pringao");
						return;
					}
				}
			}
		} while (!equipoJugador1.isEmpty() && !equipoJugador2.isEmpty());
	}
}