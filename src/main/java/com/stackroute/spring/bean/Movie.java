package com.stackroute.spring.bean;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware  {
    Actor actor1;
    Actor actor2;
    Actor actor3;
    String movieName;



    public Movie(){}

    public Movie(Actor actor1,Actor actor2,Actor actor3,String movieName) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
        this.movieName = movieName;

    }




    public Actor getActor1() {
        return actor1;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public Actor getActor2() {
        return actor2;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    public Actor getActor3() {
        return actor3;
    }

    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }


    public void show(){
        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);

    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
        Actor actor=(Actor) applicationContext.getBean("actor1");
        System.out.println(actor1);
    }
}