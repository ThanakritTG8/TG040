package OOP;

import java.util.*;


class Wallet{
    
    Scanner entint = new Scanner(System.in);
    Scanner entChar = new Scanner(System.in);
    String select_MP ; 
    String id;
    String password;
    String name;
    String choz;
    int Money;
    int point;
    int bath;
    Menu menu = new Menu();
    Account a = new User(id , password , name) ;
    
    public void select(){
        
        System.out.println("\n\nYour money: "+a.Money+"\t\tYour point "+a.point);
        System.out.print("\n\nDo you want to fil Point or Money?(M/P) >>");
        select_MP = entChar.nextLine();
        
        boolean choose = true;
        

        switch(select_MP){
            case "m": Money(); break;
            case "p": point(); break; 
            default : System.out.println("Try again.");break;
        }
    }
    
    public int Money(){
        
        System.out.print("How many do you want to top up>> ");
        Money = entint.nextInt();
        System.out.println("\nYour money is "+a.Money);
        a.Money += Money;
        select();
        
    return a.Money;
    }
    
    public int point(){

        System.out.println("1: 50+0    >>>> 25 bath\n" +
                           "2: 100+0   >>>> 40 bath\n" +
                           "3: 150+25  >>>> 60 bath\n" +
                           "4: 200+50  >>>> 90 bath\n" +
                           "5: 500+100 >>>> 150 bath\n"+
                           "0: Main menu.");
        System.out.print("\nPlease select do you chooese>> ");
        choz = entChar.nextLine();
        
        switch(choz){
            case "1": 
                if((a.Money-25)>=0){ 
                    a.point+=50; a.Money-=25;
                    System.out.println("Your point is "+a.point);
                    System.out.println("Your money is "+a.Money);break;
                }else if((a.Money-25)<0){
                    System.out.println("\nMoney not enough.");select();break;    
                }
            case "2":
                if((a.Money-40)>=0){
                    a.point+=100; a.Money-=40;
                    System.out.println("Your point is "+a.point);
                    System.out.println("Your money is "+a.Money);break;
                }
                else if((a.Money-40)<0){
                    System.out.println("\nMoney not enough.");   break;  
                }
            case "3":
                if((a.Money-60)>=0){
                    a.point+=(150+25); a.Money-=60;
                    System.out.println("Your point is "+a.point);
                    System.out.println("Your money is "+a.Money);break;
                }
                else if((a.Money-60)<0){
                    System.out.println("\nMoney not enough.");     break;
                }
            case "4":
                if((a.Money-90)>=0){
                    a.point+=(200+50); a.Money-=90;
                    System.out.println("Your point is "+a.point);
                    System.out.println("Your money is "+a.Money);break;
                }
                else if((a.Money-90)<0){
                    System.out.println("\nMoney not enough.");     break;
                }    
            case "5":
                if((a.Money-150)>=0){
                    a.point+=(500+100); a.Money-=150;
                    System.out.println("Your point is "+a.point);
                    System.out.println("Your money is "+a.Money);break;
                }
                else if((a.Money-150)<0){
                    System.out.println("\nMoney not enough."); break;    
                }
                    
                
            case "0": menu.mainMenu(); break;
            default :System.out.println("\nTry again."); point(); break;
                        
          }   
   return a.point; 
    }
}
    
    


