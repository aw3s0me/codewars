import java.util.Deque;
import java.util.List;

/**
 * Created by korovin on 12/8/2016.
 * Class that is Function abstraction
 */
public class FunctionWrapper {
    // contains parameter names, which will be substituted further
    private List<String> parameters;

    private Deque<String> expression;

    // type of function (avg, add)
    private String name;

    public FunctionWrapper(Deque<String> expression) {
        this.expression = expression;
        // TODO: initialize name
    }

    // get substituted expression
    public Deque<String> getExpression(List<String> values) {
        // TODO: return substituted expression
        return null;
    }

    public String getName() {
        return name;
    }
}
