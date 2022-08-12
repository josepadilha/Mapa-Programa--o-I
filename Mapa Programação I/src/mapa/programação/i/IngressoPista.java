/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa.programação.i;

/**
 *
 * @author Tunts
 */
public class IngressoPista extends Ingresso {
    
        private float calcularValorDoIngresso(){
            float value = this.getEvent().getValue();
            return value;
    }
                    
        public void imprimirValor(){ 
            String resumo; 
            resumo = String.format("Ingresso Pista, valor: R$ %f",calcularValorDoIngresso());
            System.out.println(resumo);
    }
}

