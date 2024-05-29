class Bike{
void run()
{
System.out.println("running...");
}

class Dio extends Bike{
void petrol()
{
System.out.println("petroled");
}
public class Biker{
public static void main (String[] args){
Dio d=new Dio();
d.run();
d.petrol();
}
}
}
}
