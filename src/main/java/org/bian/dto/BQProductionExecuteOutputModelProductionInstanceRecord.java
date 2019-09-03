package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteOutputModelProductionInstanceRecord
 */
public class BQProductionExecuteOutputModelProductionInstanceRecord   {
  private String customerBehaviorModelOperationalRequirements = null;

  private String customerBehaviorModelAllowedUsage = null;

  private String customerBehaviorModelUsageGuidelines = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Specification of the operational and technical requirements  
   * @return customerBehaviorModelOperationalRequirements
  **/

  public String getCustomerBehaviorModelOperationalRequirements() {
    return customerBehaviorModelOperationalRequirements;
  }

  public void setCustomerBehaviorModelOperationalRequirements(String customerBehaviorModelOperationalRequirements) {
    this.customerBehaviorModelOperationalRequirements = customerBehaviorModelOperationalRequirements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines rules and suitability for model usage 
   * @return customerBehaviorModelAllowedUsage
  **/

  public String getCustomerBehaviorModelAllowedUsage() {
    return customerBehaviorModelAllowedUsage;
  }

  public void setCustomerBehaviorModelAllowedUsage(String customerBehaviorModelAllowedUsage) {
    this.customerBehaviorModelAllowedUsage = customerBehaviorModelAllowedUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Provides guidance on the use of the model 
   * @return customerBehaviorModelUsageGuidelines
  **/

  public String getCustomerBehaviorModelUsageGuidelines() {
    return customerBehaviorModelUsageGuidelines;
  }

  public void setCustomerBehaviorModelUsageGuidelines(String customerBehaviorModelUsageGuidelines) {
    this.customerBehaviorModelUsageGuidelines = customerBehaviorModelUsageGuidelines;
  }


}

