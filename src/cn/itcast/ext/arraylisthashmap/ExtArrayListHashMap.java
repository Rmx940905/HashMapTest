package cn.itcast.ext.arraylisthashmap;

import java.util.ArrayList;
import java.util.List;

//基于ArrayList实现HashMap(效率低)
public class ExtArrayListHashMap<Key,Value> {

    //Map存储容量
    private List<Entry<Key,Value>> list = new ArrayList<Entry<Key,Value>>();

    //HashMap的put方法
    public void put(Key key,Value value){
        //获取Entry对象
        Entry entry = getEntry(key);
        //判断是否为空
        if(entry != null){
            //不为空将Value值替换
            entry.value = value;
        }else {
            //为空创建Entry对象储存到list中
            Entry newEntry = new Entry(key,value);
            //调用put的时候，将该hash储存对象存到ArrayList中
            list.add(newEntry);
        }

    }

    //HashMap的get方法
    public Value get(Key key){
        Entry<Key,Value> entry = getEntry(key);
        return entry == null ? null : entry.value;
    }

    public Entry<Key,Value> getEntry(Key key){
        for (Entry<Key,Value> entry : list){
            if (entry.key.equals(key)){
                return entry;
            }
        }
        return null;
    }
    public static void main(String[] args){
        ExtArrayListHashMap extArrayListHashMap = new ExtArrayListHashMap<String,String>();
        extArrayListHashMap.put("a","aaa");
        extArrayListHashMap.put("b","bbb");
        extArrayListHashMap.put("a","bbb");
        System.out.println(extArrayListHashMap.get("a"));

    }

}
//hash存储对象
class Entry <Key,Value> {

    //hash存储的Key
    Key key;

    //hash存储的Value
    Value value;

    public Entry(Key key, Value value) {
        this.key = key;
        this.value = value;
    }
}

