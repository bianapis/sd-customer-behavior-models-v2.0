package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceAnalysis
 */
public class CRCustomerBehaviorModelSpecificationRetrieveInputModelCustomerBehaviorModelSpecificationInstanceAnalysis   {
  private String customerBehaviorModelSpecificationInstanceAnalysisReference = null;

  private String customerBehaviorModelSpecificationInstanceAnalysisReportType = null;

  private String customerBehaviorModelSpecificationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerBehaviorModelSpecificationInstanceAnalysisReference
  **/

  public String getCustomerBehaviorModelSpecificationInstanceAnalysisReference() {
    return customerBehaviorModelSpecificationInstanceAnalysisReference;
  }

  public void setCustomerBehaviorModelSpecificationInstanceAnalysisReference(String customerBehaviorModelSpecificationInstanceAnalysisReference) {
    this.customerBehaviorModelSpecificationInstanceAnalysisReference = customerBehaviorModelSpecificationInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerBehaviorModelSpecificationInstanceAnalysisReportType
  **/

  public String getCustomerBehaviorModelSpecificationInstanceAnalysisReportType() {
    return customerBehaviorModelSpecificationInstanceAnalysisReportType;
  }

  public void setCustomerBehaviorModelSpecificationInstanceAnalysisReportType(String customerBehaviorModelSpecificationInstanceAnalysisReportType) {
    this.customerBehaviorModelSpecificationInstanceAnalysisReportType = customerBehaviorModelSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerBehaviorModelSpecificationInstanceAnalysisParameters
  **/

  public String getCustomerBehaviorModelSpecificationInstanceAnalysisParameters() {
    return customerBehaviorModelSpecificationInstanceAnalysisParameters;
  }

  public void setCustomerBehaviorModelSpecificationInstanceAnalysisParameters(String customerBehaviorModelSpecificationInstanceAnalysisParameters) {
    this.customerBehaviorModelSpecificationInstanceAnalysisParameters = customerBehaviorModelSpecificationInstanceAnalysisParameters;
  }


}

