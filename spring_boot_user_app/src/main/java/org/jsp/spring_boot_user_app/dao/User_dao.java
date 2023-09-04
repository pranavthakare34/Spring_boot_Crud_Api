package org.jsp.spring_boot_user_app.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.spring_boot_user_app.dto.User;
import org.jsp.spring_boot_user_app.repository.User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class User_dao {
@Autowired
	private User_Repository repository;
	
public void saveUser(User user) {
	repository.save(user);
}

public void deleteUser(User user) {
	repository.delete(user);
}
public void findUser(User user,int id) {
	Optional<User> list=repository.findById(id);
	System.out.println(list);
	
}


}
