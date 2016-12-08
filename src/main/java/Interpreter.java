import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by korovin on 12/8/2016.
 */
public class Interpreter {
    // contains all saved variables
    private Map<String, Double> variables = new HashMap<>();
    // contains all saved functions
    private Map<String, FunctionWrapper> functions = new HashMap<>();

    public Double input(String input) {
        Deque<String> tokens = tokenize(input);
        System.out.println(tokens);
        return null;
    }

    public boolean isFunction(Deque<String> input) {
        return input.contains("fn");
    }

    public Double saveFunction() {
        return 0.0;
    }

    private static Deque<String> tokenize(String input) {
        Deque<String> tokens = new LinkedList<>();
        Pattern pattern = Pattern.compile("=>|[-+*/%=\\(\\)]|[A-Za-z_][A-Za-z0-9_]*|[0-9]*(\\.?[0-9]+)");
        Matcher m = pattern.matcher(input);
        while (m.find()) {
            tokens.add(m.group());
        }
        return tokens;
    }
}

