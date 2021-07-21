public class Main {
    public static void main(String[] args) {
        int ticket = 1215599;
        int quantity = 10;
        int totalCost = ticket * quantity;
        int each = 20;
        int bonusRubles = totalCost / each;
        System.out.println(bonusRubles);

    }
}