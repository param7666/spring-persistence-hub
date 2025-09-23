package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.Merrage;
import com.nt.service.IMerrageService;
@Component
public class LobObjectTestRunner implements CommandLineRunner {

	@Autowired
	private IMerrageService ser;

	
	
	@Override
	public void run(String... args) throws Exception {
		Merrage m=ser.findUserById(1);
		long id=m.getId();
		String name=m.getName();
		boolean isIndian=m.isIndian();
		byte[] photoContent=m.getPhoto();
		char[] bioContent=m.getBiodata();
		
		System.out.println(id+" "+name+" "+isIndian);
		FileOutputStream fos=new FileOutputStream("C:\\CODE\\LOBContent\\Retrive_image.jpg");
		fos.write(photoContent);
		fos.flush();
		fos.close();
		
		FileWriter fw=new FileWriter("C:\\CODE\\LOBContent\\Retrive_bio.txt");
		fw.write(bioContent);
		fw.flush();
		fw.close();
		
	}
	
	
	
	
	
	
	
	
/*
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name  ");
		String name=sc.next();
		System.out.println("Is the person is indian..");
		boolean isIndian=sc.nextBoolean();
		System.out.println("Enter the path of Biodata");
		String biodataPath=sc.next().trim();
		System.out.println("Enter the path of Photo");
		String photoPath=sc.next().trim();
		
		File file=new File(biodataPath);
		int length=(int)file.length();
		FileReader reader=new FileReader(file);
		char[] bioDataContent=new char[length];
		reader.read(bioDataContent);
		
		FileInputStream inputStream=new FileInputStream(photoPath);
		byte[] photoContent=inputStream.readAllBytes();
		
		Merrage m1=new Merrage(name, isIndian, bioDataContent, photoContent);
		System.out.println(ser.registerUser(m1));
	}
*/
	
}
