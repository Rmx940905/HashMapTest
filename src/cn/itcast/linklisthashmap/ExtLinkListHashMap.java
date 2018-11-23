package cn.itcast.linklisthashmap;

//基于LinkedList实现HashMap(效率低)
public class ExtLinkListHashMap {

    Entry[] tables = new Entry[998];


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

