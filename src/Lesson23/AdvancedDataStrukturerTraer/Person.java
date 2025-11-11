package Lesson23.AdvancedDataStrukturerTraer;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private char gender; // '♂' eller '♀'
    private List<Person> children;

    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int countDescendants() {
        int count = 1; // Tæl personen selv
        for (Person child : children) {
            count += child.countDescendants(); // Rekursivt tilføj børnenes antal
        }
        return count;
    }

    public void printTree(String indent) {
        System.out.println(indent + "─ " + name + " " + gender);
        for (Person child : children) {

            child.printTree(indent + "  ");
        }
    }
}

