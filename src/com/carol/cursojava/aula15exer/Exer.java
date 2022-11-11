package com.carol.cursojava.aula15exer;

/**
 * Classe de exce��o para classes Service
 * @author 7COMm
 * @version 1.0
 * @updated 14-set-2006 16:26:42
 */
public class Exer extends Exception {
	/**
	 * C�digo de erro
	 */
	private String codigo = "";
	/**
	
	/**
	 * Construtor da classe
	 * @param mensagem Mensagem de erro
	 */
	public Exer(String mensagem) {
		super(mensagem);
	}

	/**
	 * Construtor da classe
	 * @param mensagem Mensagem de erro
	 * @param codigoErro C�digo de erro
	 */
	public Exer(String mensagem, String codigoErro) {
		super(mensagem);
		this.codigo = codigoErro;
	}

	/**
	 * Construtor da classe
	 * @param mensagem Mensagem de erro
	 * @param codigoErro C�digo de erro
	 */
	public Exer(String mensagem, int codigoErro) {
		super(mensagem);
		this.codigo = String.valueOf(codigoErro);
	}

	
	
	public Exer(Exception e) {
		super(e);
		
	}

	/**
	 * Retorna c�digo de erro
	 * @return C�digo de erro
	 */
	public String getCodigo() {
		return codigo;
	}



	/**
	 * Retorna mensagem de erro
	 * @return Mensagem de erro
	 */
	public String toString() {
		String mensagem = "";
		if (codigo != null) {
			mensagem = getClass().getName() + ": " + getCodigo() + "- " + getMessage();
		} else {
			mensagem = getClass().getName() + ": " + getMessage();
		}
		return mensagem;
	}
}