/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_davidbendeck;

import java.util.Random;

/**
 *
 * @author davidbendeck
 */
public class Personaje {
    Random rand = new Random();
    
    // ATRIBUTOS
    
    //subjetivos
    private String clase;
    private String nombre;
    private String raza;
    private int estatura;
    private int peso;
    private int edad;
    private String descripcion;
    private String nacionalidad;
    
    //asignados
    private int hp;
    private int cs;
    private int ac;
    private int dg;
    
    //CONSTRUCTOR

    public Personaje(String clase, String nombre, String raza, int estatura, int peso, int edad, String descripcion, String nacionalidad) {
        this.clase = clase;
        this.nombre = nombre;
        setRaza(raza);
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.descripcion = descripcion;
        setNacionalidad(nacionalidad);
        setHp();
        setCs();
        setAc();
        setDg();
    }
    
    //GETTERS

    public Random getRand() {
        return rand;
    }

    public String getClase() {
        return clase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEstatura() {
        return estatura;
    }

    public int getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getHp() {
        return hp;
    }

    public int getCs() {
        return cs;
    }

    public int getAc() {
        return ac;
    }

    public int getDg() {
        return dg;
    }
    
    //SETTERS

    public void setClase(String clase) {
        if (clase.equals("Clerigo") || clase.equals("Barbaro") || clase.equals("Mago") || clase.equals("Picaro"))
            this.clase = clase;
        else{
            this.clase = "Barbaro";
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        if (raza.equals("Mediano") || raza.equals("Enano") || raza.equals("Elfo") || raza.equals("Humano"))
            this.raza = raza;
        else{
            this.raza = "Humano";
        }
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad.equals("Norfair") || nacionalidad.equals("Brinstar") || nacionalidad.equals("Maridia") || nacionalidad.equals("Zebes") || nacionalidad.equals("Crateria"))
            this.nacionalidad = nacionalidad;
        else {
            this.nacionalidad = "Zebes";
        }
        
    }

    public void setHp() {

        switch (raza) {
            case "Mediano":
                hp = 50 + rand.nextInt(11);
                break;
            case "Enano":
                hp = 80 + rand.nextInt(21);
                break;
            case "Elfo":
                hp = 50 + rand.nextInt(21);
                break;
            case "Humano":
                hp = 40 + rand.nextInt(36);
                break;
        }
    }
    
    public void setHpC(int hp) {
        this.hp = hp;
    }

    public void setCs() {
        switch (clase) {
            case "Clerigo":
                cs = 97;
                break;
            case "Barbaro":
                cs = 93;
                break;
            case "Mago":
                cs = 101;
                break;
            case "Picaro":
                cs = 80;
                break;
        }
        
    }

    public void setAc() {
        switch (clase) {
            case "Clerigo":
                ac = 40;
                break;
            case "Barbaro":
                ac = 65;
                break;
            case "Mago":
                ac = 20;
                break;
            case "Picaro":
                ac = 50;
                break;
        }
    }

    public void setDg() {
       switch (clase) {
            case "Clerigo":
                dg = 5 + rand.nextInt(11);
                break;
            case "Barbaro":
                dg = 15 + rand.nextInt(16);
                break;
            case "Mago":
                dg = 5 + rand.nextInt(6);
                break;
            case "Picaro":
                dg = 15 + rand.nextInt(11);
                break;
        }
    }
    
    //METODOS
    
    public void imprimir() {
        System.out.printf(" Clase: %s%n Nombre: %s%n Raza: %s%n Estatura: %d%n Peso: %d%n Edad: %d%n Descripción: %s%n Nacionalidad: %s%n HP: %d%n CS: %d%n AC: %d%n DG: %d%n",clase,nombre,raza,estatura,peso,edad,descripcion,nacionalidad,hp,cs,ac,dg);
    }
    
}
