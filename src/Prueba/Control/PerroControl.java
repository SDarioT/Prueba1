/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba.Control;

import Prueba.Servicio.PerroServicio;
import Prueba.modelo.Perro;
import Prueba.vista.Pr1;
import java.util.List;

/**
 *
 * @author dario_t.
 */
public class PerroControl {
    
    private final PerroServicio perroServicio = new PerroServicio();
    
    public Perro crear(String [] args){
        var perro = new Perro(args[0],args[1],args[2],Integer.valueOf(args[3]));// integer para pasdasr entero a letras
        this.perroServicio.crear(perro);
        return perro;
       
    }
    public List<Perro> listar(){
        return this.perroServicio.listar();
    }
    
}
