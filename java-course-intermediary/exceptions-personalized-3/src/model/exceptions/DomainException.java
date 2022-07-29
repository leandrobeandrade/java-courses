package model.exceptions;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}

// RuntimeException => o compilador não obriga o tratamento das exceções
// Exception => obrigatório tratamento das exceções assim como ParseException