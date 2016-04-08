/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// JACK ÄR FUL

/**
 *
 * @author Jack
 */
public class FiskeSafari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
    datorBas a = new datorBas();		
    graphicInt gfxform = new graphicInt();
    System.out.println("Main");	
    a.DBHandler();					
    gfxform.setVisible(true);
 
    }
    
}
