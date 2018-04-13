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
public class PSUMusictest {
    
    public static void main(String[] args) {
        
        System.out.println("----------PSU MUSIC----------\n");
        Login l = new Login();
        l.login();
        System.out.println("\n\t\t\tWelcome");
        Menu m = new selectMenu();
        m.print();
        
        
        
    }
    
}
