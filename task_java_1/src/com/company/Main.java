package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] My_qestions = {"1. Кто Берлин штурмом взял?\n1: Американцы \n2: Красная Армия",
                "2. Кто не скачет тот? \n1: Москаль \n2: Печенег",
                "3. Кто ты и твои кенты? \n1: Лохи \n2: Казаки",
                "4. А по темным улицам гуляет? \n1: Вождь \n2: Дождь",
                "5. Теоретик всех теоретиков? \n1: Анатолий Вассерман \n2: Мишаня Аралов"
        };
        ArrayList<Integer> result = new ArrayList<Integer>();
        Scanner ansew = new Scanner(System.in);
        int i;

        for (String my_qestion : My_qestions){
            System.out.println(my_qestion);
            i = ansew.nextInt();
            if (i == 1 || i == 2) {
                result.add(i);
                System.out.println("Ответ сохранен\n");
            }
        }
        System.out.print("Ваши ответы " + result);
    }
}
