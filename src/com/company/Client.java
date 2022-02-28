package com.company;

public class Client extends Main {
        private int idNum;
        private String Firstname;
        private String Lastname;
        private int Age;
        Card card;

   Client(){
        this.idNum = id;
        this.Firstname = Fname;
        this.Lastname = Lname;
        this.Age =Age;


        public Client() {
            public void getidNum(int id, Card card){
                this.idNum = id;
                this.card = new Card();
            }
            public void getidNum(){
                System.out.println("idNum: " + this.idNum);
            }

           public void setFirstname(String Fname){
               this.Firstname = Fname;
           }
           public void getFirstname(){
               System.out.println("Firstname: " + this.Fname);
           }

           public void setLastname(String Lname){
               this.Lastname = Lname;
           }
           public void getLastname(){
               System.out.println("Lastname: " + this.Lname);
           }
           public void setAge(int Age){
               this.Age = Age;
           }
           public void getAge(){
               System.out.println("Age: " + this.Age);
           }
            public void setCard(Card){
                this.Card = Card;
            }
            public void getCard(){
                System.out.println("Card: " + this.Card);
            }
        }
    }
}
