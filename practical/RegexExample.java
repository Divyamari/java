import java.util.regex.Pattern;

public class RegexExample{

	public static void main(String args[])
	{
	Pattern p = pattern.comiple(".a");
	Matcher m = p.matcher("ma");
	boolean b = m.matches();
	}
	//or
	boolean bb = pattern.comiple("..m").matcher("amm").matches();
	//or
	boolean b1 = pattern.matches("[a-zA-Z0-9]{8,}","Anu123dip");
	boolean b2 = pattern.matches("[6789]{1}[0-9]{}","8778267319");
	boolean b3 = pattern.matches("^[a-z0-+_.-]*+@[a-zA-Z0-9]*+\\.[a-z]{3}","dilipsjeeva@gmail.com");
	boolean b4 = pattern.matches("^[a-zA-Z0-9+_.-]{8}","Dilips@306");
	System.out.println(b + " " + bb + " " + b1 + " " + b2 + " " + b3 + " " + b4);
}