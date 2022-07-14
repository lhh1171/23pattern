package SQL;

import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.Stack;

public class Plus {
    public static String parseToFullType(String shortenType) throws IllegalStateException {
        HashMap<String,StateHandler> STATE_TO_HANDLER_MAPPING=new HashMap();
        StringBuilder result = new StringBuilder();
        StringCharacterIterator scanner = new StringCharacterIterator(shortenType);
        Stack<State> states = new Stack<>();
        states.push(State.START);
        for (; ; scanner.next()) {
            char currentChar = scanner.current();
            if (currentChar == '\uFFFF') {
                return result.toString();
            }
            // 使用整体状态为空来代表解析结束
            if (states.isEmpty()) {
                throw new IllegalStateException("unexpected char '" + currentChar + "' at position " + scanner.getIndex());
            }
            // 将字符规整成事件对象，有利于参数的传递
            Event event = Event.parseToEvent(currentChar, scanner.getIndex());
            if (event == null) {
                throw new IllegalStateException("unknown char '" + currentChar + "' at position " + scanner.getIndex());
            }
            // 这里需要一个 Map 来映射状态和状态处理器
            STATE_TO_HANDLER_MAPPING.get(states.peek()).handle(event, states, result);
        }
    }
}
