package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    void add_noListYet() {
        // GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal = new Animal("Fellino", "Cat");
        AnimalList expected = new AnimalList(new AnimalListItem(animal));

        // WHEN
        animalList.add(animal);

        // THEN
        assertEquals(expected, animalList);
    }

    @Test
    void add_twoTimes() {
        // GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal = new Animal("Fellino", "Cat");
        Animal animal2 = new Animal("Morpheus", "Dog");
        AnimalList expected = new AnimalList(new AnimalListItem(animal, new AnimalListItem(animal2)));

        // WHEN
        animalList.add(animal);
        animalList.add(animal2);

        // THEN
        assertEquals(expected, animalList);
    }

    @Test
    void toString_oneItem() {
        // GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal = new Animal("Fellino", "Cat");
        animalList.add(animal);
        String expected = "AnimalListItem{value=Animal(name=Fellino, type=Cat)}";

        // WHEN
        String result = animalList.toString();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void toString_twoItems() {
        // GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal = new Animal("Fellino", "Cat");
        Animal animal2 = new Animal("Morpheus", "Dog");
        animalList.add(animal);
        animalList.add(animal2);
        String expected = "AnimalListItem{value=Animal(name=Fellino, type=Cat)} -> AnimalListItem{value=Animal(name=Morpheus, type=Dog)}";

        // WHEN
        String result = animalList.toString();

        // THEN
        assertEquals(expected, result);
    }
}