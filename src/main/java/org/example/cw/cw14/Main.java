package org.example.cw.cw14;

import org.example.cw.cw14.view.AnimalView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сортировка по возрастанию возраста кошек: ");
        AnimalView.CatPrint();

        System.out.println();

        System.out.println("Сортировка по алфавитному порядку кличек собак: ");
        AnimalView.DogPrint();
    }
}
