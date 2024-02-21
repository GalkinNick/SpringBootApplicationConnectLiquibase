import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class MapJson {
    @JsonProperty("nameList")
    private ArrayList<String> nameList = new ArrayList<>();
    @JsonProperty("numberList")
    private ArrayList<String> numberList = new ArrayList<>();


    public MapJson(){

   }

    public void JsonMapWrite(ArrayList<String> str) throws IOException {

    }


}
