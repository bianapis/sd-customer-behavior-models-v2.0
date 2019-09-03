package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorModelSpecificationExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationExecuteOutputModel
 */
public class CRCustomerBehaviorModelSpecificationExecuteOutputModel   {
  private CRCustomerBehaviorModelSpecificationExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord = null;

  private String customerBehaviorModelSpecificationExecuteActionTaskReference = null;

  private Object customerBehaviorModelSpecificationExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get customerBehaviorModelSpecificationInstanceRecord
   * @return customerBehaviorModelSpecificationInstanceRecord
  **/

  public CRCustomerBehaviorModelSpecificationExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecord getCustomerBehaviorModelSpecificationInstanceRecord() {
    return customerBehaviorModelSpecificationInstanceRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceRecord(CRCustomerBehaviorModelSpecificationExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord) {
    this.customerBehaviorModelSpecificationInstanceRecord = customerBehaviorModelSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Behavior Model Specification instance execute service call 
   * @return customerBehaviorModelSpecificationExecuteActionTaskReference
  **/

  public String getCustomerBehaviorModelSpecificationExecuteActionTaskReference() {
    return customerBehaviorModelSpecificationExecuteActionTaskReference;
  }

  public void setCustomerBehaviorModelSpecificationExecuteActionTaskReference(String customerBehaviorModelSpecificationExecuteActionTaskReference) {
    this.customerBehaviorModelSpecificationExecuteActionTaskReference = customerBehaviorModelSpecificationExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

