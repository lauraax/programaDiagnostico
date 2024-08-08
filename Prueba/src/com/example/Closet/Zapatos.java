/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Closet;

/**
 *
 * @author laura
 */
public class Zapatos extends Ropa{
    public Zapatos (String estilo, String color){
        super(estilo, color);
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Estilo: " + getEstilo() + ",/ Color: " + getColor());
    }
    
}
