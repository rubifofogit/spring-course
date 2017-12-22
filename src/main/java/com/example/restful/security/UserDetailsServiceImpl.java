package com.example.restful.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.restful.domain.Customer;
import com.example.restful.repositories.CustomerRepository;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private CustomerRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {	
		Customer customer = repository.findByEmail(username);
		if(customer==null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(customer.getName(), customer.getPassword(), null);
	}

}
