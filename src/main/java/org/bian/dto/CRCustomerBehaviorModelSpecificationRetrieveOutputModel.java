package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceAnalysis;
import org.bian.dto.CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceRecord;
import org.bian.dto.CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationRetrieveOutputModel
 */
public class CRCustomerBehaviorModelSpecificationRetrieveOutputModel   {
  private CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord = null;

  private String customerBehaviorModelSpecificationRetrieveActionTaskReference = null;

  private Object customerBehaviorModelSpecificationRetrieveActionTaskRecord = null;

  private String customerBehaviorModelSpecificationRetrieveActionResponse = null;

  private CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceReportRecord customerBehaviorModelSpecificationInstanceReportRecord = null;

  private CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceAnalysis customerBehaviorModelSpecificationInstanceAnalysis = null;


  /**
   * Get customerBehaviorModelSpecificationInstanceRecord
   * @return customerBehaviorModelSpecificationInstanceRecord
  **/

  public CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceRecord getCustomerBehaviorModelSpecificationInstanceRecord() {
    return customerBehaviorModelSpecificationInstanceRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceRecord(CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord) {
    this.customerBehaviorModelSpecificationInstanceRecord = customerBehaviorModelSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Behavior Model Specification instance retrieve service call 
   * @return customerBehaviorModelSpecificationRetrieveActionTaskReference
  **/

  public String getCustomerBehaviorModelSpecificationRetrieveActionTaskReference() {
    return customerBehaviorModelSpecificationRetrieveActionTaskReference;
  }

  public void setCustomerBehaviorModelSpecificationRetrieveActionTaskReference(String customerBehaviorModelSpecificationRetrieveActionTaskReference) {
    this.customerBehaviorModelSpecificationRetrieveActionTaskReference = customerBehaviorModelSpecificationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerBehaviorModelSpecificationRetrieveActionResponse
  **/

  public String getCustomerBehaviorModelSpecificationRetrieveActionResponse() {
    return customerBehaviorModelSpecificationRetrieveActionResponse;
  }

  public void setCustomerBehaviorModelSpecificationRetrieveActionResponse(String customerBehaviorModelSpecificationRetrieveActionResponse) {
    this.customerBehaviorModelSpecificationRetrieveActionResponse = customerBehaviorModelSpecificationRetrieveActionResponse;
  }


  /**
   * Get customerBehaviorModelSpecificationInstanceReportRecord
   * @return customerBehaviorModelSpecificationInstanceReportRecord
  **/

  public CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceReportRecord getCustomerBehaviorModelSpecificationInstanceReportRecord() {
    return customerBehaviorModelSpecificationInstanceReportRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceReportRecord(CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceReportRecord customerBehaviorModelSpecificationInstanceReportRecord) {
    this.customerBehaviorModelSpecificationInstanceReportRecord = customerBehaviorModelSpecificationInstanceReportRecord;
  }


  /**
   * Get customerBehaviorModelSpecificationInstanceAnalysis
   * @return customerBehaviorModelSpecificationInstanceAnalysis
  **/

  public CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceAnalysis getCustomerBehaviorModelSpecificationInstanceAnalysis() {
    return customerBehaviorModelSpecificationInstanceAnalysis;
  }

  public void setCustomerBehaviorModelSpecificationInstanceAnalysis(CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceAnalysis customerBehaviorModelSpecificationInstanceAnalysis) {
    this.customerBehaviorModelSpecificationInstanceAnalysis = customerBehaviorModelSpecificationInstanceAnalysis;
  }


}

