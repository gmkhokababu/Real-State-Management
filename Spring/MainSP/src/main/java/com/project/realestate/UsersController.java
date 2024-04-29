package com.project.realestate;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class UsersController {
	
	//---------------------------user login--------------------------
	
		@GetMapping("/{id}/{password}")
		public Users m3(@PathVariable String id,@PathVariable String password) {
			UsersDA da= new UsersDA();
			Users data = da.login(id,password);
			return data;
		}

}
