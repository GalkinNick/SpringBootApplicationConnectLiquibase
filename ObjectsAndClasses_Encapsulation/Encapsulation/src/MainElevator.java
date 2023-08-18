import java.util.Scanner;

public class MainElevator {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");

            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
            int cFloor = elevator.getCurrentFloor();
            for (int i =1; i < cFloor; i++)
                System.out.println(cFloor);
        }
    }
}
