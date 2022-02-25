/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daIntgerfaccia;

import daClasse.*;

/**
 *
 * @author Paolo
 */
public class anonymousInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Padre p = new Padre(){
            private String nome = "ANONIMO";
            @Override
            public void print() {
                System.out.println("Da anonimo");
            }

            @Override
            public String getNome() {
                return nome;
            }
            
        };
        p.print();
        System.out.println(p.getNome());
    }
}
