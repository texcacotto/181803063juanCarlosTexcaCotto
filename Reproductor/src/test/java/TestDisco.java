
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class TestDisco {
    public static void main(String[] args) {
        ArrayList<Cancion> canciones = new ArrayList();
        Cancion cancionUno = new Cancion(1, "Violet Hill", 3.44);
        Cancion cancionDos = new Cancion(2, "Yellow", 4.33);
        Cancion cancionTres = new Cancion(3, "Fix You", 4.54);
        canciones.add(cancionUno);
        canciones.add(cancionDos);
        canciones.add(cancionTres);
        Disco discoColdplay = new Disco("Rolas", "Coldplay", 2021, canciones);
        System.out.println(discoColdplay);
    }
}
