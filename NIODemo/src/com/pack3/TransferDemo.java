package com.pack3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class TransferDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile fromFile = new RandomAccessFile("sap1.txt", "rw");
		FileChannel      fromChannel = fromFile.getChannel();

		RandomAccessFile toFile = new RandomAccessFile("sap2.txt", "rw");
		FileChannel      toChannel = toFile.getChannel();

		long position = 0;
		long count    = fromChannel.size();

		//toChannel.transferFrom(fromChannel, position, count);
		fromChannel.transferTo(position, count, toChannel);
		System.out.println("file copied");

	}

}
