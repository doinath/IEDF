package GameModule.BattleSystem;

public interface Battle {

    int basic_attack();
    void takeDamage(int damage);
    boolean isAlive();
    
}
