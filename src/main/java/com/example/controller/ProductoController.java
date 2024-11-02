package com.example.controller;

import com.example.dao.ProductoDAO;
import com.example.model.Producto;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class ProductoController {
    private ProductoDAO productoDAO;

    public ProductoController() {
        this.productoDAO = new ProductoDAO();
    }

    public List<Producto> obtenerProductos() {
        List<Producto> productos;
        try {
            productos = productoDAO.cargarProductos();
        } catch (IOException e) {
            e.printStackTrace();
            productos = new ArrayList<>();
        }
        return productos;
    }

    public void actualizarStockProducto(String nombreProducto, int cantidadComprada) {
        List<Producto> productos = obtenerProductos();
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto) && producto.getStock() >= cantidadComprada) {
                producto.setStock(producto.getStock() - cantidadComprada);
            }
        }
        try {
            productoDAO.guardarProductos(productos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
