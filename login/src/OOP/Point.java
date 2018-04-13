package OOP;

import java.util.*;

class Point extends selectMenu implements wallet{
    
    
    
    public void print(){
        
        System.out.println("Your money is "+m+" Bath");
        System.out.println("Your point is "+p+" Point" );
        Money();
    
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
    
    public void Money(){
    
    
    }
    
    public void point(){
        System.out.println("50+0  >>>>> 25\n" +
                           "100+0 >>>>> 40\n" +
                           "150+25 >>>> 60\n" +
                           "200+50 >>>> 90\n" +
                           "500+100 >>>> 150");
        
      
    
    
    } 

}

 interface wallet  {
     
    public int m = 0;
    public int p = 0;
         
    public void point();
    public void Money();
    

        
    }       



