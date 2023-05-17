package Practice_collections;

import java.util.Vector;

public class Practice_ListVector {
	public static void main(String[] args) {


		Vector<String> v=new Vector<>();
		v.add("m");
		v.add("a");
		v.add("n");
		v.add("i");
		v.add("u");
		v.add("a");
		v.add("r");
		v.add("mk");
		v.add("mk1");
		
		
		//Add :
		
//		v.addElement("mani");
//		v.add(0, "kumar");
//		System.out.println(v);
		
		//get :
		
		//System.out.println(v.get(3));
		
		//remove
		
//		System.out.println(v.remove(3));
//		Object a=v.remove("mk1");
//		System.out.println(a);
//		Object s=v.removeElement("mk1");
//		System.out.println(s);
//		System.out.println(v);
		
		//Contains :
		
//		Object s=v.contains("mk122");
//		System.out.println(s); 
//		Object s1=v.containsAll(v);
//		System.out.println(s1);
		
		
			//Set :
		v.set(0, "mani kumar");
		System.out.println(v);
		v.setElementAt("kumar", 0);
		System.out.println(v);
		v.insertElementAt("mani Kumae", 0);
		System.out.println(v);
		v.setSize(30);
		System.out.println(v);















	}
}
