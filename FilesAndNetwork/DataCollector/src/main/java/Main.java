import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        String htmlFile = Parse("C:\\skillbox\\java_basics\\FilesAndNetwork\\DataCollector\\src\\data\\metro.html");

        JsonParse jsonParse = new JsonParse();
        MetroStation metroStation = new MetroStation();
        MetroLine metroLine = new MetroLine();
        metroLine.LineName(htmlFile);

        jsonParse.JsonStation(metroStation.StationName(htmlFile));
        jsonParse.JsonLine(metroLine);

        SearchFile searchFile = new SearchFile();
        searchFile.Searches(new File("C:\\Users\\svish\\Downloads\\stations-data"));
    }

    private static String Parse(String str){
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(str));
            lines.forEach(line -> builder.append(line + "\n"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return builder.toString();
    }
}
