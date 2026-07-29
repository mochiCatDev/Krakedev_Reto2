package com.krakedev.demo.test;
import com.krakedev.demo.Producto;

public class TestProducto {
    public static void main(String[] args) {
        Producto p = new Producto(1, "Galletas");
        p.setDescripcion("Galletas de chocolate");
        p.setPeso(150.5);

        System.out.println("Código: " + p.getCodigo());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Descripción: " + p.getDescripcion());
        System.out.println("Peso: " + p.getPeso());
    }
}
