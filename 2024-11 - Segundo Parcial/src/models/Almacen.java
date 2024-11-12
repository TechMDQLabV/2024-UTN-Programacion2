package models;

import exceptions.StockInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    private List<T> productos = new ArrayList<>();

    // Agregar producto al almacén.
    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    // Eliminar producto del almacén.
    public void eliminarProducto(T producto) {
        productos.remove(producto);
    }

    // Calcular el valor total del inventario.
    public double calcularValorTotalInventario() {
        double total = 0;
        for (T producto : productos) {
            total += producto.calcularPrecioFinal();
        }
        return total;
    }

    // Obtener el stock de un producto en específico.
    public int obtenerStock(T producto) {
        int cantidad = 0;
        for (T p : productos) {
            if (p.equals(producto)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    // Vender productos, lanzar excepción si no hay suficiente stock.
    public void venderProducto(T producto, int cantidad) throws StockInsuficienteException {
        if (obtenerStock(producto) < cantidad) {
            throw new StockInsuficienteException("No hay suficiente stock del producto: " + producto.getNombre());
        }
        for (int i = 0; i < cantidad; i++) {
            eliminarProducto(producto);
        }
    }
}

