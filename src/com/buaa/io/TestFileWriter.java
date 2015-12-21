package com.buaa.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	/*写了一个文件   FileWriter写的内容
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("D:/test.txt");
			fw.write("I haven't seen you for ages !");
			fw.write("\r\n");
			fw.write("好久不见");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
