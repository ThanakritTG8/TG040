
package OOP;
import java.util.Scanner;
import java.util.ArrayList;
public class Search extends Stock{
static Scanner sd = new Scanner(System.in);
static ArrayList you = new ArrayList();
static String df,po;
    
public void Arraylist(){
    you.add(closer);
  you.add(havana);
  you.add(weareyoung);
tees();
dfg();

}
public static void tees(){ 
    
    do{
        
             System.out.println("");
            System.out.println("Song name : ");
              df = sd.nextLine();
              if(df.equals("closer")){
                  System.out.println("----------------------------------------------------");
//                  System.out.println("Closer");
                  
               System.out.println(you.get(0));
    }else if(df.equals("havana")){
                  System.out.println("----------------------------------------------------");
               System.out.println(you.get(1));
    }else if(df.equals("weareyoung")){
                  System.out.println("----------------------------------------------------");
               System.out.println(you.get(2));
    }else {System.out.println("not find");}
           }while(!(df.equals("closer"))&&!(df.equals("havana"))&&!(df.equals("weareyoung")));
}   
    public static void dfg(){ 
        

System.out.print("Do you want return to find music : (Y/N)");
                po = sd.nextLine();
                switch(po){
                    case "y" : tees();
                    dfg(); break;
                    case "n" : break;
                    default: System.out.println("Try again!" );dfg();
                
                }

        
    }


 public  void musicdemo(){}
    public  void albumdemo(){}
    public  void mylistdemo(){}
    public  void getmoneydemo(){}
    public  void outdemo(){}
}

