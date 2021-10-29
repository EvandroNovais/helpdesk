package com.evandro.helpdesk.domain.enums;

public enum Profile {
	
	ADMIN(0, "ROLE_ADMIN"), 
	CUSTOMER(1, "ROLE_CUSTOMER"), 
	TECHNICIAN(2, "ROLE_TECHNICIAN");
	
	private Integer id;
	private String description;
	
	private Profile(Integer codigo, String descricao) {
		this.id = codigo;
		this.description = descricao;
	}

	public Integer getCodigo() {
		return id;
	}

	public String getDescricao() {
		return description;
	}
	
	public static Profile toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Profile x : Profile.values()) {
			
			if(cod.equals(x.getCodigo())) {
				return x;
			}
			
		}
		
		throw new IllegalArgumentException("Invalid profile");
		
	}
	

}
