import lotr.Character;
import lotr.Hobbit;

public class GameManager{
    void fight(Character player1, Character player2){
        if(player1 instanceof Hobbit and player2 instanceof Hobbit){
            System.out.println("You both drowned in tears...")
            return;
        }
        
        while (player1.isAlive() and player2.isAlive()){
            player1.kick(player2);

            Character temp = player1;
            player1 = player2;
            player2 = temp;
        }
        if (player1.isAlive()){System.out.println(player1 + " wins");}
        else{System.out.println(player2 + "wins");}
    }
}