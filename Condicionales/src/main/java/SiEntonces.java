
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
public class SiEntonces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numero = scanner.nextInt();
        if(numero == 0)
            System.out.println("¡El número es neutro!");
        else
            if(numero > 0)
                System.out.println("¡El número es positivo!");
            else    
                System.out.println("¡El número es negativo!");
    }
}
