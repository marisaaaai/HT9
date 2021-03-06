/*
 * @author Maria Isabel Montoya Valladares, Javier Alejandro Cotto Argueta
 * @carne 19169, 19324
 * @date 26/04/2020
 * @name hashMap.java
 * */
import java.util.*; 
public class hashMap<K,V> implements map<K,V>{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	//We create a variable where we will save our HasMap
	private HashMap<K,V> map;
	//we create our map
	public hashMap(){
		this.map= new HashMap<K,V>();
	}
	
	//IT RETURNS THE SIZE OF THE HASHTAHBLE

    /**
     *
     * @return
     */
        @Override
	public int size(){
		return this.map.size();
	}
	
	//Adds a key and value to our map

    /**
     *
     * @param key
     * @param value
     */
        @Override
	public void add(K key, V value){
		this.map.put(key, value);
	}

    /**
     *
     * @param key
     * @return
     */
    @Override
	public boolean containsKey(K key){
		return this.map.containsKey(key);
	}
	//get the value of the key used as paremeter

    /**
     *
     * @param key
     * @return
     */
        @Override
	public V get(K key){
		V temp=null;
		if(this.map.containsKey(key)){
			temp=this.map.get(key);
		}
		return temp;
	}

}