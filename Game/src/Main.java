import GameModule.Characters.*;
//import TaleOfTwoBrothers.BattleSystem.*;

public class Main {
    public static void main(String[] args) {

        Hakobe h = new Hakobe();
        Boss b = new Boss();

        b.bossHealth(h.basic_attack(50));
        System.out.println(b.checkHealth());
    }
}