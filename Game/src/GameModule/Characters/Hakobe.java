package GameModule.Characters;

import GameModule.BattleSystem.Battle;

public class Hakobe extends Character implements Battle {

    public Hakobe() {
        name = "Hakobe";
        hitPoints = 100;
    }

    @Override
    public int basic_attack(int damage) {
        System.out.println("Attacks with "+ damage+ " total damage");

        return damage;
    }

    @Override
    public int skill(String skillName, int damage) {

        return damage;
    }
}