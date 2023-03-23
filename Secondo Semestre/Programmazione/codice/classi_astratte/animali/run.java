class run{
    public static void main(String[] args) {
        Cane c = new Cane("dio",4);
        Tacchino n = new Tacchino("pp", 5);
        System.out.println(c.piuGrandeDi(n));
        System.err.println(c.toString());
    }
}