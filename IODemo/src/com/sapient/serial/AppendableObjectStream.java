package com.sapient.serial;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectStream extends ObjectOutputStream{

	public AppendableObjectStream(OutputStream out) throws IOException {
		super(out);
		
	}

	@Override
	protected void writeStreamHeader() throws IOException {
	
		//it will not write the header again in file followed bu object data.
		reset();
	}

	
}
