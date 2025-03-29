import javax.xml.crypto.Data;

public class Main {
   /* 1 --principio de responsabilidad unica: deberia separar la impresion del invoice
-- principio de inversion de dependencias: no deberia printear con sout deberia devolvver un string
*/
    class Invoice {
        private double amount;

        public Invoice(double amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }

    class InvoicePrinter {
        public String printInvoice(Invoice invoice) {
            return "Factura por: " + invoice.getAmount();
        }
    }

//2 -- srp y ocp
    interface Shape{
        double getArea();
    }

    class Circle implements Shape{
        private double radius;

        public Circle(double radius){this.radius=radius}

        @Override
        public double getArea(){
            double result=Math.pow(Math.PI*this.radius,2);
            return  result;
        }

    }

    class Square implements Shape{

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            double result=this.side*this.side;
            return result;
        }
    }
//3 lsp, isp
    abstract class Animal{
        private String name;

    public Animal(String name) {
        this.name = name;
    }
}
    interface Flyable{
        String fly();
}
interface Walker{
        String walk();
}
interface Swimmer{
        String swim();
}
class Sparrow extends Animal implements Flyable{
    private String race;

    public Sparrow(String name, String race) {
        super(name);
        this.race=race;
    }

    @Override
    public String fly() {
        return "Starts flying";
    }
}
class Penguin extends Animal implements Walker,Swimmer{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public String swim() {
        return "Starts swimming";
    }

    @Override
    public String walk() {
        return "Starts walking";
    }
}

//4 isp

    interface Workable{
        String work();
    }
    interface Eatable{
        String eat();
    }
    class worker implements Workable,Eatable{

        @Override
        public String eat() {
            return "Starts eating";
        }

        @Override
        public String work() {
            return "Starts working";
        }
    }
    class robot implements Workable{

        @Override
        public String work() {
            return "Starts working";
        }
    }

//5 dip

    interface DataBase{
         String connect();
    }

    class MySqlDB implements DataBase{

        @Override
        public String connect() {
            return "Connecting to MySQL";
        }
    }
    class App{
        private DataBase DB;

        public App(DataBase DB) {
            this.DB = DB;
        }

        public void start(){
            System.out.println(DB.connect());
        }
    }
}