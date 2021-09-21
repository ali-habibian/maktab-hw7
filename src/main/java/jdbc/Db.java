package jdbc;

import javax.sql.DataSource;
import java.sql.SQLException;

public abstract class Db {
    DataSource ds;

    public Db(DataSource ds) {
        this.ds = ds;
    }

    public abstract void add() throws SQLException;

    public abstract void update() throws SQLException;

    public abstract void delete(long id) throws SQLException;

    public abstract void reade(long id) throws SQLException;
}
