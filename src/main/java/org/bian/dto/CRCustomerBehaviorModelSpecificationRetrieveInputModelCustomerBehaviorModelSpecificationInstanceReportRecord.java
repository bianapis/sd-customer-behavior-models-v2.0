package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceReportRecord
 */
public class CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceReportRecord   {
  private String customerBehaviorModelSpecificationInstanceReportReference = null;

  private String customerBehaviorModelSpecificationInstanceReportType = null;

  private String customerBehaviorModelSpecificationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerBehaviorModelSpecificationInstanceReportReference
  **/

  public String getCustomerBehaviorModelSpecificationInstanceReportReference() {
    return customerBehaviorModelSpecificationInstanceReportReference;
  }

  public void setCustomerBehaviorModelSpecificationInstanceReportReference(String customerBehaviorModelSpecificationInstanceReportReference) {
    this.customerBehaviorModelSpecificationInstanceReportReference = customerBehaviorModelSpecificationInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerBehaviorModelSpecificationInstanceReportType
  **/

  public String getCustomerBehaviorModelSpecificationInstanceReportType() {
    return customerBehaviorModelSpecificationInstanceReportType;
  }

  public void setCustomerBehaviorModelSpecificationInstanceReportType(String customerBehaviorModelSpecificationInstanceReportType) {
    this.customerBehaviorModelSpecificationInstanceReportType = customerBehaviorModelSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerBehaviorModelSpecificationInstanceReportParameters
  **/

  public String getCustomerBehaviorModelSpecificationInstanceReportParameters() {
    return customerBehaviorModelSpecificationInstanceReportParameters;
  }

  public void setCustomerBehaviorModelSpecificationInstanceReportParameters(String customerBehaviorModelSpecificationInstanceReportParameters) {
    this.customerBehaviorModelSpecificationInstanceReportParameters = customerBehaviorModelSpecificationInstanceReportParameters;
  }


}

