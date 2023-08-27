public class Processor {

    private static final double frequency = 3.6; //частота;
    private static final int numberOfCores = 4; // количество ядер;
    private static final String manufacturer = "intel"; //  производитель;
    protected static final double ProcessorWeight = 0.1; // вес.
    public double getFrequency(){
        return frequency;
    }
    public double getProcessorWeight(){
        return ProcessorWeight;
    }

}
