package SQL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        String method="put";
        String url="/dbname/tab_name /_update";
        HashMap<String,String> RegularAttribute=new HashMap<>();
        RegularAttribute.put("rowKey","sss");
        HashMap <String, List<HashMap<String,String>>> CompoundAttribute=new HashMap<>();
        List<HashMap<String,String>> list1=new ArrayList<>();
        HashMap<String,String> map1=new HashMap<>();
        map1.put("cf_name","Age");
        map1.put("c_name","StudentAge");
        map1.put("max", "10");
        map1.put("min","0");
        list1.add(map1);
        CompoundAttribute.put("term",list1);
        List<HashMap<String,String>> list2=new ArrayList<>();
        HashMap<String,String> map2=new HashMap<>();
        map2.put("cf_name","Age");
        map2.put("c_name","StudentAge");
        map2.put("max", "10");
        list2.add(map2);
        CompoundAttribute.put("values",list2);
        ActionEntity actionEntity=new ActionEntity(method,url,RegularAttribute,CompoundAttribute);
//        if ("put".equals(actionEntity.Method)){
////            url.split("/");
////            if (url){
////
////            }else {
////
////            }
//        }else if ("post".equals(actionEntity.Method)){
//
//        }else {
//
//        }

    }
}
/*    POST  http://ip:端口/dbname/tab_name /_update
        {
        "rowKey":"sss"
        "terms":
        [
        {
        "cf_name":"Age",
        "c_name":"StudentAge",
        "max": "10",
        "min":"0",
        },
        .......
        ]
        "values":
        [
        {
        "cf_name":"cf1",
        "c_name":"c1",
        "value":"xxx"
        },
        .....
        ]
        }*/


/*
        PUT http://ip:端口/dbname/tab_name
        {
        "rowKey":"唯一标识",
        "values":
        [
        {
        "cf_name":"cf1",
        "c_name":"c1",
        "value":"xxx"
        },
        .....
        ]
        }*/
