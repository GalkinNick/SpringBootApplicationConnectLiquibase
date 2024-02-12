
import lombok.Getter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

@Getter
public class MetroStation {

    private ArrayList<String> listStation = new ArrayList<>();

    public ArrayList<String> StationName(String html) {
        Document doc = Jsoup.parse(html);
        Elements elements = doc.select("div.js-depend");
        elements.forEach(element -> {
            String stat = element.text();
            listStation.add(stat);
        });
        return listStation;
    }
}
