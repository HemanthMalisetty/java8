package com.pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Readerdemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("sap1.txt");
		FileChannel fc=fis.getChannel();
		
		ByteBuffer buff=ByteBuffer.allocate(1024);
		byte[] arr=null;
		String str=null;
		while(fc.read(buff) != -1){
			buff.flip(); 
//			buff.rewind();
			while(buff.hasRemaining()){
				System.out.print((char)buff.get());
			}
			
			buff.clear();
			buff.rewind();
			
		}

	}

}
