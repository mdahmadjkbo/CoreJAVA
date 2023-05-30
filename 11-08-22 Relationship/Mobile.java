class Mobile{
    String brand;
    int ram;
    Earphone e;
public Mobile(String brand, int ram){
    this.brand=brand;
    this.ram=ram;}
public void insertEarphone(Earphone e){
    this.e=e;}
public void removeEarphone(){
    this.e=null;}
}
//11-08-22