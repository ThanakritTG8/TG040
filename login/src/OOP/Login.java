
package OOP;

import java.util.*;
public class Login {
    
    
    
    public void login(){
        
         int i = 0;
            
        String id[] = {"tg","jaea","tee"};
        String pass[] = {"1111","2222","3333"};
        
        String name;
        String pas;
        
        do{
   
        
        Scanner a = new Scanner(System.in);
        System.out.print("id : ");
        name = a.nextLine();
        
        System.out.print("pass : ");
        pas = a.nextLine();
        }while( (!(name.equals(id[0])) || !(pas.equals(pass[0]))) && (!(name.equals(id[1])) || !(pas.equals(pass[1])))
                && (!(name.equals(id[2])) || !(pas.equals(pass[2]))));
        
         
        
        
}
    
    
}