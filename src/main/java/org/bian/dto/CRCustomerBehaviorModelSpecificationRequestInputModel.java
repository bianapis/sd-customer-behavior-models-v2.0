package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorModelSpecificationRequestInputModelCustomerBehaviorModelSpecificationInstanceRecord;
import org.bian.dto.CRCustomerBehaviorModelSpecificationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationRequestInputModel
 */
public class CRCustomerBehaviorModelSpecificationRequestInputModel   {
  private String customerBehaviorModelsServicingSessionReference = null;

  private String customerBehaviorModelSpecificationInstanceReference = null;

  private CRCustomerBehaviorModelSpecificationRequestInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord = null;

  private Object customerBehaviorModelSpecificationRequestActionTaskRecord = null;

  private CRCustomerBehaviorModelSpecificationRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get customerBehaviorModelSpecificationInstanceRecord
   * @return customerBehaviorModelSpecificationInstanceRecord
  **/

  public CRCustomerBehaviorModelSpecificationRequestInputModelCustomerBehaviorModelSpecificationInstanceRecord getCustomerBehaviorModelSpecificationInstanceRecord() {
    return customerBehaviorModelSpecificationInstanceRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceRecord(CRCustomerBehaviorModelSpecificationRequestInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord) {
    this.customerBehaviorModelSpecificationInstanceRecord = customerBehaviorModelSpecificationInstanceRecord;
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

