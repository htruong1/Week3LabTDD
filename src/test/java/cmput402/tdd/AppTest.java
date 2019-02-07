package cmput402.tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import cmput402.tdd.service.Search;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
    
    {
	Utility util = new Utility();
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testCountAverageScore() {
    	Search mockSearch = mock(Search.class);
    	HashMap<String, ArrayList<Integer>> fakeMap = new HashMap<String, ArrayList<Integer>>();
    	
    	ArrayList<Integer> messi = new ArrayList<Integer>();
    	messi.add(100);
    	messi.add(200);
    	
    	ArrayList<Integer> ronald = new ArrayList<Integer>();
    	ronald.add(80);
    	ronald.add(150);   	
    	
    	ArrayList<Integer> neymor = new ArrayList<Integer>();
    	neymor.add(50);
    	neymor.add(80);
    	
    	fakeMap.put("messi", messi);
    	fakeMap.put("ronald", ronald);
    	fakeMap.put("neymor", neymor);
    	
    	when(mockSearch.returnAll()).thenReturn(fakeMap);
    	
    	HashMap<String, Float> results = util.countAverageScore(mockSearch);
    	
    	assert(2==results.get("messi"));
    	assert(1.875f==results.get("ronald"));
    	assert(1.6f==results.get("neymor"));
    }
    
    public void testFindTopScorer() {
    	Integer maxScore;
    	Search mockSearch = mock(Search.class);
    	HashMap<String, ArrayList<Integer>> fakeMap = new HashMap<String, ArrayList<Integer>>();
    	
    	ArrayList<Integer> messi = new ArrayList<Integer>();
    	messi.add(100);
    	messi.add(200);
    	
    	ArrayList<Integer> ronald = new ArrayList<Integer>();
    	ronald.add(80);
    	ronald.add(150);   	
    	
    	ArrayList<Integer> neymor = new ArrayList<Integer>();
    	neymor.add(50);
    	neymor.add(80);
    	
    	fakeMap.put("messi", messi);
    	fakeMap.put("ronald", ronald);
    	fakeMap.put("neymor", neymor);
    	
    	when(mockSearch.returnAll()).thenReturn(fakeMap);
//    	
//    	HashMap<String, Float> results = util.findTopScorer(mockSearch);
//    	
//    	assert("messi" == results.get("messi"));

    }
}
