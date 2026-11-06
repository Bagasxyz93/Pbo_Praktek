package JobSheet10.Tugas;

public class Golem extends Monster {

    public Golem(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (health * 20) / 100;
        } else if (level == 2) {
            health += (health * 30) / 100;
        } else if (level == 3) {
            health += (health * 45) / 100;
        }
    }

    @Override
    public void damaged() {
        health -= (health * 15) / 100;
    }

    @Override
    public String getMonsterInfo() {
        return "Golem Data =\n" + super.getMonsterInfo();
    }
}
