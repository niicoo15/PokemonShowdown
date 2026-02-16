package PokemonShowdown;

import java.util.ArrayList;
import java.util.List;

		public class Movimiento {
			private String nombre;
			private String tipo;
			private int potencia;
	    
	    public Movimiento(String nombre, String tipo, int potencia) {
	    	this.nombre = nombre;
	    	this.tipo = tipo;
	    	this.potencia = potencia;
	    }
	    
	    public String getNombre() {
	    	return this.nombre;
	    }

	    public int getPotencia() {
	    	return this.potencia;
	    }
	    
	    public String getTipo() {
	    	return this.tipo;
	    }
	    
		public List<Movimiento> movs = new ArrayList<>(); 

			public Movimiento() {

	        // --- MOVIMIENTOS LEGENDARIOS / ESPECIALES ---
	        movs.add(new Movimiento("Distorsión", "Dragon", 150));
	        movs.add(new Movimiento("Corte Vacío", "Dragon", 100));
	        movs.add(new Movimiento("Golpe Umbrío", "Fantasma", 120));
	        movs.add(new Movimiento("Sentencia", "Normal", 100));
	        movs.add(new Movimiento("Roar of Time", "Dragon", 150));
	        movs.add(new Movimiento("Ataque Fulgor", "Eléctrico", 130));
	        movs.add(new Movimiento("Llama Azul", "Fuego", 130));
	        movs.add(new Movimiento("Pulso Primigenio", "Agua", 110));
	        movs.add(new Movimiento("Ala Mortífera", "Siniestro", 80));
	        movs.add(new Movimiento("Espada Suprema", "Acero", 100));
	        movs.add(new Movimiento("Embate Supremo", "Lucha", 120));
	        movs.add(new Movimiento("Cañón Dinamax", "Dragon", 100));
	        movs.add(new Movimiento("Viento Aciago", "Fantasma", 60));
	        movs.add(new Movimiento("Psicocorte", "Psiquico", 70));
	        movs.add(new Movimiento("Esfera Aural", "Lucha", 80));

	        // --- TIPO FUEGO ---
	        movs.add(new Movimiento("Lanzallamas", "Fuego", 90));
	        movs.add(new Movimiento("Llamarada", "Fuego", 110));
	        movs.add(new Movimiento("Envite Ígneo", "Fuego", 120));
	        movs.add(new Movimiento("Puño Fuego", "Fuego", 75));
	        movs.add(new Movimiento("Sofoco", "Fuego", 130));
	        movs.add(new Movimiento("Nitrocarga", "Fuego", 50));

	        // --- TIPO AGUA ---
	        movs.add(new Movimiento("Hidrobomba", "Agua", 110));
	        movs.add(new Movimiento("Escaldar", "Agua", 80));
	        movs.add(new Movimiento("Surf", "Agua", 90));
	        movs.add(new Movimiento("Cascada", "Agua", 80));
	        movs.add(new Movimiento("Acua Jet", "Agua", 40));
	        movs.add(new Movimiento("Martillazo", "Agua", 100));

	        // --- TIPO PLANTA ---
	        movs.add(new Movimiento("Rayo Solar", "Planta", 120));
	        movs.add(new Movimiento("Hoja Aguda", "Planta", 90));
	        movs.add(new Movimiento("Giga Drenado", "Planta", 75));
	        movs.add(new Movimiento("Tormenta Verde", "Planta", 130));
	        movs.add(new Movimiento("Latigazo", "Planta", 120));

	        // --- TIPO ELÉCTRICO ---
	        movs.add(new Movimiento("Rayo", "Electrico", 90));
	        movs.add(new Movimiento("Trueno", "Electrico", 110));
	        movs.add(new Movimiento("Voltio Cruel", "Electrico", 90));
	        movs.add(new Movimiento("Puño Trueno", "Electrico", 75));
	        movs.add(new Movimiento("Chispazo", "Electrico", 80));

	        // --- TIPO HIELO ---
	        movs.add(new Movimiento("Rayo Hielo", "Hielo", 90));
	        movs.add(new Movimiento("Ventisca", "Hielo", 110));
	        movs.add(new Movimiento("Chuzos", "Hielo", 85));
	        movs.add(new Movimiento("Canto Helado", "Hielo", 40));
	        movs.add(new Movimiento("Puño Hielo", "Hielo", 75));

	        // --- TIPO LUCHA ---
	        movs.add(new Movimiento("A bocajarro", "Lucha", 120));
	        movs.add(new Movimiento("Fuerza Bruta", "Lucha", 120));
	        movs.add(new Movimiento("Puño Incremento", "Lucha", 40));
	        movs.add(new Movimiento("Patada Salto Alta", "Lucha", 130));
	        movs.add(new Movimiento("Tajo Cruzado", "Lucha", 100));

	        // --- TIPO TIERRA ---
	        movs.add(new Movimiento("Terremoto", "Tierra", 100));
	        movs.add(new Movimiento("Tierra Viva", "Tierra", 90));
	        movs.add(new Movimiento("Excavar", "Tierra", 80));
	        movs.add(new Movimiento("Bofetón Lodo", "Tierra", 20));

	        // --- TIPO VOLADOR ---
	        movs.add(new Movimiento("Pájaro Osado", "Volador", 120));
	        movs.add(new Movimiento("Vuelo", "Volador", 90));
	        movs.add(new Movimiento("Tajo Aéreo", "Volador", 75));
	        movs.add(new Movimiento("Vendaval", "Volador", 110));

	        // --- TIPO PSÍQUICO ---
	        movs.add(new Movimiento("Psíquico", "Psiquico", 90));
	        movs.add(new Movimiento("Psicocarga", "Psiquico", 80));
	        movs.add(new Movimiento("Cabezazo Zen", "Psiquico", 80));
	        movs.add(new Movimiento("Comer Sueños", "Psiquico", 100));

	        // --- TIPO BICHO ---
	        movs.add(new Movimiento("Tijera X", "Bicho", 80));
	        movs.add(new Movimiento("Zumbado", "Bicho", 90));
	        movs.add(new Movimiento("Ida y Vuelta", "Bicho", 70));
	        movs.add(new Movimiento("Megacuerno", "Bicho", 120));

	        // --- TIPO ROCA ---
	        movs.add(new Movimiento("Roca Afilada", "Roca", 100));
	        movs.add(new Movimiento("Avalancha", "Roca", 75));
	        movs.add(new Movimiento("Joyas de Luz", "Roca", 80));
	        movs.add(new Movimiento("Antiaéreo", "Roca", 50));

	        // --- TIPO FANTASMA ---
	        movs.add(new Movimiento("Bola Sombra", "Fantasma", 80));
	        movs.add(new Movimiento("Garra Umbría", "Fantasma", 70));
	        movs.add(new Movimiento("Tinieblas", "Fantasma", 60));
	        movs.add(new Movimiento("Poltergeist", "Fantasma", 110));

	        // --- TIPO DRAGÓN ---
	        movs.add(new Movimiento("Garra Dragón", "Dragon", 80));
	        movs.add(new Movimiento("Cometa Draco", "Dragon", 130));
	        movs.add(new Movimiento("Carga Dragón", "Dragon", 100));
	        movs.add(new Movimiento("Pulso Dragón", "Dragon", 85));

	        // --- TIPO SINIESTRO ---
	        movs.add(new Movimiento("Pulso Umbrío", "Siniestro", 80));
	        movs.add(new Movimiento("Tajo Umbrío", "Siniestro", 70));
	        movs.add(new Movimiento("Desarme", "Siniestro", 65));
	        movs.add(new Movimiento("Golpe Bajo", "Siniestro", 70));

	        // --- TIPO ACERO ---
	        movs.add(new Movimiento("Foco Resplandor", "Acero", 80));
	        movs.add(new Movimiento("Puño Meteoro", "Acero", 90));
	        movs.add(new Movimiento("Cuerpo Pesado", "Acero", 100));
	        movs.add(new Movimiento("Cabeza de Hierro", "Acero", 80));

	        // --- TIPO HADA ---
	        movs.add(new Movimiento("Fuerza Lunar", "Hada", 95));
	        movs.add(new Movimiento("Brillo Mágico", "Hada", 80));
	        movs.add(new Movimiento("Carantoña", "Hada", 90));
	        movs.add(new Movimiento("Viento Feérico", "Hada", 40));

	        // --- TIPO NORMAL ---
	        movs.add(new Movimiento("Hiperrayo", "Normal", 150));
	        movs.add(new Movimiento("Gigaimpacto", "Normal", 150));
	        movs.add(new Movimiento("Placaje", "Normal", 40));
	        movs.add(new Movimiento("Cuchillada", "Normal", 70));
	        movs.add(new Movimiento("Doble Filo", "Normal", 120));
	        movs.add(new Movimiento("Fuerza", "Normal", 80));
	        movs.add(new Movimiento("Portazo", "Normal", 80));
	        movs.add(new Movimiento("Rapidez", "Normal", 60));
	        movs.add(new Movimiento("Venganza", "Normal", 60));
	        movs.add(new Movimiento("Pisotón", "Normal", 65));

	    }
			
		
			
	}	

