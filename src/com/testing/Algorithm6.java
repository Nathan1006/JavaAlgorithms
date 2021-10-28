package com.testing;

public class Algorithm6 {
    public static boolean Alg6 (String word) {
        String[] myArray = word.split("");
        String letter = "";
        boolean tOrf = false;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == letter){
                tOrf = true;
                return tOrf;
            }
            letter = myArray[i];
        }

        //String myString = String.join("", myArray);
        System.out.println(myArray[3]);
        return tOrf;
    }
}
