package com.example;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordED {

	int a=20;
	String name="Quazi";
	double price=10.50;

	public static String encode(String str) {
		
		Encoder encoder=Base64.getEncoder();
		return encoder.encodeToString(str.getBytes());
	}
	
	public static String decode(String name) {
		Decoder decoder=Base64.getDecoder();
		byte[] decode=decoder.decode(name);
		return new String(decode);
	}
	
	public static void main(String[] args) {
		
		String name=PasswordED.encode("Aqeemoddin");
		System.out.println(name);

		String name2=PasswordED.decode(name);
		System.out.println(name2);
	}

}
