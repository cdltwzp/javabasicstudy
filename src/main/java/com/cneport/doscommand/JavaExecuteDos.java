package com.cneport.doscommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * java执行dos命令
 * @author admin
 *
 */
public class JavaExecuteDos {
public static void main(String[] args) throws Exception {
	//openDocByJavaCode();
	// Process rt=Runtime.getRuntime().exec("calc");
	String cmd = "cmd.exe   /C   start   /b    ./src/main/resource/test.bat";//可以读到
	//String cmd = "/resource/test.bat";//读不到
	Process p = Runtime.getRuntime().exec(cmd);
	/*//取得命令结果的输出流    
    InputStream fis = p.getInputStream();    
   //用一个读输出流类去读    
    InputStreamReader isr = new InputStreamReader(fis);    
   //用缓冲器读行    
    BufferedReader br = new BufferedReader(isr);    
    String line=null;    
   //直到读完为止    
   while((line=br.readLine())!=null)    
    {    
	   System.out.println(line);
        //System.out.println(new String(line.getBytes("iso-8859-1"),"utf-8"));    
    }    */
}

private static void openDocByJavaCode() throws IOException {
	System.out.println("----");
	 Process rt=Runtime.getRuntime().exec("C:\\Users\\admin\\AppData\\Local\\kingsoft\\WPS Office\\ksolaunch.exe C:\\Users\\admin\\Desktop\\文件下载.docx");
	 System.out.println("------");
}
}
