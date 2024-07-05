package Homework.Lesson28;

public class Ex {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("eto inner finnally block");
            }
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }


    }
class NeMyasoException extends RuntimeException{
    NeMyasoException(String message){
            super(message);
    }
}
class NeVodaException extends Exception{
    NeVodaException(String message){
        super(message);
    }
}

class Tiger{
    void  eat(String y)throws NeMyasoException{

        if (!y.equals("myaso")) {
            throw new NeMyasoException("Tiger ye est " + y);

        }  System.out.println("Tiger est miyaso");



    }
    void drink(String y)throws NeVodaException{
        if (!y.equals("voda")){
            throw  new NeVodaException("Tiger ne pyot " + y);
        }
        System.out.println("Tiger pyet vodu");

    }
}

