package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorModelSpecificationExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecord;
import org.bian.dto.CRCustomerBehaviorModelSpecificationExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationExecuteInputModel
 */
public class CRCustomerBehaviorModelSpecificationExecuteInputModel   {
  private String customerBehaviorModelsServicingSessionReference = null;

  private String customerBehaviorModelSpecificationInstanceReference = null;

  private CRCustomerBehaviorModelSpecificationExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord = null;

  private Object customerBehaviorModelSpecificationExecuteActionTaskRecord = null;

  private CRCustomerBehaviorModelSpecificationExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRCustomerBehaviorModelSpecificationExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecord getCustomerBehaviorModelSpecificationInstanceRecord() {
    return customerBehaviorModelSpecificationInstanceRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceRecord(CRCustomerBehaviorModelSpecificationExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord) {
    this.customerBehaviorModelSpecificationInstanceRecord = customerBehaviorModelSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerBehaviorModelSpecificationExecuteActionTaskRecord
  **/

  public Object getCustomerBehaviorModelSpecificationExecuteActionTaskRecord() {
    return customerBehaviorModelSpecificationExecuteActionTaskRecord;
  }

  public void setCustomerBehaviorModelSpecificationExecuteActionTaskRecord(Object customerBehaviorModelSpecificationExecuteActionTaskRecord) {
    this.customerBehaviorModelSpecificationExecuteActionTaskRecord = customerBehaviorModelSpecificationExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustomerBehaviorModelSpecificationExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustomerBehaviorModelSpecificationExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

