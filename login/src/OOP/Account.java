
package OOP;

import java.util.*;
public abstract class Account {
    
    String id;
    String password;
    String name;
    int point;
    int Money;
    boolean permission;
  
    
    Account(){
        this.permission = false;
        
    }
    
    
    Account(String id , String password , String name){
        
        this.permission = true;
        this.id = id;
        this.password = password;
        this.name = name;
      
    
    }
    public abstract void welcome();
    
    public void setPoint(int point){
        this.point += point;
        
    }
    
    public void setMoney(int Money){
        this.Money += Money;
    
    }
    public int getPoint(){
    
        return this.point;
    }
    public abstract boolean checkList(String music_name);
    public abstract void showPlayList();
    public abstract void addMusic(Music music);
//    public void setmylist(String list){
//        this.list.equals(list);
//        
//    }


}
