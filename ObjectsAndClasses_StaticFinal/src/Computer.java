

public class Computer{


    private final String vendor ; // производитель
    private final String name ;// имя
    protected Processor processor;
    protected StorageOfInformation storageOfInformation;
    protected Memory memory;
    protected Screen screen;
    protected Keyboard keyboard;


    public Computer(String name,
                    String vendor
                    ){
        this.name = name;
        this.vendor = vendor;

    }
    public double SumWeight(){

        double sum = processor.ProcessorWeight +
                storageOfInformation.StorageWeight +
                memory.MemoryWeight +
                screen.ScreenWeight +
                keyboard.KeyboardWeight;
        return sum;
    }

    public String Info(){
        double infoFrequencyP1 = processor.getFrequency();
        String str = Double.toString(infoFrequencyP1);
        return str;
    }




}
