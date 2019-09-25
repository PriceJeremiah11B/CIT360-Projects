package com.tcg.json;

import java.io.InputStream;
import java.util.Scanner;

import org.json.JSONObject;

public class JSONUtils {
	 public static String getJSONSStringFromFile(String path) {
		 Scanner scanner;
		 InputStream in = FileHandle.inputStreamFromFile(path);
		 scanner = new Scanner(in);
		 String json = scanner.useDelimiter("\\z").next();
		 scanner.close();
		 return json;
		 
	 }
	 
	 public static JSONObject getJSONObjectFromFile(String path) {
		 return new JSONObject(getJSONObjectFromFile(path));
	 }
	 
	 public static boolean objectExists(JSONObject jsonObject, String key) {
		 Object o;
		 try {
			o = jsonObject.get(key);
		 }
		 catch(Exception e) {
			 return false;
		 }
		 return o != null;
		 
	 }
	 
}
