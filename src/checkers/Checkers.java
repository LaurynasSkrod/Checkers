package checkers; 


public class Checkers {

    public static void main(String[] args) {
        Board myGame = new Board();
       
      myGame.render();
      while(true){
        myGame.move();  
      }     
    }
    
}
