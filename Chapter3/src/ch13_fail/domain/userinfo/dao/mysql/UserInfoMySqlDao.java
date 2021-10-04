package ch13_fail.domain.userinfo.dao.mysql;

import ch13_fail.domain.userinfo.UserInfo;
import ch13_fail.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB userId =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from MYSQL DB userId = " + userInfo.getUserId());

    }
}
