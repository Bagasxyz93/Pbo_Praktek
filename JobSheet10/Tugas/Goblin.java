package JobSheet10.Tugas;

public class Goblin extends Monster {

    public Goblin(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (health * 15) / 100;
        } else if (level == 2) {
            health += (health * 25) / 100;
        } else if (level == 3) {
            health += (health * 35) / 100;
        }
    }

    @Override
    public void damaged() {
        health -= (health * 25) / 100;
    }

    @Override
    public String getMonsterInfo() {
        return "Goblin Data =\n" + super.getMonsterInfo();
    }
}
