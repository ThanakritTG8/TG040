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
        
public abstract class Menu {
    
    public abstract void print();
    
    public void menu(){
    
        System.out.println("\n1:Search    \t2:Point   \t3:Year    \t4:My List    \t5:OUT");
    
    } 
    
}

interface select{

    public void Select();
    
}

class selectMenu extends Menu implements select {
    
    int n;
    
    public void print(){
        
        super.menu();
        
        Scanner s = new Scanner(System.in);
        System.out.print("__");
        n = s.nextInt();
        Select();
    
    }
    public void Select(){
        
        Point p = new Point();
                    
        switch(n){
            
            case 1 : break;
            case 2 : p.print(); break;
        
        }
    
    }
    
    }

    


