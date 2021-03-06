package com.evandro.helpdesk.domain.enums;

public enum Status {
	
	OPEN(0, "OPEN"), 
	PROGRESS(1, "IN PROGRESS"), 
	CLOSED(2, "CLOSED");
	
	private Integer id;
	private String description;
	
	private Status(Integer codigo, String descricao) {
		this.id = codigo;
		this.description = descricao;
	}

	public Integer getCodigo() {
		return id;
	}

	public String getDescricao() {
		return description;
	}
	
	public static Status toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Status x : Status.values()) {
			
			if(cod.equals(x.getCodigo())) {
				return x;
			}
			
		}
		
		throw new IllegalArgumentException("Status inválido");
		
	}
	

}
