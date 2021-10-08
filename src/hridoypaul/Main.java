/*
Name:Hridoy Paul (Gupi)
ID :2012020136
Section: C
Email :cse_2012020136@lus.ac.bd
Date:11-09-2021
 */
package hridoypaul;

public class Main {
    public static void main(String[] args){
        Player player = new Player("Sakib",75);
        Cricket cricket = new Cricket("International Match",20,player);
        cricket.display();
        Football football = new Football();
        
    }
    
}
