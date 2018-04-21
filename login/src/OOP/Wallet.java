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

Account user;

public void select(Account user_acc){
this.user = user_acc;

System.out.println("\n\nYour money: "+user.Money+""
        + "\t\tYour point "+user.point);
System.out.print("\n\nDo you want to fil Point or Money?(M/P) >>");
select_MP = entChar.nextLine();

switch(select_MP){
    case "m": Money(); break;
    case "p": point(); break; 
    default : System.out.println("Try again.");break;
}
}

public int Money(){

System.out.print("How many do you want to top up>> ");
Money = entint.nextInt();
user.Money += Money;


return user.Money;
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
        if((user.Money-25)>=0){ 
            user.point+=50; user.Money-=25;
            System.out.println("Your point is "+user.point);
            System.out.println("Your money is "+user.Money);break;
        }else if((user.Money-25)<0){
            System.out.println("\nMoney not enough.");break;    
        }
    case "2":
        if((user.Money-40)>=0){
            user.point+=100; user.Money-=40;
            System.out.println("Your point is "+user.point);
            System.out.println("Your money is "+user.Money);break;
        }
        else if((user.Money-40)<0){
            System.out.println("\nMoney not enough.");   break;  
        }
    case "3":
        if((user.Money-60)>=0){
            user.point+=(150+25); user.Money-=60;
            System.out.println("Your point is "+user.point);
            System.out.println("Your money is "+user.Money);break;
        }
        else if((user.Money-60)<0){
            System.out.println("\nMoney not enough.");     break;
        }
    case "4":
        if((user.Money-90)>=0){
            user.point+=(200+50); user.Money-=90;
            System.out.println("Your point is "+user.point);
            System.out.println("Your money is "+user.Money);break;
        }
        else if((user.Money-90)<0){
            System.out.println("\nMoney not enough.");     break;
        }    
    case "5":
        if((user.Money-150)>=0){
            user.point+=(500+100); user.Money-=150;
            System.out.println("Your point is "+user.point);
            System.out.println("Your money is "+user.Money);break;
        }
        else if((user.Money-150)<0){
            System.out.println("\nMoney not enough."); break;    
        }


    case "0":break;
    default :System.out.println("\nTry again."); point(); break;

  }   
return user.point; 
}
}
    
    


