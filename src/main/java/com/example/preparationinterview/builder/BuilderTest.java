package com.example.preparationinterview.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("Ivan")
                .lastName("Sidorov")
                .middleName("Ivanovich")
                .country("Russia")
                .address("Moscow Mira 32")
                .phone("89565256612")
                .age(20)
                .gender("Male")
                .build();
        System.out.println(person);
    }
}
