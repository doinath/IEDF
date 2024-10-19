package GameModule.Entities;

import GameModule.BattleSystem.Battle;

public class PicklePrick extends Entities implements Battle {

    public PicklePrick() {
        entityName = "Pickle Prick";
        hitPoints = 100;
        attackPower = 50;

    }

    @Override
    public int basic_attack() {
        return 0;
    }

    @Override
    public void takeDamage(int damage) {

    }

    @Override
    public boolean isAlive() {
        return false;
    }

}
