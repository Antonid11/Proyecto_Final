/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.Random;

public class Catalogo {

    static Random ran = new Random();
    private Producto[][] productos;
    private int Categorias = 4;
    private int Productos_Categoria = 7;

    public Catalogo() {
        productos = new Producto[Categorias][Productos_Categoria];
        inicializarProductos();
    }

    private void inicializarProductos() {
        for (int i = 0; i < Categorias; i++) {
            for (int j = 0; j < Productos_Categoria; j++) {
                int id;
                do {
                    id = generarIdAleatorio(); // Genera un ID aleatorio
                } while (idYaExiste(id)); // Verifica si el ID ya existe

                // Asigna el producto con el ID único
                switch (i) {
                    case 0:
                        switch (j) {
                            case 0:
                                productos[i][j] = new Producto(id, "Manzana", 12.50, "Frutas y Verduras", 100);
                                break;
                            case 1:
                                productos[i][j] = new Producto(id, "Plátano", 8.90, "Frutas y Verduras", 150);
                                break;
                            case 2:
                                productos[i][j] = new Producto(id, "Zanahoria", 15.00, "Frutas y Verduras", 80);
                                break;
                            case 3:
                                productos[i][j] = new Producto(id, "Lechuga", 18.50, "Frutas y Verduras", 60);
                                break;
                            case 4:
                                productos[i][j] = new Producto(id, "Tomate", 22.00, "Frutas y Verduras", 90);
                                break;
                            case 5:
                                productos[i][j] = new Producto(id, "Pera", 10.23, "Frutas y Verduras", 100);
                                break;
                            case 6:
                                productos[i][j] = new Producto(id, "Brócoli", 17.12, "Frutas y Verduras", 140);
                                break;
                            default:
                                break;
                        }
                        break;

                    case 1:
                        switch (j) {
                            case 0:
                                productos[i][j] = new Producto(id, "Leche", 25.00, "Lácteos", 120);
                                break;
                            case 1:
                                productos[i][j] = new Producto(id, "Queso", 45.00, "Lácteos", 70);
                                break;
                            case 2:
                                productos[i][j] = new Producto(id, "Yogurt", 18.00, "Lácteos", 90);
                                break;
                            case 3:
                                productos[i][j] = new Producto(id, "Mantequilla", 32.00, "Lácteos", 50);
                                break;
                            case 4:
                                productos[i][j] = new Producto(id, "Crema", 28.00, "Lácteos", 60);
                                break;
                            case 5:
                                productos[i][j] = new Producto(id, "Margarina", 50.00, "Lácteos", 70);
                                break;
                            case 6:
                                productos[i][j] = new Producto(id, "Quesillo", 25.00, "Lácteos", 80);
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        switch (j) {
                            case 0:
                                productos[i][j] = new Producto(id, "Arroz", 35.00, "Abarrotes", 200);
                                break;
                            case 1:
                                productos[i][j] = new Producto(id, "Frijol", 32.00, "Abarrotes", 180);
                                break;
                            case 2:
                                productos[i][j] = new Producto(id, "Aceite", 45.00, "Abarrotes", 100);
                                break;
                            case 3:
                                productos[i][j] = new Producto(id, "Azúcar", 28.00, "Abarrotes", 150);
                                break;
                            case 4:
                                productos[i][j] = new Producto(id, "Sal", 15.00, "Abarrotes", 200);
                                break;
                            case 5:
                                productos[i][j] = new Producto(id, "Pimienta", 20.00, "Abarrotes", 180);
                                break;
                            case 6:
                                productos[i][j] = new Producto(id, "Comino", 10.00, "Abarrotes", 100);
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        switch (j) {
                            case 0:
                                productos[i][j] = new Producto(id, "Agua", 15.00, "Bebidas", 300);
                                break;
                            case 1:
                                productos[i][j] = new Producto(id, "Refresco", 22.00, "Bebidas", 250);
                                break;
                            case 2:
                                productos[i][j] = new Producto(id, "Jugo", 18.00, "Bebidas", 180);
                                break;
                            case 3:
                                productos[i][j] = new Producto(id, "Cerveza", 28.00, "Bebidas", 120);
                                break;
                            case 4:
                                productos[i][j] = new Producto(id, "Café", 65.00, "Bebidas", 90);
                                break;
                            case 5:
                                productos[i][j] = new Producto(id, "Malteadas", 40.00, "Bebidas", 85);
                                break;
                            case 6:
                                productos[i][j] = new Producto(id, "Té", 50.00, "Bebidas", 80);
                                break;
                            default:
                                break;
                        }
                        break;

                }
            }
        }
    }

    private int generarIdAleatorio() {
        int id = ran.nextInt(100, 1000);// Genera un ID aleatorio entre 0 y 999
        return id;
    }

    private boolean idYaExiste(int id) {
        for (int i = 0; i < Categorias; i++) {
            for (int j = 0; j < Productos_Categoria; j++) {
                if (productos[i][j] != null && productos[i][j].getId() == id) {
                    return true; // El ID ya existe
                }
            }
        }
        return false; // El ID no existe
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
}
