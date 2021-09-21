package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public class DbConnection {

    public static DataSource getMySQLDataSource(){
        MysqlDataSource mysqlDS = new MysqlDataSource();
        mysqlDS.setURL(DbConfig.URL);
        mysqlDS.setUser(DbConfig.USERNAME);
        mysqlDS.setPassword(DbConfig.PASSWORD);
        return mysqlDS;
    }
}
