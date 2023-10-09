package lotr;

import kicks.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
// import lombok.Setter;

@AllArgsConstructor
public abstract class Character{
    @Getter
    private int power;
    @Getter
    private int hp;
    private KickStrategy kick;

    public void kick(Character opponent){
        kick.kick(this, opponent);
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void setHp(int hp){
        if (hp > 0){
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String toString(){
        return this.getClass().getName() + "{hp=" + hp + "; power=" + power + "}";
    }
}
