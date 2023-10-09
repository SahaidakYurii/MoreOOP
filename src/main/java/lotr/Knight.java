package lotr;

import java.util.Random;

import kicks.Sword;

public class Knight extends Character {
    public Knight(){
        super(new Random().ints(2, 12).findFirst().getAsInt(), 
              new Random().ints(2, 12).findFirst().getAsInt(),
              new Sword());        
    }

    @Override
    public void kick(Character opponent){
        opponent.setHp(opponent.getHp() - new Random().ints(0, getPower() + 1).findFirst().getAsInt());
    }
}
