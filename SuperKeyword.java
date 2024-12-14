class a{
    public void r(){
        System.out.println("Hello");
    }
}
class b extends a{
    public void r1(){
        super.r();
        System.out.println("Hello Students");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        b h=new b();
        h.r1();
    }
    
}
