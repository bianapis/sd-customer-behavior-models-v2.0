package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceReportRecord
 */
public class CRCustomerBehaviorModelSpecificationRetrieveOutputModelCustomerBehaviorModelSpecificationInstanceReportRecord   {
  private String customerBehaviorModelSpecificationInstanceReportData = null;

  private String customerBehaviorModelSpecificationInstanceReportType = null;

  private Object customerBehaviorModelSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerBehaviorModelSpecificationInstanceReportData
  **/

  public String getCustomerBehaviorModelSpecificationInstanceReportData() {
    return customerBehaviorModelSpecificationInstanceReportData;
  }

  public void setCustomerBehaviorModelSpecificationInstanceReportData(String customerBehaviorModelSpecificationInstanceReportData) {
    this.customerBehaviorModelSpecificationInstanceReportData = customerBehaviorModelSpecificationInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerBehaviorModelSpecificationInstanceReport
  **/

  public Object getCustomerBehaviorModelSpecificationInstanceReport() {
    return customerBehaviorModelSpecificationInstanceReport;
  }

  public void setCustomerBehaviorModelSpecificationInstanceReport(Object customerBehaviorModelSpecificationInstanceReport) {
    this.customerBehaviorModelSpecificationInstanceReport = customerBehaviorModelSpecificationInstanceReport;
  }


}

