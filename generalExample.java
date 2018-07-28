//general example showing class, object creation, methods

class Student{
    int rollNo      //instance variable
    String name;    //instance variable

    void insertRecord(int r, String n){
        roll no = r;
        name = n;
    }

    void displayInfo(){
        System.out.println(rollNo + " " + name);
    }
     system.out.println(String[]args){
         //these create spaces in Stack whereas the 'new' keyword creates space in the heap-> AT RUNTIME!!!
        student s1 = new Student(); 
        student s2 = new Student();

        s1.insertRecord(111, "Aannaya");    //used for function outside of main
        s1.insertRecord(112, "Tanya");

        s1.displayInfo();
        s2.displayInfo();

    }
}