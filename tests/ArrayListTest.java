import java.util.ArrayList;
import java.util.List;


public class ArrayListTest extends ListTest {

    @Override
    protected List<Object> getInstance() {
        return new ArrayList<Object>();
    }

}
