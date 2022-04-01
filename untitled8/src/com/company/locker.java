package com.company;

public class locker {

    public  int lockerToggle(int numberOfLockers){
        boolean[] doors = new boolean[numberOfLockers];

        for (int i = 1; i <= numberOfLockers; i += 1){
            for (int locker = i - 1; locker < numberOfLockers; locker += i){
                doors[locker] = !doors[locker];
            }
        }

        int doorNumber = 0;
        for(boolean isOpen: doors) {
            if (isOpen) {
                doorNumber++;
            }
        }

        return doorNumber;
    }
}
