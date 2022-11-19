class GameEntity extends Weapon {
    public float health;
    public int damage;

    // Getter
    public void getInfo() {
        System.out.println("Damage" + this.damage);
        System.out.println("Health" + this.health);
    }

    // Setter
    public void setGameInfo(float health, int damage) {
        this.damage = damage;
        this.health = health;
    }
}
