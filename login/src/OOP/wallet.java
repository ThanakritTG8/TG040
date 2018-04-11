package OOP;

import java.util.*;

public abstract class wallet {
    
    public int p = 0;
         
    public abstract void point();
    
    public void print(){
    
        System.out.println("Your point is "+p+" Point" );
        
    }       
}

class Point extends wallet{
    
    
    
    public void print(){
    
        Scanner yn = new Scanner(System.in);
        System.out.print("Do you want to fill point (Y/N) >> ");
        String y = yn.nextLine();
        char n = y.charAt(0);
        
        switch(n){
            case 'y': point();break;
            case 'n': break;
            default : print();break;
        
        }    
    }
    
    public void point(){
        
      
    
    
    } 

}
