package ba.unsa.etf.rpr;

public class Artikl {
  prtivate String naziv, kod;
  private int cijena;
  
  public Artikl(String naziv, String kod, int cijena){
    setNaziv(naziv);
    setKod(kod);
    setCijena(cijena);
  }
  
  public String getNaziv(){
    return naziv;
  }
  
  public String getKod(){
    return kod;
  }
  
  public int getCijena(){
    return cijena;
  }
  
  public void setNaziv(String naziv){
    this.naziv=naziv;
  }
  
   public void setKod(String kod){
    this.kod=kod;
  }
  
   public void setCijena(int cijena){
    this.cijena=cijena;
  }
  
  
}
