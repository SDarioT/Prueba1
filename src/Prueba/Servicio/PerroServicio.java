/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba.Servicio;

import Prueba.modelo.Perro;
import Prueba.vista.Pr1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dario_t.
 */
public class PerroServicio implements IPerroServicio{
    
    private static List<Perro> perroList = new ArrayList<>();
    

    @Override
    public Perro crear(Perro perro) {
        this.perroList.add(perro);
        return perro;
    }

    @Override
    public List<Perro> listar() {
        return this.perroList;
    }

    @Override
    public int buscarPosicion(Perro perro) {
       // int posicion = -1;
        //int(var p:this.perroList){
        //posicion++;
        int posicion=-1;
        for(var p:this.perroList){
            posicion++;
            if(p.getNombre()==perro.getNombre()){
                break;
            }
        }
        return posicion;
    }
}
