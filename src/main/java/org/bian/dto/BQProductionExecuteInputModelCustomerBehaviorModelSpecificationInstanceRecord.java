package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecord
 */
public class BQProductionExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecord   {
  private BQProductionExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment customerBehaviorModelDeployment = null;

  private String customerBehaviorModelVersion = null;


  /**
   * Get customerBehaviorModelDeployment
   * @return customerBehaviorModelDeployment
  **/

  public BQProductionExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment getCustomerBehaviorModelDeployment() {
    return customerBehaviorModelDeployment;
  }

  public void setCustomerBehaviorModelDeployment(BQProductionExecuteInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment customerBehaviorModelDeployment) {
    this.customerBehaviorModelDeployment = customerBehaviorModelDeployment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Release version of available model plus version history as appropriate 
   * @return customerBehaviorModelVersion
  **/

  public String getCustomerBehaviorModelVersion() {
    return customerBehaviorModelVersion;
  }

  public void setCustomerBehaviorModelVersion(String customerBehaviorModelVersion) {
    this.customerBehaviorModelVersion = customerBehaviorModelVersion;
  }


}

