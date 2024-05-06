public class Wizard implements Human {

    public void hit(Monster monster) {
        System.out.println("[Wizard]: Avada Kedavra! -> [" + monster.getClass().getName() + "]");
        monster.hitBy(this);
    }

}
