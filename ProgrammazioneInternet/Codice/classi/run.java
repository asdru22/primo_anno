class run{
    public static void main(String[] args){
        //saluta s1 = new saluta("ciaone","marco");
        //saluta s2 = new saluta("ciao.","antonio");
        //saluta s3 = new saluta("ciaoone","paolo");
        //System.out.println(s1.sayHello());
        //System.out.println(s2.sayHello());
        //s3.setNome("giovanni");
        //System.out.println(s3.sayHello());

        ContoCorrente mio = new ContoCorrente(124241, "isola", 1530);

        mio.Preleva(-14500);
        mio.Deposita(-1500);

        mio.Informazioni();
    }
}  