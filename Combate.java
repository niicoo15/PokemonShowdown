package PokemonShowdown;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Map;

public class Combate {
    
    private Map<String, Map<String, Double>> tablaTipos;

    public Combate() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            tablaTipos = mapper.readValue(new File("tipos.json"), Map.class);
        } catch (Exception e) {
            System.out.println("Error: No se pudo leer el archivo tipos.json. Revisa que esté en la raíz del proyecto.");
        }
    }

    public void realizarAtaque(Pokemon atacante, Pokemon defensor, Movimiento movimiento) {
        System.out.println(atacante.getNombre() + " usa " + movimiento.getNombre());
      
        double multiplicador = 1.0;
        if (tablaTipos != null && tablaTipos.containsKey(movimiento.getTipo())) {
            Map<String, Double> relaciones = tablaTipos.get(movimiento.getTipo());
            multiplicador = relaciones.getOrDefault(defensor.getTipo(), 1.0);
        }

        int daño = (int) (((atacante.getAtaque() + movimiento.getPotencia()) * 0.4) * multiplicador);
        
        if (multiplicador > 1.0) {
        	System.out.println("¡Es muy eficaz!");
        } else if (multiplicador < 1.0 && multiplicador > 0) {
        	System.out.println("No es muy eficaz...");
        } else if (multiplicador == 0) {
        	System.out.println("No afecta a " + defensor.getNombre());
        } else {
            System.out.println("El daño es neutro.");
        }
        System.out.println("Ha causado " + daño + " puntos de daño!");
        defensor.recibirDaño(daño);
    }
}