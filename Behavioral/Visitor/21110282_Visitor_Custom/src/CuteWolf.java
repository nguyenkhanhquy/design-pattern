public class CuteWolf implements Monster {

    public void hitBy(Warrior warrior) {
        damaged(150);
    }

    public void hitBy(Wizard wizard) {
        damaged(110);
    }

    private void damaged(int hp) {
        System.out.println("[Cute Wolf]: Woof! I lost " + hp + "hp");
    }

}
