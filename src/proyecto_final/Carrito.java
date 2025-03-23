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
    private double iva;

    public Carrito() {
        productos = new ArrayList<>();
        total = 0.0;
        iva = 0.0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    public void eliminarProducto(int index) {
        if (index >= 0 && index < productos.size()) {
            Producto productoEliminado = productos.get(index);
            productoEliminado.setStock(productoEliminado.getStock() + 1); // Incrementar el stock
            total -= productoEliminado.getPrecio();
            productos.remove(index);
        }
    }

    public void vaciarCarrito() {
        for (Producto producto : productos) {
            producto.setStock(producto.getStock() + 1); // Incrementar el stock de cada producto
        }
        productos.clear();
        total = 0.0;
        iva = 0.0;
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

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double calcularSubTotal(int index) {
        if (index >= productos.size()) {//caso base cuando lleguemos al final de la lista
            return 0.0;
        }
        return productos.get(index).getPrecio() + calcularSubTotal(index + 1);//suma el precio del producto actual mas el total de los demas productos
    }

    public double calcularIVA() {
        double sub = calcularSubTotal(0);
        iva = sub * 0.15;
        return iva;
    }

    public double calcularTotalIVA() {
        double sub = calcularSubTotal(0);
        double iva = calcularIVA();
        return sub + iva;
    }
}
