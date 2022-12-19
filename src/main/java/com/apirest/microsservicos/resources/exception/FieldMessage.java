package com.apirest.microsservicos.resources.exception;

public class FieldMessage {
	
	private Integer titulo;
	private String fieldMessage;
	private String message;
	
	public FieldMessage(){
		
	}
	
	
	public FieldMessage(Integer titulo, String fieldMessage, String message) {
		super();
		this.titulo = titulo;
		this.fieldMessage = fieldMessage;
		this.message = message;
	}

	public Integer getTitulo() {
		return titulo;
	}
	public void setTitulo(Integer titulo) {
		this.titulo = titulo;
	}
	public String getFieldMessage() {
		return fieldMessage;
	}
	public void setFieldMessage(String fieldMessage) {
		this.fieldMessage = fieldMessage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	} 
	
	
	
}
