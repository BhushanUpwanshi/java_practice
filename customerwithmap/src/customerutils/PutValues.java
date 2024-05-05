package customerutils;

import java.util.HashMap;
import java.util.Map;

import customerwithmap.CustException;
import customerwithmap.Customer;
import static customerwithmap.ValidationRules.*;

public class PutValues {
	public static Map putVal() throws CustException {
		Map<String,Customer> custMap=new HashMap<>();
		custMap.put("w",validationInp("w"," k"," k", "Pass@123"," 2002-04-10", 2000," gold",custMap));
		custMap.put("i",validationInp("i"," k"," k", "Pass@123"," 2002-04-10", 2000," gold",custMap));
		custMap.put("p",validationInp("p"," k"," k", "Pass@123"," 2002-04-10", 2000," gold",custMap));
		custMap.put("r",validationInp("r"," k"," k", "Pass@123"," 2002-04-10", 2000," gold",custMap));
		custMap.put("j",validationInp("j"," k"," k", "Pass@123"," 2002-04-10", 2000," gold",custMap));
		return custMap;
	}
}
