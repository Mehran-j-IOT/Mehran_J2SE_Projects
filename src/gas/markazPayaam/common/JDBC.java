package gas.markazPayaam.common;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;

public class JDBC {
    private static final BasicDataSource BASIC_DATA_SOURCE = new BasicDataSource();

    static {
        BASIC_DATA_SOURCE.setUsername("mehran");
        BASIC_DATA_SOURCE.setPassword("derezo1362");
        BASIC_DATA_SOURCE.setUrl("jdbc:oracle:thin:@localhost:1521/gasfpdb194");
        BASIC_DATA_SOURCE.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        BASIC_DATA_SOURCE.setMaxTotal(20);
    }
    public static Connection getConnection()throws Exception{
        return BASIC_DATA_SOURCE.getConnection();
    }
}
