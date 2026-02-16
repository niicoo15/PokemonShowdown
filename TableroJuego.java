package PokemonShowdown;
import java.util.List;
import java.util.Scanner;
	
	public class TableroJuego {
		Scanner sc = new Scanner(System.in);

// -------------- CODIGO TABLERO JUEGO -----------------
		
		public void dibujarTablero(Pokemon Jugador1, Pokemon Jugador2) {
		    System.out.println("\n" + "_".repeat(65));
		    
		    System.out.println();
		    System.out.printf("%45s [%s]\n", "", Jugador2.getNombre().toUpperCase());
		    System.out.println();
		    System.out.printf("%45s HP: %d / %d\n", "", Jugador2.getVidaActual(), Jugador2.getVidaMax());

		    System.out.println("\n                               VS\n");

		    System.out.printf("[%s]\n", Jugador1.getNombre().toUpperCase());
		    System.out.println();
		    System.out.printf("HP: %d / %d\n", Jugador1.getVidaActual(), Jugador1.getVidaMax());
		    System.out.println();
		    
		    List<Movimiento> misMovimientos = Jugador1.getMovimientos();
		    
		    System.out.printf(" 1. %-15s (Pot: %-3d) |  2. %-15s (Pot: %-3d)\n", 
		        misMovimientos.get(0).getNombre(), misMovimientos.get(0).getPotencia(), 
		        misMovimientos.get(1).getNombre(), misMovimientos.get(1).getPotencia());
		        
		    System.out.printf(" 3. %-15s (Pot: %-3d) |  4. %-15s (Pot: %-3d)\n", 
		        misMovimientos.get(2).getNombre(), misMovimientos.get(2).getPotencia(), 
		        misMovimientos.get(3).getNombre(), misMovimientos.get(3).getPotencia());
		    System.out.println("_".repeat(65));
	}		
}



