class PrePostIncCombo
{
    public static void main(String[]args)
    {
	int num1=34;
	int num2=12;
	int num3=5;
	int res= ++num3 + num3++ + num2 - ++num2*2 + ++num1 + num2++;
	      //  1+5  +   6     +  12  - (1+12)*2 +  1+34  +  13
	      //   6   +   6     +  12  -    26    +   35   +  13
	      // 46
	int alres= 6+6+12-26+35+13;


	System.out.println(num1);//35
	System.out.println(num2);//14
	System.out.println(num3);//7
	System.out.println(res);//46
	System.out.println(alres);//46
    }
}