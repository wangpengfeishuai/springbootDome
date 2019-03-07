package cn.dream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.dream.entity.UserRegister;
import cn.dream.service.UserRegisterService;
import io.swagger.annotations.ApiOperation;

/**
 * @author 18396
 * 用户注册
 */
@RestController
@RequestMapping(value = "register")
public class RegisterContorller {
	@Autowired
	UserRegisterService service;
	@ApiOperation(value = "register", notes = "register")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> newUserRegister(@RequestBody UserRegister userRegister){
		String register = service.register(userRegister);
		return new ResponseEntity<String>(register, HttpStatus.OK);
	}
}
