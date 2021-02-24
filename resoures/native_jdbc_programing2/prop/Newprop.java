package native_jdbc_programing2.prop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Newprop {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("url", "jdbc:mysql://localhost:3306/native_jdbc?useSSL=false");
		prop.setProperty("user", "user_native_jdbc");
		prop.setProperty("password", "rootroot");
		try {
			prop.store(new FileWriter("db2.properties"), "Properties Example");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
