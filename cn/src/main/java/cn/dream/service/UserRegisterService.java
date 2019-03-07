package cn.dream.service;

import cn.dream.entity.UserRegister;

/**
 * @author 18396
 *
 */
public interface UserRegisterService {
	/**
	 * 用户注册service
	 * @param userRegister
	 * @return
	 */
	public String register(UserRegister userRegister);
}
