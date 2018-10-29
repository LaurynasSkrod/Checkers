/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers; 

/**
 *
 * @author Lauris
 */
public class Checkers {
/*Scanner scan = new Scanner(System.in);
String s = scan.next();
int i = scan.nextInt();*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board myGame = new Board();
        
      myGame.render();
      while(true){

        myGame.move();  
      }
      
      
      
    }
    
}
