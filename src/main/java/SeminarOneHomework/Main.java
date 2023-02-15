package SeminarOneHomework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person fatherMarat = new Person();
        fatherMarat.setName("Marat");
        System.out.println(fatherMarat.getName());
        fatherMarat.setBirthYear(1983);
        System.out.println(fatherMarat.getBirthYear());
        fatherMarat.setGender(true);


        Person matherLilya = new Person();
        matherLilya.setName("Lilya");
        matherLilya.setBirthYear(1985);
        matherLilya.setGender(false);

        Person son = new Person();
        son.setName("Danyar");
        son.setBirthYear(2018);
        son.setGender(true);



    }
}
