  
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.*; 
import java.util.concurrent.*; 
/*
 * @author Maria Isabel Montoya Valladares, Javier Alejandro Cotto Argueta
 * @carne 19169, 19324
 * @date 26/04/2020
 * @name Factory.java
 * */
public class Factory<K,V> {
	public map<String,String> obtenerMap(int opcion){
	    switch (opcion){
	        case 2:
	            return new hashMap<String,String>();
	        case 1:
	            return new RedBlackTree<String,String>();
	        default:
	            return null;
	    }
	}
}