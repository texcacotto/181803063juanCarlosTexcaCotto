
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
        int numero, exp, digito;
        double binario;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Introduce un numero entero >= 0: ");                                                
        numero = scanner.nextInt();
        

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, exp);                                                   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }
}
