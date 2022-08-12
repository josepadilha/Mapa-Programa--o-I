/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa.programação.i;

public class IngressoCamarote extends Ingresso {
    
        private float calcularValorDoIngresso(){
            float value = this.getEvent().getValue();
            return (float) (value *1.6);
    }
                    
        public void imprimirValor(){ 
            String resumo; 
            resumo = String.format("Ingresso Camarote: R$ %f",calcularValorDoIngresso());
            System.out.println(resumo);
    }
}

