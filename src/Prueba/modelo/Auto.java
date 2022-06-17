/*//modelo Iservicio, servicio, control, ventana. ojo por cada taza de arroz van 2 de agua.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba.modelo;

/**
 *
 * @author dario_t.
 */

public class Auto {
    private int codigo;
    private String modelo;
    private String placa;
    private int year;

    public Auto(int codigo, String modelo, String placa, int year) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.placa = placa;
        this.year = year;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto{" + "codigo=" + codigo + ", modelo=" + modelo + ", placa=" + placa + ", year=" + year + '}';
    }
    
    
}
