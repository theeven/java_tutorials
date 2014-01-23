/**
 * Creation Date: 1/11/14
 * Creation Time: 8:39 PM
 * Author: Deven Panchal
 * Email: panchal@yahoo-inc.com
 */
public class MyHashMap {

    int size;
    Data[] MyMap;

    public MyHashMap(int size) {
        this.size = size;
        this.MyMap = new Data[size];
    }

    public void put(int key, Object value) throws Exception {
        int hash = hashFunction(key);
        MyMap[hash] = new Data(key, value);
    }

    public Object get(int key) {
        int hash = hashFunction(key);
        return MyMap[hash].value;
    }

    public int hashFunction(int key) {
        return key % size;
    }
}
