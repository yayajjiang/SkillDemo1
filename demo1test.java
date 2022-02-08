import static org.junit.Assert.*;
import org.junit.*;

public class demo1test {
    @Test
    public void addition() {
        assertEquals(2,demo1.multiple(1,2));//make it successful
    }
    public void addition2() {
        assertEquals(4,demo1.multiple(1,4));//make it successful

	assertEquals(2,demo1.multiple(1,4));//make it fail
	//sth different
    }
    
}
