
public class application {
 
public static void main(String[] args){
 
Rey[] elements = { new Finn(), new Rey(), new Poe(), new Kylo() };
 
for (int i = 0; i < elements.length; i++) {
 
System.out.println(elements[i]);
 
elements[i].method1();
 
System.out.println();
 
elements[i].method2();
 
System.out.println();
System.out.println();
 
}
 
}
