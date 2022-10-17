package org.util;

import org.model.ConsignmentDetail;

public class CommonFunctionUtils {
    private static String leftPadding(String paddingValue,String tobePadded,int size){
        return  String.format("%"+paddingValue+size+"d" , Integer.parseInt(tobePadded));
    }

    public static String getFreightCarrierMnemonic(String carrierName) throws  FreightMnemonicNotFoundException {
        switch(carrierName){
            case CommonConstants.Freight1 :
                return "FMCC";
            default:
                throw new FreightMnemonicNotFoundException();
        }
    }

    public  static String indexChange(ConsignmentDetail consignmentDetail){
        return leftPadding("0",String.valueOf(consignmentDetail.getLastUsedIndex()+1),consignmentDetail.getDigits());
    }

    public static void  rangeValidation(ConsignmentDetail consignmentDetail) throws Exception {
        int indexIncremented = consignmentDetail.getLastUsedIndex()+1;
        int fromRange = consignmentDetail.getRangeStart();
        int toRange = consignmentDetail.getRangeEnd();

        if (indexIncremented < fromRange || indexIncremented > toRange) {
                throw new Exception("index should be within "+fromRange+" and "+toRange);
        }
    }

    public static Integer checksumCalculation(String indexValue){

        int[] digits = indexValue.chars().map(c -> c-'0').toArray();
        int size =digits.length;
        int firstValue = 0;
        int secondValue = 0;
        for(int i=size-1;i>=0;i--){
            firstValue+=digits[i];
            i--;
        }
        firstValue=firstValue*3;
        for(int i=size-2;i>=0;i--){
            secondValue+=digits[i];
            i--;
        }
        secondValue= secondValue*7;
        int sumValue = firstValue+secondValue;

        int checksum = 10-(sumValue%10);
        return checksum;
    }

}
