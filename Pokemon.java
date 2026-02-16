package PokemonShowdown;
import java.util.List;
import java.util.ArrayList;

// ----------- ATRIBUTOS --------------

public class Pokemon {
	private String nombre;
    private String tipo;
    private int vidaMax;
    private int vidaActual;
    private int ataque;
    private List<Movimiento> movimientos;
    private boolean estaVivo;
	
// ---------- CONSTRUCTOR ----------------    
    
    public Pokemon(String nombre, String tipo, int vidaMax, int ataque, List<Movimiento> movimientos, boolean estaVivo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vidaMax = vidaMax;
        this.vidaActual = vidaMax;
        this.ataque = ataque;
        if (movimientos == null) {
           this.movimientos = new ArrayList<>();
        } else {
           this.movimientos = new ArrayList<>(movimientos);
        }
        this.estaVivo = estaVivo;
    }

// ------------ GETTERS ------------------

	public String getNombre() {
		return this.nombre;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getVidaMax() {
		return this.vidaMax;
	}
	
	public int getVidaActual() {
		return this.vidaActual;
	}
	
	public int getAtaque() {
		return this.ataque;
	}
	public boolean getEstaVivo() {
		return this.estaVivo;
	}
	
	public List<Movimiento> getMovimientos(){
		return this.movimientos;
	}
	
	public void aprenderMovimiento(Movimiento movimientoNuevo) {
	    this.movimientos.add(movimientoNuevo);
	}
	
	// ----------- METODO PARA RECIBIR DAÑO --------------
	
	public void recibirDaño(int daño) {
		if (estaVivo) {
			vidaActual = vidaActual - daño;
			if (vidaActual <= 0) {
				estaVivo = false;
				vidaActual = 0;
			}
		}
	}
	
}