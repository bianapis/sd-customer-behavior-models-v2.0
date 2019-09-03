package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceRecord
 */
public class BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceRecord   {
  private String customerBehaviorModelDesignTaskReference = null;

  private Object customerBehaviorModelDesignTaskRecord = null;

  private String customerMarketDataServiceReference = null;

  private Object customerMarketDataRecord = null;

  private Object customerBehaviorModelFeedbackRecord = null;

  private String customerBehaviorModelRequirementsSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a type of functional requirements specification activity 
   * @return customerBehaviorModelDesignTaskReference
  **/

  public String getCustomerBehaviorModelDesignTaskReference() {
    return customerBehaviorModelDesignTaskReference;
  }

  public void setCustomerBehaviorModelDesignTaskReference(String customerBehaviorModelDesignTaskReference) {
    this.customerBehaviorModelDesignTaskReference = customerBehaviorModelDesignTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of work products used for the design task 
   * @return customerBehaviorModelDesignTaskRecord
  **/

  public Object getCustomerBehaviorModelDesignTaskRecord() {
    return customerBehaviorModelDesignTaskRecord;
  }

  public void setCustomerBehaviorModelDesignTaskRecord(Object customerBehaviorModelDesignTaskRecord) {
    this.customerBehaviorModelDesignTaskRecord = customerBehaviorModelDesignTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to external service information provider used to obtain example production data for design 
   * @return customerMarketDataServiceReference
  **/

  public String getCustomerMarketDataServiceReference() {
    return customerMarketDataServiceReference;
  }

  public void setCustomerMarketDataServiceReference(String customerMarketDataServiceReference) {
    this.customerMarketDataServiceReference = customerMarketDataServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Record of example production data file 
   * @return customerMarketDataRecord
  **/

  public Object getCustomerMarketDataRecord() {
    return customerMarketDataRecord;
  }

  public void setCustomerMarketDataRecord(Object customerMarketDataRecord) {
    this.customerMarketDataRecord = customerMarketDataRecord;
  }


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

