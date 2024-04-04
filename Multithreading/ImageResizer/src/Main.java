import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {

    private static  int newWidth = 100;
    public static void main(String[] args) {
        String srcFolder = "C:\\Users\\svish\\Desktop\\src";
        String dstFolder = "C:\\Users\\svish\\Desktop\\dsr";

        File srcDir = new File(srcFolder);

        long start = System.currentTimeMillis();

        File[] files = srcDir.listFiles();

        int middle = files.length / 2;
        // создание копий для исходных файлов
        File[] files1 = new File[middle];
        System.arraycopy(files, 0 , files1, 0, middle);
        // создание потоков
        ImageResizer resizer = new ImageResizer(files1, newWidth, dstFolder, start);
        // запуск потоков
        resizer.start();

        File[] files2 = new File[files.length - middle];
        System.arraycopy(files, middle, files2,0, files2.length);
        ImageResizer resizer1 = new ImageResizer(files2, newWidth, dstFolder, start);
        resizer1.start();
    }
}
