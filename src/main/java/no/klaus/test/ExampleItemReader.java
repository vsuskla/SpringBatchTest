package no.klaus.test;

import no.klaus.test.dto.TestDto;
import org.springframework.batch.item.ItemReader;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * {@link ItemReader} with hard-coded input data.
 */

@Component("reader")
public class ExampleItemReader implements ItemReader<String> {

    private DataSource dataSource;
    private Connection con;
    private List<TestDto> medlemmer;
    private JdbcTemplate jdbcTemplate;


    public ExampleItemReader(DataSource dataSource) throws SQLException{
        this.dataSource = dataSource;
        this.con = dataSource.getConnection();
        this.jdbcTemplate = new JdbcTemplate(this.dataSource);

    }

	private String[] input = {"Hello world!", null};
	
	private int index = 0;
	
	/**
	 * Reads next record from input
	 */
	public String read() throws Exception {
        List<Map> row = jdbcTemplate.queryForList("SELECT KTOID, FORNAVN, ETTERNAVN FROM TEST.TEST;");
        getJdbcTemplate().update();

		if (index < input.length) {
            System.out.println(input[index]);
			return input[index++];
		}
		else {
			return null;
		}
		
	}

}
