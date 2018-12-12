package com.tech.sharekart.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.sharekart.model.Users;


@Repository
public interface UserDao extends JpaRepository<Users,String> {
	 List<Users> findByMobile(String mobile);
	

}

