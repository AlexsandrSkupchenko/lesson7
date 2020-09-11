package lesson7;

public class Plate {
    private int food;
    private boolean catEat;
    private int x;

    public Plate(int food) {
        this.food = food;
    }

    public int getTimFood() {
        return x;
    }

    public int getFood() {
        return food;
    }
    public boolean getcatEat() {
        return catEat;
    }

    public boolean howmuchFood(int amount) {
        if (food >= amount) {
            catEat = true;
            return true;
        }
        if (food > 0 & food < amount) {
            x = amount - food;
            this.food = 0;
            catEat = false;
            return true;
        }
        if (food == 0) {
            return false;
        }
        return false;
    }

    public void decreaseFood(int amount) {
            this.food -= amount;
    }

    public void addFood(int food) {
        System.out.println("Добавка " + food);
        this.food += food;
    }
    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
