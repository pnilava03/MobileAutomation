package com.apple.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesFile {

    public static String getProperty(String key) throws IOException {
        Properties prop= new Properties();
        prop.load(Files.newInputStream(Paths.get("./resources/config/config.properties")));
        return prop.getProperty(key);

    }
}
