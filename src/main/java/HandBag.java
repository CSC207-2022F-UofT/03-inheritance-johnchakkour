/**
 * This file defines a child class named HandBag.
 * We have provided most of the code for this class, however,
 * you should implement the provided TODOs.

 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
public class HandBag extends Bag{

    /**
     * Creates a new HandBag with the given color and
     * capacity.
     *
     * @param color the HandBag's color
     * @param capacity how many items can fit in the Handbag
     */
    public HandBag(String color, int capacity) {
        super(color, capacity);
    }

    /**
     * Increase the capacity of this bag by 1.
     */
    @Override
    public void enhance() {
        /*
         *
         * To call a method defined in a parent, you use super.method_name(...)
         */
        increaseCapacity(1);
    }
}