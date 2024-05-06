public class Warrior implements Human {

    public void hit(Monster monster) {
        System.out.println("[Warrior]: Let me introduce you: my sword!!! -> [" + monster.getClass().getName() + "]");
        monster.hitBy(this);
    }

}
