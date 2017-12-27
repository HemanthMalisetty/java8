package com.pack3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;
public class WritableFutureDemo {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("sap4.txt");
		if(!Files.exists(path)){
			Files.createFile(path);
		}
		
		
		/**
		 * Here with AsynchronousFileChannel do read write operation in different place 
		 * so that jvm can perform next line of execution.
		 */
		AsynchronousFileChannel fileChannel = 
		    AsynchronousFileChannel.open(path, StandardOpenOption.WRITE);

		ByteBuffer buffer = ByteBuffer.allocate(1024);
		long position = 0;

		buffer.put("test data".getBytes());
		buffer.flip();

		Future<Integer> operation = fileChannel.write(buffer, position);
		buffer.clear();

		while(!operation.isDone());

		System.out.println("Write done");

	}

}
