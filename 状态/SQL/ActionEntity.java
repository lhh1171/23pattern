package SQL;

import java.util.HashMap;
import java.util.List;

public class ActionEntity {
    String Method;
    String Url;
    HashMap<String,String> RegularAttribute;
    HashMap <String, List<HashMap<String,String>>> CompoundAttribute;

    public ActionEntity(String method, String url, HashMap<String, String> regularAttribute, HashMap<String, List<HashMap<String, String>>> compoundAttribute) {
        Method = method;
        Url = url;
        RegularAttribute = regularAttribute;
        CompoundAttribute = compoundAttribute;
    }

    public ActionEntity() {
    }
}