package SeminarOneHomework;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int birthYear;
    private List<Person> children;
    private Person mother;
    private Person father;
    private boolean gender;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.children = new ArrayList<>();
    }

    public Person() {

    }

    public void setMother(Person mother) {
        this.mother = mother;
        mother.addChild(this);
    }

    public void setFather(Person father) {
        this.father = father;
        father.addChild(this);
    }

    public void addChild(Person child) {
        this.children.add(child);
        if (this.isMale()) {
            child.setFather(this);
        } else {
            child.setMother(this);
        }
    }

    public boolean isMale() {
        boolean isMale = false;
        // implement logic to determine if person is male or not based on a gender field
        // e.g. if gender is stored as a boolean value
        if (gender) {
            isMale = true;
        }
        return isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", children=" + children +
                ", mother=" + mother +
                ", father=" + father +
                ", gender=" + gender +
                '}';
    }
}