package com.cneport.encode_decode;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * 3f其实�?003f
 * @author admin
 *
 */
public class EncodeAndDecodeStudy {
public static void main(String[] args) throws Exception {
	//cnTest();
	//String s = "中文";
	String s = "中文";
	char[] charArray = s.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		System.out.print(Integer.toHexString(charArray[i]) + " ");//unicode 4e2d 6587 
	}
	System.out.println();
	System.out.println("-------");
	/**
	 * StringCoding$StringEncoder里面�?
	 * byte[] encode(char[] ca, int off, int len) {
            int en = scale(len, ce.maxBytesPerChar());
                数组的长�? int blen = ((ArrayEncoder)ce).encode(ca, off, len, ba);
       rt.jar里面sun.nio.cs.UTF_8可以看出
       private Encoder(Charset param1Charset) {
	      super(param1Charset, 1.1F, 3.0F);
	      this.repl = 63;
    }      
    �?个字符最多用三个字节表示 而ISO8859-1�?多是�?个字节表示一个字�?   
	 */
	byte[] bytes = s.getBytes();
	for (int i = 0; i < bytes.length; i++) {
		System.out.print(Integer.toHexString(bytes[i] & 0Xff) + " ");//u8 e4 b8 ad e6 96 87  
	}
	
	System.out.println();
	System.out.println("-------");
	byte[] bytesgbk = s.getBytes("gb2312");
	for (int i = 0; i < bytesgbk.length; i++) {
		System.out.print(Integer.toHexString(bytesgbk[i] & 0Xff) + " ");//d6 d0 ce c4 
		//gbk 3f  为什么是3f,而不�?3f 3f因为码表是一个字符一个字符去�?
	}
	
	System.out.println();
	System.out.println("-------");
	byte[] bytesiso = s.getBytes("iso8859-1");
	for (int i = 0; i < bytesiso.length; i++) {
		System.out.print(Integer.toHexString(bytesiso[i] & 0Xff) + " ");//iso 3f 3f  
	}
	System.out.println();
	System.out.println("-------");

	/*char x = '1';
	System.out.println(Integer.toHexString(x));
	byte[]arr = new byte[1];
	arr[0] = -75;
	System.out.println(new String(arr,"iso8859-1"));*/
	System.out.println(new String(s.getBytes(),"iso8859-1"));
	
	for (int i = 128; i < 256; i++) {
		byte[]arr = new byte[1];
		arr[0] = (byte)i;
		//System.out.println(arr[0]);
		System.out.println(i + " : " + new String(arr,"ISO-8859-1"));
	}
	
	System.out.println(new String("中文".getBytes("ISO-8859-1"),"ISO-8859-1"));
	System.out.println(new String("中文".getBytes("UTF-8"),"UTF-8"));
	System.out.println(new String("中文".getBytes("UTF-8"),"ISO-8859-1"));
	
	System.out.println(URLEncoder.encode("INDEX与优�?","utf-8"));
}

private static void cnTest() throws UnsupportedEncodingException {
	//String s = "中文";
	String s = "中文";
	char[] charArray = s.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		System.out.print(Integer.toHexString(charArray[i]) + " ");//unicode 4e2d 6587 
	}
	System.out.println();
	System.out.println("-------");
	/**
	 * StringCoding$StringEncoder里面�?
	 * byte[] encode(char[] ca, int off, int len) {
            int en = scale(len, ce.maxBytesPerChar());
                数组的长�? int blen = ((ArrayEncoder)ce).encode(ca, off, len, ba);
       rt.jar里面sun.nio.cs.UTF_8可以看出
       private Encoder(Charset param1Charset) {
	      super(param1Charset, 1.1F, 3.0F);
	      this.repl = 63;
    }      
    �?个字符最多用三个字节表示 而ISO8859-1�?多是�?个字节表示一个字�?   
	 */
	byte[] bytes = s.getBytes();
	for (int i = 0; i < bytes.length; i++) {
		System.out.print(Integer.toHexString(bytes[i] & 0Xff) + " ");//u8 e4 b8 ad e6 96 87 
	}
	
	System.out.println();
	System.out.println("-------");
	byte[] bytesgbk = s.getBytes("gb2312");
	for (int i = 0; i < bytesgbk.length; i++) {
		System.out.print(Integer.toHexString(bytesgbk[i] & 0Xff) + " ");//gbk d6 d0 ce c4 
	}
	
	System.out.println();
	System.out.println("-------");
	byte[] bytesiso = s.getBytes("iso8859-1");
	for (int i = 0; i < bytesiso.length; i++) {
		System.out.print(Integer.toHexString(bytesiso[i] & 0Xff) + " ");//iso 3f 3f 
	}
}
}
