package com.example.model;

public class Producto {
    private String nombre;
    private double precio;
    private String detalles;
    private String imagen;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, String detalles, String imagen, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.detalles = detalles;
        this.imagen = imagen;
        this.stock = stock;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public String getDetalles() { return detalles; }
    public void setDetalles(String detalles) { this.detalles = detalles; }
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
