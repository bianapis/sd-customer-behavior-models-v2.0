package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecord;
import org.bian.dto.CRCustomerBehaviorModelSpecificationExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteInputModel
 */
public class BQProductionExecuteInputModel   {
  private BQProductionExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord = null;

  private String customerBehaviorModelSpecificationInstanceReference = null;

  private String productionInstanceReference = null;

  private Object productionExecuteActionTaskRecord = null;

  private CRCustomerBehaviorModelSpecificationExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * Get customerBehaviorModelSpecificationInstanceRecord
   * @return customerBehaviorModelSpecificationInstanceRecord
  **/

  public BQProductionExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecord getCustomerBehaviorModelSpecificationInstanceRecord() {
    return customerBehaviorModelSpecificationInstanceRecord;
  }

  public void setCustomerBehaviorModelSpecificationInstanceRecord(BQProductionExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecord customerBehaviorModelSpecificationInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production instance 
   * @return productionInstanceReference
  **/

  public String getProductionInstanceReference() {
    return productionInstanceReference;
  }

  public void setProductionInstanceReference(String productionInstanceReference) {
    this.productionInstanceReference = productionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return productionExecuteActionTaskRecord
  **/

  public Object getProductionExecuteActionTaskRecord() {
    return productionExecuteActionTaskRecord;
  }

  public void setProductionExecuteActionTaskRecord(Object productionExecuteActionTaskRecord) {
    this.productionExecuteActionTaskRecord = productionExecuteActionTaskRecord;
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

