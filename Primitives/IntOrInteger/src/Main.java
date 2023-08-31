import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        Capital();
        Uppercase();

    }
    // TODO: ниже напишите код для выполнения задания:
    //  С помощью цикла и преобразования чисел в символы найдите все коды
    //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
    private static void Capital(){
        for (char ch = 'А'; ch <= 'Я'; ch++) {
            char chr = ch;
            int in = (int)chr;
            System.out.println(ch + "(" + in + ")" );
        }
    }
    private static void Uppercase() {
        for (char ch1 = 'а'; ch1 <= 'я'; ch1++) {
            char chr1 = ch1;
            int in1 = (int) chr1;
            System.out.println(ch1 + "(" + in1 + ")" );
        }
    }
}
