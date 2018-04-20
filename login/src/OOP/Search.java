
package OOP;
import java.util.Scanner;
import java.util.ArrayList;
public class Search extends Stock{
  

static Scanner sd = new Scanner(System.in);
static ArrayList you = new ArrayList();
static String df,po;
static String cho;
String mus1;

Account mylistt;
    buy music;
public static void Arraylist(){
  you.add(closer);
  you.add(havana);
  you.add(weareyoung);
tees();
dfg();

}

public static void tees(){ 
    
          do{
             System.out.println("Song name  ");
              df = sd.nextLine();
           
              if(df.equals("closer")){
                  System.out.println("----------------------------------------------------");
                  System.out.println("Closer");
                  do{ 
                  System.out.print(" 1 : play now\n"
                          + " 2 : buy now\n"
                          + " 3 : back to search\n");
                  System.out.print("Choose number : ");
                  cho = sd.nextLine();
                  switch(cho){
                      case "1" :  System.out.println(you.get(0)); break;
                      case "2" :  break;
                      case "3" :  tees();
                                break;
                  }
                 }while(cho.equals("1")||cho.equals("2")||cho.equals("3"));
                  
               
    }else if(df.equals("havana")){
                  System.out.println("----------------------------------------------------");
                  System.out.println("havana");
                  do{ 
                  System.out.print(" 1 : play now\n"
                          + " 2 : buy now\n"
                          + " 3 : back to search\n");
                  System.out.print("Choose number : ");
                  cho = sd.nextLine();
                  switch(cho){
                      case "1" : System.out.println(you.get(1)); break;
                      case "2" :  break;
                      case "3" :  tees();
                                break;
                  }
                 }while(cho.equals("1")||cho.equals("2")||cho.equals("3"));
    }else if(df.equals("weareyoung")){
                  System.out.println("----------------------------------------------------");
                  do{ 
                  System.out.print(" 1 : play now\n"
                          + " 2 : buy now\n"
                          + " 3 : back to search\n");
                  System.out.print("Choose number : ");
                cho = sd.nextLine();
                  switch(cho){
                      case "1" : System.out.println(you.get(2)); break;
                      case "2" :  break;
                      case "3" :  tees();break;
                                
                  }
                 }while(cho.equals("1")||cho.equals("2")||cho.equals("3"));
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

//    public String MyList(){
//    
//    
//    }
      

 public  void musicdemo(){}
    public  void albumdemo(){}
    public  void mylistdemo(){}
    public  void getmoneydemo(){}
    public  void outdemo(){}










}

