package com.weweb.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	
	private String email;
	private String password;
	private String name;
	private Timestamp regdate;
	
	@Override
	public String toString() {
		String msg = String.format("[Email: %s, PW: %s, NAME: %s, REGDATE: %s", 
				this.email, this.password, this.name, this.regdate );
		return msg;
	}
}
