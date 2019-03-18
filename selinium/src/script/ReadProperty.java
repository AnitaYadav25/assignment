package script;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
    public static void main(String args[]) throws IOException {
        Properties properties=new Properties();
        File f=new File("/home/anita/IdeaProjects/selinium/src/script/abc.properties");
        FileInputStream fin=new FileInputStream(f);
        properties.load(fin);
        System.out.println(properties.getProperty("FName"));

    }
}
