package com.cneport.fileoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class FilePathAndReadWriteTest {

	public static void main(String[] args) throws Exception {
		//filePathTest();
		//read1();
		URL resource = FilePathAndReadWriteTest.class.getResource("TxtFile1.txt");
		InputStream openStream = resource.openStream();//如果读取不到文件会报空指针
        BufferedReader br = new BufferedReader(new InputStreamReader(openStream));
        String i;
        while((i = br.readLine()) != null) {
        	System.out.println(i);
        }
        openStream.close();
        br.close();
        		
	
	}

	/**
	 * 每次读取一个字符并输出
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void read1() throws FileNotFoundException, IOException {
		File srcFile = new File("./TxtFile.txt");
	    InputStream is = new FileInputStream(srcFile);
	    Reader reader = new InputStreamReader(new FileInputStream(srcFile));
	    int len;
	    while ((len = reader.read()) != -1) {
			System.out.print((char)len);
		}
	    is.close();
	    reader.close();
	}

	private static void filePathTest() {
		File file = new File("xx.txt");
		System.out.println(file.getAbsolutePath());//D:\Users\dave_\Documents\WorkSpace\Kafka\JavaBasicStudy\.\xx.txt
		System.out.println(file.getPath());//.\xx.txt
		System.out.println(file.isFile());//true
		File file2 = new File("/xx.txt");
		System.out.println(file2.getAbsolutePath());//D:\xx.txt
		System.out.println(file2.getPath());//\xx.txt
		System.out.println(file2.isFile());//false
	}

}
