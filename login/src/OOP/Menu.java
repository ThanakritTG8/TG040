package OOP;

import java.util.*;

class Menu{
    
    String id ;
    String password ;
    String name ;
    int index;
    
    
    Scanner entchar = new Scanner(System.in);
    
    private String input;
    
    public String Access(){
        
        System.out.println("------------------PSU MUSIC------------------\n");
        String choose=null;
        System.out.println("\t\n1: Register"
                         + "\t\n2: Login"
                         + "\t\n3: Use for free"
                         + "\t\n0: Exit");
        boolean notchoose=true;
        
        while(notchoose){
            System.out.print(">>> ");
            choose = entchar.nextLine();
            
            switch(choose){
                
                case"1":case"2":case"3":
                case"0":notchoose=false;
                break;
                default:System.out.println("Try again.");
            }
        }
        return choose;
    }
    
    public boolean Register(){
        
        boolean sure = true;
        System.out.print("ID: ");
        id = entchar.nextLine();
        
        System.out.print("Password: ");
        password = entchar.nextLine();
        
        System.out.print("Name: ");
        name = entchar.nextLine();
        
        System.out.print("Are you sure? (Y/N) >> ");
        String Sure = entchar.nextLine();
        
        if(!Sure.equalsIgnoreCase("Y"))
            sure = false;
        
        

    return sure;
    }
    
    public boolean Login(ArrayList<Account> user){
        
        boolean access = false;
        System.out.print("ID: ");
        id = entchar.nextLine();
        System.out.print("Password: ");
        password = entchar.nextLine();
        
        for(int index = 0;index<user.size();index++){
            
            if(id.equals(user.get(index).id)&&password.equals(user.get(index).password)){
                
                access=true;
                this.index=index;       
                user.get(index).welcome();
            }
        }

    return access;
    }
    public int getIndex(){
        return this.index;
    }
    
    public String mainMenu(){
        
        String sel=null;
        
        System.out.println("------------------------------------------------------");
        System.out.println("1:Search\t2:Point\t3:My List\t0:Log Out");
        System.out.println("------------------------------------------------------");
        System.out.print("___");
        
        boolean selecting = true;
        
        while(selecting){
            
        sel = entchar.nextLine();
        
        switch(sel){
            
            case "1":case"2":case"3":
            selecting=false;
            break;
            
            case"0":
            selecting=false;
                System.out.println("Loging Out.");
            break;
            default : System.out.println("Try again.");
        }
        }
        return sel;
    }

    
}