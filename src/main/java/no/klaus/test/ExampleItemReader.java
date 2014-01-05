package no.klaus.test;

import no.klaus.test.dto.TestDto;
import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * {@link ItemReader} with hard-coded input data.
 */

@Component("reader")
public class ExampleItemReader implements ItemReader<String> {

    private DataSource dataSource;
    private Connection con;
    private List<TestDto> medlemmer;


    public ExampleItemReader(DataSource dataSource) throws SQLException{
        this.dataSource = dataSource;
        this.con = dataSource.getConnection();


    }

	private String[] input = {"Hello world!", null};
	
	private int index = 0;
	
	/**
	 * Reads next record from input
	 */
	public String read() throws Exception {

		if (index < input.length) {
            System.out.println(input[index]);
			return input[index++];
		}
		else {
			return null;
		}
		
	}

}
