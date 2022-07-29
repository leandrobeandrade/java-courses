package model.exceptions;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}

// RuntimeException => o compilador n�o obriga o tratamento das exce��es
// Exception => obrigat�rio tratamento das exce��es assim como ParseException