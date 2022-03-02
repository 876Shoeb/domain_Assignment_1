package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        class customer {
            private String Firstname;
            private String Lastname;
            private String kyaadnum;
            public void Firstname() {
                System.out.println("Ford");
            }
            public void Lastname() {
                System.out.println("Henry");
            }

        }

        class kyaad extends customer{
            private String kyaadnum = "87642";

            public static void main(String[] args) {
                customer myObj1 = new customer();
                kyaad myObj = new kyaad();
                myObj1.Firstname();
                myObj1.Lastname();
                myObj.kyaadnum();
                System.out.println(myObj1.Firstname + " " + myObj1.Lastname + " " + myObj1.kyaadnum);
            }

            private void kyaadnum() {
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