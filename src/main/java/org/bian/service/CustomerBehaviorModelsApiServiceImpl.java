/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerBehaviorModelsApiServiceImpl implements CustomerBehaviorModelsApiService {

	public SDCustomerBehaviorModelsActivateOutputModel activate(SDCustomerBehaviorModelsActivateInputModel request){
		return JsonReader.read("activate-SDCustomerBehaviorModelsActivateOutputModel.json",new TypeReference<SDCustomerBehaviorModelsActivateOutputModel>(){});
	}
	
	public BQFunctionalRequirementsCaptureOutputModel captureFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsCaptureInputModel request){
		return JsonReader.read("capture-BQFunctionalRequirementsCaptureOutputModel.json",new TypeReference<BQFunctionalRequirementsCaptureOutputModel>(){});
	}
	
	public SDCustomerBehaviorModelsConfigureOutputModel configure(String sdReferenceId, SDCustomerBehaviorModelsConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerBehaviorModelsConfigureOutputModel.json",new TypeReference<SDCustomerBehaviorModelsConfigureOutputModel>(){});
	}
	
	public CRCustomerBehaviorModelSpecificationCreateOutputModel create(String sdReferenceId, CRCustomerBehaviorModelSpecificationCreateInputModel request){
		return JsonReader.read("create-CRCustomerBehaviorModelSpecificationCreateOutputModel.json",new TypeReference<CRCustomerBehaviorModelSpecificationCreateOutputModel>(){});
	}
	
	public BQFunctionalRequirementsExchangeOutputModel exchangeFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsExchangeInputModel request){
		return JsonReader.read("exchange-BQFunctionalRequirementsExchangeOutputModel.json",new TypeReference<BQFunctionalRequirementsExchangeOutputModel>(){});
	}
	
	public BQTestingExchangeOutputModel exchangeTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingExchangeInputModel request){
		return JsonReader.read("exchange-BQTestingExchangeOutputModel.json",new TypeReference<BQTestingExchangeOutputModel>(){});
	}
	
	public BQProductionExecuteOutputModel executeProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionExecuteInputModel request){
		return JsonReader.read("execute-BQProductionExecuteOutputModel.json",new TypeReference<BQProductionExecuteOutputModel>(){});
	}
	
	public CRCustomerBehaviorModelSpecificationExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerBehaviorModelSpecificationExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerBehaviorModelSpecificationExecuteOutputModel.json",new TypeReference<CRCustomerBehaviorModelSpecificationExecuteOutputModel>(){});
	}
	
	public SDCustomerBehaviorModelsFeedbackOutputModel feedback(String sdReferenceId, SDCustomerBehaviorModelsFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerBehaviorModelsFeedbackOutputModel.json",new TypeReference<SDCustomerBehaviorModelsFeedbackOutputModel>(){});
	}
	
	public BQFunctionalRequirementsRequestOutputModel requestFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsRequestInputModel request){
		return JsonReader.read("request-BQFunctionalRequirementsRequestOutputModel.json",new TypeReference<BQFunctionalRequirementsRequestOutputModel>(){});
	}
	
	public BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request){
		return JsonReader.read("request-BQProductionRequestOutputModel.json",new TypeReference<BQProductionRequestOutputModel>(){});
	}
	
	public CRCustomerBehaviorModelSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerBehaviorModelSpecificationRequestInputModel request){
		return JsonReader.read("request-CRCustomerBehaviorModelSpecificationRequestOutputModel.json",new TypeReference<CRCustomerBehaviorModelSpecificationRequestOutputModel>(){});
	}
	
	public BQFunctionalRequirementsRetrieveOutputModel retrieveFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFunctionalRequirementsRetrieveOutputModel.json",new TypeReference<BQFunctionalRequirementsRetrieveOutputModel>(){});
	}
	
	public BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductionRetrieveOutputModel.json",new TypeReference<BQProductionRetrieveOutputModel>(){});
	}
	
	public BQTestingRetrieveOutputModel retrieveTesting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTestingRetrieveOutputModel.json",new TypeReference<BQTestingRetrieveOutputModel>(){});
	}
	
	public CRCustomerBehaviorModelSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerBehaviorModelSpecificationRetrieveOutputModel.json",new TypeReference<CRCustomerBehaviorModelSpecificationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerBehaviorModelsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerBehaviorModelsRetrieveOutputModel.json",new TypeReference<SDCustomerBehaviorModelsRetrieveOutputModel>(){});
	}
	
	public BQFunctionalRequirementsUpdateOutputModel updateFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsUpdateInputModel request){
		return JsonReader.read("update-BQFunctionalRequirementsUpdateOutputModel.json",new TypeReference<BQFunctionalRequirementsUpdateOutputModel>(){});
	}
	
	public BQTestingUpdateOutputModel updateTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingUpdateInputModel request){
		return JsonReader.read("update-BQTestingUpdateOutputModel.json",new TypeReference<BQTestingUpdateOutputModel>(){});
	}
	
}
