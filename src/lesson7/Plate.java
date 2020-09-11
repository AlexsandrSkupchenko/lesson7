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
            return true;
        }
        return false;
    }

    public void decreaseFood(int amount) {
            this.food -= amount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
