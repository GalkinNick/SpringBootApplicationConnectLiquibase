import java.util.Scanner;

public class MainStaticFinal {
    public static void main(String[] args) {
    Computer computer = new Computer("Redmi", "China");
    Processor processor = new Processor(3.5,8,"",19.2);
    StorageOfInformation storage = new StorageOfInformation("",7,11.2);
    Memory memory = new Memory("",8,13.5);
    Screen screen = new Screen(8,"",13.2);
    Keyboard keyboard = new Keyboard("",true,13.5);

    System.out.println("Общий вес всех комплектующих: "  + computer.SumWeight() + " г");
    System.out.println(computer.toString());
   // System.out.println(computer.Info());

    }

}
