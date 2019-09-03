package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRequestInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment;

import javax.validation.Valid;
  
/**
 * BQProductionRequestInputModelCustomerBehaviorModelSpecificationInstanceRecord
 */
public class BQProductionRequestInputModelCustomerBehaviorModelSpecificationInstanceRecord   {
  private BQProductionRequestInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment customerBehaviorModelDeployment = null;

  private String customerBehaviorModelVersion = null;


  /**
   * Get customerBehaviorModelDeployment
   * @return customerBehaviorModelDeployment
  **/

  public BQProductionRequestInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment getCustomerBehaviorModelDeployment() {
    return customerBehaviorModelDeployment;
  }

  public void setCustomerBehaviorModelDeployment(BQProductionRequestInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment customerBehaviorModelDeployment) {
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

