package com.my.common.dao;

import com.my.common.model.SysUsers;
import com.my.common.model.SysUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    int countByExample(SysUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    int deleteByExample(SysUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    int insert(SysUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    int insertSelective(SysUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    List<SysUsers> selectByExample(SysUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    SysUsers selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    int updateByExampleSelective(@Param("record") SysUsers record, @Param("example") SysUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    int updateByExample(@Param("record") SysUsers record, @Param("example") SysUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    int updateByPrimaryKeySelective(SysUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_users
     *
     * @mbggenerated Thu Feb 05 00:28:06 CST 2015
     */
    int updateByPrimaryKey(SysUsers record);
}