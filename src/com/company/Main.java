package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        class Client {
            private String Firstname;
            private String Lastname;
            private String cardnum;
            public void Firstname() {
                System.out.println("Ford");
            }
            public void Lastname() {
                System.out.println("Henry");
            }

        }

        class Card extends Client{
            private String cardnum = "87642";

            public static void main(String[] args) {
                Client myObj1 = new Client();
                Card myObj = new Card();
                myObj1.Firstname();
                myObj1.Lastname();
                myObj.cardnum();
                System.out.println(myObj1.Firstname + " " + myObj1.Lastname + " " + myObj.cardnum);
            }

            private void cardnum() {
            }
        }

    }
}






