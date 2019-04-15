package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa tairo = new Pessoa( "Tairo", "Roberto", 30);
        Pessoa jessica = new Pessoa( "Jessica", "Milena", 18);
        Pessoa felipe = new Pessoa(   "Felipe", "Zeppelini", 18);

        pessoas.add(tairo);
        pessoas.add(jessica);
        pessoas.add(felipe);

        for (Pessoa pessoa : pessoas){
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }



    }
}
