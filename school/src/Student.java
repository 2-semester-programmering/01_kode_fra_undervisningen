public class Student {

    // Data, attributter, Fields - Tilstand
    private int cpr;  // 221080-8888  3112808888
    private String navn;
    private int age;


    // Methoder - handlinger

    public int getCpr() {
        return cpr;
    }

    public void setCpr(int cpr) {
        if(cpr == 1234){
            this.cpr = cpr;
        }
        else {
            this.cpr =9999;
        }
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
