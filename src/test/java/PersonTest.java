import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPerson1() {
        Person person = new Person("Adam", 19);

        String expected = "Adam, 19 years old";
        String actual = person.identifyPerson();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPerson2() {
        Person person = new Person("Richard", 22);

        String expected = "Richard, 22 years old";
        String actual = person.identifyPerson();

        Assert.assertEquals(expected, actual);
    }
}
