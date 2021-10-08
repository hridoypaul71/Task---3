/*
Name:Hridoy Paul (Gupi)
ID :2012020136
Section: C
Email :cse_2012020136@lus.ac.bd
Date:11-09-2021
 */
package hridoypaul;

public class Cricket extends Sports {
    
    String matchType;
    int over;
    Player player;
    
    Cricket(String matchType, int over, Player player){
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }
    
    void display(){
        System.out.println("MatchType : "+matchType);
        System.out.println("Over : "+over);
        System.out.println("Player Name : "+player.playerName);
        System.out.println("jersey Number : "+player.jerseyNumber);
    }
    
}
