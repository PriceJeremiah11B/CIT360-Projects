package com.tcg.json;

import java.io.InputStream;
import java.util.Scanner;

public class JSONUtils {
	 public static String getJSONSStringFromFile(String path) {
		 Scanner scanner;
		 InputStream in = FileHandle.inputStreamFromFile(path);
		 scanner = new Scanner(in);
		 String json = scanner.useDelimiter("\\z").next();
		 scanner.close();
		 return json;
		 
	 }
}
