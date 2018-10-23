package hello.domain;

public class TransactionResponse {
    private String txnReference;
    private boolean txnStatus;

    public TransactionResponse(String txnReference, boolean txnStatus) {
        this.txnReference = txnReference;
        this.txnStatus = txnStatus;
    }

    public String getTxnReference() {
        return txnReference;
    }

    public void setTxnReference(String txnReference) {
        this.txnReference = txnReference;
    }

    public boolean isTxnStatus() {
        return txnStatus;
    }

    public void setTxnStatus(boolean txnStatus) {
        this.txnStatus = txnStatus;
    }
}
