/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa.programação.i;


/**
 *
 * @author Tunts
 */
public class Ingresso {
    private String name;
    private String cpf;
    private Evento event;
    
    public String getName(){
        return name;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public Evento getEvent(){
        return event;
    }  
    
    public void armazenarDadosdoIngresso(Evento event, String cpf, String name){
            this.event = event;
            this.cpf = cpf;
            this.name = name;
}
    
    public void mostrarResumo(){
      String resumo; 
      resumo = String.format("Dados do ingresso vendido:\n Nome: %s\n CPF: %s\n Evento: %s\n Data: %s", name, cpf, event.getName(), event.getDate());
      System.out.println(resumo);
    }
}
