package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRequestOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeploymentCustomerBehaviorModelDeploymentConfiguration
 */
public class BQProductionRequestOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeploymentCustomerBehaviorModelDeploymentConfiguration   {
  private String customerBehaviorModelDeploymentTaskReference = null;

  private Object customerBehaviorModelDeploymentTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to deployment task 
   * @return customerBehaviorModelDeploymentTaskReference
  **/

  public String getCustomerBehaviorModelDeploymentTaskReference() {
    return customerBehaviorModelDeploymentTaskReference;
  }

  public void setCustomerBehaviorModelDeploymentTaskReference(String customerBehaviorModelDeploymentTaskReference) {
    this.customerBehaviorModelDeploymentTaskReference = customerBehaviorModelDeploymentTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Recorded details of a deployment task 
   * @return customerBehaviorModelDeploymentTaskRecord
  **/

  public Object getCustomerBehaviorModelDeploymentTaskRecord() {
    return customerBehaviorModelDeploymentTaskRecord;
  }

  public void setCustomerBehaviorModelDeploymentTaskRecord(Object customerBehaviorModelDeploymentTaskRecord) {
    this.customerBehaviorModelDeploymentTaskRecord = customerBehaviorModelDeploymentTaskRecord;
  }


}

