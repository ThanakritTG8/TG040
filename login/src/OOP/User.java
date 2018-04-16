/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.*;

/**
 *
 * @author tgroc
 */
public class User extends Account {
    
    ArrayList <Music> music = new ArrayList();
    User(String id , String password , String name){
        
        super(id,password,name);
    }
    public void welcome(){
        System.out.println("Welcome to PSU Music "+name);
    }
    
}
