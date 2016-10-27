/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprensentacao;
import negocio.Empregado;
import negocio.ProxyCarro;


/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("====================================");
        Empregado empregado = new Empregado("Pedro", "20/08/1990", "");
        System.out.println("Empregado");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("CNH: " + empregado.getNumeroCnh());
        System.out.println("Idade: " + empregado.calculaIdade());

        System.out.println("====================================");

        ProxyCarro carroProxy = new ProxyCarro();
        carroProxy.manobrar(empregado);

    }

}
