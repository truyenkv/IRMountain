package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {


	public String getObjectRepository(String keyword) throws IOException{
        String path = "\\IRMountain\\";
        String fileName = "serenity.properties";
        Properties pro = new Properties();
        InputStream fileInput = new FileInputStream(new File(System.getProperty("user.dir")+ path + fileName));
        pro.load(fileInput);
        String value;
        value = pro.getProperty(keyword);
        return value;
	}
}
