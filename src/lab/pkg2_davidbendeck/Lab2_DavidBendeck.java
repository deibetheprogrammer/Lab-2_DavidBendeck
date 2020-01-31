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
                    + "5) Combate\n"
                    + "6) Salir\n"
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
                    
                    int posicion = 0;
                    for (Personaje p : personajes) {
                        System.out.println("# " +posicion + " : ");
                        p.imprimir();
                    }
                    
                    System.out.print("Ingrese la posicion del personaje que desea modificar: ");
                    posicion = sc.nextInt();
                    vs = sc.nextLine();
                    
                    System.out.print("Modificar: \n"
                            + "1) Clase\n"
                            + "2) Nombre"
                            + "3) Raza\n"
                            + "4) Estatura\n"
                            + "5) Peso\n"
                            + "6) Edad\n"
                            + "7) Descripcion\n"
                            + "8) Nacionalidad\n"
                            + "Su eleccion: ");
                    int mod =  sc.nextInt();
                    vs = sc.nextLine();
                    
                    switch (mod) {
                        case 1:
                            System.out.println("Elija una clase (Clerigo,Barbaro,Mago,Picaro) si ingresa una clase invalida el default sera Barbaro: ");
                            clase = sc.nextLine();
                            
                            personajes.get(posicion).setClase(clase);
                            break;
                        case 2:
                            System.out.print("Elija un nombre: ");
                            nombre = sc.nextLine();
                            
                            personajes.get(posicion).setNombre(nombre);
                            break;
                        case 3:
                            System.out.println("Elija una raza (Mediano,Enano,Elfo,Humano) si ingresa una raza invalida el default sera Humano: ");
                            raza = sc.nextLine();
                            
                            personajes.get(posicion).setRaza(raza);
                            break;
                        case 4:
                            System.out.print("Ingrese la estatura en cm: ");
                            estatura = sc.nextInt();
                            vs = sc.nextLine();
                            
                            personajes.get(posicion).setEstatura(estatura);
                            break;
                        case 5:
                            System.out.print("Ingrese el peso en libras: ");
                            peso = sc.nextInt();
                            vs = sc.nextLine();
                            
                            personajes.get(posicion).setPeso(peso);
                            break;
                        case 6:
                            System.out.print("Ingrese la edad en años: ");
                            edad = sc.nextInt();
                            vs = sc.nextLine();
                            
                            personajes.get(posicion).setEdad(edad);
                            break;
                        case 7:
                            System.out.print("Ingrese una descripción: ");
                            descripcion = sc.nextLine();
                            
                            personajes.get(posicion).setDescripcion(descripcion);
                            break;
                        case 8:
                            System.out.println("Elija una nacionalidad (Norfair,Brinstar,Maridia,Zebes,Crateria) si ingresa una nacionalidad invalida el default sera Zebes: ");
                            nacionalidad = sc.nextLine();
                            
                            personajes.get(posicion).setNacionalidad(nacionalidad);
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                    
                    break;
                case 3:
                    System.out.print("Ingrese la posicion del personaje que desea revisar: ");
                    posicion = sc.nextInt();
                    vs = sc.nextLine();
                    
                    personajes.get(posicion).imprimir();
                    break;
                    
                case 4:
                    
                    System.out.println("Personajes: ");
                    
                    posicion = 0;
                    for (Personaje p : personajes) {
                        System.out.println("# " +posicion + " : ");
                        p.imprimir();
                    }
                    
                    System.out.print("Ingrese la posicion del personaje que desea eliminar: ");
                    posicion = sc.nextInt();
                    vs = sc.nextLine();
                    
                    personajes.remove(posicion);
                    break;
                case 5:
                    
                    break;
                case 6:
                    break OUTER;
            }
        }
    }
    
}
