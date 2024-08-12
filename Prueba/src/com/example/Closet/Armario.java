/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Closet;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author laura
 */
public class Armario {
    private Ropa[] camisetas;
    private Ropa[] pantalones;
    private Ropa[] zapatos;
    private Ropa camisetaSeleccionada;
    private Ropa pantalonSeleccionado;
    private Ropa zapatosSeleccionados;
    private Random random;
    private Scanner scanner;
    
    public Armario(){
        camisetas = new Ropa[]{
            new Camiseta("Baby tee", "negro"),
            new Camiseta("Deportiva", "Rojo"),
            new Camiseta("Crop top", "blanco")  
        };
        pantalones = new Ropa[]{
            new Pantalon("Falda tableada", "blanco"),
            new Pantalon("Cargo", "negro"),
            new Pantalon("Jean", "Azul oscuro")
        };
        zapatos = new Ropa[]{
            new Zapatos("Botas", "negro"),
            new Zapatos("Deportivo", "Blanco"),
            new Zapatos("Casuales", "Blanco")     
        };
        
        random = new Random();
        scanner = new Scanner(System.in);
                
                
    }
    
    public void mostrarMenu(){
        while(true){
            System.out.println("\nBienvenido al Armario");
            System.out.println("1. Elegir una camiseta");
            System.out.println("2. Elegir un pantalon");
            System.out.println("3. Elegir unos zapatos");
            System.out.println("4. Aleatorio");
            System.out.println("5. Mostrar resultado");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
                        
            int opcion = scanner.nextInt();
            
            switch(opcion){
                case 1 -> {
                    System.out.println("Elige una camiseta: ");
                    for (int i = 0; i < camisetas.length; i++){
                        System.out.println((i+1)+"." + camisetas[i].getEstilo() + " " +camisetas[i].getColor() );
                    }
                    int opcionCamiseta = scanner.nextInt() - 1;
                    camisetaSeleccionada = camisetas[opcionCamiseta];
                }
                case 2 -> {
                    System.out.println("Elige un pantalon: ");
                    for (int i = 0; i < pantalones.length ; i++){
                      System.out.println((i+1)+"." + pantalones[i].getEstilo() + " " +pantalones[i].getColor() );  
                    }
                    int opcionPantalon = scanner.nextInt() - 1;
                    pantalonSeleccionado = pantalones[opcionPantalon];
                }
                case 3 -> {
                    System.out.println("Elige unos zapatos: ");
                    for (int i = 0; i < zapatos.length ; i++){
                      System.out.println((i+1)+"." + zapatos[i].getEstilo() + " " +zapatos[i].getColor() );  
                    }
                    int opcionZapatos = scanner.nextInt() - 1;
                    zapatosSeleccionados = zapatos[opcionZapatos];
                }
                case 4 -> {
                    camisetaSeleccionada = camisetas[random.nextInt(camisetas.length)];
                    pantalonSeleccionado = pantalones[random.nextInt(pantalones.length)];
                    zapatosSeleccionados = zapatos[random.nextInt(zapatos.length)];
                    System.out.println("Ropa seleccionada aleatoriamente.");
                }
                case 5 ->{
                    System.out.println("\nTu seleccion final es:");
                    if (camisetaSeleccionada != null) {
                        camisetaSeleccionada.mostrarInfo();
                    } else {
                        System.out.println("No has seleccionado una camiseta.");
                    }
                    if (pantalonSeleccionado != null) {
                        pantalonSeleccionado.mostrarInfo();
                    } else {
                        System.out.println("No has seleccionado un pantalon.");
                    }
                    if (zapatosSeleccionados != null) {
                        zapatosSeleccionados.mostrarInfo();
                    } else {
                        System.out.println("No has seleccionado unos zapatos.");
                    }
                    
                }
                case 6 ->{
                    System.out.println("Saliendo del programa");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opcion no valida. Intentalo de nuevo.");
            }   
         
        }
        
    }
    
   public static void main(String[] args) {
       Armario armario = new Armario();
       armario.mostrarMenu();
               
        }
                
}
                
    
    

