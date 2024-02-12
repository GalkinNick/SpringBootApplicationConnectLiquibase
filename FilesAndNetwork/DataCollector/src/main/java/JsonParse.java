import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class JsonParse {
    ObjectMapper mapper = new ObjectMapper();


    ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
    public void JsonStation(ArrayList<String> str) throws IOException {
        try {
            writer.writeValue(Paths.get("lib\\station.json").toFile(), str);
        } catch ( Exception ex){
            ex.printStackTrace();
        }
    }

    public void JsonLine(MetroLine str){
        try {
            writer.writeValue(Paths.get("lib\\lines.json").toFile(),str);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
