public class Processor {

    private  double frequency ; //частота;
    private  int numberOfCores ; // количество ядер;
    private  String manufacturer ; //  производитель;
    protected  double ProcessorWeight ; // вес.

    public Processor(double frequency, int numberOfCores, String manufacturer, double processorWeight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        ProcessorWeight = processorWeight;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    public double getFrequency(){
        return frequency;
    }
    public int getNumberOfCores() {
        return numberOfCores;
    }
    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public double getProcessorWeight(){
        return ProcessorWeight;
    }
    public void setProcessorWeight(double processorWeight) {
        ProcessorWeight = processorWeight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
