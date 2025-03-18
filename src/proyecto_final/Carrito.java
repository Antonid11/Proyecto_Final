/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.ArrayList;

/**
 *
 * @author mayel
 */
public class Carrito {

    private ArrayList<Producto> productos;
    private double total;

    public Carrito() {
        productos = new ArrayList<>();
        total = 0.0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(int index) {
        if (index >= 0 && index < productos.size()) {
            total -= productos.get(index).getPrecio();
            productos.remove(index);
        }
    }

    public void vaciarCarrito() {
        productos.clear();
    }

    public int getCantidadProductos() {
        return productos.size();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double calcularTotal(int index) {
        if (index >= productos.size()) {//caso base cuando lleguemos al final de la lista
            return 0.0;
        }
        return productos.get(index).getPrecio() + calcularTotal(index + 1);//suma el precio del producto actual mas el total de los demas productos
    }

}
