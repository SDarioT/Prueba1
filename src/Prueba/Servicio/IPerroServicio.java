/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Prueba.Servicio;

import Prueba.modelo.Perro;
import Prueba.vista.Pr1;
import java.util.List;

/**
 *
 * @author dario_t.
 */
public interface IPerroServicio {
    public Perro crear(Perro perro);
    public List<Perro> listar();
    public int buscarPosicion(Perro perro);
    
}
