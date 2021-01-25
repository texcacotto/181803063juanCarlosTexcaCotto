
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Tacos {
    public static void main(String[] args) {
        
        int TACOS = 17;
        int REFRESCOS = 10;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("¿Cuántos tacos consumiste?");
        int cantidadTacos = scanner.nextInt();
        
        System.out.println("¿Cuántos refrescos consumiste?");
        int cantidadRefrescos = scanner.nextInt();
        
        int totalCompra = ((TACOS * cantidadTacos) + (REFRESCOS * cantidadRefrescos));
        System.out.println("El total por tu compra es:");
        System.out.println("$" + totalCompra);
    }
}
