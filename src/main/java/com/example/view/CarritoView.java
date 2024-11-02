package com.example.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox; // Importación correcta de VBox
import javafx.stage.Stage;

import com.example.controller.ProductoController;
import com.example.model.Producto;

public class CarritoView extends Application {
    private ProductoController productoController = new ProductoController();

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Button confirmarPedidoButton = new Button("Confirmar Pedido");
        confirmarPedidoButton.setOnAction(e -> productoController.actualizarStockProducto("Torta de Chocolate", 1));
        root.getChildren().add(confirmarPedidoButton);

        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.setTitle("Carrito de Compras");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
