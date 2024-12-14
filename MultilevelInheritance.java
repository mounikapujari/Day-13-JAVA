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
  class C extends B{
    public void r1(){
        System.out.println("Hello professor");
    }
  }
  class MultilevelInheritance{
    public static void main(String args[]){
      C h=new C();
      h.p1();
      h.r();
      h.r1();
  
    }
  }