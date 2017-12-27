package com.pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("sap1.txt");
		FileChannel fc=fos.getChannel();
		
		ByteBuffer buff=ByteBuffer.allocate(1024);
		buff.put("Sapient Technology\n".getBytes());
		buff.put("Sapient Razorfish".getBytes());
		
		buff.flip();
		fc.write(buff);
		System.out.println("writen");
		fos.close();

	}

}
