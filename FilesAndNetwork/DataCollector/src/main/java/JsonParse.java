import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;

public class JsonParse {
    ObjectMapper mapper = new ObjectMapper();



    //ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
    public void JsonStation(ArrayList<String> str) throws IOException {
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(Paths.get("lib\\station.json").toFile(), str);
        } catch ( Exception ex){
            ex.printStackTrace();
        }
    }

    public void JsonLine(MetroLine str){
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(Paths.get("lib\\lines.json").toFile(),str);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
