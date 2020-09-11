package lesson7;

public class Cat {
    private String name;
    private int amount;
    private boolean satiety;

    public Cat(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void eat(Plate plate) {
        if (plate.howmuchFood(amount) == true) {
            if (plate.getcatEat() == true) {
                plate.decreaseFood(amount);
                System.out.println("Кот " + name + " поел..." + plate.getFood() + " осталось.");
            } else {
                System.out.println("Кот " + name + " не доел " + plate.getTimFood() + " еды.");
            }
        } else {
            System.out.println("Кот " + name + " не поел. Еды нет");
            plate.getFood();
        }
    }
//    public void catHunger() {
//
//    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", satiety=" + satiety +
                '}';
    }
    //    public String getName() {
//        return name;
//    }

//    //public void fear(Dog dog){
//        System.out.println("Cat "+ name+" fear dog "+ dog.getName());
//    }
}

