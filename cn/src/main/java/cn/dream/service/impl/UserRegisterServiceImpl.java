package cn.dream.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dream.entity.UserRegister;
import cn.dream.mapper.UserRegisterMapper;
import cn.dream.service.UserRegisterService;

/**
 * @author 18396
 *
 */
@Service
public class UserRegisterServiceImpl implements UserRegisterService {

	@Autowired
	UserRegisterMapper userRegisterMapper;

	@Override
	public String register(UserRegister userRegister) {
		if (StringUtils.isNoneBlank(userRegister.getUserAccount())) {
			UserRegister user = userRegisterMapper.queryUser(userRegister.getUserAccount());
			if (user != null) {
				return "该帐号已存在！";
			} else {
				int addUser = userRegisterMapper.addUser(userRegister);
				if (addUser > 0) {
					return "注册成功";
				}
			}

		}
		return null;
	}

}
