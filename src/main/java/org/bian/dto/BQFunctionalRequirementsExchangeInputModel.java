package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsExchangeInputModelFunctionalRequirementsExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsExchangeInputModel
 */
public class BQFunctionalRequirementsExchangeInputModel   {
  private String customerBehaviorModelSpecificationInstanceReference = null;

  private String functionalRequirementsInstanceReference = null;

  private Object functionalRequirementsExchangeActionTaskRecord = null;

  private BQFunctionalRequirementsExchangeInputModelFunctionalRequirementsExchangeActionRequest functionalRequirementsExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return functionalRequirementsExchangeActionTaskRecord
  **/

  public Object getFunctionalRequirementsExchangeActionTaskRecord() {
    return functionalRequirementsExchangeActionTaskRecord;
  }

  public void setFunctionalRequirementsExchangeActionTaskRecord(Object functionalRequirementsExchangeActionTaskRecord) {
    this.functionalRequirementsExchangeActionTaskRecord = functionalRequirementsExchangeActionTaskRecord;
  }


  /**
   * Get functionalRequirementsExchangeActionRequest
   * @return functionalRequirementsExchangeActionRequest
  **/

  public BQFunctionalRequirementsExchangeInputModelFunctionalRequirementsExchangeActionRequest getFunctionalRequirementsExchangeActionRequest() {
    return functionalRequirementsExchangeActionRequest;
  }

  public void setFunctionalRequirementsExchangeActionRequest(BQFunctionalRequirementsExchangeInputModelFunctionalRequirementsExchangeActionRequest functionalRequirementsExchangeActionRequest) {
    this.functionalRequirementsExchangeActionRequest = functionalRequirementsExchangeActionRequest;
  }


}

