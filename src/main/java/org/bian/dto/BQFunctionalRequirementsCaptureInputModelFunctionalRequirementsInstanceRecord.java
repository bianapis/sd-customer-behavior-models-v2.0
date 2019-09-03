package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsCaptureInputModelFunctionalRequirementsInstanceRecord
 */
public class BQFunctionalRequirementsCaptureInputModelFunctionalRequirementsInstanceRecord   {
  private Object customerBehaviorModelFeedbackRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: User provided and solicited feedback, suggestions for model refinement 
   * @return customerBehaviorModelFeedbackRecord
  **/

  public Object getCustomerBehaviorModelFeedbackRecord() {
    return customerBehaviorModelFeedbackRecord;
  }

  public void setCustomerBehaviorModelFeedbackRecord(Object customerBehaviorModelFeedbackRecord) {
    this.customerBehaviorModelFeedbackRecord = customerBehaviorModelFeedbackRecord;
  }


}

