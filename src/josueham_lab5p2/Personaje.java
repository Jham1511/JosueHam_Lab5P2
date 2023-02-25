/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josueham_lab5p2;

/**
 *
 * @author skxka
 */
public class Personaje {
    private String nombre, poder, debilidad, universo;
    private int fuerza,agilidad,mental, hp;

    public Personaje(String nombre, String poder, String debilidad, String universo, int fuerza, int agilidad, int mental, int hp) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.mental = mental;
        this.hp = hp;
    }

    public Personaje() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Nombre -> " + nombre 
                + "\nPoder -> " + poder 
                + "\nDebilidad ->" + debilidad 
                + "\nUniverso -> " + universo 
                + "\nFuerza ->  " + fuerza 
                + "\nAgilidad Fisica -> " + agilidad 
                + "\nAgilidad Mental -> " + mental 
                + "\nHP -> " + hp;
    }
    
    
}
