package org.example;

import org.model.ConsignmentDetail;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.util.CommonFunctionUtils;
import org.util.FreightMnemonicNotFoundException;

import javax.validation.Valid;

@RestController
@Validated
public class FreightManagementController {

    @RequestMapping(value = "/generateConsignNo",method = RequestMethod.POST)
    public  String generateConsignmentNumber(@Valid @RequestBody ConsignmentDetail consignmentDetail){
        String generatedConsignmentNumber = "";
        try {
            CommonFunctionUtils.rangeValidation(consignmentDetail);

            generatedConsignmentNumber =
                    CommonFunctionUtils.getFreightCarrierMnemonic(consignmentDetail.getCarrierName())+consignmentDetail.getAccountNumber()
                    +CommonFunctionUtils.indexChange(consignmentDetail)+CommonFunctionUtils.
                            checksumCalculation(String.valueOf(consignmentDetail.getLastUsedIndex()+1));

        } catch (Exception | FreightMnemonicNotFoundException e) {
            return e.getMessage();
        }
        return generatedConsignmentNumber ;
    }
}
