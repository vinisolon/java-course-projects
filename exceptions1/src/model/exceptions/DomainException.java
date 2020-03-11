package model.exceptions;

public class DomainException extends Exception { // extends RuntimeException
	
	/* 
	 * A diferen�a entre Exception e RuntimeException �:
	 * Exception - Compilador obriga a tratar ou propagar a exce��o.
	 * RuntimeException - Compilador n�o obriga a tratar porque s� ocorre em tempo de execu��o,
	 * portanto n�o tem como prever a exce��o.
	 */

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
