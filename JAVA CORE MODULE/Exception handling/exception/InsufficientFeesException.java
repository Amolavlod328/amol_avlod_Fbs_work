package exception;

public class InsufficientFeesException extends Exception {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "fees must be fully paid";
	}

}
