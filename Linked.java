import java.util.LinkedList;
class Linked {
public static void main(String[] args){
LinkedList<String> a=new LinkedList<>();
a.add("king");
a.add("queen");
a.add("raj");
a.add("kumar");
String lastelement=a.getLast();
System.out.println("last element  "+lastelement);
}
}