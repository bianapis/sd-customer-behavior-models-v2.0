package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeploymentCustomerBehaviorModelDeploymentConfiguration;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment
 */
public class BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment   {
  private BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeploymentCustomerBehaviorModelDeploymentConfiguration customerBehaviorModelDeploymentConfiguration = null;


  /**
   * Get customerBehaviorModelDeploymentConfiguration
   * @return customerBehaviorModelDeploymentConfiguration
  **/

  public BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeploymentCustomerBehaviorModelDeploymentConfiguration getCustomerBehaviorModelDeploymentConfiguration() {
    return customerBehaviorModelDeploymentConfiguration;
  }

  public void setCustomerBehaviorModelDeploymentConfiguration(BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeploymentCustomerBehaviorModelDeploymentConfiguration customerBehaviorModelDeploymentConfiguration) {
    this.customerBehaviorModelDeploymentConfiguration = customerBehaviorModelDeploymentConfiguration;
  }


}
