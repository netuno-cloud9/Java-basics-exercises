
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instrutor
 */
public class Fila2 {
    private List<String> fila = new ArrayList<String>();
    
    public void add(String elem){
        fila.add(elem);
    }
    
    public void remove(){
        fila.remove(0);
    }
}
