
package com.mycompany.aula1121;

import java.util.*;

public class Cliente {
    
    private String nome;
    private String cpf;
    List<Pagamento> pagamentos;
    
    
    public Cliente(String n, String c){
        this.nome = n;
        this.cpf = c;
        pagamentos = new ArrayList<>();
    }
    
    public void pagar(int id, double vO, int tp){
        Pagamento p1 = new Pagamento(id, vO, tp);
        p1.setCliente(this);
        pagamentos.add(p1);
    }
    
    public void imprimirCompra(){
        for (Pagamento p: pagamentos){
            p.Imprimir();
        }
    }
    
    public void valorGasto(){
        double valorGasto = 0;
        
        for (Pagamento p: pagamentos){           
            valorGasto += p.getValorCalculado();
        }

        System.out.println("-- O valor total gasto por " + this.nome + " foi de: " + valorGasto + " Reais \n");
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
