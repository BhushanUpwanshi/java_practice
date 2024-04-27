package exp;

public class ColourNotFound extends Exception {
	String msg;

	public ColourNotFound(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
