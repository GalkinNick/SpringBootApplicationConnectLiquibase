public class MainArithmetic {
    public static void main(String[] args) {

        Arithmetic mth = new Arithmetic(6,5);
        int summa = mth.sum();
        System.out.println(summa);
        System.out.println(mth.composition());
        System.out.println(mth.max());
        System.out.println(mth.min());



    }
}
