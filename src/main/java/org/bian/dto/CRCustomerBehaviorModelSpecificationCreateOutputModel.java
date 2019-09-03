package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorModelSpecificationCreateOutputModelCustomerBehaviorModelSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationCreateOutputModel
 */
public class CRCustomerBehaviorModelSpecificationCreateOutputModel   {
  private String customerBehaviorModelSpecificationInstanceReference = null;

  private String customerBehaviorModelSpecificationCreateActionReference = null;

  private Object customerBehaviorModelSpecificationCreateActionRecord = null;

  private String customerBehaviorModelSpecificationInstanceStatus = null;

  private CRCustomerBehaviorModelSpecificationCreateOutputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Behavior Model Specification instance 
   * @return customerBehaviorModelSpecificationInstanceReference
  **/

  public String getCustomerBehaviorModelSpecificationInstanceReference() {
    return customerBehaviorModelSpecificationInstanceReference;
  }

  public void setCustomerBehaviorModelSpecificationInstanceReference(String customerBehaviorModelSpecificationInstanceReference) {
    this.customerBehaviorModelSpecificationInstanceReference = customerBehaviorModelSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return customerBehaviorModelSpecificationCreateActionReference
  **/

  public String getCustomerBehaviorModelSpecificationCreateActionReference() {
    return customerBehaviorModelSpecificationCreateActionReference;
  }

  public void setCustomerBehaviorModelSpecificationCreateActionReference(String customerBehaviorModelSpecificationCreateActionReference) {
    this.customerBehaviorModelSpecificationCreateActionReference = customerBehaviorModelSpecificationCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return customerBehaviorModelSpecificationCreateActionRecord
  **/

  public Object getCustomerBehaviorModelSpecificationCreateActionRecord() {
    return customerBehaviorModelSpecificationCreateActionRecord;
  }

  public void setCustomerBehaviorModelSpecificationCreateActionRecord(Object customerBehaviorModelSpecificationCreateActionRecord) {
    this.customerBehaviorModelSpecificationCreateActionRecord = customerBehaviorModelSpecificationCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Behavior Model Specification instance (e.g. initialised, pending, active) 
   * @return customerBehaviorModelSpecificationInstanceStatus
  **/

  public String getCustomerBehaviorModelSpecificationInstanceStatus() {
    return customerBehaviorModelSpecificationInstanceStatus;
  }

  public void setCustomerBehaviorModelSpecificationInstanceStatus(String customerBehaviorModelSpecificationInstanceStatus) {
    this.customerBehaviorModelSpecificationInstanceStatus = customerBehaviorModelSpecificationInstanceStatus;
  }


  /**
   * Get customerBehaviorModelSpecificationInstanceRecord
   * @return customerBehaviorModelSpecificationInstanceRecord
  **/

  public CRCustomerBehaviorModelSpecificationCreateOutputModelCustomerBehaviorModelSpecificationInstanceRecord getCustomerBehaviorModelSpecificationInstanceRecord() {
    return customerBehaviorModelSpecificationInstanceRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceRecord(CRCustomerBehaviorModelSpecificationCreateOutputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord) {
    this.customerBehaviorModelSpecificationInstanceRecord = customerBehaviorModelSpecificationInstanceRecord;
  }


}

