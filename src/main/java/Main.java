public class Main {
    public static void main(String[] args) {
        Character hero = new Character("Hero", 2, 11);
        Character monster = new Character("Monster", 4, 8);

        String string = BattleStage.startBattle(hero, monster);
        System.out.println(string);
    }

}

class BattleStage {
    private BattleStage() {
    }

    public static String startBattle(Character hero, Character monster) {
        String string;
        String monsterName = monster.getName();
        String heroName = hero.getName();

        int heroDamage = hero.getDamage();
        int heroHealth = hero.getHealth();

        int monsterDamage = monster.getDamage();
        int monsterHealth = monster.getHealth();

        while (monsterHealth > 0 && heroHealth > 0) {
            monsterHealth -= heroDamage;
            System.out.println(heroName + " attacked the " + monsterName + ". " + monsterName + " has " + monsterHealth + " HP");
            heroHealth -= monsterDamage;
            System.out.println(monsterName + " attacked the " + heroName + ". " + heroName + " has " + heroHealth + " HP");
            hero.setHealth(heroHealth);
            monster.setHealth(monsterHealth);
        }

        if (monster.getHealth() <= 0){
            string = heroName + " wins!";
        }
        else if (hero.getHealth() <= 0){
            string = monsterName + " wins!";
        }
        else {string = "ERROR!";}

      return string;
    }
}