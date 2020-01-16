/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_15;
import datosPersoa.Persoal;
import notamediaav.Nota;

/**
 *
 * @author Josemolamazo
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persoal Jose = new Persoal("123 456 789","jose@mail");
        Nota notaAV = new Nota();
       
        Academia neno = new Academia(Academia.numReferencia,"Jose", notaAV.getTotal(), Jose);
        neno.toString();
    }
    
}
