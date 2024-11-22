package assgn;

 class Car {
    private String color;
    private String model;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
         this.color = color;
    }
    public String getModal(){
        return model;
    }
    public void setModal(String model){
        this.model = model;
    }
}
class Main{
public static void main(String[] args) {
    Car ob = new Car();
ob.setColor("Red");
ob.setModal("2020");   
    System.out.println(ob.getColor() + " " + ob.getModal());
}
}

