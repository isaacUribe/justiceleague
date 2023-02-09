package clases;

import org.example.Hero;

public class Villain {
    protected String nombre;
    public int poder;

    private Hero heroe;

    public  int destruir(){
        int resultado = this.poder-this.heroe.getPower();
        return resultado;
    }

}
