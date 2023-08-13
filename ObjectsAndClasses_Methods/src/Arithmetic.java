public class Arithmetic {
    private int a;
    private int b;



    public Arithmetic(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sum (){
        int sum = a + b;
        return sum;
    }

    public int composition(){
        int comp = a * b;
        return comp;
    }
    public int max(){
        int max;
        if ( a > b){
            max = a;
        }
        else {
            max = b;
        }
        return max;
    }
    public int min(){
        int min;
        if ( a < b){
            min = a;
        }
        else {
            min = b;
        }
        return min;
    }


}