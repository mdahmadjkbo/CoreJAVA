class MobileDriver{
    public static void main(String[]args){
	Mobile m=new Mobile("Oppo", 8, 25000, new Battery(6000));
	Mobile mo=new Mobile("Samsung", 4, 15000, new Battery(500));
	Mobile mob=new Mobile("Redmi", 16, 20000, new Battery(5000));

	System.out.println(m.price);
	System.out.println(mob.ram);
	System.out.println(m.b.mah);
	System.out.println(mo.b.mah);
	System.out.println(mob.b.mah);}
}