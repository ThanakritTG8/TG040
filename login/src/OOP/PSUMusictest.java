
package OOP;

import java.util.*;
public class PSUMusictest {
    
    
    static ArrayList <Account> UserAccess = new ArrayList();
    
    public static void main(String[] args) {
        Search search = new Search();
        Menu menu = new Menu();
        String select=" ";
        boolean enter;
        boolean access_success=false;
        boolean inprogram=true;
        Account user_access=null;
        
        Wallet p = new Wallet();
        do{
            enter=true;
            while(enter){

                switch(menu.Access()){
                    case"1":
                        if(menu.Register()){
                            Account user = new User(menu.id,menu.password,menu.name);
                            UserAccess.add(user);
                            
                        }
                        enter=false;
                    break;
                    case"2":
                        if(menu.Login(UserAccess)){
                            user_access=UserAccess.get(menu.getIndex());
                            access_success=true;
                        }else
                            System.out.println("access fail.");
                        enter = false;
                     break;
                    case"3":
                        user_access=new Guess();
                        access_success=true;
                        enter = false;  
                        break;
                    case"0":enter=false;
                    inprogram = false ;break;
                }
            }
       
            while(access_success){
                switch(menu.mainMenu()){
                    
                    case"1":search.searchMusic(user_access);break;
                    case"2":
                            if(user_access!=null&&user_access.permission){
                                p.select(user_access);
                            
                            }else{
                            System.out.println("You have to register or login.");}
                        break;

        
                        case"3":System.out.println("My List");
                        if(user_access!=null&&user_access.permission){
                               user_access.showPlayList();
                        }else
                            System.out.println("You have to register or login.");

                        break;
                        
                        case"0":System.out.println("Log Out");
                        access_success = false;break;

                    }
            }
            }while(inprogram);
        }

   







}
