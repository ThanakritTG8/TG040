
package OOP;
import java.util.Scanner;
import java.util.ArrayList;
public class Search implements MusicStock{
    ArrayList<Music> musicsList = new ArrayList();
    Scanner sc=new Scanner(System.in);
    Search(){
        this.addMusicToStore();
        
    }
    private void addMusicToStore(){
        Music music;
        int amount;
        //add free and vip music
        if(free_music.length>vip_music.length)
            amount=free_music.length;
        else
            amount=vip_music.length;
        
        for(int i=0;i<amount;i++){
            if(i<free_music.length){
                music=new FreeMusic(free_music[i]);
                this.musicsList.add(music);
            }
            if(i<vip_music.length){
                music=new VipMusic(vip_music[i],price_musics[i]);
                this.musicsList.add(music);
            }
        }
    
    }

    public void searchMusic(Account user){
        String song_name;
        Scanner sn = new Scanner(System.in);
        int index=-1;
        boolean inprocess=true;
        do{
            System.out.print("Show Music list (L)\tBack(E)"
                    + "\nSong name : ");
            song_name = sn.nextLine();
            boolean notfound=true;
            if(song_name.equalsIgnoreCase("L")){
                PlayList();
                
            }else if(song_name.equalsIgnoreCase("E")){
            inprocess =false;
            
            }else{
                for(int i=0;i<musicsList.size()&&notfound;i++){
                    if(musicsList.get(i).getname().equalsIgnoreCase(song_name)){
                        System.out.println("-----------Found! :"+musicsList.get(i).getname()+"-----------");
                        notfound=false;
                        index=i;
                    }

                }
                if(notfound){
                    System.out.println("-----------Not found!-----------");
                }else{
                  String input;
                  boolean inplay=true;
                   while(inplay){
                    System.out.println("Play(1)\tBuy(B)\tBack to Search(0)");
                    input=sc.nextLine();
                    boolean canplay= user.checkList(musicsList.get(index).getname());
                    switch(input){
                        case"1":
                            
                            if(musicsList.get(index).getbuy()||user.permission&&canplay){
                                System.out.println("Playing "
                                        +musicsList.get(index).getname());
                                
                            }else{
                                System.out.println("you have to buy before play");
                            }
                         break;
                        case"B":case"b":
                            if(user.getPoint()>=musicsList.get(index).getprice()
                                    &&!musicsList.get(index).getbuy()){
                                System.out.println("Music "+musicsList.get(index).getname()
                                        + "\ncost "+musicsList.get(index).getprice()
                                        + "\nDo you want to buy? (y/n)");
                                input=sc.nextLine();
                                if(input.equalsIgnoreCase("y")){
                                    System.out.println("\nused "
                                            + musicsList.get(index).getprice()
                                            + " points."
                                            + "\nMusic "+musicsList.get(index).getname()
                                            + " added to your Playlist.");
                                    user.setPoint(-musicsList.get(index).getprice());
                                    user.addMusic(musicsList.get(index));
                                }else
                                    System.out.println("-----try again.-----");
                            }else if(musicsList.get(index).getbuy())
                                System.out.println("\nthis's free music");
                            else
                                System.out.println("\nYour point not enough");
                          break;
                        case"0":inplay=false;
                         
                    }
                   }
                }
            }
        }while(inprocess);
    
    
    }
    
   public void PlayList(){
       for(int i=0;i<musicsList.size();i++){
       System.out.println(musicsList.get(i).getname());
       
   } 
   }
    
  
    
    
    
}

