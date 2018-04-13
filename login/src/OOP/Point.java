package OOP;

import java.util.*;

class Point extends selectMenu implements wallet{
    
    
    
    public void print(){
        
        System.out.println("Your point is "+p+" Point" );
    
        Scanner yn = new Scanner(System.in);
        System.out.print("Do you want to fill point (Y/N) >> ");
        String y = yn.nextLine();
        char n = y.charAt(0);
        
        switch(n){
            case 'y': point();break;
            case 'n': super.print(); break;
            default : System.out.println("\nPlease try again\n");print();break;
        
        }    
    }
    
    public void point(){
        System.out.println("");
        
      
    
    
    } 

}

 interface wallet  {
    
    public int p = 0;
         
    public abstract void point();

        
    }       



