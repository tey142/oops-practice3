abstract class vehicletype{
    private String make;
    private String model;
    private int year;
    public vehicle(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public abstract void drive(){}
}
class car extends vehicletype{
    private int doors;
    public car(String make, String model, int year, int doors){
        super(make, model, year);
        this.doors=doors;
    }
    @Override
    public drive(){
        System.out.println("~~driving car~~");
    }
}
class truck extends vehicletype{
    private int capacity;
    public truck(String make, String model, int year, int capacity)
}