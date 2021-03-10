
import java.util.Formatter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Un programa que solicite un número mayor que 1,
e imprima la tabla de verdad de dicho número,
por ejemplo, si coloca el número 2 debería imprimir:
    00
    01
    10
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/EjerciciosEC1/src/main/java/Ejercicio78Nivel3.java
*/

/**
 *
 * @author charl
 */
public class Ejercicio78Nivel3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngresa un número:");                                                
        int decimal = scanner.nextInt();
        System.out.println("\nResultado:");
        for(int i = 0; i <= decimal; i++) {
            int turno = i;
            double resultado = 0;
            int exponente = 0;
            while(turno != 0) {
                int residuo = turno % 2;           
                resultado = resultado + residuo * Math.pow(10, exponente);
                exponente++;
                turno = turno / 2;
            }
            Formatter formatter = new Formatter();
            int binario = (int) resultado;
            String cadenaNumeros = String.valueOf(formatter.format("%08d", binario));
            System.out.println(cadenaNumeros);
        }
    }
}
