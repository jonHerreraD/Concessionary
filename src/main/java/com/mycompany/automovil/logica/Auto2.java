/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author diazj
 */
@Entity
public class Auto2 implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String anio;
    private String marca;
    private String color;
    private String motor;
    private String placa;
    private String cantPuertas;
    
    public Auto2(){
        
    }
    
    public Auto2(int id, String anio, String marca, String color, String motor, String placa, String cantPuertas){
        this.id = id;
        this.anio = anio;
        this.marca = marca;
        this.color = color;
        this.motor = motor;
        this.placa = placa;
        this.cantPuertas = cantPuertas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(String cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    
    
    
}
