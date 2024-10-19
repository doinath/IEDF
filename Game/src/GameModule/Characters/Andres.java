package GameModule.Characters;

import GameModule.BattleSystem.Battle;


public class Andres extends Character implements Battle {

    public Andres() {
        name = "Andres";
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
        if(!isAlive()) {
            return;
        }

        hitPoints -= damage;

    }

    @Override
    public boolean isAlive() {
        return (hitPoints > 0);
    }

}
