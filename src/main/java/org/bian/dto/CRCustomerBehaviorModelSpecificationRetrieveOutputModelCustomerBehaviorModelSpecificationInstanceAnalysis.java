package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceAnalysis
 */
public class CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceAnalysis   {
  private String customerBehaviorModelSpecificationInstanceAnalysisData = null;

  private String customerBehaviorModelSpecificationInstanceAnalysisReportType = null;

  private Object customerBehaviorModelSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerBehaviorModelSpecificationInstanceAnalysisData
  **/

  public String getCustomerBehaviorModelSpecificationInstanceAnalysisData() {
    return customerBehaviorModelSpecificationInstanceAnalysisData;
  }

  public void setCustomerBehaviorModelSpecificationInstanceAnalysisData(String customerBehaviorModelSpecificationInstanceAnalysisData) {
    this.customerBehaviorModelSpecificationInstanceAnalysisData = customerBehaviorModelSpecificationInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerBehaviorModelSpecificationInstanceAnalysisReport
  **/

  public Object getCustomerBehaviorModelSpecificationInstanceAnalysisReport() {
    return customerBehaviorModelSpecificationInstanceAnalysisReport;
  }

  public void setCustomerBehaviorModelSpecificationInstanceAnalysisReport(Object customerBehaviorModelSpecificationInstanceAnalysisReport) {
    this.customerBehaviorModelSpecificationInstanceAnalysisReport = customerBehaviorModelSpecificationInstanceAnalysisReport;
  }


}

