package Java;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Program1 {
    @Test(priority = 1)
    public void calls() {
        System.out.println("calls");

}
@Test(priority = 2)
public void Message(){
        System.out.println("Message");
    if(true) {
        throw new SkipException("This is skipped call");
    }
    }
}
