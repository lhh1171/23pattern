package SQL;

import java.util.Stack;

public interface StateHandler {
    /**  
     * @param event 要处理的事件  
     * @param states 系统整体状态  
     * @param result 解析的结果  
     */  
    void handle(Event event, Stack<State> states, StringBuilder result);
} 