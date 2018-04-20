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
        System.out.println("\n\n-----------------Welcome to PSU Music "+name+"-----------------");
    }
    public boolean checkList(String music_name){
        boolean check=false;
        for(int i =0;i<music.size();i++){
            if(music.get(i).getname().equals(music_name))
                check=true;
        }
        return check;
    }
    public void addMusic(Music music){
        this.music.add(music);
    }
    public void showPlayList(){
        System.out.println("Show Play List ");
        for(int i=0;i<this.music.size();i++){
            System.out.println((i+1)+" "+music.get(i).getname());
        }
    }
}
