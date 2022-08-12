/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa.programação.i;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Tunts
 */
public class Evento {
    private String nome;
    private Date data;
    private float valor;
    private int capacidadeMaxima;
    private List<Ingresso> ingressosVendidos;
    
    
    public String getName(){
        return nome;
    }
    
    public String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(this.data);
        return dataFormatada;
    }
    
    public float getValue(){
        return valor;
    }
    
    public int getMaximumCapacity(){
        return capacidadeMaxima;
    }

    public List<Ingresso> getTicketsSold(){
        return ingressosVendidos;
    }
    
    public void venderIngresso(Ingresso ingresso){
        if(ingressosVendidos.size() < capacidadeMaxima) {
            ingressosVendidos.add(ingresso);
            System.out.println("INGRESSO VENDIDO COM SUCESSO.\n\n");

        } else {
            System.out.println("INGRESSO NAO PODE SER VENDIDO, JA EXCEDEU A CAPACIDADE MAXIMA PARA ESSE EVENTO.\n\n");
        }
    }
    
    public void mostrarIngressosVendidos(){
      String resumo; 
      resumo = String.format("A quantidade de ingressos vendidos ate o momento e: %d", ingressosVendidos.size());
      System.out.println(resumo);
    }
    
    public void setValuesClass(String name,Date date,float value,int maximumCapacity,List<Ingresso> ticketsSold){
        this.nome = name;
        this.data = date;
        this.valor = value;
        this.capacidadeMaxima = maximumCapacity;
        this.ingressosVendidos = ticketsSold;
        
    }

}
    
   
