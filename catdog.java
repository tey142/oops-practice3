class animal{
    private String name;
    private int age;
    public animal(String name; int age){
        this.name=name;
        this.age=age;
    }
    public getname(){
        return name;
    }
    public getage(){
        return age;
    }
    public sound(){
        System.out.println("this animal makes a sound");
    }
}
class dog extends animal{
    private String breed;
    public dog(String name, int age, String breed){
        super(name, age);
        this.breed=breed;
    }
    public getbreed(){
        return breed;
    }
    @Override
    public sound(){
        System.out.println("bark");
    }
}
class cat extends animal{
    private boolean isindoor;
    public cat(String name, int age, boolean isindoor){
        super(name, age);
        this.isindoor=isindoor;
    }
    public boolean isindoor(){
        return isindoor;
    }
    @Override
    public sound(){
        System.out.println("miaow");
    }
}
public class catdog{
    dog d=new dog("maverick", 7, "golden doodle");
    cat c=new cat("mookie", 1, true);
    public static void main(String[] args){
        System.out.println("cat: "+c.getname()+" - "+c.getage()+" - "+c.getisindoor());
        System.out.println("dog: "+d.getname()+" - "+d.getage()+" - "+d.getbreed());
    }
}