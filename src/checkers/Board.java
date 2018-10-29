/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import java.util.Scanner;

/**
 *
 * @author Lauris
 */
public class Board {
    Board(){};
    String board[][] = new String [][]{
        {" ","|","1","|","2","|","3","|","4","|","5","|","6","|","7","|","8","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"1","|"," ","|","X","|"," ","|","X","|"," ","|","X","|"," ","|","X","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"2","|","X","|"," ","|","X","|"," ","|","X","|"," ","|","X","|"," ","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"3","|"," ","|","X","|"," ","|","X","|"," ","|","X","|"," ","|","X","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"4","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"5","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"6","|","O","|"," ","|","O","|"," ","|","O","|"," ","|","O","|"," ","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"7","|"," ","|","O","|"," ","|","O","|"," ","|","O","|"," ","|","O","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"8","|","O","|"," ","|","O","|"," ","|","O","|"," ","|","O","|"," ","|"},
      
        
    };
    public int getHeight(){
        return board.length;
    }
    public int getWidth(){
        return board[0].length;
    }
    public void render(){
       for(int i = 0; i < getHeight(); i++){
           for(int j = 0; j < getWidth(); j++){
               System.out.print(board[i][j]);
              
           }
           System.out.println();
           
            
        }
       System.out.println();System.out.println();System.out.println();System.out.println();
   }
 
   public void move(){
	   System.out.println("Iveskite pradines saskes koordinates. Pvz: 1 2");
       int nowA = scanner.nextInt();
       int nowB = scanner.nextInt();
       System.out.println("Iveskite galines saskes koordinates. Pvz: 2 3");
       int newA = scanner.nextInt();
       int newB = scanner.nextInt();
       if(nowA<9 && nowB<9 && newA<9 && newB<9 && nowA>0 && nowB>0 && newA>0 && newB>0) {

       if("X".equals(board[nowA*2][nowB*2])){
    	   if("O".equals(board[newA*2][newB*2])) {
    		   if(nowA<newA && nowB<newB && " ".equals(board[newA*2+2][newB*2+2])) {		   
    				   board[newA*2+2][newB*2+2] = "X"; 
    				   board[nowA*2][nowB*2] = " ";
    	    		   board[newA*2][newB*2] = " ";
    		   }
    		   else  if(nowA>newA && nowB>newB && " ".equals(board[newA*2-2][newB*2-2])) {    			   
    				   board[newA*2-2][newB*2-2] = "X"; 
    				   board[nowA*2][nowB*2] = " ";
    	    		   board[newA*2][newB*2] = " ";
     		   }
    		   else  if(nowA<newA && nowB>newB && " ".equals(board[newA*2+2][newB*2-2])) {  			   
    				   board[newA*2+2][newB*2-2] = "X"; 
    				   board[nowA*2][nowB*2] = " ";
    	    		   board[newA*2][newB*2] = " ";
      		   }
    		   else  if(nowA>newA && nowB<newB && " ".equals(board[newA*2-2][newB*2+2])) {  			 
    				   board[newA*2-2][newB*2+2] = "X";  
    				   board[nowA*2][nowB*2] = " ";
    	    		   board[newA*2][newB*2] = " ";
       		   }
    		   else {
    			   System.out.println("blogai ivestos koordinates");
    		   }
    		   
    	   }
    	   else if(" ".equals(board[newA*2][newB*2])) {
    		 board[nowA*2][nowB*2] = " ";
             board[newA*2][newB*2] = "X"; 
    	   }
    	   else {
    		   System.out.println("Blogai ivestos koordinates");
    	   }
             
            
             render();
       }
       else if ("O".equals(board[nowA*2][nowB*2])){
    	   if("X".equals(board[newA*2][newB*2])) {
    		   if(nowA<newA && nowB<newB && " ".equals(board[newA*2+2][newB*2+2])) {		   
    				   board[newA*2+2][newB*2+2] = "O";  
    				   board[nowA*2][nowB*2] = " ";
    	    		   board[newA*2][newB*2] = " ";
    		   }
    		   else  if(nowA>newA && nowB>newB && " ".equals(board[newA*2-2][newB*2-2])) {    			   
    				   board[newA*2-2][newB*2-2] = "O"; 
    				   board[nowA*2][nowB*2] = " ";
    	    		   board[newA*2][newB*2] = " ";
     		   }
    		   else  if(nowA<newA && nowB>newB && " ".equals(board[newA*2+2][newB*2-2])) {  			   
    				   board[newA*2+2][newB*2-2] = "O";
    				   board[nowA*2][nowB*2] = " ";
    	    		   board[newA*2][newB*2] = " ";
      		   }
    		   else  if(nowA>newA && nowB<newB && " ".equals(board[newA*2-2][newB*2+2])) {  			 
    				   board[newA*2-2][newB*2+2] = "O";    
    				   board[nowA*2][nowB*2] = " ";
    	    		   board[newA*2][newB*2] = " ";
       		   }
    		   else {
    			   System.out.println("blogai ivestos koordinates");
    		   }
    		   
    	   }
    	   else if(" ".equals(board[newA*2][newB*2])) {
    		 board[nowA*2][nowB*2] = " ";
             board[newA*2][newB*2] = "O"; 
    	   }
    	   else {
    		   System.out.println("Blogai ivestos koordinates");
    	   }
            
             render();
       }
       else {
    	   System.out.println("Blogai ivestos koordinates ");
       }
       } 
       else {
    	   System.out.println("Blogai ivestos koordinates ");
       }
       
   }
   public Scanner scanner = new Scanner(System.in);
     
       
}
