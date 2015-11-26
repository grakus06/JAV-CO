package objects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainObject {
	
	public static void main (String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		String s = "hello";
		System.out.println(s.getClass());
		
		UneClasse myObject = new UneClasse();
		Method m = myObject.getClass().getDeclaredMethod("doSomethng",null);
		m.setAccessible(true);
		m.invoke(myObject, null);
		UneClasse leClone = (UneClasse) myObject.clone();
		UneClasse laCopie = new UneClasse( myObject);
		
		
	}

}
