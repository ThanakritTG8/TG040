package OOP;

import java.util.*;

class Point extends selectMenu implements wallet{
    
    
    
    public void print(){
        
        System.out.print("Your money is "+m+" Bath");
        System.out.println("\t\tYour point is "+p+" Point" );
    
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
    
    public int point(){
        
        int selectP ;
        System.out.println("1: 50+0    >>>> 25 bath\n" +
                           "2: 100+0   >>>> 40 bath\n" +
                           "3: 150+25  >>>> 60 bath\n" +
                           "4: 200+50  >>>> 90 bath\n" +
                           "5: 500+100 >>>> 150 bath");
        Scanner sel = new Scanner(System.in);
        System.out.print("How many do you want? >>> ");
        selectP = sel.nextInt();
        
        switch(selectP){
            case 1 : break;
        
        }
        
        return p ;
    } 

}

 interface wallet  {
     
    public int m = 0;
    public int p = 0;
         
    public int point();
    public void Money();
    

        
    }       



