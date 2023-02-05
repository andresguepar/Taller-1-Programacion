package com.java.ex17;

import java.util.Scanner;

public class PrinGym {
    public static void main(String[] args) {
        Gym gym = new Gym();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose:  1. 15 days for 18000, 2. 30 days for 35000), 3. 3 months for 86000)");
        gym.type = sc.nextInt();
        System.out.println("Calculating...");
        System.out.println(gym.howMuch());

    }
}
