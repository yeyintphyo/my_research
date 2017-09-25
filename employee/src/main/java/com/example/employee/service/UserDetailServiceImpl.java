package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.entity.Employee;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
	private final EmployeeDao empDao;
	
	@Autowired
	public UserDetailServiceImpl(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails user = null;
		try {
			Employee curruser = empDao.findByUserName(username);
			System.out.println(username + " username from login");
	        user = new org.springframework.security.core.userdetails.User(username, curruser.getPassword(), true, 
	        		true, true, true, AuthorityUtils.createAuthorityList(curruser.getRole()));	
	        System.out.println(curruser.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(user.getUsername() + user.getPassword());
        return user;
	}

}
