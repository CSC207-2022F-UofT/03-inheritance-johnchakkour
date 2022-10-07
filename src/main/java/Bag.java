/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

import java.util.ArrayList;

public abstract class Bag {
    /*
     *
     */
    private String color;
    private int numberOfContents;
    private int capacity;
    private ArrayList<String> contents;




    /*
     *
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new ArrayList<String>();
    }




    /*
     *
     */
    String getColor() {
        return this.color;
    }
    int getNumberOfContents() {
        return this.numberOfContents;
    }
    int getCapacity() {
        return this.capacity;
    }




    /*
     *
     */
    void setColor(String newColor) {
        this.color = newColor;
    }





    /*
     *
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */
    boolean addItem(String item) {
        if (this.numberOfContents < this.capacity) {
            this.contents.add(item);
            this.numberOfContents += 1;
            return true;
        } else {
            return false;
        }
    }





    /**
     *

     * If there are no items in this Bag, return null.
     *
     * @return String, or null if Bag is empty
     */
    String popItem() {
        if (this.numberOfContents == 0) {
            return null;
        } else {
            String itemToBeRemoved = this.contents.get(this.contents.size() - 1);
            this.contents.remove(this.contents.size() - 1);
            this.numberOfContents -= 1;
            return itemToBeRemoved;
        }
    }





    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity += n;

    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return String representation of Bag
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}