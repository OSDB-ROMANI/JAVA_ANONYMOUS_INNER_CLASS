/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daClasse;

/**
 *
 * @author Paolo
 */
public class anonymousInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Padre p = new Padre();
        p.print();
        //creiamo un anonymous inner class
        Padre p1 = new Padre(){
            @Override  
            public void print(){
                System.out.println("anonymousInnerClass");
            }  
        };
        p1.print();
    }
    
}
