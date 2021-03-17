import java.io.File;
import java.io.IOException;

public class mkdir {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\demo");

        if(f.mkdir())
        {
            System.out.println("Directory created");
        }
        else {
            System.out.println("not created");
        }

        File f1 = new File("D:\\demo\\text.txt");
        f1.createNewFile();
    }
}
