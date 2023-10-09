package kicks;

import lotr.Character;

public interface KickStrategy {
    void kick(Character me, Character opponent);
}
