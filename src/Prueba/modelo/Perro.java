/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba.modelo;

/**
 *
 * @author dario_t.
 */
public class Perro {
    private String nombre;
    private String dueno;
    private String color;
    private int year;

    public Perro(String nombre, String dueno, String color, int year) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.color = color;
        this.year = year;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", dueno=" + dueno + ", color=" + color + ", year=" + year + '}';
    }
    
}
