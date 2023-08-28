public class StorageOfInformation {

    private  String StorageType ; //тип — HDD, SSD;
    private  int memoryCapacity ; //  объём памяти;
    protected  double StorageWeight ; // вес.

    public StorageOfInformation(String storageType, int memoryCapacity, double storageWeight) {
        StorageType = storageType;
        this.memoryCapacity = memoryCapacity;
        StorageWeight = storageWeight;
    }

    public String getStorageType() {
        return StorageType;
    }

    public void setStorageType(String storageType) {
        StorageType = storageType;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public double getStorageWeight() {
        return StorageWeight;
    }

    public void setStorageWeight(double storageWeight) {
        StorageWeight = storageWeight;
    }

}
