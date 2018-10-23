package hello.domain;

public class TransactionRequest {
    private String txnReference;
    private long cardNumber;
    private double amount;

    public TransactionRequest(String txnReferrence, long cardNumber, double amount) {
        this.txnReference = txnReferrence;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public String getTxnReference() {
        return txnReference;
    }

    public void setTxnReference(String txnReference) {
        this.txnReference = txnReference;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
