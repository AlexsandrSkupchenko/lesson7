package lesson7;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box("red", 5);
//        Box box2 = new Box("red", 5);
//
//        if(box1.equals(box2)){
//            System.out.println("Равны");
//        }else {
//            System.out.println("Не равны");
//        }
//
//
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());

//        byte b = 9;
//        int x = 6;
//        Integer y = 120;
//        Integer z = new Integer(120);
//        testMethod(b);
//        testMethod2(x);

//        Byte
//        Short
//        Long

//        Boolean
//        Character
//
//        for (Integer i = 0; i <1000000 ; i++) {
//
//        }
//
//        for (int i = 0; i < 1000000; i++) {
//
//        }

//        String s1 = "java";
//        String s2 = "java";
//        String s3 = new String("java");
//
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);


//        StringBuilder sb = new StringBuilder("asdf");
//
////        for (int i = 0; i < 1000000; i++) {
////            sb.append("1");
////        }
//
//        sb.append(111).append('v').append(2.1213).append("erter");
//        System.out.println(sb);
//
//        sb.insert(3, "aaaaa");
//        System.out.println(sb);
//
//        sb.replace(2, 6, "*");
//        System.out.println(sb);
//
//        sb.setLength(sb.length() - 3);
//        System.out.println(sb);
//
//        sb.delete(6,9);
//        System.out.println(sb);
//
//        sb.reverse();
//        System.out.println(sb);


        Cat cat1 = new Cat("Barsik", 30);
        Cat cat2 = new Cat("Murzik", 60);
        Cat cat3 = new Cat("Vasya", 20);
        Cat cat4 = new Cat("Kity", 30);
        Plate plate = new Plate(100);

        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        cat4.eat(plate);
        System.out.println("Осталось еды " + plate.getFood());



//        Dog dog = new Dog("Tuzik");
//        dog.scare(cat);
//
//
//    }
//
//    static void testMethod(int a) {
//        System.out.println(a);
//    }
//
//    static void testMethod2(Integer a) {
//        System.out.println(a);
//    }

    }
}
