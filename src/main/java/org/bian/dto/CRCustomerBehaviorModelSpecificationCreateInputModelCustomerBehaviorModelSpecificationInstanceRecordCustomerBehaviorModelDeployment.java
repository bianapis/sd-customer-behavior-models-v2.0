package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeplCusBehModDeploymentConfiguration;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment
 */
public class CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeployment   {
  private String employeeBusinessUnitReference = null;

  private CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeplCusBehModDeploymentConfiguration customerBehaviorModelDeploymentConfiguration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business units where the model is deployed and in use 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * Get customerBehaviorModelDeploymentConfiguration
   * @return customerBehaviorModelDeploymentConfiguration
  **/

  public CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeplCusBehModDeploymentConfiguration getCustomerBehaviorModelDeploymentConfiguration() {
    return customerBehaviorModelDeploymentConfiguration;
  }

  public void setCustomerBehaviorModelDeploymentConfiguration(CRCustomerBehaviorModelSpecificationCreateInputModelCustomerBehaviorModelSpecificationInstanceRecordCustomerBehaviorModelDeplCusBehModDeploymentConfiguration customerBehaviorModelDeploymentConfiguration) {
    this.customerBehaviorModelDeploymentConfiguration = customerBehaviorModelDeploymentConfiguration;
  }


}

