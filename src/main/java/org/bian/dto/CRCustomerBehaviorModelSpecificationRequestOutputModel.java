package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorModelSpecificationRequestOutputModelCustomerBehaviorModelSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationRequestOutputModel
 */
public class CRCustomerBehaviorModelSpecificationRequestOutputModel   {
  private CRCustomerBehaviorModelSpecificationRequestOutputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord = null;

  private String customerBehaviorModelSpecificationRequestActionTaskReference = null;

  private Object customerBehaviorModelSpecificationRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get customerBehaviorModelSpecificationInstanceRecord
   * @return customerBehaviorModelSpecificationInstanceRecord
  **/

  public CRCustomerBehaviorModelSpecificationRequestOutputModelCustomerBehaviorModelSpecificationInstanceRecord getCustomerBehaviorModelSpecificationInstanceRecord() {
    return customerBehaviorModelSpecificationInstanceRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceRecord(CRCustomerBehaviorModelSpecificationRequestOutputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord) {
    this.customerBehaviorModelSpecificationInstanceRecord = customerBehaviorModelSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Behavior Model Specification instance request service call 
   * @return customerBehaviorModelSpecificationRequestActionTaskReference
  **/

  public String getCustomerBehaviorModelSpecificationRequestActionTaskReference() {
    return customerBehaviorModelSpecificationRequestActionTaskReference;
  }

  public void setCustomerBehaviorModelSpecificationRequestActionTaskReference(String customerBehaviorModelSpecificationRequestActionTaskReference) {
    this.customerBehaviorModelSpecificationRequestActionTaskReference = customerBehaviorModelSpecificationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerBehaviorModelSpecificationRequestActionTaskRecord
  **/

  public Object getCustomerBehaviorModelSpecificationRequestActionTaskRecord() {
    return customerBehaviorModelSpecificationRequestActionTaskRecord;
  }

  public void setCustomerBehaviorModelSpecificationRequestActionTaskRecord(Object customerBehaviorModelSpecificationRequestActionTaskRecord) {
    this.customerBehaviorModelSpecificationRequestActionTaskRecord = customerBehaviorModelSpecificationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

