
package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.logica.Auto2;
import com.mycompany.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diazj
 */
public class ControladoraPersistencia {

    //Creates an instance of AutoJpaController
    AutoJpaController autoJpa = new AutoJpaController();
    
    /**
     * Stores the Auto2 object recieved as parameter in our data base
     */
    public void guardar(Auto2 auto) {
       autoJpa.create(auto);
    }

    public List<Auto2> traerAutos() {
       return autoJpa.findAutoEntities();
    }

    public Auto2 traerAuto(int id_car) {
      return autoJpa.findAuto(id_car);
    }

    public void modificarAuto(Auto2 auto) {
         try {
            autoJpa.edit(auto);
           
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarAuto(int id_car) {
       try{
         autoJpa.destroy(id_car);
        
     } catch (NonexistentEntityException ex){
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     } 
    }
} 

