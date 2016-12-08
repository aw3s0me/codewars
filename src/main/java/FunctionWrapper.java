import java.util.Deque;
import java.util.List;

/**
 * Created by korovin on 12/8/2016.
 * Class that is Function abstraction
 */
public class FunctionWrapper {
    // contains parameter names, which will be substituted further
    private List<String> parameters;

    // type of function (avg, add)
    private String type;

    private Deque<String> expression;

    public FunctionWrapper(Deque<String> expression) {
        this.expression = expression;
    }

    // get substituted expression
    public Deque<String> getExpression(List<String> values) {
        // TODO: return substituted expression
        return null;
    }
}
