package pack;

import java.lang.reflect.Field;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassForTests cft=new ClassForTests();
		Class classForTests=cft.getClass();
		try {
			Field fl=classForTests.getDeclaredField("fl");
			fl.setAccessible(true);
			fl.setFloat(cft, 14.7f);
			System.out.println(fl.getFloat(cft));
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Field str=classForTests.getDeclaredField("str");
			str.setAccessible(true);
			str.set(cft, "ololo");
			System.out.println(str.get(cft));
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Field i=classForTests.getDeclaredField("i");
			i.setAccessible(true);
			i.setInt(cft, 123);
			System.out.println(i.getInt(cft));
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
