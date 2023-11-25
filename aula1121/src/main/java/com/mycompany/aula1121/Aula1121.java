package com.mycompany.aula1121;


public class Aula1121 {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("João", "15487896365");
        Cliente c2 = new Cliente("Maria", "23559874154");
        
        c1.pagar(1, 100, 1);
        c1.pagar(2, 100, 2);
        c1.pagar(3, 100, 3);
        
        c2.pagar(1, 1000, 1);
        c2.pagar(2, 1000, 2);
        c2.pagar(3, 1000, 3);
        
        c1.imprimirCompra();
        c2.imprimirCompra();
        
        c1.valorGasto();
        c2.valorGasto();
        
    }
}
