package com.company;

public class Card {
    private int CardNum;
    private double Balance;
    private int Pin;
    private boolean Status;



public Card(){
    public void setCardNum(int cardnum){
            this.CardNum = cardnum;
                    }
        public void getCardNum(){
            System.out.println("CardNum: " + this.CardNum);
        }

        public void setBalance(double balance){
            this.Balance = balance;
        }
        public void getBalance(){
            System.out.println("Balance: " + this.balance);
        }

        public void setPin(int Pin){
            this.Pin = pin;
        }
        public void getPin(){
            System.out.println("Pin: " + this.Pin);
        }
        public void setStatus(Boolean Status){
            this.Status = status;
        }
        public void getStatus(){
            System.out.println("Status: " + this.status);
        }

}
