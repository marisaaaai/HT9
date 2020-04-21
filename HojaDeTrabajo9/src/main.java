/*
 * @author Maria Isabel Montoya Valladares, Javier Alejandro Cotto Argueta
 * @carne 19169, 19324
 * @date 26/04/2020
 * @name main.java
 * */
/**
* This program translates a text that the user creates from english to spanish, using associations from words on another text that the user created
in ordeer to do a binary search and be able to translate every single word, it also includes the implementation of a RBT 
*/
//Se importan los paquetes necesarios 
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.*; 
import java.util.Collection;
public class main{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	@SuppressWarnings({ "rawtypes", "unchecked" })
		//In here we will keep the keys of our map that we will create
		ArrayList<String> ingles = new ArrayList<String>();
		//In here we will keep the values of our map that we will create
		ArrayList<String> espanol = new ArrayList<String>();
		//we begin readig the different files needed
		File dictxt = new File("Spanish.txt");
		File texttxt = new File("texto.txt");
		String linea ="";
		Scanner s = null;
		Scanner s1 = null;
		try{
			//we begin by reading our dictionary
			s = new Scanner(dictxt);
			int num = 0;
			while(s.hasNextLine()){
				linea = s.nextLine();
				//we remove all the parethesis
				linea = linea.replaceAll("\\(","");
				linea = linea.replaceAll("\\)","");
				String[] lector = linea.split(",");//we split the string in order to have [englis,spanish on our new arraylist]
				ingles.add(lector[0]);
				espanol.add(lector[1]);
				num++;
			}
			s.close();//we close the file
			s1= new Scanner(texttxt);//we read the text to translate
			String translate1 = s1.nextLine();
			String translate=translate1.toLowerCase();//we change every word to a lower case in order to not create errors
			String[] translateSplit = translate.split(" ");
			
			//Prueba de implementacion con hashmap sin factory
			//No se si te parece la idea de agregar las palabras al map y 
			//luego con un for las vaya buscando y las integre a un solo String 
			
			hashMap myDictionary = new hashMap<String,String>();
			for(int i =0; i<ingles.size(); i++){
				myDictionary.add(ingles.get(i), espanol.get(i));//Ingresa los valores al mapa
			}	
			String translation ="";//Aqui se guardara toda la variable, la oracion traducida
			Object support="";
			int size = translateSplit.length;//It has de size of the array that contains the words that we wish to translate
			for(int i=0;i<size;i++){
				if(myDictionary.containsKey(translateSplit[i])==true) {
					support=myDictionary.get(translateSplit[i]);
				}
				else{
					//If the word is not on our map it means that we dont know the translation so our support will be *word in english*
					support=("*")+translateSplit[i]+("*");
				}
				//we join all of the words that have been transla
				translation= translation + " " + support;
			}
			System.out.println("************************************************");
			System.out.println("Lo que usted ingreso para traducir: ");
			System.out.println(translate1);
			System.out.println();
			System.out.println("Traducido:");
			System.out.println(translation);
			System.out.println();
			System.out.println("Gracias por usar nuestro programa");
			System.out.println("************************************************");
		}
		catch(Exception ex){
			System.out.println("Mensaje de error: "+ex);
		}
	}
}