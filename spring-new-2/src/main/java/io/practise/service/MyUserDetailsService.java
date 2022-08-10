/*
package io.practise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import io.practise.dao.UserDao;
import io.practise.model.MyUserDetails;
import io.practise.model.User;
 

@Component
public class MyUserDetailsService implements UserDetailsService{
	
	 @Autowired
	 private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=userDao.findByUsername(s);
		if(user==null) {
			throw new UsernameNotFoundException("User not found");
		}
		 return new MyUserDetails(user);
		
	}

}
*/