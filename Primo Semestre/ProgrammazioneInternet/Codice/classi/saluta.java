public class saluta {
    private String saluto,nome;

    public saluta(String saluto,String nome){
        this.saluto = saluto;
        this.nome = nome;
    }
    public saluta(String saluto){
        this.saluto = saluto;

    }
    //public String sayHello(){
    //    return saluto;
    //}
    public String sayHello(){
        return saluto +" "+ nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}