package CompositeDesignPattern;
import java.util.ArrayList;

public class Folder extends Component{

    public ArrayList<Component> list;
    public Folder(String name) {
        super(name);
        list = new ArrayList<>();
    }
}
