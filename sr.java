class Hoaqua
{
    String hinhdang;
    String nguoitrong;
    int doanhthu;
    Hoaqua(String hinhdang, String nguoitrong, int doanhthu)
{
        this.hinhdang = hinhdang;
        this.nguoitrong = nguoitrong;
        this.doanhthu = doanhthu;
    }
}
class Quacam extends Hoaqua
{
    int giaban1can;
    String nguongoc;
    int ngaynhap;
    int soluong;
    Quacam(String hinhdang, String nguoitrong, int doanhthu)
{
       this.hinhdang = hinhdang;
        this.nguoitrong = nguoitrong;
        this.doanhthu = doanhthu; 
    }
    Quacam(String hinhdang, String nguoitrong, int doanhthu,int giaban1can, String nguongoc, int ngaynhap, int soluong)
{
        super(hinhdang, nguoitrong, doanhthu);
        this.giaban1can = giaban1can;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
}
class Quatao extends Hoaqua
{
    int giaban1can;
    String nguongoc;
    int ngaynhap;
    int soluong;
    Quatao(String hinhdang, String nguoitrong, int doanhthu)
{
         this.hinhdang = hinhdang;
        this.nguoitrong = nguoitrong;
        this.doanhthu = doanhthu;
    }
    Quatao(String hinhdang, String nguoitrong, int doanhthu, int giaban1can, String nguongoc, int ngaynhap, int soluong)
{
        super(hinhdang, nguoitrong, doanhthu);
        this.giaban1can = giaban1can;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
}
class Camcaophong extends Hoaqua
{
    int giaban1can;
    String nguongoc;
    int ngaynhap;
    int soluong;
    Camcaophong(String hinhdang, String nguoitrong, int doanhthu)
{
         this.hinhdang = hinhdang;
        this.nguoitrong = nguoitrong;
        this.doanhthu = doanhthu;
    }
    Camcaophong(String hinhdang, String nguoitrong, int doanhthu,int giaban1can, String nguongoc, int ngaynhap, int soluong)
{
        super(hinhdang, nguoitrong, doanhthu);
        this.giaban1can = giaban1can;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
}
class Camsanh extends Quacam
{
    int giaban1can;
    String nguongoc;
    int ngaynhap;
    int soluong;
    Camsanh(String hinhdang, String nguoitrong, int doanhthu)
{
        this.hinhdang = hinhdang;
        this.nguoitrong = nguoitrong;
        this.doanhthu = doanhthu;
    }
    Camsanh(String hinhdang, String nguoitrong, int doanhthu,int giaban1can, String nguongoc, int ngaynhap, int soluong)
{
         this.hinhdang = hinhdang;
        this.nguoitrong = nguoitrong;
        this.doanhthu = doanhthu;
        this.giaban1can = giaban1can;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
}
{
    public static void main(String[]args)
{
        Quacam qua1 = new Quacam ("Quacam");
    System.out.println("Hinh dang: "+qua1.hinhdang+");
        Quatao qua2 = new Quatao ("Quatao");
    System.out.println("Hinh dang: "+qua2.hinhdang+");
        Camcaophong qua3 = new Camcaophong("Camcaophong");
    System.out.println("Hinh dang: "+qua3.hinhdang+");
        Camsanh qua4 = new Camsanh("Cam sanh");
        System.out.println("Hinh dang: "+qua4.hinhdang+");
    }
}