/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapa.programação.i;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Tunts
 */
public class MapaProgramaçãoI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciando um novo evento
        Evento eventoRockInRio = new Evento();
       
        eventoRockInRio.setValuesClass("Um belo show", new Date(), (float) 150.00, 3, new ArrayList());
        
        IngressoPista ingresso1 = new IngressoPista();
        IngressoVIP ingresso2 = new IngressoVIP();
        IngressoCamarote ingresso3 = new IngressoCamarote();
        IngressoPista ingresso4 = new IngressoPista();
        IngressoPista ingresso5 = new IngressoPista();



        
        ingresso1.armazenarDadosdoIngresso(eventoRockInRio, "123.456.789-12", "Jose");
        ingresso1.imprimirValor();
        ingresso1.mostrarResumo();
        eventoRockInRio.venderIngresso(ingresso1);
        
        ingresso2.armazenarDadosdoIngresso(eventoRockInRio, "987.654.321-21", "Larissa");
        ingresso2.imprimirValor();
        ingresso2.mostrarResumo();
        eventoRockInRio.venderIngresso(ingresso2);
        
        ingresso3.armazenarDadosdoIngresso(eventoRockInRio, "456.123.789-11", "Alisson");
        ingresso3.imprimirValor();
        ingresso3.mostrarResumo();
        eventoRockInRio.venderIngresso(ingresso3);
        
        ingresso4.armazenarDadosdoIngresso(eventoRockInRio, "434.121.565-98", "Gustavo");
        ingresso4.imprimirValor();
        ingresso4.mostrarResumo();
        eventoRockInRio.venderIngresso(ingresso4);
        
        ingresso5.armazenarDadosdoIngresso(eventoRockInRio, "434.121.565-98", "Gustavo");
        ingresso5.imprimirValor();
        ingresso5.mostrarResumo();
        eventoRockInRio.venderIngresso(ingresso5);
        
        eventoRockInRio.mostrarIngressosVendidos();

        
        // TODO code application logic here
    }
    
}
