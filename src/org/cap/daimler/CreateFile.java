package org.cap.daimler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a file

		try {
			File obj = new File("C:\\users\\user\\Desktop\\GAJENDRAN.txt");
			if (obj.createNewFile()) {
				System.out.println("File Created newly:" + obj.getName());
			} else {
				System.out.println("File already exits");
			}

			// file information

			if (obj.exists()) {
				System.out.println("File name:" + obj.getName());
				System.out.println("Absolute path:" + obj.getAbsolutePath());
				System.out.println("writable:" + obj.canWrite());
				System.out.println("Readable:" + obj.canRead());
				System.out.println("File size in bytes:" + obj.length());
			} else {
				System.out.println("File doesn't exist");
			}

			// write a file
			try {
				FileWriter a = new FileWriter("C:\\\\users\\\\user\\\\Desktop\\\\GAJENDRAN.txt");
				a.write("Welcome to  Java Selenium batch");
				a.close();
				System.out.println("Written successfully");
				System.out.println("File size in bytes:" + obj.length());
			} catch (IOException e) {
				System.out.println("An error occured");
				e.printStackTrace();
			}
			// read a file
			try {
				Scanner r = new Scanner(obj);
				while (r.hasNextLine()) {
					String data = r.nextLine();
					System.out.println(data);
					System.out.println("Read successful");
				}
				r.close();
			} catch (FileNotFoundException e) {
				System.out.println("error in file reading");
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("AN error occured");
			e.printStackTrace();
		}
	}
}
