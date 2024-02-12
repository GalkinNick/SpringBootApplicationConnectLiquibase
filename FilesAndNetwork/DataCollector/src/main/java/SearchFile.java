import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFile {

    List<File> listCSV = new ArrayList<>();
    List<File> listJson = new ArrayList<>();
    StringBuilder builder = new StringBuilder();

    public  void Searches(File root){
        if (root.isDirectory()) {
            File[] directotyFile = root.listFiles();
            if (directotyFile != null) {
                for (File files : directotyFile) {
                    if (files.isDirectory()) Searches(files);
                    else {
                        if (files.getName().toLowerCase().endsWith(".csv"))
                        {
                           listCSV.add(files);
                        } else if(files.getName().toLowerCase().endsWith(".json")){
                            listJson.add(files);
                        }

                    }
                }
            }
        }
    }

}
