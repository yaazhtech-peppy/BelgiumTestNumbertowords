package com.belgium.numtoword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belgium.numtoword.business.api.Business;

@SpringBootApplication
public class NumtowordApplication implements CommandLineRunner {
@Autowired Business<Integer, String> business;
	public static void main(String[] args) {
		SpringApplication.run(NumtowordApplication.class, args);
		
	}
	public void run(String... arg0) throws Exception {
		if(arg0.length==0){
			System.out.println("Please Enter the Number in commandlin");
		}else{
		for(int i=0;i<arg0.length;i++)
			System.out.println(business.process(Integer.valueOf(arg0[i])));
		}
		
	}

}
