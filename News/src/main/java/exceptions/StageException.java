package exceptions;

public class StageException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public StageException(){
		super("Problema no Stage, contate o admin");
		
	}
}
