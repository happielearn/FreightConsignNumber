package org.model;


import javax.validation.constraints.*;

public class ConsignmentDetail {

    @NotEmpty(message = " carrierName cannot be null or empty ")
    private String carrierName ;
    @NotEmpty(message = " accountNumber cannot be null or empty")
    private String accountNumber ;
    @NotNull(message = " digits cannot be null ")
    @Max(100)
    @Min(10)
    private int digits ;
    @NotNull
    private int lastUsedIndex ;
    @NotNull(message = " rangeStart cannot be null ")
    private int rangeStart ;
    @NotNull(message = "rangeEnd cannot be null ")
    private int rangeEnd ;

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getDigits() {
        return digits;
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public int getLastUsedIndex() {
        return lastUsedIndex;
    }

    public void setLastUsedIndex(int lastUsedIndex) {
        this.lastUsedIndex = lastUsedIndex;
    }

    public int getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(int rangeStart) {
        this.rangeStart = rangeStart;
    }

    public int getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(int rangeEnd) {
        this.rangeEnd = rangeEnd;
    }
}
