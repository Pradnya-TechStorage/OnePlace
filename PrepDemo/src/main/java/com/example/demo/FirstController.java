package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class FirstController implements CommandLineRunner{

	@Autowired
	UserServices userServices;

	@RequestMapping("/user")
	public List<UserBean> getUser() {
		return userServices.getUserList();
	}

	@RequestMapping("/user/{id}")
	public String checkTopic(@PathVariable String id) {
		boolean b = userServices.getUserTopic(id);
		if (b)
			return id + " Topic available";
		else
			return id + " Topic Not available";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public List addUser(@RequestBody UserBean userBean) {
		return userServices.addUserList(userBean);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/userTest")
	public String getString() {
		return "Test RestController";
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@GetMapping("/listHeaders")
	public ResponseEntity<String> listAllHeaders(
			  @RequestHeader Map<String, String> headers) {
			    headers.forEach((key, value) -> {
			        System.out.println(String.format("Header '%s' = %s", key, value));
			    });

			    return new ResponseEntity<String>(
			      String.format("Listed %d headers", headers.size()), HttpStatus.OK);
			}
}

