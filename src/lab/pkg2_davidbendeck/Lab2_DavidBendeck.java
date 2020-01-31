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
        
        String vs;
        
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
            vs = sc.nextLine();
            
            switch(opcion) {
                case 1:
                    System.out.println("Elija una clase (Clerigo,Barbaro,Mago,Picaro) si ingresa una clase invalida el default sera Barbaro: ");
                    String clase = sc.nextLine();
                    
                    
                    System.out.print("Elija un nombre: ");
                    String nombre = sc.nextLine();
                    
                    
                    System.out.println("Elija una raza (Mediano,Enano,Elfo,Humano) si ingresa una raza invalida el default sera Humano: ");
                    String raza = sc.nextLine();
                    
                    
                    System.out.print("Ingrese la estatura en cm: ");
                    int estatura = sc.nextInt();
                    vs = sc.nextLine();
                    
                    
                    System.out.print("Ingrese el peso en libras: ");
                    int peso = sc.nextInt();
                    vs = sc.nextLine();
                    
                    
                    System.out.print("Ingrese la edad en años: ");
                    int edad = sc.nextInt();
                    vs = sc.nextLine();
                    
                    
                    System.out.print("Ingrese una descripción: ");
                    String descripcion = sc.nextLine();
                    
                    
                    System.out.println("Elija una nacionalidad (Norfair,Brinstar,Maridia,Zebes,Crateria) si ingresa una nacionalidad invalida el default sera Zebes: ");
                    String nacionalidad = sc.nextLine();
                    
                    personajes.add(new Personaje(clase,nombre,raza,estatura,peso,edad,descripcion,nacionalidad));
                    
                    personajes.get(personajes.size()-1).imprimir();
                    break;
                case 2:
                    System.out.println("Personajes: ");
                    
                    for (Personaje p : personajes) {
                        
                    }
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
