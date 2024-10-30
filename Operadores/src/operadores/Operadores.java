/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author gianelo
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Vamos a crear una funcion que sume dos numeros!!!");
        //Scanner
        Scanner keyboard = new Scanner(System.in);

        double num1, num2;
        double suma;

        System.out.println("Ingrese el primer numero: ");
        num1 = keyboard.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        num2 = keyboard.nextDouble();

        suma = num1 + num2;

        System.out.println("la suma de " + num1 + " + " + num2 + " = " + suma);
    }

}
