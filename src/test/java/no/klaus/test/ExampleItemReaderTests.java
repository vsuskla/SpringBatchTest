package no.klaus.test; 

import no.klaus.test.ExampleItemReader;

import junit.framework.TestCase;

public class ExampleItemReaderTests extends TestCase {

	private ExampleItemReader reader = new ExampleItemReader();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", reader.read());
	}

	public void testReadTwice() throws Exception {
        System.out.println("testReadTwice");
		reader.read();
		assertEquals(null, reader.read());
	}

}
