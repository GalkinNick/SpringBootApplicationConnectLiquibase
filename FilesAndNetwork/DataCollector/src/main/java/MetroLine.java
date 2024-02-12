import lombok.Getter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

@Getter
public class MetroLine {
    private ArrayList<String> nameList = new ArrayList<>();
    private ArrayList<String> numberList = new ArrayList<>();
    public void LineName (String html) {
        Document doc = Jsoup.parse(html);

        Elements lines = doc.select("div.js-toggle-depend");
        lines.forEach(line -> {
            String lineName = line.text();
            nameList.add(lineName);
        });
        Elements numbers = doc.select("span.js-metro-line");
        numbers.forEach(number -> {
            String lineNumber = number.attr("data-line");
            numberList.add(lineNumber);
        });
    }
}
