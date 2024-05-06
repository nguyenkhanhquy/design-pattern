public class Goblin implements Monster {

    public void hitBy(Warrior warrior) {
        damaged(100);
    }

    public void hitBy(Wizard wizard) {
        damaged(180);
    }

    private void damaged(int hp) {
        System.out.println("[Goblin]: Owie! I lost " + hp + "hp");
    }

}
