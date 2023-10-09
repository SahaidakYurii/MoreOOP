package kicks;

import java.util.Random;

import lotr.Character;

public class Sword implements KickStrategy{
    @Override
    public void kick(Character me, Character opponent){
        opponent.setHp(opponent.getHp() - new Random().ints(0, me.getPower() + 1).findFirst().getAsInt());
    }
}
