/* Universidad del Valle de Guatemala
Maria Jose Morales 19145
Maria Isabel Montoya 19169
Hoja de Trabajo No. 6
HashTables 
TreeMap*/
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