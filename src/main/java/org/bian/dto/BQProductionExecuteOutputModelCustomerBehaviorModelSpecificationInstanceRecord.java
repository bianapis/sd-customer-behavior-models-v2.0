package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecord
 */
public class BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecord   {
  private BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment customerBehaviorModelDeployment = null;

  private String customerBehaviorModelStatus = null;

  private String customerBehaviorModelUsage = null;

  private String customerBehaviorModelVersion = null;

  private String customerBehaviorModel = null;


  /**
   * Get customerBehaviorModelDeployment
   * @return customerBehaviorModelDeployment
  **/

  public BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment getCustomerBehaviorModelDeployment() {
    return customerBehaviorModelDeployment;
  }

  public void setCustomerBehaviorModelDeployment(BQProductionExecuteOutputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment customerBehaviorModelDeployment) {
    this.customerBehaviorModelDeployment = customerBehaviorModelDeployment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The operational and development status of the model (e.g. under development, available, under review)  
   * @return customerBehaviorModelStatus
  **/

  public String getCustomerBehaviorModelStatus() {
    return customerBehaviorModelStatus;
  }

  public void setCustomerBehaviorModelStatus(String customerBehaviorModelStatus) {
    this.customerBehaviorModelStatus = customerBehaviorModelStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracking deployment and usage frequency  
   * @return customerBehaviorModelUsage
  **/

  public String getCustomerBehaviorModelUsage() {
    return customerBehaviorModelUsage;
  }

  public void setCustomerBehaviorModelUsage(String customerBehaviorModelUsage) {
    this.customerBehaviorModelUsage = customerBehaviorModelUsage;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The deployable model in any appropriate form (including historical versions as appropriate) 
   * @return customerBehaviorModel
  **/

  public String getCustomerBehaviorModel() {
    return customerBehaviorModel;
  }

  public void setCustomerBehaviorModel(String customerBehaviorModel) {
    this.customerBehaviorModel = customerBehaviorModel;
  }


}

