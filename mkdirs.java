import java.io.File;

public class mkdirs {
    public static void main(String[] args) {
        File f = new File("D:\\a\\b\\text");

        if(f.mkdir())
        {
            System.out.println("created");
        }
        else
        {
            System.out.println("not created");
        }

        boolean s = f.mkdirs();
        System.out.println(s);
    }
}
