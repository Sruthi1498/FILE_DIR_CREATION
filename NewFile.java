import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\text.txt");

        if(f.createNewFile())
        {
            System.out.println("file created");
        }
        else
        {
            System.out.println("not created");
        }
    }
}
