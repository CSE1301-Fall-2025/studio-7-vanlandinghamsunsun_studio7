public class Die {
    private int n;

    public Die(int nInit) {
        n = nInit;
    }

    public int diceRoll() {
        return ((int)(Math.random()*n) + 1);
    }

    public static void main(String[] args) {
        Die d1 = new Die(6);
        System.out.println(d1.diceRoll());
    }
}
