package SQL;

import java.util.Stack;

public class MapLeftHandler implements StateHandler {
    final int MAP=1;
    final int SET=2;
    final int LIST=3;
    final int WRAPPED_ELE=4;
    final int PRIMITIVE_ELE=5;
    @Override  
    public void handle(Event event, Stack<State> states, StringBuilder result) {
        // 这里是核心的 Action，将单步解析结果放到最终结果内  
        result.append(",");  
        result.append(event.getParsedVal());  
        // 状态机的典型处理方式，处理各种事件发生在当前状态时的逻辑  
        switch (event.getEventType()) {
            case MAP:  
                states.push(State.MAP_START);  
                break;  
            case SET:  
                states.push(State.SET_START);  
                break;  
            case LIST:  
                states.push(State.LIST_START);  
                break;  
            case WRAPPED_ELE:  
                // 使用 pop 或 push 修改栈顶状态来修改解析器的整体状态  
                states.pop();  
                states.push(State.MAP_RIGHT);  
                break;  
            case PRIMITIVE_ELE:  
                // 当前状态不能接受的事件类型要抛异常中断  
                throw new IllegalStateException("unexpected primitive char '" + event.getCharacter() + "' at position " + event.getIndex());  
            default:  
        }
    }  
}
