package nopbaitap.tuan3.buoi6.bai2;

public class SinhVien {
    private int id;
    private String name;
    private float DLT;
    private float DTH;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setDLT(float DLT){
        this.DLT = DLT;
    }

    public float getDLT(){
        return DLT;
    }

    public void setDTH(float DTH){
        this.DTH = DTH;
    }

    public float getDTH(){
        return DTH;
    }

    public float DTB(){
        return (DLT*DTH)/2;
    }

    public String toString() {
        String str = "Ten: "+this.getName()+"Mssv: "+this.getId()+"DTB: "+this.DTB();
        return str;
    }
}
