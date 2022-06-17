/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Prueba.Servicio;

import Prueba.modelo.Auto;
import java.util.List;

/**
 *
 * @author dario_t.
 */
public interface IAutoServicio {
    public Auto crear(Auto auto);
    public List<Auto>listar();
   

    
}
