package model.exceptions;

public class DomainException extends Exception { // extends RuntimeException
	
	/* 
	 * A diferença entre Exception e RuntimeException é:
	 * Exception - Compilador obriga a tratar ou propagar a exceção.
	 * RuntimeException - Compilador não obriga a tratar porque só ocorre em tempo de execução,
	 * portanto não tem como prever a exceção.
	 */

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
