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
 * @author pedro
 */
public class Empregado {
    
    private String nome;
    private String dataNasc;
    private String numeroCnh;

    public Empregado(String nome, String dataNasc, String numeroCnh) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.numeroCnh = numeroCnh;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }
    
    
     public int calculaIdade( ) {

        DateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        Date dataNascInput = null;

        try {

            dataNascInput = sdf.parse(this.dataNasc);

        } catch (Exception e) {
        }

        Calendar dateOfBirth = new GregorianCalendar();

        dateOfBirth.setTime(dataNascInput);

// Cria um objeto calendar com a data atual
        Calendar today = Calendar.getInstance();

// Obtém a idade baseado no ano
        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

        dateOfBirth.add(Calendar.YEAR, age);

        if (today.before(dateOfBirth)) {

            age--;

        }

        return age;

    }
    
    
}
