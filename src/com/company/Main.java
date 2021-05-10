package com.company;

import java.util.LinkedHashMap;

class Main {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap: " + numbers);

        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Kaldırılan değer: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("{Üç = 3} girişi kaldırıldı mı? " + result);

        System.out.println("Güncellenmiş LinkedHashMap: " + numbers);
    }
}