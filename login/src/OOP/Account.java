/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author tgroc
 */
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
}
