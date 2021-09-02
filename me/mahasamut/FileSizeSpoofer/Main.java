package me.mahasamut.FileSizeSpoofer;

import java.io.File;
import java.io.RandomAccessFile;

public class Main {

	public static void main(String[] args) {
		try {
			File path = new File(args[0]);
			RandomAccessFile randomAccessFile = new RandomAccessFile(path, "rw");
			long kb = Integer.parseInt(args[1]) * 1000L;

			randomAccessFile.setLength(kb);
			randomAccessFile.close();

			System.out.println(
					"File has been save to: " + path.getAbsoluteFile() + " with " + Integer.parseInt(args[1]) + "kb");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
