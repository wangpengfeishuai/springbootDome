package cn.dream.mapper;

import cn.dream.entity.UserRegister;

/**
 * @author 18396
 *
 */
public interface UserRegisterMapper {
	
	/**
	 * 查询用户是否存在
	 * @param userAccount 用户账号
	 * @return UserRegister
	 */
	UserRegister queryUser(String userAccount);
	
	/**
	 * 新增用户
	 * @param userRegister 用户账号信息
	 * @return int
	 * 
	 */
	int addUser(UserRegister userRegister);
}
