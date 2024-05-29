import java.util.HashSet;
import java.util.Iterator;
public class Hash {
public static void main(String[] args){

HashSet<String> a=new HashSet<>();
a.add("raj");
a.add("kumar");
a.add("prakesh");
System.out.println("travesing the Hashset: ");

for(String element:a){
System.out.println(element);
}
}
}