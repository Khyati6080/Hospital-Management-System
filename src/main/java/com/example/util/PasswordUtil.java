package com.example.util;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtil {
	public static String hashPassword(String password){
	    MessageDigest md = null;
	    byte[] hash = null;
	    
	    try {
			md = MessageDigest.getInstance("SHA-256");
			hash = md.digest(password.getBytes("UTF-8"));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	    catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	    
	    StringBuilder hexString = new StringBuilder();
	    for (byte b : hash) {
	      hexString.append(String.format("%02x", b));
	    }
	    return hexString.toString();
	  }

}
