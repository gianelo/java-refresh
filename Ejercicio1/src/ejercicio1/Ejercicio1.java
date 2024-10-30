/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gianelo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("********* BIENVENIDO A ENGLISH SCHOOL *********");

        Scanner keyboard = new Scanner(System.in);
        int age;

        System.out.println("Por favor ingrese la edad del alumno.");
        age = keyboard.nextInt();

        if (age >= 4 && age <= 6) {
            System.out.println("El alumno esta en KINDER, es Lunes y Miercoles de 16h a las 17h");
        }

        if (age >= 7 && age <= 8) {
            System.out.println("El alumno esta en PRIMER AÑO, es Martes y Jueves de 16:30h a las 17:30h");
        }

        if (age >= 9 && age <= 10) {
            System.out.println("El alumno esta en SEGUNDO AÑO, es Martes y Jueves de 17:30h a las 19:30h");
        }
        
        if (age >= 11 && age <= 13) {
            System.out.println("El alumno esta en TERCERO AÑO, es Martes y Jueves de 17h a las 18:30h");
        }
        
        if(age < 4 || age > 13) {
            System.out.println("La edad no coincide con los rangos permitidos por la escuela");
        }
    }

}
