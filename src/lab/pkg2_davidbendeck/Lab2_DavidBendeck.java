/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_davidbendeck;

import java.util.ArrayList;
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
        
        ArrayList<Personaje> personajes = new ArrayList<>();
        
        personajes.add(new Personaje("Barbaro","Samus Aran","Humano",178,150,31,"Caza recompensas legendaria","Zebes"));
        personajes.add(new Personaje("Mago","Gandalf","Mediano",190,180,3000,"El vaganbundo gris","Norfair"));
        personajes.add(new Personaje("Picaro","Gollum","Humano",75,50,150,"Creatura miserable","Brinstar"));
        personajes.add(new Personaje("Barbaro","Aragorn","Humano",187,175,100,"Verdadero rey de Gondor","Maridia"));
        
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
                    System.out.println("Elija un nombre");
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
