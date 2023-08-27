

public class Computer{


    private final String vendor ; // производитель
    private final String name ;// имя
    private String processor;
    private String storageOfInformation;
    private String memory;
    private String screen;
    private String keyboard;

    public Computer(String name,
                    String vendor,
                    String processor,
                    String storageOfInformation,
                    String memory,
                    String screen,
                    String keyboard){
        this.name = name;
        this.vendor = vendor;
        this.processor = processor;
        this.storageOfInformation = storageOfInformation;
        this.memory = memory;
        this.screen = screen;
        this.keyboard = keyboard;
    }

        Processor p1 = new Processor();
        StorageOfInformation s1 = new StorageOfInformation();
        Memory m1 = new Memory();
        Screen s2 = new Screen();
        Keyboard k1 = new Keyboard();


    public void setProcessor( String processor){
        this.processor = processor;
    }
    public String getProcessor(){
        return processor;
    }
    public void setStorageOfInformation( String storageOfInformation){
        this.storageOfInformation = storageOfInformation;
    }

    public String getStorageOfInformation(){
        return storageOfInformation;
    }
    public void setMemory( String memory){
        this.memory = memory;
    }

    public String getMemory(){
        return memory;
    }
    public void setScreen( String screen){
        this.screen = screen;
    }

    public String getScreen(){
        return screen;
    }
    public void setKeyboard( String keyboard){
        this.keyboard = keyboard;
    }
    public String getKeyboard(){
        return keyboard;
    }

    public double SumWeight(){

        double sum = p1.ProcessorWeight + s1.StorageWeight + m1.MemoryWeight + s2.ScreenWeight + k1.KeyboardWeight;
        return sum;
    }

    public String Info(){
        double infoFrequencyP1 = p1.getFrequency();
        String str = Double.toString(infoFrequencyP1);
        return str;
    }




}
