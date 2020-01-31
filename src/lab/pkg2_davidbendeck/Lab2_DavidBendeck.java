/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_davidbendeck;

import java.util.ArrayList;
import java.util.Random;
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
        Random rand = new Random();
        
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
                    
                    System.out.println("Personajes: ");
                    
                    posicion = 0;
                    for (Personaje p : personajes) {
                        System.out.println("# " +posicion + " : ");
                        p.imprimir();
                    }
                    
                    System.out.print("Ingrese la posicion del personaje que desea utilizar: ");
                    posicion = sc.nextInt();
                    vs = sc.nextLine();
                    
                    Personaje jugador = personajes.get(posicion);
                    Personaje oponente;
                    
                    try {
                        oponente = personajes.get(posicion+1);
                    } catch (Exception e) {
                        oponente = personajes.get(posicion-1);
                    }
                    
                    boolean playerDefense = false;
                    boolean oponentDefense = false;
                    
                    boolean jugadorGana = false;
                    boolean oponenteGana = false;
                    
                    while(jugador.getHp() > 0 && oponente.getHp() > 0) {
                        
                        System.out.print("Turno del jugador:\n "
                                + "1) Atacar\n"
                                + "2) Defender\n"
                                + "Tu eleccion: ");
                        opcion = sc.nextInt();
                        vs = sc.nextLine();
                        
                        if (opcion == 1) {
                            System.out.println("Has elegido atacar");
                            int ataque = rand.nextInt(101);
                            
                            if (oponentDefense) {
                                if(ataque > oponente.getCs()) {
                                    oponente.setHpC(oponente.getHp() - jugador.getDg() * 2);
                                    System.out.printf("Hp del oponente: %d%n",oponente.getHp());
                                }
                                
                                else if (ataque > oponente.getAc() + 15) {
                                    oponente.setHpC(oponente.getHp() - jugador.getDg());
                                    System.out.printf("Hp del oponente: %d%n",oponente.getHp());
                                }
                            }
                            
                            else {
                                 if (ataque > oponente.getCs()) {
                                    oponente.setHpC(oponente.getHp() - jugador.getDg() * 2);
                                    System.out.printf("Hp del oponente: %d%n",oponente.getHp());
                                } else if (ataque > oponente.getAc()) {
                                    oponente.setHpC(oponente.getHp() - jugador.getDg());
                                    System.out.printf("Hp del oponente: %d%n",oponente.getHp());
                                }
                            } 
                        }
                        
                        else{
                            System.out.println("Has elegido defender");
                            playerDefense = true;
                        }
                        
                        //Reset de la defensa del oponente
                        if (oponentDefense) {
                            oponentDefense = false;
                        }
                        
                        //Turno de la máquina
                        System.out.println("Turno del oponente: ");
                        
                        opcion = 1 + rand.nextInt(3);
                        
                        if (opcion == 1) {
                            System.out.println("El oponente ha elegido atacar");
                            int ataque = rand.nextInt(101);
                            
                            if (playerDefense) {
                                if(ataque > jugador.getCs()) {
                                    jugador.setHpC(jugador.getHp() - oponente.getDg() * 2);
                                    System.out.printf("Hp del jugador: %d%n",jugador.getHp());
                                }
                                
                                else if (ataque > jugador.getAc() + 15) {
                                    jugador.setHpC(jugador.getHp() - oponente.getDg());
                                    System.out.printf("Hp del jugador: %d%n",jugador.getHp());
                                }
                            }
                            
                            else {
                                 if (ataque > jugador.getCs()) {
                                    jugador.setHpC(jugador.getHp() - oponente.getDg() * 2);
                                    System.out.printf("Hp del jugador: %d%n",jugador.getHp());
                                } else if (ataque > jugador.getAc()) {
                                    jugador.setHpC(jugador.getHp() - oponente.getDg());
                                    System.out.printf("Hp del jugador: %d%n",jugador.getHp());
                                }
                            } 
                        }
                        
                        else {
                            System.out.println("El oponente ha decidido defender");
                            oponentDefense = true;
                        }
                        
                        //Reset de la defensa del jugador
                        if (playerDefense) {
                            playerDefense = false;
                        }
                        
                        if (oponente.getHp() < 0) {
                            jugadorGana = true;
                        }
                    }
                    
                    if (jugadorGana) {
                        System.out.println("Felicidades has ganado!");
                    }
                    else{
                        System.out.println("Ha ganado tu oponente");
                    }
                    break;
                case 6:
                    break OUTER;
            }
        }
    }
    
}
