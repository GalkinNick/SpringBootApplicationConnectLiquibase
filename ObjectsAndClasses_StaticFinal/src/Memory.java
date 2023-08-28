public class Memory {
    private  String MemoryType ; // тип;
    private  int MemoryVolume ; //  объём;
    protected  double MemoryWeight ; //  вес.

    public int getMemoryVolume() {
        return MemoryVolume;
    }

    public void setMemoryVolume(int memoryVolume) {
        MemoryVolume = memoryVolume;
    }

    public double getMemoryWeight() {
        return MemoryWeight;
    }

    public void setMemoryWeight(double memoryWeight) {
        MemoryWeight = memoryWeight;
    }

    public void setMemoryType(String memoryType) {
        MemoryType = memoryType;
    }
    public String getMemoryType() {
        return MemoryType;
    }



}
