package interfaceex;

public class Fighter extends Unit implements Fightable{
    public void move(int x, int y) {
        System.out.println("Move");
    }

    public void attack(Unit u) {
        System.out.println("Attack!");
    }
}
