package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord
 */
public class BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord   {
  private String customerBehaviorModelRequirementsSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The model functional requirements specification (with versioning as appropriate) 
   * @return customerBehaviorModelRequirementsSpecification
  **/

  public String getCustomerBehaviorModelRequirementsSpecification() {
    return customerBehaviorModelRequirementsSpecification;
  }

  public void setCustomerBehaviorModelRequirementsSpecification(String customerBehaviorModelRequirementsSpecification) {
    this.customerBehaviorModelRequirementsSpecification = customerBehaviorModelRequirementsSpecification;
  }


}

