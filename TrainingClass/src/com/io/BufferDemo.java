package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("new_file.txt"));
		
			BufferedOutputStream bos = new BufferedOutputStream(System.out);
		
			byte[] data = new byte[1024];
			boolean eof = false;
			int length = 0;
		
			while(!eof) {
				length = bis.read(data);
			
				if(length == -1) {
					eof = true;
				}
				else {
					bos.write(data);
				}
			}
			
			bis.close();
			bos.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
