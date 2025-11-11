package Lesson23.AdvancedDataStrukturerTraer;

public class PrintTrae {
    public static void main(String[] args) {
        Person frederik = new Person("Kong Frederik X", '♂');
        Person christian = new Person("Kronprins Christian", '♂');
        Person isabella = new Person("Princess Isabella", '♀');
        Person vincent = new Person("Prince Vincent", '♂');
        Person josephine = new Person("Princess Josephine", '♀');

        frederik.addChild(christian);
        frederik.addChild(isabella);
        frederik.addChild(vincent);
        frederik.addChild(josephine);

        Person joachim = new Person("Prins Joachim", '♂');
        Person nikolai = new Person("Grev Nikolai", '♂');
        Person felix = new Person("Grev Felix", '♂');
        Person henrik = new Person("Grev Henrik", '♂');
        Person athena = new Person("Komtesse Athena", '♀');

        joachim.addChild(nikolai);
        joachim.addChild(felix);
        joachim.addChild(henrik);
        joachim.addChild(athena);

        // Udskriv stamtræet
        frederik.printTree("");
        System.out.println("Antal personer i træet: " + frederik.countDescendants());
        joachim.printTree("");
        System.out.println("Antal personer i træet: " + frederik.countDescendants());
    }
}