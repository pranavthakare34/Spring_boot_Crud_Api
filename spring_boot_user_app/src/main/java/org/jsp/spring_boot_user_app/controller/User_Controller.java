package org.jsp.spring_boot_user_app.controller;

import org.jsp.spring_boot_user_app.dao.User_dao;
import org.jsp.spring_boot_user_app.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User_Controller {
@Autowired
	private User_dao dao;

//@PostMapping("/saveUser")
//public void saveUser(@RequestBody User user) {
//	dao.saveUser(user);
//}
//@PostMapping("/deleteUser")
//public void deletUser(@RequestBody User user) {
//	dao.deleteUser(user);
//	
//}

@GetMapping("/find")
public void findbyId(@RequestBody int id,User user) {
	dao.findUser(user, id);
}


}
