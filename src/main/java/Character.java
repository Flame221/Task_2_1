public class Character {
    private String name;
    private int damage;
    private int health;

    public Character(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

