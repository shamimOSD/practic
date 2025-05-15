package ch9;

class GrandFather {
    int gage;
    String gname;
    public GrandFather(int gage,String gname){
        this.gage=gage;
        this.gname=gname;


    }
}
class father extends GrandFather{
    String fname;
    int fage;
    public father (int gage,String gname,int fage,String fname){
        super(gage,gname);
        this.fname=fname;
        this.fage=fage;


    }
}
class Son extends father{


    int age ;
    String name;
    public Son(int gage, String gname, int fage, String fname, int age, String name){
        super(gage,gname,fage,fname);
        this.name=name;
        this.age=age;

    }
    void printDetails(){
        System.out.println(gname+" "+ gage+" ");
        System.out.println(fname+" "+ fage+" ");
        System.out.println(name+" "+ age+" ");
    }

    public static void main(String[] args) {
        Son son=new Son(88,"Adom Ali Sarkar",47,"Ibrahim Khalil",24,"Rasel");
        son.printDetails();
    }
}