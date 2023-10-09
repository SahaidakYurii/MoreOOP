package kicks;

import lotr.Character;

public class Bow implements KickStrategy{
    @Override
    public void kick(Character me, Character opponent){
        if (me.getPower() > opponent.getPower()){
            opponent.setHp(0);
        } else {
            me.setHp(me.getHp() - 1);
        }
    }
}
