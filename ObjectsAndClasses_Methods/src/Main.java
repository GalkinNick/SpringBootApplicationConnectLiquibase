public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Bread",13,1,150);
        basket.print("Milk");
        double cont = Basket.getAllCount();
        double sum = Basket.getAllSum();
        // basket.print("Bread");
        System.out.println(cont);
        System.out.println(sum); //
    }
}
