/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author aluno
 */
public class ProxyCarro implements InterfaceCarro{
    
   

    @Override
    public void manobrar(Empregado empregado) {
       if(empregado.calculaIdade() > 18 && empregado.getNumeroCnh() != "") {
           Carro carro = new Carro (2016, "KIB2013", "Honda", "Civic", "0909012390129");
           carro.manobrar(empregado);
       }else
            System.out.println(empregado.getNome() + " não pode manobrar");
    }
}
