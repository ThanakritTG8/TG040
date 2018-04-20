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
public abstract class Music {
    private String name;
    private String lyric;
    private int price;
    private boolean buy;
    Music (String name,int price){
        this.name=name;
        this.lyric="[Lyric "+name+" ]";
        this.price=price;
    }
        
    public  void setname (String name){
        this.name.equals(name);    
    }
    public String getname(){
        return name;
    }

    public  void setlyric (String lyric){
        this.lyric.equals(lyric);    
    }
    
    public String getlyric(){
        return lyric;
    }
    
    public  void setprice (int price){
        this.price=price;    
    }
    public int getprice(){
        return price;
    }
    public void setbuy(boolean buy){
        this.buy=buy;
    }

    public boolean getbuy(){
        return buy;
    }




}
