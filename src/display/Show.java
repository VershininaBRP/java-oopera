package display;

import human.Actor;
import human.Director;

import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;
    Scanner scanner = new Scanner(System.in);

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void changeActor(Actor actor, String surname) {
        int count = 0;
        if (!listOfActors.isEmpty()){
            System.out.println("Замена актера " + surname);
            for (int i = 0; i < listOfActors.size(); i++) {
                if (listOfActors.get(i).getSurname().equals(surname)) {
                    count++;
                }
            }
            if (count == 1){
                for (int i = 0; i < listOfActors.size(); i++) {
                    if (listOfActors.get(i).getSurname().equals(surname)) {
                        listOfActors.set(i, actor);
                        return;
                    }
                }
            } else if (count == 0){
                System.out.println("Актер с фамилией " + surname + " не найден.\n");
            } else {
                System.out.println("Актер не может быть заменен, так как есть однофамильцы!.\n");
            }

        } else {
            System.out.println("Список пуст");
        }
    }

    public void addActor(Actor actor){
        if (!listOfActors.contains(actor)){
            listOfActors.add(actor);
        } else {
            System.out.println("Такой актер уже есть!");
        }
    }

    public void printListOfActors(){
        if (!listOfActors.isEmpty()){
            System.out.println("Список актеров спектакля " + getTitle() + ":");
            for(Actor actor: listOfActors){
                System.out.println(actor.toString());
            }
            System.out.println();
        }
    }

    public void printDirector(){
        System.out.println("Информация о режиссёре спектакля " + getTitle() + ":\n" + director.toString() + "\n");
    }

}
