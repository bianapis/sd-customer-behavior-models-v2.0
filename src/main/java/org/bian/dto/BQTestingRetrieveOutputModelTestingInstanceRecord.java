package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingRetrieveOutputModelTestingInstanceRecordCustomerBehaviorModelTestResult;

import javax.validation.Valid;
  
/**
 * BQTestingRetrieveOutputModelTestingInstanceRecord
 */
public class BQTestingRetrieveOutputModelTestingInstanceRecord   {
  private String customerBehaviorModelTestReference = null;

  private String customerBehaviorModelTestType = null;

  private String customerBehaviorModelTestHarnessReference = null;

  private BQTestingRetrieveOutputModelTestingInstanceRecordCustomerBehaviorModelTestResult customerBehaviorModelTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a type of test 
   * @return customerBehaviorModelTestReference
  **/

  public String getCustomerBehaviorModelTestReference() {
    return customerBehaviorModelTestReference;
  }

  public void setCustomerBehaviorModelTestReference(String customerBehaviorModelTestReference) {
    this.customerBehaviorModelTestReference = customerBehaviorModelTestReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of test (e.g. unit, integration, load, user acceptance etc.) 
   * @return customerBehaviorModelTestType
  **/

  public String getCustomerBehaviorModelTestType() {
    return customerBehaviorModelTestType;
  }

  public void setCustomerBehaviorModelTestType(String customerBehaviorModelTestType) {
    this.customerBehaviorModelTestType = customerBehaviorModelTestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the testing environment used to apply the test 
   * @return customerBehaviorModelTestHarnessReference
  **/

  public String getCustomerBehaviorModelTestHarnessReference() {
    return customerBehaviorModelTestHarnessReference;
  }

  public void setCustomerBehaviorModelTestHarnessReference(String customerBehaviorModelTestHarnessReference) {
    this.customerBehaviorModelTestHarnessReference = customerBehaviorModelTestHarnessReference;
  }


  /**
   * Get customerBehaviorModelTestResult
   * @return customerBehaviorModelTestResult
  **/

  public BQTestingRetrieveOutputModelTestingInstanceRecordCustomerBehaviorModelTestResult getCustomerBehaviorModelTestResult() {
    return customerBehaviorModelTestResult;
  }

  public void setCustomerBehaviorModelTestResult(BQTestingRetrieveOutputModelTestingInstanceRecordCustomerBehaviorModelTestResult customerBehaviorModelTestResult) {
    this.customerBehaviorModelTestResult = customerBehaviorModelTestResult;
  }


}

