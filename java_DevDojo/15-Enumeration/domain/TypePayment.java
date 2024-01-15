public enum TypePayment {
  DEBIT {
    @Override
    public double calculateDiscount(double price) {
      return price * 0.1;
    }
  },
  CREDIT {
    @Override
    public double calculateDiscount(double price) {
      return price * 0.05;
    }
  };

  public abstract double calculateDiscount(double price);
}
