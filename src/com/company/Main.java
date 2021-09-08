package com.company;

import java.util.Collection;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        User [] us = new User[100];
        int lostID = 0;
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Меню 1.Список 2.Добавить 3.Изменить 0.Выход\n Команда: ");
            String answ = in.next();
            if(answ.equals("1")){
            }
            if(answ.equals("2")){
                System.out.println("Логин: ");
                String log = in.next();
                System.out.println("Почта: ");
                String mail = in.next();
                System.out.println("Пароль: ");
                String pass = in.next();

                User User[lostID] = new User(log, mail, pass);
                user1.stats();
            }
            if(answ.equals("3")){

            }
            if(answ.equals("0")){
                System.out.print("Выход!");
                break;
            }
        }
        in.close();
	// write your code here
    }
}
