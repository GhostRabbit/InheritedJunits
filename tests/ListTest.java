import static org.fest.assertions.Assertions.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public abstract class ListTest {

    protected List<Object> list;

    @Before
    public void setup() {
        list = getInstance();
    }

    protected abstract List<Object> getInstance();

    @Test
    public void isEmpty_trueWhenCreated() {
        assertThat(list.isEmpty()).isTrue();
    }

    @Test
    public void isEmpty_falseWhenAddedTo() {
        list.add(new Object());
        assertThat(list.isEmpty()).isFalse();
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void get_shouldThrowExceptionIfRetrivingOutOfBounds() {
        list.get(-1);
    }

    // And many more to come?

}
