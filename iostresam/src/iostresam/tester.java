package iostresam;

import static iostresam.IoUtils.ReadDetails;
import static iostresam.IoUtils.writeDetails;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class tester {
	public static void main(String[] args) {
		List<String> iList= Arrays.asList("1","2","3","4","5","6","9","4","3");
		
		try {
			writeDetails(iList, "temp1.txt");
			System.out.println("Afterwrite details");
			ReadDetails("temp1.txt").stream().forEach(l->System.out.println(l));
			System.out.println("After ReadDetails");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
