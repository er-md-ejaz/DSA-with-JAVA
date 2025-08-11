

public class Abstraction {
    public static void main(String[] args) {
        // Bank b = new Bank(); // we can't make an object of the abstract class
        // PNB p = new PNB();
        Bank p = new PNB();
        System.out.println(p.rateOfInterest());
        // p.display();
        Bank s = new SBI();
        System.out.println(s.rateOfInterest());
        // Bank h = new HDFC();
        Bank h = new NewBank();
        System.out.println(h.rateOfInterest());
        Bank.display(); // static method
    }
}


abstract class Bank {
    static String message;

    Bank(){
        message = "Sir";
        System.out.println("Constructor of Bank!");
    }

    abstract int rateOfInterest();

    static void display(){
        System.out.println("Welcome to our Bank! " + message);
    }
} 

class PNB extends Bank {
    PNB(){
        System.out.println("Constructor of PNB!");
    }
    public int rateOfInterest(){
        return 10;
    }
}

class SBI extends Bank {
    public int rateOfInterest(){
        return 9;
    }
}

abstract class HDFC extends Bank {
    HDFC(){
        System.out.println("Constructor of HDFC!");
    }

    abstract void details();

    void print(){
        System.out.println("Hi HDFC!");
    }
}

class NewBank extends HDFC {
    int rateOfInterest(){
        return 7;
    }

    void details(){
        System.out.println("HDFC Details through NewBank");
    }    
}