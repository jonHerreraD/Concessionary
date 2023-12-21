
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author diazj
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    /**
     * Creates a new Auto object and sets the information in that object.
     * Then, our persistence controller will call the guardar method, recieving by parameter
     * our Auto object.
     * That's because Controller only works for the logic, its purpose is to give orders to 
     * Persistence Controller to let it know what actions it should perform in order to make
     * the desired changes in our data base.
     */
    public void guardar(String anio, String motor, String cantPuertas, String marca, String color, String placa) {
     
        Auto2 auto = new Auto2();
        auto.setAnio(anio);
        auto.setMotor(motor);
        auto.setCantPuertas(cantPuertas);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setPlaca(placa);
        
        controlPersis.guardar(auto);
        
    }

    public List<Auto2> traerAutos() {
       return controlPersis.traerAutos();
    }

    public Auto2 traerAuto(int id_car) {
       return controlPersis.traerAuto(id_car);
    }

    public void modificarAuto(Auto2 auto, String anio, String cantPuertas, String motor, String marca, String color, String placa) {
        auto.setAnio(anio);
        auto.setCantPuertas(cantPuertas);
        auto.setMotor(motor);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setPlaca(placa);
        
        //Modifico mascota
        controlPersis.modificarAuto(auto);
        
    }

    public void borrarAuto(int id_car) {
        controlPersis.borrarAuto(id_car);
    }
    
}
