package lesson7;

public class Cat {
    private String name;
    private int amount;

    public Cat(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void eat(Plate plate) {
        if (plate.howmuchFood(amount) == true) {
            System.out.println("Cat " + name + " есть не будет. Мало еды.");
        } else {
            System.out.println("Cat " + name + " eat...");
            plate.decreaseFood(amount);
        }


//    public String getName() {
//        return name;
//    }

//    //public void fear(Dog dog){
//        System.out.println("Cat "+ name+" fear dog "+ dog.getName());
//    }
    }
}
