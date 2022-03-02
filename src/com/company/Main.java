package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        class customer {
            private String Firstname;
            private String Lastname;
            private String card;
            public void Firstname() {
                System.out.println("Ford");
            }
            public void Lastname() {
                System.out.println("Henry");
            }

        }

        class card extends client{
            private String card = "87642";

            public static void main(String[] args) {
                customer myObj1 = new client();
                card myObj = new card();
                myObj1.Firstname();
                myObj1.Lastname();
                myObj.card();
                System.out.println(myObj1.Firstname + " " + myObj1.Lastname + " " + myObj1.card);
            }

            private void card() {
            }
        }

    }
}



/*public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        Card card = new Card();
       client.setName();
       client.getName();


Main myObj1 = new Client(/*45678, "Shoeb" "Harris" "30"*/);
        System.out.println("idNum: " + myObj.idNum, "Name: " + myObj.Firstname + " " + myObj.Lastname,
                "Age: " + myObj.Age, /*insert card info*/  );




   }

}
*/