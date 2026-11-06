package JobSheet10.Tugas;

public abstract class Monster implements Damageable {
    protected int health;
    protected int level;

    public abstract void heal();
    public abstract void damaged();

    public String getMonsterInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}
