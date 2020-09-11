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
                satiety = true;
                plate.decreaseFood(amount);
                System.out.println("Кот " + name + " поел..." + plate.getFood() + " осталось. Насытелся " + satiety);
            } else {
                satiety = false;
                System.out.println("Кот " + name + " не доел " + plate.getTimFood() + " еды. Не насытился " + satiety);
            }
        } else {
            satiety = false;
            System.out.println("Кот " + name + " не поел. Еды нет. Голодный " + satiety);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", satiety=" + satiety +
                '}';
    }
}

