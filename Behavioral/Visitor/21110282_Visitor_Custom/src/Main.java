public class Main {

    public static void main(String[] args) {
        Human warrior = new Warrior();
        Human wizard = new Wizard();

        Monster wolf = new CuteWolf();
        Monster goblin = new Goblin();

        warrior.hit(wolf);
        wizard.hit(wolf);

        warrior.hit(goblin);
        wizard.hit(goblin);
    }

}
