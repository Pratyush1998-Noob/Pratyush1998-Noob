public class Starter  
{    
static int factorial(int n)  
{      
if (n == 0)      
return 1;      
else      
return(n * factorial(n-1));      
}      
public static void main(String args[])  
{    
int i,fsact=1;    
int number=4;//It is the number to calculate factorial      
fsact = factorial(number);     
System.out.println("Factorial of "+number+" is: "+fsact);      
}    
}    