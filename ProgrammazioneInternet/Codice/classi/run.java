class run{
    public static void main(String[] args){
        //saluta s1 = new saluta("ciaone","marco");
        //saluta s2 = new saluta("ciao.","antonio");
        //saluta s3 = new saluta("ciaoone","paolo");
        //System.out.println(s1.sayHello());
        //System.out.println(s2.sayHello());
        //s3.setNome("giovanni");
        //System.out.println(s3.sayHello());
        Persona bruh = new Persona("bling", "chilling");
        Persona cacca = new Persona("caca", "sbura");

        //bruh.Presentati();
        ContoCorrente mio = new ContoCorrente(124241, bruh, 1530);
        ContoCorrente condiviso = new ContoCorrente(124241, bruh, 1530,cacca);
        condiviso.Informazioni();
        //mio.Deposita(42);
        //mio.Preleva(3);
        //mio.Informazioni();
    }
}  