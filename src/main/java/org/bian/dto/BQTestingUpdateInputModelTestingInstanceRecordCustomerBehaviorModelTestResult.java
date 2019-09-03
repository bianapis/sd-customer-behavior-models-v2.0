package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingUpdateInputModelTestingInstanceRecordCustomerBehaviorModelTestResult
 */
public class BQTestingUpdateInputModelTestingInstanceRecordCustomerBehaviorModelTestResult   {
  private String customerBehaviorModelTestingTaskReference = null;

  private Object customerBehaviorModelTestingTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a type of testing activity 
   * @return customerBehaviorModelTestingTaskReference
  **/

  public String getCustomerBehaviorModelTestingTaskReference() {
    return customerBehaviorModelTestingTaskReference;
  }

  public void setCustomerBehaviorModelTestingTaskReference(String customerBehaviorModelTestingTaskReference) {
    this.customerBehaviorModelTestingTaskReference = customerBehaviorModelTestingTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of work products used for this testing activity 
   * @return customerBehaviorModelTestingTaskRecord
  **/

  public Object getCustomerBehaviorModelTestingTaskRecord() {
    return customerBehaviorModelTestingTaskRecord;
  }

  public void setCustomerBehaviorModelTestingTaskRecord(Object customerBehaviorModelTestingTaskRecord) {
    this.customerBehaviorModelTestingTaskRecord = customerBehaviorModelTestingTaskRecord;
  }


}

