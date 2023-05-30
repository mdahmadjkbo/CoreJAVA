class Instagram extends FaceBook{
    String stories;
    Instagram(String id, int noOfUsers, long cNo, String stories){
    super(id, noOfUsers, cNo);
    this.stories=stories;}
public static void main(String[]args){
    Instagram i1=new Instagram("dad", 23, 9345l, "feeling great");
    Instagram i2=new Instagram("Mr. Pickoo", 25, 7894l, "Go ahead");
    System.out.println(i2.stories);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();}
}
