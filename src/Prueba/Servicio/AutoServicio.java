/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba.Servicio;

import Prueba.modelo.Auto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dario_t.
 */
////primero implemento metodos y luego crear e iniciar el arrayList pero que sea estatico
public class AutoServicio implements IAutoServicio{

    private static List<Auto> autoList = new ArrayList<>();
    @Override
    public Auto crear(Auto auto) {
        this.autoList.add(auto);
        return auto;
    }

    @Override
    public List<Auto> listar() {
        return this.autoList;
    }
    
}
