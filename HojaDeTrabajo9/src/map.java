/*
 * @author Maria Isabel Montoya Valladares, Javier Alejandro Cotto Argueta
 * @carne 19169, 19324
 * @date 26/04/2020
 * @name map.java
 * */
import java.util.*; 
import java.util.concurrent.*; 
public interface map<K,V>{
	
	//Returns the size of the map
	int size();
	
	//adds a key and a value to the map
	void add(K key, V value);
	
	//returns the value of the key entered as the parameter
	V get(K key);
	
	boolean containsKey(K key);
}