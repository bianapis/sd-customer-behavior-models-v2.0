package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment;

import javax.validation.Valid;
  
/**
 * BQTestingRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceRecord
 */
public class BQTestingRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceRecord   {
  private String customerBehaviorModelType = null;

  private BQTestingRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment customerBehaviorModelDeployment = null;

  private String customerBehaviorModelVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of behavior model (e.g. life event detection) 
   * @return customerBehaviorModelType
  **/

  public String getCustomerBehaviorModelType() {
    return customerBehaviorModelType;
  }

  public void setCustomerBehaviorModelType(String customerBehaviorModelType) {
    this.customerBehaviorModelType = customerBehaviorModelType;
  }


  /**
   * Get customerBehaviorModelDeployment
   * @return customerBehaviorModelDeployment
  **/

  public BQTestingRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment getCustomerBehaviorModelDeployment() {
    return customerBehaviorModelDeployment;
  }

  public void setCustomerBehaviorModelDeployment(BQTestingRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment customerBehaviorModelDeployment) {
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

