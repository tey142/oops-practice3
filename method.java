class vegetable{
    public void method1(){
        System.out.println("tomato");
    }
    public void method2(){
        System.out.println("avocado");
    }
}
class fruit{
    public void method3(){
        System.out.println("pineapple");
    }
    public void method4(){
        System.out.println("mango");
    }
}
public class method{
    public static void main(String[] args){
    vegetable v=new vegetable();
    fruit f=new fruit();
    v.method1();
    v.method2();
    f.method3();
    f.method4();
    }
}
