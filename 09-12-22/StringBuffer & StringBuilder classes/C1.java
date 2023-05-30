public class C1{
    public static void main(String[]a){
	StringBuffer sb1=new StringBuffer("Hi!");
	StringBuffer sb2=new StringBuffer("Hi!");
	/* the StringBuffer-object makes the String Mutable(modifies the object instead of creating new objects), is created in Heap-area & has the size-capacity 
	of 16 (initial/by default)+ 3(no. of characters of the mentioned String)=19 */
	
	System.out.println(sb1==sb2);//false
	/* toString()-method gives object-address & is Overriden in StringBuffer-class. both the addresses are not same here as both the objects aren't same. */
	
	System.out.println(sb1.equals(sb2));//false
	/* states of both the objects are same but still the output is false, means equals()-method is not overriden in StringBuffer-class. */
	
	System.out.println(sb1.hashCode());//746292446
	System.out.println(sb2.hashCode());//1072591677
	/* integers generated by both the above hashCodes are not same although states(Hi!) of both the objects are same, means both the integers aren't generated 		based on states, means hashCode()-methods are not overriden in StringBuffer-class. */

	System.out.println(sb1);//Hi!
	System.out.println(sb1.append("Woww!"));//Hi!Woww!
	System.out.println(sb1);//Hi!Woww!
	sb1.append("Woww!");
	System.out.println(sb1);//Hi!Woww!Woww!
	/* append- an inbuilt-method to join 2 values in StringBuffer-class, similar to concat, doesn't create the new object instead, modify the object.  */

	//System.out.println(sb1.size);
    }
}