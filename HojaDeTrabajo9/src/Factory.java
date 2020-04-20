import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * @author Maria Isabel Montoya Valladares, Javier Alejandro Cotto Argueta
 * @carne 19169, 19324
 * @date 26/04/2020
 * @name Factory.java
 * */
public class Factory {
	 public static Map<String, String[]> obtenerMap(String opcion){
	        switch (opcion){
	            case "1":
	                return new HashMap<>();
	            case "2":
	                return new TreeMap<>();
	            default:
	                return null;
	        }
	    }
}
