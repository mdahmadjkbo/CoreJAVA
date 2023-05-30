class AccountDriver{
    public static void main(String[]args){
	Account a=new Account("Loki", 123, 0.0, 153);
	System.out.println(a.name);
	System.out.println(a.accNo);
	System.out.println(a.getBal());
	a.setBal(0.1);
	System.out.println(a.getBal());
	a.setBal(231);}
}
