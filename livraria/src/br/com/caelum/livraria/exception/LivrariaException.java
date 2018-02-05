package br.com.caelum.livraria.exception;

import javax.ejb.ApplicationException;

@SuppressWarnings("serial")
@ApplicationException(rollback= false)
public class LivrariaException extends RuntimeException {
	
}
