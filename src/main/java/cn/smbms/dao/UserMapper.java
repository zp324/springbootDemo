package cn.smbms.dao;

import org.apache.ibatis.annotations.Mapper;

import cn.smbms.pojo.User;
@Mapper
public interface UserMapper {
	/**
	 * 通过userCode获取User
	 * @param connection
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(String userCode) throws Exception;
}
