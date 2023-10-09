package lotr;

import java.util.Random;

import kicks.Sword;

public class King extends Character{

    public King(){
        super(new Random().ints(5, 16).findFirst().getAsInt(), 
              new Random().ints(5, 16).findFirst().getAsInt(),
              new Sword());        
    }
}
