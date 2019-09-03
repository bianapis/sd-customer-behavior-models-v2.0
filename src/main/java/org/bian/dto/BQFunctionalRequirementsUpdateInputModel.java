package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsUpdateInputModelCustomerBehaviorModelSpecificationInstanceRecord;
import org.bian.dto.BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsUpdateInputModel
 */
public class BQFunctionalRequirementsUpdateInputModel   {
  private BQFunctionalRequirementsUpdateInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord = null;

  private String customerBehaviorModelSpecificationInstanceReference = null;

  private String functionalRequirementsInstanceReference = null;

  private BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord = null;

  private Object functionalRequirementsUpdateActionTaskRecord = null;

  private String functionalRequirementsUpdateActionRequest = null;


  /**
   * Get customerBehaviorModelSpecificationInstanceRecord
   * @return customerBehaviorModelSpecificationInstanceRecord
  **/

  public BQFunctionalRequirementsUpdateInputModelCustomerBehaviorModelSpecificationInstanceRecord getCustomerBehaviorModelSpecificationInstanceRecord() {
    return customerBehaviorModelSpecificationInstanceRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceRecord(BQFunctionalRequirementsUpdateInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord) {
    this.customerBehaviorModelSpecificationInstanceRecord = customerBehaviorModelSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Behavior Model Specification instance 
   * @return customerBehaviorModelSpecificationInstanceReference
  **/

  public String getCustomerBehaviorModelSpecificationInstanceReference() {
    return customerBehaviorModelSpecificationInstanceReference;
  }

  public void setCustomerBehaviorModelSpecificationInstanceReference(String customerBehaviorModelSpecificationInstanceReference) {
    this.customerBehaviorModelSpecificationInstanceReference = customerBehaviorModelSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Requirements instance 
   * @return functionalRequirementsInstanceReference
  **/

  public String getFunctionalRequirementsInstanceReference() {
    return functionalRequirementsInstanceReference;
  }

  public void setFunctionalRequirementsInstanceReference(String functionalRequirementsInstanceReference) {
    this.functionalRequirementsInstanceReference = functionalRequirementsInstanceReference;
  }


  /**
   * Get functionalRequirementsInstanceRecord
   * @return functionalRequirementsInstanceRecord
  **/

  public BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord getFunctionalRequirementsInstanceRecord() {
    return functionalRequirementsInstanceRecord;
  }

  public void setFunctionalRequirementsInstanceRecord(BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord) {
    this.functionalRequirementsInstanceRecord = functionalRequirementsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return functionalRequirementsUpdateActionTaskRecord
  **/

  public Object getFunctionalRequirementsUpdateActionTaskRecord() {
    return functionalRequirementsUpdateActionTaskRecord;
  }

  public void setFunctionalRequirementsUpdateActionTaskRecord(Object functionalRequirementsUpdateActionTaskRecord) {
    this.functionalRequirementsUpdateActionTaskRecord = functionalRequirementsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return functionalRequirementsUpdateActionRequest
  **/

  public String getFunctionalRequirementsUpdateActionRequest() {
    return functionalRequirementsUpdateActionRequest;
  }

  public void setFunctionalRequirementsUpdateActionRequest(String functionalRequirementsUpdateActionRequest) {
    this.functionalRequirementsUpdateActionRequest = functionalRequirementsUpdateActionRequest;
  }


}

