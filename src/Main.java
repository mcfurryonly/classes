public class Main {
    public static void main(String[] args) {
        Author cliveStaplesLewis = new Author("Клайв Стейплз ", "Льюис");
        Author johnRonaldReuelTolkien = new Author("Джон Рональд Руэл", "Толкин");
        Book theCroniclesOfNarnia = new Book("Хроники Нарнии", cliveStaplesLewis,1950);
        Book lordOfTheRings = new Book("Властелин Колец", johnRonaldReuelTolkien, 1954);

        System.out.println("Книга: " + theCroniclesOfNarnia.getName() + " Автор: " + cliveStaplesLewis.getFirstName() + "" + cliveStaplesLewis.getLastName() + " Год: " + theCroniclesOfNarnia.getPublishYear());
        System.out.println("Книга: " + lordOfTheRings.getName() + " Автор: " + johnRonaldReuelTolkien.getFirstName() + "" + johnRonaldReuelTolkien.getLastName() + " Год: " + lordOfTheRings.getPublishYear());

    }
}