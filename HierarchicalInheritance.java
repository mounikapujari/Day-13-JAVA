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
  class C extends A{
    public void r1(){
        System.out.println("Hello professor");
    }
  }
  class HierarchicalInheritance{
    public static void main(String args[]){
       B h=new B();
       h.p1();
       h.r();
      C h1=new C();
      h1.p1();
      h1.r1();
  
    }
  }