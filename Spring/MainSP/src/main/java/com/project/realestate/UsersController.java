package com.project.realestate;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class UsersController {
	
	//---------------------------user login--------------------------
	
		@GetMapping("/{id}/{password}")
		public Users login(@PathVariable String id,@PathVariable String password) {
			UsersDA da= new UsersDA();
			Users data = da.login(id, password);
			return data;
		}

		//--------------------------create user------------------------
		
		@PostMapping("/create-user")
		public Users create(@RequestBody Users u) {
			UsersDA da= new UsersDA();
			Users data = da.create(u);
			return data;
		}
		
		//------------------------create tenant---------------------
		
		@PostMapping("/create-tenent")
		public Tenant createtenant(@RequestBody Tenant u) {
			TenantDA da= new TenantDA();
			Tenant data = da.create(u);
			return data;
		}
		
		//-----------------------post property-------------------------
		
		@PostMapping("/postproperty")
		public Property postproperty(@RequestBody Property p) {
			
			PropertyDA da= new PropertyDA();
			Property data= da.save(p);
			return data;
		}
		
}
