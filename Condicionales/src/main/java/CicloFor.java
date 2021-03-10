
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
public class CicloFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número límite para la serie:");
        int numeroSerie = scanner.nextInt();
        System.out.println("Esta es la serie:");
        for(int i = 0; i <= numeroSerie; i++) {
            System.out.println(i);
        }
    }
}
