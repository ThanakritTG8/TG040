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
        
        while(choose){
        switch(select_MP){
            case "m": Money(); break;
            case "p": point(); break; 
            default : System.out.println("Try again.");
            choose = false ;   break; 
//        
        }
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
        boolean select = true;
        
        System.out.println("1: 50+0    >>>> 25 bath\n" +
                           "2: 100+0   >>>> 40 bath\n" +
                           "3: 150+25  >>>> 60 bath\n" +
                           "4: 200+50  >>>> 90 bath\n" +
                           "5: 500+100 >>>> 150 bath\n"+
                           "0: Main menu.");
        System.out.print("\nHow many do you chooese>> ");
        choz = entChar.nextLine();
        
        while(select){
        switch(choz){
            case "1": 
                if((a.Money-25)>=0){ 
                    
                    System.out.println("Your point is "+a.point);
                    System.out.println("Your money is "+a.Money);break;
                }
                else if((a.Money-25)<0){
                    System.out.println("\nMoney not enough.");     
                }
            case "2":
                if((a.Money-40)>=0){
                    System.out.println("Your point is "+a.point);
                    System.out.println("Your money is "+a.Money);break;
                }
                else if((a.Money-40)<0){
                    System.out.println("\nMoney not enough.");     
                }
            case "3":
                if((a.Money-60)>=0){
                    System.out.println("Your point is "+a.point);
                    System.out.println("Your money is "+a.Money);break;
                }
                else if((a.Money-60)<0){
                    System.out.println("\nMoney not enough.");     
                }
            case "4":
                if((a.Money-90)>=0){
                    System.out.println("Your point is "+a.point);
                    System.out.println("Your money is "+a.Money);break;
                }
                else if((a.Money-90)<0){
                    System.out.println("\nMoney not enough.");     
                }    
            case "5":
                if((a.Money-150)>=0){
                    System.out.println("Your point is "+a.point);
                    System.out.println("Your money is "+a.Money);break;
                }
                else if((a.Money-150)<0){
                    System.out.println("\nMoney not enough.");     
                }
            case "0": menu.mainMenu();
                        select = false;
        }}
    return a.point;
    }


}