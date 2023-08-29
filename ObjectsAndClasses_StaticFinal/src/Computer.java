

public class Computer{


    private final String vendor ; // производитель
    private final String name ;// имя
    protected Processor processor;
    protected StorageOfInformation storageOfInformation;
    protected Memory memory;
    protected Screen screen;
    protected Keyboard keyboard;


    public Computer(String name,
                    String vendor,
                    Processor processor,
                    StorageOfInformation storageOfInformation,
                    Memory memory,
                    Screen screen,
                    Keyboard keyboard
                    ){
        this.name = name;
        this.vendor = vendor;
        this.processor = processor;
        this.storageOfInformation = storageOfInformation;
        this.memory = memory;
        this.screen = screen;
        this.keyboard = keyboard;
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

    public String toString(){
        String str = String.valueOf(processor.getFrequency()) +
                processor.getManufacturer() +
                processor.getManufacturer()+
                processor.getNumberOfCores();
        return str;
    }




}
