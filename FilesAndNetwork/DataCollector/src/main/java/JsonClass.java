import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
@AllArgsConstructor
@ToString
@Getter
public class JsonClass {
    @JsonProperty("station_name")
    private String station_name;
    @JsonProperty("depth")
    private String depth;

    public JsonClass(){

    }

}
