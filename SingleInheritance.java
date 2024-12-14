class A{
  public void p1(){
    System.out.println("Hello Students");
  }
}
class B extends A{
  public void r(){
    System.out.println("Hello Teachers");
  }
}
class SingleInheritance{
  public static void main(String args[]){
    B h=new B();
    h.p1();
    h.r();

  }
}