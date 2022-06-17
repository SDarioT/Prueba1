/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba.Control;

import Prueba.Servicio.AutoServicio;
import Prueba.modelo.Auto;
import java.util.List;

/**
 *
 * @author dario_t.
 */
public class AutoControl {
    
    
    private final AutoServicio autoServicio = new AutoServicio();
    

    public Auto crear(String[] args) {
        
        Auto auto = new Auto(Integer.valueOf(args[0]),args[1],args[2],Integer.valueOf(args[3]));
        this.autoServicio.crear(auto);
        return auto;    
    }
        
    public List<Auto> listar(){
        return this.autoServicio.listar();
    }
}
