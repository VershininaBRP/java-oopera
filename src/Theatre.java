import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Андрей","Миронов", Gender.MALE, 182);
        Actor actor2 = new Actor("Анатолий","Папанов", Gender.MALE, 180);
        Actor actor3 = new Actor("Лариса","Голубкина", Gender.FEMALE, 170);

        Director director1 = new Director("Константин","Станиславский", Gender.MALE, 17);
        Director director2 = new Director("Марина","Брусникина", Gender.FEMALE, 15);

        Person musicAuthor = new Person("Александр", "Алябьев", Gender.MALE);
        Person choreographer = new Person("Алла", "Сигалова", Gender.FEMALE);

        //спектакль обычный
        ArrayList<Actor> listOfActors1 = new ArrayList<>();
        Show show = new Show("Пиковая дама",120, director1, listOfActors1);
        show.printDirector();

        show.addActor(actor1);
        show.printListOfActors();


        //балет
        ArrayList<Actor> listOfActors2 = new ArrayList<>();
        Ballet ballet = new Ballet("Щелкунчик",320, director2, listOfActors2,
                musicAuthor, "Мари, Щелкунчик, волшебство.", choreographer);
        ballet.printDirector();

        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.printListOfActors();

        ballet.changeActor(actor3,actor2.getSurname());
        ballet.printListOfActors();

        ballet.printLibrettoText();

        //опера
        ArrayList<Actor> listOfActors3 = new ArrayList<>();
        Opera opera = new Opera("Енуфа", 180, director2, listOfActors3,
                musicAuthor, "Ребёнок, преступление, прощение.", 3);
        opera.printDirector();

        opera.addActor(actor1);
        opera.addActor(actor3);
        opera.printListOfActors();

        opera.changeActor(actor2,actor2.getSurname());
        opera.printListOfActors();

        opera.printLibrettoText();
    }
}
