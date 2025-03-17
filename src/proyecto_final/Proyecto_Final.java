/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_final;

import java.util.ArrayList;

public class Proyecto_Final {

    static String nombreUsuario;
    static Carrito carro = new Carrito ();
    static ArrayList<Producto> catalogoProductos = new ArrayList<>();
    static ArrayList<Producto> carrito = new ArrayList<>();
    static double totalCompra = 0.0;

    public static void main(String[] args) {
        PantallaInicio inicio = new PantallaInicio();
        inicio.setVisible(true);
    }
}
