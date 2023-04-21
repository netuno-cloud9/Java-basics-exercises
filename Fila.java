/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instrutor
 */
public class Fila {
    private String[] fila;
    
    public void add(String elem){
            if(fila[fila.length-1] == null){
                fila[fila.length-1] = elem;
            } else {
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = fila[i+1];
                }
                fila[fila.length-1] = elem;               
            }
        }
    

    public void remove(){
        fila[0] =  null;
        for (int i = 0; i < fila.length; i++) {
            fila[i] =  fila[i+1];
        }
    }

}
