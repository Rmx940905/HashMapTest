package cn.itcast.linklisthashmap;

//基于LinkedList实现HashMap(效率低)
public class ExtLinkListHashMap {

    Entry[] tables = new Entry[998];

    public void put(Object key,Object value){
        int hashCode = key.hashCode();
        //两个对象最比较的时候，如果hashCode相同，对象的的值不一定相同。
        //两个对象最比较的时候，如果equest比较相同，对象的的值相同。

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

