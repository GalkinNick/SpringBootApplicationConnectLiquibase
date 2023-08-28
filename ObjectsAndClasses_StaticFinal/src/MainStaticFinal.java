import java.util.Scanner;

public class MainStaticFinal {
    public static void main(String[] args) {
    Computer computer = new Computer("Redmi", "China");
        computer.processor.setProcessorWeight(13.5);
        computer.storageOfInformation.setStorageWeight(10.5);
        computer.memory.setMemoryWeight(10.4);
        computer.screen.setScreenWeight(13.4);
        computer.keyboard.setKeyboardWeight(7.4);
    System.out.println("Общий вес всех комплектующих: "  + computer.SumWeight() + " г");
   // System.out.println(computer.Info());

    }

}
