package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {

        try {
            int[] numero = new int[1];
            System.out.println(numero[3]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
