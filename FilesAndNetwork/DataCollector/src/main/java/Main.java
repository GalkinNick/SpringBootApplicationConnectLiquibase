import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;


public class Main {

    public static void main(String[] args) throws IOException {

        String htmlFile = Parse("C:\\skillbox\\java_basics\\FilesAndNetwork\\DataCollector\\src\\data\\metro.html");

        JsonParse jsonParse = new JsonParse();
        MetroStation metroStation = new MetroStation();
        MetroLine metroLine = new MetroLine();
        // поиск линии и номера
        metroLine.LineName(htmlFile);

        /*париснг и поиск хтмл файла
         */
        jsonParse.JsonStation(metroStation.StationName(htmlFile));
        //metroStation.getListStation().forEach(s-> System.out.println(s));
        jsonParse.JsonLine(metroLine);

        /*поиcк файлов из папки
         */
        SearchFile searchFile = new SearchFile();
        searchFile.Searches(new File("C:\\Users\\svish\\Downloads\\stations-data"));
        //searchFile.GetJSONList();
        //searchFile.GetCSVList();


        /*преобразование файла джексон в класс
        */
        String json = Files.readString(Paths.get("C:\\Users\\svish\\Downloads\\stations-data\\data\\7\\1\\depths-2.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        List<JsonClass> jsClass = objectMapper.readValue(json, new TypeReference<List<JsonClass>>() {});
        //jsClass.forEach(jsonClass -> System.out.println(jsonClass.getStation_name()));

        /*преобразование файла csv в класс
         */
        CSVClass csvClass = new CSVClass();
        csvClass.CSVParse("C:\\Users\\svish\\Downloads\\stations-data\\data\\9\\6\\dates-3.csv");
        //csvClass.GetName();

        /*
         */
        ObjectMapper objectMap = new ObjectMapper();
        String jsonLine = Files.readString(Paths.get("lib\\lines.json"));
        String jsonStation = Files.readString(Paths.get("lib\\station.json"));
        objectMap.registerModule(new JavaTimeModule());
        List<MapJson> listMapjson = objectMap.readValue(jsonLine, new TypeReference<List<MapJson>>(){});
        List<MapJson> listMapjson1 = objectMap.readValue(jsonStation, new TypeReference<List<MapJson>>(){});
        System.out.println(jsonStation);



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
