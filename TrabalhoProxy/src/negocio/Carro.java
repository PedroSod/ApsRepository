/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author pedro
 */
public class Carro  implements InterfaceCarro{

    private int ano;
    private String placa;
    private String marca;
    private String modelo;
    private String chassi;

    public Carro(int ano, String placa, String marca, String modelo, String chassi) {
        this.ano = ano;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
    }

   

  

    @Override
    public void manobrar(Empregado empregado) {
       System.out.println(empregado.getNome() + " pode manobrar " + " veículo " + this.marca
                    + " " + this.modelo + ", ano " + this.ano + ", placa " + this.placa + ", chassi " + this.chassi);
        }

   
}
