package com.generation.blogpessoal.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.blogpessoal.model.Usuario;

public class UserDetailsImpl implements UserDetails {
	
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private List<GrantedAuthority> authorities;

    public UserDetailsImpl(Usuario user) {
        this.username = user.getUsuario();
        this.password = user.getSenha();
    }

    public UserDetailsImpl() {
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}
	
	@Override
	public boolean isAccountNonExpired() {
	    // A conta nunca expira
	    return true;
	}

	@Override
	public boolean isAccountNonLocked() {
	    // A conta nunca é bloqueada
	    return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
	    // As credenciais nunca expiram
	    return true;
	}

	@Override
	public boolean isEnabled() {
	    // A conta sempre está ativa
	    return true;
	}
	
}