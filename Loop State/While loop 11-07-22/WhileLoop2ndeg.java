//11-07-22
//While loop- Used for repeating the set of instructions blocked. Control 1st checks the condition given to the While loop, if true- enters the while block, executes set of instructions blocked by While loop, after execution, backs to the condition, checks, if true, executes,...keep on repeating executions until condition is false- control will stop execution & control quits the While block. So Wile Loop becomes ∞ until not stopped manually or by applying conditions. *while is written with lower case.

class WhileLoop2ndeg 
{
    public static void main(String[]args)
    {
	int i=1;//to control ∞ loop or infinite no.of Executions/Iterations, 3 segments are required 1st. Initialization
	while(i<=5)//2nd. Condition
	{
	    System.out.println("While Loop");//While Loop...(gets printed 5 times totally)
	    i++;//3rd. Update
	}
    }
}
//javac WhileLoop2ndeg.java
//java WhileLoop2ndeg