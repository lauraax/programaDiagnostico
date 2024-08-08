/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Closet;

/**
 *
 * @author laura
 */
public abstract class Ropa {
    private String estilo;
    private String color;

    public Ropa(String estilo, String color) {
        this.estilo = estilo;
        this.color = color;
    }
    
    public String getEstilo(){return estilo;}
    public void setEstilo(String estilo){this.estilo = estilo;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    
    public abstract void mostrarInfo();
}
