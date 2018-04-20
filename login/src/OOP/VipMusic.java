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
public class VipMusic extends Music{
    VipMusic(String name,int price){
        super(name,price);
        super.setbuy(false);      
   }
}
