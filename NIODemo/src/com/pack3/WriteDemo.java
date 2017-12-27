package com.pack3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("sap1.txt");
		FileChannel fc = fos.getChannel();
		ByteBuffer buffer = ByteBuffer.allocateDirect(48);
		buffer.put("sapient technolgy\n".getBytes());
		buffer.put("sapient razorfish\n".getBytes());
		buffer.flip();
		fc.write(buffer);
		System.out.println("file created");
	}

}
