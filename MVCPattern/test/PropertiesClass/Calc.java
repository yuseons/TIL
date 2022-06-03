package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Calc {

	//속성 파일을 이용해 사칙연산을 수행하는 자바 프로그램을 작성하세요. 
	   
	public static void main(String[] args) {

		Properties prop = new Properties();
		FileInputStream fis = null;
		File file = new File("calc.properties");
		
		try {
			fis = new FileInputStream(file);
		
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
		
		int su1, su2;
		
		su1 = Integer.parseInt(prop.getProperty("su1"));  
		su2 = Integer.parseInt(prop.getProperty("su2"));  
		
        System.out.println("su1+su2 = " + (su1+su2));
        System.out.println("su1-su2 = " + (su1-su2));
        System.out.println("su1*su2 = " + (su1*su2));
        System.out.println("su1/su2 = " + (su1/su2));
	}

}
