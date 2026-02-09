package PokemonShowdown;

public class Combate {
	
	public void realizarAtaque(Pokemon atacante, Pokemon defensor, Movimiento movimiento) {
        System.out.println(atacante.getNombre() + " usa " + movimiento.getNombre());  
      
        int daño = (int) ((atacante.getAtaque() + movimiento.getPotencia()) * 0.4);             
        
        System.out.println("Ha causado " + daño + " puntos de daño!");
        defensor.recibirDaño(daño);
    }

}
