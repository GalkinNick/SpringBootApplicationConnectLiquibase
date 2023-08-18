public class Elevator {

    private int currentFloor = 1;
    private int maxFloor;
    private int minFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    private void MoveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    private void MoveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor; //new new
    }


    public int getCurrentFloor() {
        return currentFloor;
    }
    public void move(int floor) {
        while (currentFloor != floor){
            if (currentFloor < floor){
                MoveUp();
            } else {
                MoveDown();
            }
        }
    }

}