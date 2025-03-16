/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

public class Catalogo {

    private Producto[][] productos;
    private int Categorias = 4;
    private int Productos_Categoria = 5;

    public Catalogo() {
        productos = new Producto[Categorias][Productos_Categoria];
        inicializarProductos();
    }

    private void inicializarProductos() {
        productos[0][0] = new Producto("Manzana", 12.50, "Frutas y Verduras", 100);
        productos[0][1] = new Producto("Plátano", 8.90, "Frutas y Verduras", 150);
        productos[0][2] = new Producto("Zanahoria", 15.00, "Frutas y Verduras", 80);
        productos[0][3] = new Producto("Lechuga", 18.50, "Frutas y Verduras", 60);
        productos[0][4] = new Producto("Tomate", 22.00, "Frutas y Verduras", 90);

        productos[1][0] = new Producto("Leche", 25.00, "Lácteos", 120);
        productos[1][1] = new Producto("Queso", 45.00, "Lácteos", 70);
        productos[1][2] = new Producto("Yogurt", 18.00, "Lácteos", 90);
        productos[1][3] = new Producto("Mantequilla", 32.00, "Lácteos", 50);
        productos[1][4] = new Producto("Crema", 28.00, "Lácteos", 60);

        productos[2][0] = new Producto("Arroz", 35.00, "Abarrotes", 200);
        productos[2][1] = new Producto("Frijol", 32.00, "Abarrotes", 180);
        productos[2][2] = new Producto("Aceite", 45.00, "Abarrotes", 100);
        productos[2][3] = new Producto("Azúcar", 28.00, "Abarrotes", 150);
        productos[2][4] = new Producto("Sal", 15.00, "Abarrotes", 200);

        productos[3][0] = new Producto("Agua", 15.00, "Bebidas", 300);
        productos[3][1] = new Producto("Refresco", 22.00, "Bebidas", 250);
        productos[3][2] = new Producto("Jugo", 18.00, "Bebidas", 180);
        productos[3][3] = new Producto("Cerveza", 28.00, "Bebidas", 120);
        productos[3][4] = new Producto("Café", 65.00, "Bebidas", 90);
    }

    public Producto[][] getProductos() {
        return productos;
    }

    public void setProductos(Producto[][] productos) {
        this.productos = productos;
    }

    public Producto getProducto(int categoria, int index) {
        if (categoria >= 0 && categoria < Categorias && index >= 0 && index < Productos_Categoria) {
            return productos[categoria][index];
        }
        return null;
    }

    public Producto[] getProductosCategoria(int categoria) {
        if (categoria >= 0 && categoria < Categorias) {
            return productos[categoria];
        }
        return null;
    }

    public int getCategorias() {
        return Categorias;
    }

    public void setCategorias(int Categorias) {
        this.Categorias = Categorias;
    }

    public int getProductos_Categoria() {
        return Productos_Categoria;
    }

    public void setProductos_Categoria(int Productos_Categoria) {
        this.Productos_Categoria = Productos_Categoria;
    }

    public boolean existeProducto(int id) {
        for (int i = 0; i < Categorias; i++) {
            for (int j = 0; j < Productos_Categoria; j++) {
                if (productos[i][j] != null && productos[i][j].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public Producto buscarProductoPorID(int id) {
        for (int i = 0; i < Categorias; i++) {
            for (int j = 0; j < Productos_Categoria; j++) {
                if (productos[i][j] != null && productos[i][j].getId() == id) {
                    return productos[i][j];
                }
            }
        }
        return null;
    }
}
