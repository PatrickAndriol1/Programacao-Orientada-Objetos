package loja;

import exceptions.*;

public class Produto {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) throws NomeInvalidoException, ValorInvalidoException {
        setNome(nome);
        setValor(valor);
    }

    public void setNome(String nome) throws NomeInvalidoException{
        if(!(nome.length() < 3)){
            this.nome = nome;
            return;
        }
        throw new NomeInvalidoException();
    }
    public String getNome(){
        return this.nome;
    }

    public void setValor(double valor) throws ValorInvalidoException{
        if(!(valor <= 0)){
            this.valor = valor;
            return;
        }
        throw new ValorInvalidoException();
    }
    public double getValor(){
        return this.valor;
    }
}
