package com.app.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Stream;

import javax.sound.midi.Soundbank;

import com.app.entity.BankStatement;

public interface IOUtils {
	static void writeDetails(Stream<BankStatement> blist,
			String fileName) throws IOException {
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName))){
			blist.forEach(b->pw.println(b));
		}
	}
	
//	static void readDetails(List<BankStatement> list,String fileName) 
//			throws FileNotFoundException, IOException {
//		try(BufferedReader br=new BufferedReader(new FileReader(fileName));
//				PrintWriter pw=new PrintWriter(new FileWriter(fileName))){
//			br.lines()
//			.forEach(l->pw.);
//		}
//	}
	
	static void ReadDetails(List<BankStatement> list,String fileName) throws FileNotFoundException, IOException {
		try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
			String line;
			br.readLine();
			while((line=br.readLine())!=null) {
				String[] values=line.split(",");
				LocalDate date=LocalDate.parse(values[0],DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				String narration = values[1];
                double withdrawalAmount = Double.parseDouble(values[2]);
                double depositAmount = Double.parseDouble(values[3]);
                list.add(new BankStatement(date, narration, withdrawalAmount, depositAmount));
			}
		}
	}
}
