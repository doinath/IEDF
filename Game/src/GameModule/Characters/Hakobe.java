package GameModule.Characters;

import GameModule.BattleSystem.Battle;

public class Hakobe extends Character implements Battle {

    public Hakobe() {
        name = "Hakobe";
        hitPoints = 100;
        level = 1;
        attackPower = 5;
    }

    @Override
    public int basic_attack() {
        if (!isAlive()) {
            return -1;
        }

        int damage = random.nextInt(attackPower+1);
        System.out.println("Attacks with "+ damage+ " total damage");

        return damage;
    }

    @Override
    public void takeDamage(int damage) {
        if (!isAlive()) {
            return;
        }
    }

    @Override
    public boolean isAlive() {
        return (hitPoints > 0);
    }

}