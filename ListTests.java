import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests implements StringChecker{

    @Test
    public void testFilter(){
        ArrayList<String> input = new ArrayList<String>();
        input.add("one");
        input.add("two");
        input.add("three");
        input.add("four");
        input.add("five");

        assertArrayEquals(new String[]{"one", "two"}, ListExamples.filter(input, this).toArray());
        

    }

    public boolean checkString(String s){
        return (s.length() < 4);
    }


}