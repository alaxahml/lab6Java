package com.cherkasov.lab6;

public class Main {
    public static void main(String[] args) {
      Abiturient vasya=new ExtramuralStudent();
      vasya.setCtScore(350);
      System.out.println(vasya.getCtScore());

        try{
            System.out.println(((ExtramuralStudent) vasya).getFaculty());
        }catch(NullPointerException e){
            System.out.println("Mistake");
        }

       Student petr=new ExtramuralStudent();
        try{
            System.out.println(((ExtramuralStudent) vasya).getFaculty().toString());
        }catch(NullPointerException e){
            System.out.println("Mistake");
        }
        petr.setFaculty(Faculty.MMF);
       System.out.println(((ExtramuralStudent) petr).getFaculty().toString());

    }
}
