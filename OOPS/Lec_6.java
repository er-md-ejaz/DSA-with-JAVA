// package OOPS;

class ReadOnly {
    String name;
    int age;

    ReadOnly(){
        this.name = "Ansari";
        this.age = 20;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}

class WriteOnly {
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class ReadWrite {
    String name;
    int age;

    ReadWrite(){
        this.name = "Ansari";
        this.age = 20;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

}

public class Lec_6 {
    public static void main(String[] args) {
        ReadWrite rw = new ReadWrite();
        System.out.println(rw.getName());
        System.out.println(rw.getAge());
        rw.setAge(25);
        rw.setName("Habibi");
        System.out.println(rw.getName());
        System.out.println(rw.getAge());
    }
    
}
