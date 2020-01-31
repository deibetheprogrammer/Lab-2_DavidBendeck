/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_davidbendeck;

import java.util.Scanner;

/**
 *
 * @author davidbendeck
 */
public class Lab2_DavidBendeck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        OUTER:
        while(true) {
            System.out.print("Menu :\n"
                    + "1) Creación de personajes\n"
                    + "2) Modificar personajes\n"
                    + "3) Ver atributos del personaje\n"
                    + "4) Eliminar personaje\n"
                    + "5) Salir\n"
                    + "Su opción: ");
            int opcion = sc.nextInt();
            
            switch(opcion) {
                case 1:
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break OUTER;
            }
        }
    }
    
}
