package Lesson19.Dog;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void getName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void getDogYears() {
    }

    @Test
    void findOldestDog() {
    }

    @Test
    public void testGetDogYears() {
        Dog dog1 = new Dog("Bella", 1);
        Dog dog2 = new Dog("Max", 5);
        Dog dog3 = new Dog("Charlie", 10);

        assertEquals(7, dog1.getDogYears());
        assertEquals(35, dog2.getDogYears());
        assertEquals(70, dog3.getDogYears());
    }

    @Test
    public void testFindOldestDog() {
        Dog dog1 = new Dog("Bella", 3);
        Dog dog2 = new Dog("Max", 7);
        Dog dog3 = new Dog("Charlie", 5);

        List<Dog> dogs = Arrays.asList(dog1, dog2, dog3);
        Dog oldest = Dog.findOldestDog(dogs);

        assertEquals("Max", oldest.getName());
        assertEquals(7, oldest.getAge());
    }

    @Test
    public void testFindOldestDogWithEmptyList() {
        List<Dog> emptyList = Arrays.asList();
        Dog result = Dog.findOldestDog(emptyList);
        assertNull(result);
    }

    @Test
    public void testGetters() {
        Dog dog = new Dog("Luna", 4);
        assertEquals("Luna", dog.getName());
        assertEquals(4, dog.getAge());
    }
}