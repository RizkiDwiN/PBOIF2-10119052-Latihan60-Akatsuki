package pboif2.pkg10119052.latihan60.akatsuki;

/**
 *
 * @author Kiki
 */
public class AnggotaAkatsuki extends Akatsuki{
     @Override
    public void tampil() {
      switch(getNama()){
          case "itachi":
        System.out.println("+= Anggota Akatsuki =+");
        System.out.println("Nama : "+getNama());
        System.out.println("asal : konohagakure");
        System.out.println("status :  Sudah Meninggal");
        System.out.println("Ciri khas : Berambut belah tengah, ahli dalam Genjutsu, memakai sharingan dan mangekyo sharingan");
       break;
          case "yahiko":
        System.out.println("+= Anggota Akatsuki =+");;
        System.out.println("Nama : "+getNama());
        System.out.println("asal :  Amegakure");
        System.out.println("status : Sudah Meninggal dan mayatnya dikendalikan oleh nagato");
        System.out.println("Ciri khas : Memiliki besi hitam berupa tindikan di hampir seluruh tubuh, rambut berwarna jingga.");
        System.out.println("Jurus : Rine Tensei, Shinra Tensei, BanshoTein, Chibaku Tensei, Kuchiyose, Dan jurus Rine lainnya");  
      break;
         case"tobi":
        System.out.println("+= Anggota Akatsuki =+");
        System.out.println("Nama : "+getNama());
        System.out.println("asal :  konohagakure");
        System.out.println("status : Sudah Meninggal ");
        System.out.println("Ciri khas : Topeng jingga dengan satu lubang mata dengan pola pusaran yang terpusat pada mata kanan. ");
        System.out.println("Mata kanannya memiliki Sharingan dan topeng putih dengan tiga lubang dengan titik di tengah mirip seperti \"Sharingan\".");
        System.out.println( "Saat perang dunia shinobi keempat"
                + ", mata kirinya berupa rinnegan.");  
       break;
        case"deidara":
        System.out.println("+= Anggota Akatsuki =+");
        System.out.println("Nama : "+getNama());
        System.out.println("asal : Iwagakure ");
        System.out.println("status : Sudah Meninggal");
        System.out.println("Rekan kerja : sasori,kemudian tobi");
        System.out.println("Ciri khas : Berambut pirang dan dikuncir, spesialis ledakan menggunakan tanah liat dengan mulut di telapak tangan dan dada");      
        break;
        case"hidan":
        System.out.println("+= Anggota Akatsuki =+");
        System.out.println("Nama : "+getNama());
        System.out.println("asal : yugakure ");
        System.out.println("status : Lumpuh");
        System.out.println("Rekan kerja : kakuzu");
        System.out.println("Ciri khas : Tidak bisa Mati, membawa sabit besar bermata tiga, rambut cepak berwarna pucat");      
        break;
        case"kakuzu" :
        System.out.println("+= Anggota Akatsuki =+");
        System.out.println("Nama : "+getNama());
        System.out.println("asal : Takigakure ");
        System.out.println("status : Sudah Meninggal");
        System.out.println("Rekan kerja : hidan");
        System.out.println("Ciri khas : Memakai penutup wajah, dapat memperpanjang hidupnya dengan cara mengambil jantung manusia");      
        break;
        case"kisame" :
        System.out.println("+= Anggota Akatsuki =+");
        System.out.println("Nama : "+getNama());
        System.out.println("asal : Kirigakure ");
        System.out.println("status : Sudah Meninggal");
        System.out.println("Rekan kerja : itachi ");
        System.out.println("Ciri khas : Memiliki Kulit seperti ikan hiu, bergigi seperti ikan hiu.");      
        break;
         case"sasori" :
        System.out.println("+= Anggota Akatsuki =+");
        System.out.println("Nama : "+getNama());
        System.out.println("asal :  Sunagakure ");
        System.out.println("status : Sudah Meninggal");
        System.out.println("Rekan kerja : deidara ");
        System.out.println("Ciri khas : Berambut pendek berwarna merah. Bertubuh boneka sehingga tidak bisa menua. Ahli racun.");      
        break; 
         case"konan" :
        System.out.println("+= Anggota Akatsuki =+");
        System.out.println("Nama : "+getNama());
        System.out.println("asal :  Amegakure ");
        System.out.println("status : Sudah Meninggal ");
        System.out.println("Rekan kerja : yahiko & nagato ");
        System.out.println("Ciri khas : Memiliki aksesoris origami bunga di kepala, berambut biru.");      
        break; 
        case"nagato" :
        System.out.println("+= Anggota Akatsuki =+");
        System.out.println("Nama : "+getNama());
        System.out.println("asal :  Amegakure ");
        System.out.println("status : Sudah Meninggal ");
        System.out.println("Kepemilikan : 7 pain ");
        System.out.println("Ciri khas : Memiliki rambut berwarna merah dengan mata rineggan dan mengendalikan 7 pain.");      
        break;
        case"zetsu" :
        System.out.println("+= Anggota Akatsuki =+");
        System.out.println("Nama : "+getNama());
        System.out.println("asal :  Tidak DIketahui");
        System.out.println("status : Masih hidup hingga episode boruto");
        System.out.println("Ciri khas : Memiliki dua belah jiwa yaitu zetsu putih dan hitam");      
        break;     
          default:
        System.out.println("Nama anggota akatsuki yang anda cari tidak ada, mohon periksa kembali nama anggotanya!");
    }
    
    
    }  
}
