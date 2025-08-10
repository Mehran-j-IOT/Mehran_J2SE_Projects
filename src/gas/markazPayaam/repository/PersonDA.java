package gas.markazPayaam.repository;

import gas.markazPayaam.entity.Person7se1;
import gas.markazPayaam.common.JDBC;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDA implements AutoCloseable {

    //////////////////////////////////////////////////
    private Connection connection;
    private PreparedStatement preparedStatement;
///////////////////////////////////////////////////////
    public PersonDA() throws Exception {

        connection = JDBC.getConnection();
        connection.setAutoCommit(false);
    }
 //////////////////////////////////////////////////////////////////////////////////
    public void insert(Person7se1 person) throws Exception {
        preparedStatement = connection.prepareStatement("insert into person7se1 (id,name,family,salary) values (?,?,?,?)");
        preparedStatement.setLong(1, person.getId());
        preparedStatement.setString(2, person.getName());
        preparedStatement.setString(3, person.getFamily());
        preparedStatement.setLong(4, person.getSalary());
        preparedStatement.executeUpdate();
    }

    public void update(Person7se1 person) throws Exception {
        preparedStatement = connection.prepareStatement("update person7se1 set name=? , family=? , salary=? where id=?");
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getFamily());
        preparedStatement.setLong(3, person.getSalary());
        preparedStatement.setLong(4, person.getId());
        preparedStatement.executeUpdate();
    }

    public void delete(Person7se1 person) throws Exception {
        preparedStatement = connection.prepareStatement("delete person7se1 where id=?");
        preparedStatement.setLong(1, person.getId());
        preparedStatement.executeUpdate();
    }

    public List<Person7se1> selectAll() throws Exception {
        preparedStatement = connection.prepareStatement("select * from person7se1");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Person7se1> personList = new ArrayList<>();
        while (resultSet.next()) {
            Person7se1 person = new Person7se1();
            person.setId(resultSet.getLong("id"));
            person.setName(resultSet.getString("name"));
            person.setFamily(resultSet.getString("family"));
            person.setId(resultSet.getLong("salary"));
            personList.add(person);
        }
        return personList;
    }


    public void commit()throws Exception{
        connection.commit();

    }
    public void close() throws Exception {

        connection.close();
    }


}

