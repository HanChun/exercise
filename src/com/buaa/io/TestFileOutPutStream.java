package com.buaa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutPutStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try {
			FileInputStream fis = new FileInputStream("D:/testFile/TestCollections1.java");
			File file = new File("D:/jinchunxi/hanxueting.txt");
			if(!file.exists()){
				file.getParentFile().mkdirs();
				file.createNewFile();			
			}
			FileOutputStream fos = new FileOutputStream(file);
			int a = 0;
			while((a=fis.read())!=-1){
				fos.write(a);
			}
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
