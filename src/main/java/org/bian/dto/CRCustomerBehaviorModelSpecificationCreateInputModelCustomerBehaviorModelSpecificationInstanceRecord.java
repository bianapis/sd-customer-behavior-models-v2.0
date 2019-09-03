package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecord
 */
public class CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecord   {
  private String customerBehaviorModelType = null;

  private String customerBehaviorModelPurpose = null;

  private CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment customerBehaviorModelDeployment = null;

  private String customerBehaviorModelStatus = null;

  private String customerBehaviorModelUsage = null;

  private String customerBehaviorModelImpact = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the model that clarifies the intended analysis/insights provided 
   * @return customerBehaviorModelPurpose
  **/

  public String getCustomerBehaviorModelPurpose() {
    return customerBehaviorModelPurpose;
  }

  public void setCustomerBehaviorModelPurpose(String customerBehaviorModelPurpose) {
    this.customerBehaviorModelPurpose = customerBehaviorModelPurpose;
  }


  /**
   * Get customerBehaviorModelDeployment
   * @return customerBehaviorModelDeployment
  **/

  public CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment getCustomerBehaviorModelDeployment() {
    return customerBehaviorModelDeployment;
  }

  public void setCustomerBehaviorModelDeployment(CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment customerBehaviorModelDeployment) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Track reporting of the impact/accuracy of the model's insights 
   * @return customerBehaviorModelImpact
  **/

  public String getCustomerBehaviorModelImpact() {
    return customerBehaviorModelImpact;
  }

  public void setCustomerBehaviorModelImpact(String customerBehaviorModelImpact) {
    this.customerBehaviorModelImpact = customerBehaviorModelImpact;
  }


}

