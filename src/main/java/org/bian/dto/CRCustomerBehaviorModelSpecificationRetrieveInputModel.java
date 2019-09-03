package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceAnalysis;
import org.bian.dto.CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationRetrieveInputModel
 */
public class CRCustomerBehaviorModelSpecificationRetrieveInputModel   {
  private Object customerBehaviorModelSpecificationRetrieveActionTaskRecord = null;

  private String customerBehaviorModelSpecificationRetrieveActionRequest = null;

  private CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceReportRecord customerBehaviorModelSpecificationInstanceReportRecord = null;

  private CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceAnalysis customerBehaviorModelSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerBehaviorModelSpecificationRetrieveActionTaskRecord
  **/

  public Object getCustomerBehaviorModelSpecificationRetrieveActionTaskRecord() {
    return customerBehaviorModelSpecificationRetrieveActionTaskRecord;
  }

  public void setCustomerBehaviorModelSpecificationRetrieveActionTaskRecord(Object customerBehaviorModelSpecificationRetrieveActionTaskRecord) {
    this.customerBehaviorModelSpecificationRetrieveActionTaskRecord = customerBehaviorModelSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerBehaviorModelSpecificationRetrieveActionRequest
  **/

  public String getCustomerBehaviorModelSpecificationRetrieveActionRequest() {
    return customerBehaviorModelSpecificationRetrieveActionRequest;
  }

  public void setCustomerBehaviorModelSpecificationRetrieveActionRequest(String customerBehaviorModelSpecificationRetrieveActionRequest) {
    this.customerBehaviorModelSpecificationRetrieveActionRequest = customerBehaviorModelSpecificationRetrieveActionRequest;
  }


  /**
   * Get customerBehaviorModelSpecificationInstanceReportRecord
   * @return customerBehaviorModelSpecificationInstanceReportRecord
  **/

  public CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceReportRecord getCustomerBehaviorModelSpecificationInstanceReportRecord() {
    return customerBehaviorModelSpecificationInstanceReportRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceReportRecord(CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceReportRecord customerBehaviorModelSpecificationInstanceReportRecord) {
    this.customerBehaviorModelSpecificationInstanceReportRecord = customerBehaviorModelSpecificationInstanceReportRecord;
  }


  /**
   * Get customerBehaviorModelSpecificationInstanceAnalysis
   * @return customerBehaviorModelSpecificationInstanceAnalysis
  **/

  public CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceAnalysis getCustomerBehaviorModelSpecificationInstanceAnalysis() {
    return customerBehaviorModelSpecificationInstanceAnalysis;
  }

  public void setCustomerBehaviorModelSpecificationInstanceAnalysis(CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceAnalysis customerBehaviorModelSpecificationInstanceAnalysis) {
    this.customerBehaviorModelSpecificationInstanceAnalysis = customerBehaviorModelSpecificationInstanceAnalysis;
  }


}

