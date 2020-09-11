package lesson7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        for (int j = 0; j < 2; j++){
            Cat[] arrCats = new Cat[5];
            arrCats[0] = new Cat("Barsik", 50);
            arrCats[1] = new Cat("Murzik", 25);
            arrCats[2] = new Cat("Vasya", 20);
            arrCats[3] = new Cat("Kity", 30);
            arrCats[4] = new Cat("Kasper", 9);

            for (int i = 0; i < arrCats.length; i++) {
                arrCats[i].eat(plate);
            }
            System.out.println("Осталось еды " + plate.getFood());
            plate.addFood(200);
            System.out.println("Стало еды " + plate.getFood());
        }
    }
}
