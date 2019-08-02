package com.BriteERP.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    public static final String  PROPFILE="./configuration.properties";
    public static Properties prop;

    static{
        File file=new File(PROPFILE);

        try {
            FileInputStream fis=new FileInputStream(file);
            prop=new Properties();
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){
        return prop.getProperty(key);
    }
}
