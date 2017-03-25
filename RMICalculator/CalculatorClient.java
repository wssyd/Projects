import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException;
import java.io.*;
import java.util.*; 
 
public class CalculatorClient

{ 
 
public static void main(String[] args)throws IOException 

{
 
try 

{
 
//Client passes the same URL as registered by the Server
//to get the access of the remote objects.

Calculator c = (Calculator)
Naming.lookup
("rmi://localhost/PrathamVasaCalculator"); 




int x=1;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

while(x==1)

{

System.out.println("Enter the string:");

String abc=br.readLine();


//If the Client wants to discontinue then Server closes. 
if(abc.equalsIgnoreCase("exit"))
{
x=0;
c.exit();
break;
}


int i;
for(i=0;i<abc.length();i++)

{

//Find out the index of the space
if(Character.isWhitespace(abc.charAt(i))&&(i!=1))
{
break;
}

}

//Splitting the operator and the two operands.
int index=i;
String a1=abc.substring(0,1);
String a2=abc.substring(2,index);
String a3=abc.substring(index+1);


//Obtain the ASCII value of the operator.
char ch1=abc.charAt(0);
int b1=(int)ch1;

//Obtain the Integer values of the operands.
int b2=Integer.parseInt(a2);
int b3=Integer.parseInt(a3);



int result=c.calculate(b1,b2,b3);

System.out.println("The result is:"+result);

}

}


//If a malformed URL has been discovered
//or the string has not been parsed properly. 
catch (MalformedURLException murle) 
{
 
System.out.println(); 
System.out.println
("MalformedURLException"); 
System.out.println(murle); 
        
} 


//If there is some problem in the network communication.
catch (RemoteException re) 
{
 
System.out.println(); 
System.out.println("RemoteException"); 
System.out.println(re); 
        
}


//If you try to unbind a name which has not yet been bound. 
catch (NotBoundException nbe)
{
 
System.out.println(); 
System.out.println("NotBoundException"); 
System.out.println(nbe); 

}


//If an exceptional arithmetic condition occurs. 
catch (java.lang.ArithmeticException ae)
{
 
System.out.println(); 
System.out.println("java.lang.ArithmeticException"); 
System.out.println(ae); 

} 

} 

} 