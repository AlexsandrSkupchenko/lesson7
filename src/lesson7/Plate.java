package lesson7;

public class Plate {
    private int food;
    private boolean notEat;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean howmuchFood(int amount) {
        if (food < amount) {
            System.out.println("Осталось еды " + food);
            return true;
        }
        return false;
    }

    public void decreaseFood(int amount) {
            this.food -= amount;
            System.out.println("Осталось еды " + food);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
