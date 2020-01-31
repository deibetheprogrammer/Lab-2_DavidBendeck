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
    private String Nacionalidad;
    
    //asignados
    private int hp;
    private int cs;
    private int ac;
    private int dg;
    
    //CONSTRUCTOR

    public Personaje(String clase, String nombre, String raza, int estatura, int peso, int edad, String descripcion, String Nacionalidad, int hp, int cs, int ac, int dg) {
        this.clase = clase;
        this.nombre = nombre;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.descripcion = descripcion;
        this.Nacionalidad = Nacionalidad;
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
        return Nacionalidad;
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

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setHp() {
        
    }

    public void setCs() {
        
    }

    public void setAc() {
        
    }

    public void setDg() {
       
    }
    
    
    
}
