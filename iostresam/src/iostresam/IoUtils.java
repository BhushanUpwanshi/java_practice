package iostresam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class IoUtils {
	public static void writeDetails(List<String> list, String filename) throws IOException {
		try(PrintWriter pw=new PrintWriter(new FileWriter(filename))){
			System.out.println("In WriteDetails");
			list.forEach(l->pw.println(l));
		}
	}
	
	public static List<String> ReadDetails(String Filename) throws FileNotFoundException, IOException{
		try(BufferedReader br=new BufferedReader(new FileReader(Filename))){
			System.out.println("in Read Details");
			List<String> iList=new ArrayList<String>();
			String line;
			while((line = br.readLine())!=null) {
				System.out.println("in while");
				iList.add(line);
			}
			return iList;
		}
	}
}
