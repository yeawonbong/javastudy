package ch13_fail.web.userinfo;

import ch13_fail.domain.userinfo.UserInfo;
import ch13_fail.domain.userinfo.dao.UserInfoDao;
import ch13_fail.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13_fail.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ClientInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");
        Properties prop = new Properties(); //쌍으로 된 애들을 Pair로 읽는 객체
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPasswd("321");
        userInfo.setUserName("Lee");
        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if (dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }
        else{
            System.out.println("db error");
            return;
        }
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
