class Employee{
    private String name;
    private int age;
    private boolean isCertified;

    Employee(String name,int age,boolean isCertified){
        this.name = name;
        this.age = age;
        this.isCertified = isCertified;
    }
    public String toString(){
        return "It is " + isCertified + " that " + name +
        ", age " + age + ", is certified.";
    }
}