package com.tekwill.homework2.october.october05.exercise3;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable vec[] = {new Rectangle(200, 100), new SportCar("Fiat", 7892321),
                new Rectangle(34, 32), new Manager("Gidi", 32),
                new Rectangle(54,10), new SportCar("Audi", 4322344),
                new SportCar("Mazda", 4322343), new Manager("Moshe", 2344322)};

        for (int index = 0; index < vec.length; index++) {
            vec[index].print();
        }
    }
}
