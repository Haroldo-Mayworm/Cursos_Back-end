package enumeracao.domain;

public enum TypePayment {
    DEBITO {
        @Override
        public double calculateDiscount(double price) {
            return price * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calculateDiscount(double price) {
            return price * 0.05;
        }
    };

    public abstract double calculateDiscount(double price);
}