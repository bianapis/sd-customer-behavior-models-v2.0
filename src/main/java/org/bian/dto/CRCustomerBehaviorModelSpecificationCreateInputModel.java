package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationCreateInputModel
 */
public class CRCustomerBehaviorModelSpecificationCreateInputModel   {
  private String customerBehaviorModelsServicingSessionReference = null;

  private Object customerBehaviorModelSpecificationCreateActionRecord = null;

  private String customerBehaviorModelSpecificationInstanceStatus = null;

  private CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerBehaviorModelsServicingSessionReference
  **/

  public String getCustomerBehaviorModelsServicingSessionReference() {
    return customerBehaviorModelsServicingSessionReference;
  }

  public void setCustomerBehaviorModelsServicingSessionReference(String customerBehaviorModelsServicingSessionReference) {
    this.customerBehaviorModelsServicingSessionReference = customerBehaviorModelsServicingSessionReference;
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

  public CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecord getCustomerBehaviorModelSpecificationInstanceRecord() {
    return customerBehaviorModelSpecificationInstanceRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceRecord(CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord) {
    this.customerBehaviorModelSpecificationInstanceRecord = customerBehaviorModelSpecificationInstanceRecord;
  }


}

