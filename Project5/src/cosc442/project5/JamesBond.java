package cosc442.project5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JamesBond {
	
	public Boolean bondRegex(String input){
	Pattern p = Pattern.compile(".*[(].*\\s0\\s0\\s7\\s.*[)].*");
	Matcher m = p.matcher(input);
	return m.matches();
	
	}
}
