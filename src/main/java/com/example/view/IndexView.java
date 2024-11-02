package com.example.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.example.controller.ProductoController;
import com.example.model.Producto;

import java.util.List;

public class IndexView extends Application {
    private ProductoController productoController = new ProductoController();

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Label titulo = new Label("Bienvenido a Kraut Tortas");
        root.getChildren().add(titulo);

        List<Producto> productos = productoController.obtenerProductos();

        if (productos != null) {
            for (Producto producto : productos) {
                VBox productoBox = new VBox();
                Label nombre = new Label("Producto: " + producto.getNombre());
                Label precio = new Label("Precio: S/ " + producto.getPrecio());
                Button agregarCarrito = new Button("Agregar al carrito");

                agregarCarrito.setOnAction(e -> {
                    // Aquí llamamos a CarritoController para agregar al carrito
                });

                productoBox.getChildren().addAll(nombre, precio, agregarCarrito);
                root.getChildren().add(productoBox);
            }
        } else {
            root.getChildren().add(new Label("No hay productos disponibles."));
        }

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Kraut - Productos");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
