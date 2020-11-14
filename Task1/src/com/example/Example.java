package com.example;

import com.example.forImport.*;

public class Example{ 
	public static void main(String[] args){
		 Friend f = new Friend();
		 f.sayHello();
			for (int i = 0; i < args.length; i++) 
            		System.out.println(args[i]);
	}
} 