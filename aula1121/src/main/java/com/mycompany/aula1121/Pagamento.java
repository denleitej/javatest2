
package com.mycompany.aula1121;

public class Pagamento implements Avista, Cartao, Pix{
    
    private int id;
    private Cliente cliente;
    private double valorOriginal;
    private double valorCalculado;
    private int tipoPagamento;
    
    public Pagamento(int id, double vO, int tp){
        this.id = id;
        this.valorOriginal = vO;
        this.tipoPagamento = tp;
        
        calcularPagamento();
        
    }

    public void Imprimir(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-- ID da compra: " + this.id);
        System.out.println("\n-- Cliente responsável: " + this.cliente.getNome());
        System.out.println("\n-- Valor original do produto: " + this.valorOriginal + " Reais");
        System.out.println("\n-- Valor após descontos e/ou juros: " + this.valorCalculado + " Reais \n");
        
        switch (this.tipoPagamento) {
            case 1:
                System.out.println("-- Tipo de pagamento: À Vista\n\n");
                break;
            case 2:
                System.out.println("-- Tipo de pagamento: Cartão\n\n");
                break;
            case 3:
                System.out.println("-- Tipo de pagamento: Pix\n\n");
                break;
            default:
                break;
        }
      
    }
    
    public void calcularPagamento(){
        switch (this.tipoPagamento) {
            case 1:
                calcularAVista();
                break;
            case 2:
                calcularCartao();
                break;
            case 3:
                calcularPix();
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
    
    @Override
    public double calcularAVista(){
        this.valorCalculado = this.valorOriginal*0.9;
        return this.valorCalculado;
    }
    
    @Override
    public double calcularCartao(){
        this.valorOriginal = this.valorOriginal*1.05;
        return this.valorCalculado;
    }
    
    @Override
    public double calcularPix(){
        this.valorCalculado = this.valorOriginal*0.95;
        return this.valorCalculado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public double getValorCalculado() {
        return valorCalculado;
    }

    public void setValorCalculado(double valorCalculado) {
        this.valorCalculado = valorCalculado;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    
}
