import static org.junit.Assert.*;
import org.junit.Test;

public class RedBlackTreeTest<K, V> {
	String key="hola";
	String val ="perro";
	@Test
	public void testAdd() {		
		RedBlackTree<String, String> RBT = new RedBlackTree<String, String>();
		RBT.add("Hello", "hola");
		RBT.add("dog", "perro");	
		assertEquals("hola", RBT.get("Hello"));
	}
	@Test
	public void testAddHash() {
		hashMap<String, String> hm = new hashMap<String, String>();
		hm.add("Hello", "hola");
		hm.add("dog", "perro");	
		assertEquals("hola", hm.get("Hello"));
	}
	@Test
	public void testGetHash() {
		hashMap<String, String> hm = new hashMap<String, String>();
		hm.add("Hello", "hola");
		hm.add("dog", "perro");
		assertEquals("perro", hm.get("dog"));
	}
	@Test
	public void testGetRBT() {
		RedBlackTree<String, String> RBT = new RedBlackTree<String, String>();
		RBT.add("Hello", "hola");
		RBT.add("dog", "perro");	
		assertEquals("perro", RBT.get("dog"));
		
	}
}
