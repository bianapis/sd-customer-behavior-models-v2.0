package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsRequestInputModelCustomerBehaviorModelSpecificationInstanceRecord;
import org.bian.dto.BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord;
import org.bian.dto.CRCustomerBehaviorModelSpecificationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRequestInputModel
 */
public class BQFunctionalRequirementsRequestInputModel   {
  private BQFunctionalRequirementsRequestInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord = null;

  private String customerBehaviorModelSpecificationInstanceReference = null;

  private String functionalRequirementsInstanceReference = null;

  private BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord = null;

  private Object functionalRequirementsRequestActionTaskRecord = null;

  private CRCustomerBehaviorModelSpecificationRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get customerBehaviorModelSpecificationInstanceRecord
   * @return customerBehaviorModelSpecificationInstanceRecord
  **/

  public BQFunctionalRequirementsRequestInputModelCustomerBehaviorModelSpecificationInstanceRecord getCustomerBehaviorModelSpecificationInstanceRecord() {
    return customerBehaviorModelSpecificationInstanceRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceRecord(BQFunctionalRequirementsRequestInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord) {
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

  public BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord getFunctionalRequirementsInstanceRecord() {
    return functionalRequirementsInstanceRecord;
  }

  public void setFunctionalRequirementsInstanceRecord(BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord) {
    this.functionalRequirementsInstanceRecord = functionalRequirementsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return functionalRequirementsRequestActionTaskRecord
  **/

  public Object getFunctionalRequirementsRequestActionTaskRecord() {
    return functionalRequirementsRequestActionTaskRecord;
  }

  public void setFunctionalRequirementsRequestActionTaskRecord(Object functionalRequirementsRequestActionTaskRecord) {
    this.functionalRequirementsRequestActionTaskRecord = functionalRequirementsRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerBehaviorModelSpecificationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerBehaviorModelSpecificationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

