 void main(String[] )
	{
		System.out.println("Java is an object oriented language");
		System.out.println("Java Features:");
		System.out.println("1.Java is simple");
		System.out.println("2.Java is High-level");
		System.out.println("3.Java is Platform independent");
	}
 -----------
 //Explanation of java methods in java program
 class HelloWorld{
	 public static void main(String[] args){
		 System.out.println("Hello World");
		 System.out.println(args[0]);
		 System.out.println(args [1]);
		 System.out.println(args [2]);//here u r giving values as java HelloWorld srikanth java jntu
		 }
 }
/*--class ----class is a keyword in java to create a class
 --Classname-ex:HelloWord-class name name start with capital letter and use pasacl case for better readability
 main is a method name
 --for classes,methods,logical statements we use open code curly braces and praentheses we use--this are the rules
 --we need to write main method inside the class
 ---for  main method we need to write return type--void means nothing.
 --String[] args 
 --public-to access main methods from anywhere i am giving public
 --static-without creating object if u want to load something we keep static
 --method should be return something,here my method not using nothing i  am using void
 -main is main method
 --[]is the collection characters r elements to store in asingle variable
 --array  is given becz 
 -args is a variable,it is an argument ,instead of args we can also use anywords like name...
 --arrays works an index  based
 --we can rearrange public static as --static public along with this we can also write final,synchronize,strictfp---this are access modifiers
 -In 1 file can we write multiple classes
 -ex:class HelloWorld{
	 public static void main(String[] args){
		 System.out.println("Hello World");
		 
		 }
 }
 class Greetings{
	 public static void main(String[] args){
		 System.out.println("Good morning");
		 
		 }
 }
 class JavaWorld{
	 public static void main(String[] args){
		 System.out.println("Java");
		 
		 }
 }           ---this program going to execute
 --it will execute and complie and create separate class files and execute one by one by giving class name
 public class HelloWorld{
	 public static void main(String[] args){
		 System.out.println("Hello World");
		 
		 }
 }
 public class Greetings{
	 public static void main(String[] args){
		 System.out.println("Good morning");
		 
		 }
 }
 public class JavaWorld{
	 public static void main(String[] args){
		 System.out.println("Java");
		 
		 }
 }//In one program atmost one public          
 ---if i give all classes as public is it execute  ,whenever class is public class name and file name should be same
 --the public class should be only one
 --
 */
 
 
 /*----JVM Arcitecture--
 ---why we need to understand abt JVM--without jvm we cannot execute java program.
 --so,to execute java programs we need jvm
 ---jvm will convert byte code to native code.
 

--Eclipse installation and what a class can contains?how it going to execute
Jvm architect explain with class only?
A class can contains 1.datamembers (variables+methods)
A.static data members
(Static variables+static methods)
B.instance data members
(Instance variable+instance method)
2.Blocks
A.static blocks
B.instance blocks
3.Constructors : there are 3 types of constructors
A..default constructor
B.no arg
C.parameterized
Copy constructor
Constructor chaining
4.Inner classes
A.regular r normal innerclasses
B.static inner classes
C method inside inner classes
D.anonymous inner classes
5.Interfaces
A.normal
b.fun tional
C.marker
5.Interfaces

Definations:
1.Variable: variable is a container to store a single value
Ex.int age=22;

2.Method:method is a block of code to execute based on 
our functionalities and a method can contains collection of 
statements and logics.
Ex:void addition (){//addition is method method can return 
anything so we return void.
}

3.Constructor:-to initialise object and its instance data we need 
a constructor is same like your class name it looks like a
 method not a method but not.
 -without constructor there is no object
ex: class Student{
	    Student(){
}
}
4.Block:Block is also to maintain collection of statements and 
logics 
based on your requirements.
note:q)here,method and block is same what is the difference 
between  method and block
-methods we must need to call explicityly but blocks will 
load automatically 
- when class loading static blocks will load 
-when object loading instance block will load to the memory and 
 executes automatcally we no need to call explicityly.
 
 5.Inner class:Class inside the class is called inner classes to solve 
 temporary problems.
 
 6.Inner interface:
 -we can also write interfaces in a classes.
 -interfaces we can consider as Blueprint of a class.
 
 

 
 
 
 