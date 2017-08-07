import com.corneliadavis.cloudnative.LambdaHandler;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cdavis on 4/23/17.
 */

public class SayHelloTest {

    LambdaHandler lambdaHandler;

    @Before
    public void initialize() {
        lambdaHandler = new LambdaHandler();
    }

    @Test(expected = RuntimeException.class)
    public void	helloNoName() throws Exception {
        lambdaHandler.LambdaHandler("");//, null);
    }

    @Test()
    public void	helloWithName() throws Exception {
        assertEquals("Hello Cornelia", lambdaHandler.LambdaHandler("Cornelia"));//, null));
    }

}
