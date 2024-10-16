package GameModule.Characters;
import GameModule.BattleSystem.*;

public class Boss extends Character implements Battle {

    public Boss() {
        name = "Boss";
        hitPoints = 100;
    }

    public boolean takenDamage(int damage) {
        return damage > 0;
    }

    public void bossHealth(int damage) {
        if(takenDamage(damage)) {
            System.out.println(name + " has taken " + damage + " damage");
            this.hitPoints -= damage;
        }
    }

    public int checkHealth() {
        return hitPoints;
    }

    @Override
    public int basic_attack(int damage) {
        System.out.println("Attacks with "+ damage+ " total damage");

        return damage;
    }

    @Override
    public int skill(String skillName, int damage) {
        return 1;
    }
}

