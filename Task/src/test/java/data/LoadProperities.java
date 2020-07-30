package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperities {


	//load properities file

	public static Properties userData= loadproperties(System.getProperty("user.dir")+"\\src\\main\\java\\properities\\userdata.properities");

	private static Properties  loadproperties (String path)
	{
		Properties  pro= new Properties();

		try {
			FileInputStream stream= new FileInputStream(path);
			pro.load(stream);

		} catch (FileNotFoundException e) {
			System.out.println("Error Ocurred:" +e.getMessage());
		} catch (IOException e) {
			System.out.println("Error Ocurred:" +e.getMessage());
		}
	     catch (NullPointerException e) {
		System.out.println("Error Ocurred:" +e.getMessage());
	    }

	return pro;
}



}
