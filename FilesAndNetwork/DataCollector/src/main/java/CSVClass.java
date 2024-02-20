import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVClass {
    private List<String> name = new ArrayList<>();
    private List<String> date = new ArrayList<>();

    public void CSVParse(String str){
        try {
            List<String> lines = Files.readAllLines(Paths.get(str));
            for (String line : lines){
                String[] fragments = line.split(",");
                if (fragments.length != 2) {
                    System.out.println("Error");
                    continue;
                }
                name.add(fragments[0]);
                date.add(fragments[1]);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void GetName(){
        //name.forEach(n-> System.out.println(n));
        date.forEach(d-> System.out.println(d));
    }
}
