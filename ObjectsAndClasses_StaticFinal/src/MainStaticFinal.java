import java.util.Scanner;

public class MainStaticFinal {
    public static void main(String[] args) {
    Computer computer = new Computer("Redmi",
                                    "China",
                                    "Intel",
                                    "HHD",
                                    "Memory",
                                    "Redmi",
                                    "Touchpad");
    System.out.println("Общий вес всех комплектующих: "  + computer.SumWeight() + " г");
    System.out.println(computer.Info());






    }
}
