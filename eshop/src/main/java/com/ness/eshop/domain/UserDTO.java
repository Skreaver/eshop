package com.ness.eshop.domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserDTO {
	
	@NotNull
    @NotEmpty
	private String login;
	
	@NotNull
    @NotEmpty
	private String password;

	@NotNull
    @NotEmpty
	private String name;

	@NotNull
    @NotEmpty
	private String verifiedPasswd;

	public UserDTO(String login, String password, String name) {
		this.login = login;
		this.password = password;
		this.name = name;
	}

	public UserDTO() {

	}

}
