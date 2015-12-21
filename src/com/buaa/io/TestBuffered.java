package com.buaa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:/test.txt"));
			for(int i =0; i<10 ; i++){
				bw.write(String.valueOf(Math.random()));//把double型转换成string型
				bw.newLine();
			}
			bw.flush();
			bw.close();
			
			FileReader fr = new FileReader("D:/test.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = null;
			while((str = br.readLine())!=null){
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
