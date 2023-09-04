 package org.jsp.spring_boot_user_app.repository;

import org.jsp.spring_boot_user_app.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Repository extends JpaRepository<User, Integer>{

}
