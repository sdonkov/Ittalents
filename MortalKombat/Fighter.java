import java.util.Random;

public class Fighter {

    private String name;
    private int health;
    private static final int MAX_HEALTH =200;
    private int damage;

    Fighter(String name, int health, int damage){
        this.name = name;
        if(health < MAX_HEALTH) {
            this.health = health;
        }
        if(damage >0 && damage <10){
            this.damage = damage;
        }
    }

    void hit(Fighter enemy){
        int rand = new Random().nextInt(100);
        if(rand <10){
            dodge(enemy);
            return;
        }
        if(rand <20){
            kick(enemy);
            return;
        }
        if (rand < 25) {
            critical(enemy);
            return;
        }
        if(rand < 30){
            heal();
            return;
        }
        enemy.health -= this.damage;
        System.out.println(this.name + " hits for " + this.damage + " " + enemy.name + " left with "
        + enemy.health + " HP");
    }

    void dodge(Fighter enemy){
        System.out.println(enemy.name + " dodge the hits. NO DAMAGE MADE");
    }

    void kick(Fighter enemy){
        int kick = damage +2;
        enemy.health -= kick;
        System.out.println(this.name + " KICKS for " + kick + " " + enemy.name + " left with "
                + enemy.health + " HP");
    }

    void critical(Fighter enemy){
        int critical = damage*2;
        enemy.health -= critical;
        System.out.println(this.name + " CRITICAL HIT FOR " + critical + " " + enemy.name + " left with "
                + enemy.health + " HP");
    }

    void heal(){
        int heal =10;
        if(heal + health < MAX_HEALTH) {
            this.health += heal;
            System.out.println(this.name + " FIND VODKA AND HEALS HIMSELF FOR " + heal + " HP" +
                    ". New HP: " + this.health);
        }
    }

    boolean isAlive(){
        return health > 0;
    }

    void resetHealth(){
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
