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

//2 --
    interface Shape{
        double getArea();
    }

    class Circle implements Shape{
        private double radius;

        public Circle(double radius){this.radius=radius}

        @Override
        public double getArea(){

        }
    }

}