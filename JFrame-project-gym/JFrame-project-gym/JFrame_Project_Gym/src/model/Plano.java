package model;

public class Plano {
    private int idPlano;
    private String tipo;
    private double valor;
    private int duracaoMeses;

    public Plano(int idPlano, String tipo, double valor, int duracaoMeses) {
        this.idPlano = idPlano;
        this.tipo = tipo;
        this.valor = valor;
        this.duracaoMeses = duracaoMeses;
    }

    public int getIdPlano() { return idPlano; }
    public String getTipo() { return tipo; }
    public double getValor() { return valor; }
    public int getDuracaoMeses() { return duracaoMeses; }

    public void setIdPlano(int idPlano) { this.idPlano = idPlano; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setValor(double valor) { this.valor = valor; }
    public void setDuracaoMeses(int duracaoMeses) { this.duracaoMeses = duracaoMeses; }

    @Override
    public String toString() {
        return "Plano: " + tipo + " | Valor: R$" + valor + " | Duração: " + duracaoMeses + " mês(es)";
    }
}