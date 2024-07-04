package Lesson27;

public class COZDANIE {
    void marafon(int tem, int tempbega) throws PodvenytNiguException{
        if(tempbega > 12){
            throw new PodvenytNiguException("Temp bega bil slishkom vus: " + tempbega);
        }
        if (tem > 32){
            throw new SveloMishException();
        }
        System.out.println("You win");
    }

    public static void main(String[] args) {
        COZDANIE c = new COZDANIE();
        try {
            c.marafon(1,15);
        }
        catch (PodvenytNiguException e){
            System.out.println(e.getMessage() );
        }

    }
}

class PodvenytNiguException extends  Exception{
    PodvenytNiguException(String message){
        super(message);
    }
    PodvenytNiguException()  {};
}
class SveloMishException extends RuntimeException{
 SveloMishException(String message){
     super(message);
 }
 SveloMishException(){}
}