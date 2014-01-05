package no.klaus.test.dto;

import javax.swing.tree.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by klaus on 05/01/14.
 */
public class TestDtoRowMapper implements RowMapper<TestDto> {

    public TestDto mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        TestDto person = new TestDto();
        person.setKontohaverId(resultSet.getString(1));
        person.setForNavn(resultSet.getString(2));
        person.setEtterNavn(resultSet.getString(3));
        return person;
    }

}
