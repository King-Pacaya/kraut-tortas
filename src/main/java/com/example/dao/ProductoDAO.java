package com.example.dao;

import com.example.model.Producto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class ProductoDAO {
    private static final String PRODUCTOS_FILE_PATH = "src/main/resources/productos.json";

    public List<Producto> cargarProductos() throws IOException {
        try (FileReader reader = new FileReader(PRODUCTOS_FILE_PATH)) {
            Type tipoListaProductos = new TypeToken<List<Producto>>(){}.getType();
            return new Gson().fromJson(reader, tipoListaProductos);
        }
    }

    public void guardarProductos(List<Producto> productos) throws IOException {
        try (FileWriter writer = new FileWriter(PRODUCTOS_FILE_PATH)) {
            new Gson().toJson(productos, writer);
        }
    }
}
