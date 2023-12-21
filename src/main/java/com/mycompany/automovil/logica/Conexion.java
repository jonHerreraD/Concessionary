/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diazj
 */
public class Conexion {
  //Declaramos la variable para obtener la conexion
    private static Connection conexion;
    
    //Declaramos las variables para conectarnos a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/Concesionaria?serverTimezone=UTC";
    private static final String PASSWORD = "";
    private static final String USERNAME = "root";
    
    //Creamos el metodo para conectarnos a la BD
    public Connection abrirConexion() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            
            //Preguntemos si se realizo la conexion
            if(conexion != null){
                JOptionPane.showMessageDialog(null,"Conexion con exito .");
            }
            return conexion;
        }catch(ClassNotFoundException e){
            System.out.println("Error : "+e);
        }
        return conexion;
    }
    
    //Patron Singleton
    public Connection getInstance() throws SQLException{
        if(conexion == null){
            conexion = abrirConexion();
        }
        return conexion;
    }
    
    //Creamos el metodo para cerrar la conexion
    public void cerrarConexion() throws SQLException{
        try{
            conexion.close();
        }catch(SQLException e){
            System.out.println("Error : "+e);
            conexion.close();
        }finally{
            conexion.close();
        }
    }
}
