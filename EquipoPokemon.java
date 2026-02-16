package PokemonShowdown;

import java.util.ArrayList;
import java.util.List;
 
public class EquipoPokemon {
	
	private List<Pokemon> listaPokemons = new ArrayList<>();
	
	// ----------- LISTA DE POKEMONS AÑADIDOS ---------------------
	
	public EquipoPokemon() {

	    listaPokemons.add(new Pokemon("Mewtwo", "Psiquico", 212, 110, null, true));
	    listaPokemons.add(new Pokemon("Lugia", "Psiquico", 212, 90, null, true));
	    listaPokemons.add(new Pokemon("Ho-Oh", "Fuego", 212, 130, null, true));
	    listaPokemons.add(new Pokemon("Rayquaza", "Dragon", 210, 150, null, true));
	    listaPokemons.add(new Pokemon("Kyogre", "Agua", 200, 100, null, true));
	    listaPokemons.add(new Pokemon("Groudon", "Tierra", 200, 150, null, true));
	    listaPokemons.add(new Pokemon("Dialga", "Acero", 200, 120, null, true));
	    listaPokemons.add(new Pokemon("Palkia", "Agua", 190, 120, null, true));
	    listaPokemons.add(new Pokemon("Giratina", "Fantasma", 250, 100, null, true));
	    listaPokemons.add(new Pokemon("Arceus", "Normal", 220, 120, null, true));
	    listaPokemons.add(new Pokemon("Zekrom", "Electrico", 200, 150, null, true));
	    listaPokemons.add(new Pokemon("Reshiram", "Fuego", 200, 120, null, true));
	    listaPokemons.add(new Pokemon("Xerneas", "Hada", 226, 131, null, true));
	    listaPokemons.add(new Pokemon("Yveltal", "Siniestro", 226, 131, null, true));
	    listaPokemons.add(new Pokemon("Zacian", "Acero", 192, 170, null, true));
	    listaPokemons.add(new Pokemon("Zamazenta", "Acero", 192, 130, null, true));
	    listaPokemons.add(new Pokemon("Eternatus", "Dragon", 240, 85, null, true));
	    listaPokemons.add(new Pokemon("Darkrai", "Siniestro", 170, 90, null, true));
	    listaPokemons.add(new Pokemon("Deoxys", "Psiquico", 150, 150, null, true));
	    listaPokemons.add(new Pokemon("Articuno", "Hielo", 190, 85, null, true));
	    listaPokemons.add(new Pokemon("Zapdos", "Electrico", 190, 90, null, true));
	    listaPokemons.add(new Pokemon("Moltres", "Fuego", 190, 100, null, true));
	    listaPokemons.add(new Pokemon("Entei", "Fuego", 215, 115, null, true));
	    listaPokemons.add(new Pokemon("Raikou", "Electrico", 190, 85, null, true));
	    listaPokemons.add(new Pokemon("Suicune", "Agua", 200, 75, null, true));
	    listaPokemons.add(new Pokemon("Regirock", "Roca", 180, 100, null, true));
	    listaPokemons.add(new Pokemon("Regice", "Hielo", 180, 50, null, true));
	    listaPokemons.add(new Pokemon("Registeel", "Acero", 180, 75, null, true));
	    listaPokemons.add(new Pokemon("Latios", "Dragon", 180, 90, null, true));
	    listaPokemons.add(new Pokemon("Latias", "Dragon", 180, 80, null, true));
	    listaPokemons.add(new Pokemon("Dragonite", "Dragon", 191, 134, null, true));
	    listaPokemons.add(new Pokemon("Tyranitar", "Roca", 200, 134, null, true));
	    listaPokemons.add(new Pokemon("Salamence", "Dragon", 195, 135, null, true));
	    listaPokemons.add(new Pokemon("Metagross", "Acero", 180, 135, null, true));
	    listaPokemons.add(new Pokemon("Garchomp", "Dragon", 208, 130, null, true));
	    listaPokemons.add(new Pokemon("Hydreigon", "Siniestro", 192, 105, null, true));
	    listaPokemons.add(new Pokemon("Goodra", "Dragon", 190, 100, null, true));
	    listaPokemons.add(new Pokemon("Kommo-o", "Lucha", 175, 110, null, true));
	    listaPokemons.add(new Pokemon("Dragapult", "Fantasma", 188, 120, null, true));
	    listaPokemons.add(new Pokemon("Baxcalibur", "Hielo", 215, 145, null, true));
	    listaPokemons.add(new Pokemon("Charizard", "Fuego", 178, 84, null, true));
	    listaPokemons.add(new Pokemon("Blastoise", "Agua", 179, 83, null, true));
	    listaPokemons.add(new Pokemon("Venusaur", "Planta", 180, 82, null, true));
	    listaPokemons.add(new Pokemon("Gengar", "Fantasma", 160, 65, null, true));
	    listaPokemons.add(new Pokemon("Alakazam", "Psiquico", 155, 50, null, true));
	    listaPokemons.add(new Pokemon("Machamp", "Lucha", 190, 130, null, true));
	    listaPokemons.add(new Pokemon("Gyarados", "Agua", 195, 125, null, true));
	    listaPokemons.add(new Pokemon("Snorlax", "Normal", 260, 110, null, true));
	    listaPokemons.add(new Pokemon("Arcanine", "Fuego", 190, 110, null, true));
	    listaPokemons.add(new Pokemon("Lucario", "Lucha", 170, 110, null, true));
	    listaPokemons.add(new Pokemon("Scizor", "Bicho", 170, 130, null, true));
	    listaPokemons.add(new Pokemon("Gardevoir", "Psiquico", 168, 65, null, true));
	    listaPokemons.add(new Pokemon("Gallade", "Lucha", 168, 125, null, true));
	    listaPokemons.add(new Pokemon("Blaziken", "Fuego", 180, 120, null, true));
	    listaPokemons.add(new Pokemon("Swampert", "Agua", 200, 110, null, true));
	    listaPokemons.add(new Pokemon("Sceptile", "Planta", 170, 85, null, true));
	    listaPokemons.add(new Pokemon("Infernale", "Fuego", 176, 104, null, true));
	    listaPokemons.add(new Pokemon("Torterra", "Planta", 195, 109, null, true));
	    listaPokemons.add(new Pokemon("Empoleon", "Agua", 184, 86, null, true));
	    listaPokemons.add(new Pokemon("Greninja", "Agua", 172, 95, null, true));
	    listaPokemons.add(new Pokemon("Cinderace", "Fuego", 180, 116, null, true));
	    listaPokemons.add(new Pokemon("Rillaboom", "Planta", 200, 125, null, true));
	    listaPokemons.add(new Pokemon("Inteleon", "Agua", 170, 85, null, true));
	    listaPokemons.add(new Pokemon("Volcarona", "Bicho", 185, 60, null, true));
	    listaPokemons.add(new Pokemon("Haxorus", "Dragon", 176, 147, null, true));
	    listaPokemons.add(new Pokemon("Zoroark", "Siniestro", 160, 105, null, true));
	    listaPokemons.add(new Pokemon("Braviary", "Normal", 200, 123, null, true));
	    listaPokemons.add(new Pokemon("Corviknight", "Acero", 198, 87, null, true));
	    listaPokemons.add(new Pokemon("Toxtricity", "Electrico", 175, 98, null, true));
	    listaPokemons.add(new Pokemon("Grimmsnarl", "Siniestro", 195, 120, null, true));
	    listaPokemons.add(new Pokemon("Lapras", "Agua", 230, 85, null, true));
	    listaPokemons.add(new Pokemon("Vaporeon", "Agua", 230, 65, null, true));
	    listaPokemons.add(new Pokemon("Jolteon", "Electrico", 165, 65, null, true));
	    listaPokemons.add(new Pokemon("Flareon", "Fuego", 165, 130, null, true));
	    listaPokemons.add(new Pokemon("Umbreon", "Siniestro", 195, 65, null, true));
	    listaPokemons.add(new Pokemon("Espeon", "Psiquico", 165, 65, null, true));
	    listaPokemons.add(new Pokemon("Sylveon", "Hada", 195, 65, null, true));
	    listaPokemons.add(new Pokemon("Steelix", "Acero", 175, 85, null, true));
	    listaPokemons.add(new Pokemon("Aggron", "Acero", 170, 110, null, true));
	    listaPokemons.add(new Pokemon("Walrein", "Hielo", 210, 80, null, true));
	    listaPokemons.add(new Pokemon("Mamoswine", "Hielo", 210, 130, null, true));
	    listaPokemons.add(new Pokemon("Togekiss", "Hada", 185, 50, null, true));
	    listaPokemons.add(new Pokemon("Electivire", "Electrico", 175, 123, null, true));
	    listaPokemons.add(new Pokemon("Magmortar", "Fuego", 175, 95, null, true));
	    listaPokemons.add(new Pokemon("Rhyperior", "Tierra", 215, 140, null, true));
	    listaPokemons.add(new Pokemon("Porygon-Z", "Normal", 185, 80, null, true));
	    listaPokemons.add(new Pokemon("Chandelure", "Fantasma", 160, 55, null, true));
	    listaPokemons.add(new Pokemon("Aerodactyl", "Roca", 180, 105, null, true));
	    listaPokemons.add(new Pokemon("Kingdra", "Agua", 175, 95, null, true));
	    listaPokemons.add(new Pokemon("Milotic", "Agua", 195, 60, null, true));
	    listaPokemons.add(new Pokemon("Eelektross", "Electrico", 185, 115, null, true));
	    listaPokemons.add(new Pokemon("Aegislash", "Acero", 160, 50, null, true));
	    listaPokemons.add(new Pokemon("Noivern", "Volador", 185, 70, null, true));
	    listaPokemons.add(new Pokemon("Lycanroc", "Roca", 175, 115, null, true));
	    listaPokemons.add(new Pokemon("Mimikyu", "Fantasma", 155, 90, null, true));
	    listaPokemons.add(new Pokemon("Duraludon", "Acero", 170, 95, null, true));
	    listaPokemons.add(new Pokemon("Annihilape", "Lucha", 210, 115, null, true));
	    listaPokemons.add(new Pokemon("Kingambit", "Acero", 200, 135, null, true));
	    listaPokemons.add(new Pokemon("Gholdengo", "Acero", 187, 60, null, true));
	    listaPokemons.add(new Pokemon("Meowscarada", "Planta", 176, 110, null, true));
}
	
	// ------------ CODIGO GENERAR EQUIPO --------------
	
	public List<Pokemon> generarEquipo() {
        List<Pokemon> equipo = new ArrayList<>();
        Movimiento listaMovimientos = new Movimiento();

        for (int i = 0; i < 6; i++) {
        	int numero = (int) (Math.random() * listaPokemons.size());
        	Pokemon pBase = listaPokemons.get(numero);

            Pokemon pNuevo = new Pokemon(pBase.getNombre(), pBase.getTipo(), 
                                         pBase.getVidaMax(), pBase.getAtaque(), 
                                         null, true);

            while (pNuevo.getMovimientos().size() < 4) {
                int numMov = (int) (Math.random() * listaMovimientos.movs.size());
                Movimiento m = listaMovimientos.movs.get(numMov);
                
                if (!pNuevo.getMovimientos().contains(m)) {
                    pNuevo.aprenderMovimiento(m);
                }
            }
            equipo.add(pNuevo);
        }
        return equipo;
    }
}
	


