class es {
    public static void main(String[] args) {       
        /*Rectangle b1 = new Rectangle(1,1,1,1);
        Rectangle b2 = new Rectangle(1,1,2,1);
        if(b1.equals(b2)) System.out.println("ugule");*/

        int digit = 5;
        String englishDigit;
        switch(digit){
            case 1: englishDigit = "one"; break;
            case 2: englishDigit = "two"; break;
            case 3: englishDigit = "thwee"; break;
            default: englishDigit = "bruh"; break;
        }
        System.out.println(englishDigit);
    }
}