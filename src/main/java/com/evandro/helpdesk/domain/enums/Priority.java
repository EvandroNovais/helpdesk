package com.evandro.helpdesk.domain.enums;

public enum Priority {
	
	LOW(0, "LOW"), 
	MEDIUM(1, "MEDIUM"), 
	HIGH(2, "HIGH");
	
	private Integer codigo;
	private String descricao;
	
	private Priority(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Priority toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Priority x : Priority.values()) {
			
			if(cod.equals(x.getCodigo())) {
				return x;
			}
			
		}
		
		throw new IllegalArgumentException("Prioridade inválida");
		
	}
	

}
