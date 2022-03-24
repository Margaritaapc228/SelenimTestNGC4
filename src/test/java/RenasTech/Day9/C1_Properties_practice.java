package RenasTech.Day9;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class C1_Properties_practice {
    @Test
    public void TC1_SystemProperties() {
        //java has some ready properties then we can system info
        System.out.println(System.getProperty("os.name"));
    }

    @Test
    public void configurationProperties9() throws FileNotFoundException {
        //to be able to make our code understand properties file I need to connect to my file
        Properties properties = new Properties();

        String pathForPropertiesFile = "configuration.properties";
        //this is path of the configuration.properties file

        FileInputStream fileInputStream = new FileInputStream(pathForPropertiesFile);
        try {
            properties.load(fileInputStream);
            //file needs to be loaded in the automation

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));

    }
}

