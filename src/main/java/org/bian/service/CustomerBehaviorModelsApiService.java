/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerBehaviorModelsApiService {

	SDCustomerBehaviorModelsActivateOutputModel activate(SDCustomerBehaviorModelsActivateInputModel request);
	
	BQFunctionalRequirementsCaptureOutputModel captureFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsCaptureInputModel request);
	
	SDCustomerBehaviorModelsConfigureOutputModel configure(String sdReferenceId, SDCustomerBehaviorModelsConfigureInputModel request);
	
	CRCustomerBehaviorModelSpecificationCreateOutputModel create(String sdReferenceId, CRCustomerBehaviorModelSpecificationCreateInputModel request);
	
	BQFunctionalRequirementsExchangeOutputModel exchangeFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsExchangeInputModel request);
	
	BQTestingExchangeOutputModel exchangeTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingExchangeInputModel request);
	
	BQProductionExecuteOutputModel executeProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionExecuteInputModel request);
	
	CRCustomerBehaviorModelSpecificationExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerBehaviorModelSpecificationExecuteInputModel request);
	
	SDCustomerBehaviorModelsFeedbackOutputModel feedback(String sdReferenceId, SDCustomerBehaviorModelsFeedbackInputModel request);
	
	BQFunctionalRequirementsRequestOutputModel requestFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsRequestInputModel request);
	
	BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request);
	
	CRCustomerBehaviorModelSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerBehaviorModelSpecificationRequestInputModel request);
	
	BQFunctionalRequirementsRetrieveOutputModel retrieveFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTestingRetrieveOutputModel retrieveTesting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCustomerBehaviorModelSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerBehaviorModelsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	BQFunctionalRequirementsUpdateOutputModel updateFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsUpdateInputModel request);
	
	BQTestingUpdateOutputModel updateTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingUpdateInputModel request);
	
}
