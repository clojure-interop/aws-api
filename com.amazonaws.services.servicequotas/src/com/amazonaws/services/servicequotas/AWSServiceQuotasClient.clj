(ns com.amazonaws.services.servicequotas.AWSServiceQuotasClient
  "Client for accessing Service Quotas. All service calls made using this client are blocking, and will not return until
  the service call completes.


  Service Quotas is a web service that you can use to manage many of your AWS service quotas. Quotas, also referred to
  as limits, are the maximum values for a resource, item, or operation. This guide provide descriptions of the Service
  Quotas actions that you can call from an API. For the Service Quotas user guide, which explains how to use Service
  Quotas from the console, see What is
  Service Quotas.



  AWS provides SDKs that consist of libraries and sample code for programming languages and platforms (Java, Ruby,
  .NET, iOS, Android, etc...,). The SDKs provide a convenient way to create programmatic access to Service Quotas and
  AWS. For information about the AWS SDKs, including how to download and install them, see the Tools for Amazon Web Services page."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicequotas AWSServiceQuotasClient]))

(defn *builder
  "returns: `com.amazonaws.services.servicequotas.AWSServiceQuotasClientBuilder`"
  (^com.amazonaws.services.servicequotas.AWSServiceQuotasClientBuilder []
    (AWSServiceQuotasClient/builder )))

(defn list-aws-default-service-quotas
  "Lists all default service quotas for the specified AWS service or all AWS services. ListAWSDefaultServiceQuotas
   is similar to ListServiceQuotas except for the Value object. The Value object returned by
   ListAWSDefaultServiceQuotas is the default value assigned by AWS. This request returns a list of all
   service quotas for the specified service. The listing of each you'll see the default values are the values that
   AWS provides for the quotas.



   Always check the NextToken response parameter when calling any of the List* operations.
   These operations can return an unexpected list of results, even when there are more results available. When this
   happens, the NextToken response parameter contains a value to pass the next call to the same API to
   request the next part of the list.

  request - `com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest`

  returns: Result of the ListAWSDefaultServiceQuotas operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest request]
    (-> this (.listAWSDefaultServiceQuotas request))))

(defn associate-service-quota-template
  "Associates the Service Quotas template with your organization so that when new accounts are created in your
   organization, the template submits increase requests for the specified service quotas. Use the Service Quotas
   template to request an increase for any adjustable quota value. After you define the Service Quotas template, use
   this operation to associate, or enable, the template.

  request - `com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest`

  returns: Result of the AssociateServiceQuotaTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.DependencyAccessDeniedException - You can't perform this action because a dependency does not have access."
  (^com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest request]
    (-> this (.associateServiceQuotaTemplate request))))

(defn list-services
  "Lists the AWS services available in Service Quotas. Not all AWS services are available in Service Quotas. To list
   the see the list of the service quotas for a specific service, use ListServiceQuotas.

  request - `com.amazonaws.services.servicequotas.model.ListServicesRequest`

  returns: Result of the ListServices operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListServicesResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListServicesResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.ListServicesRequest request]
    (-> this (.listServices request))))

(defn get-association-for-service-quota-template
  "Retrieves the ServiceQuotaTemplateAssociationStatus value from the service. Use this action to
   determine if the Service Quota template is associated, or enabled.

  request - `com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest`

  returns: Result of the GetAssociationForServiceQuotaTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.DependencyAccessDeniedException - You can't perform this action because a dependency does not have access."
  (^com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest request]
    (-> this (.getAssociationForServiceQuotaTemplate request))))

(defn request-service-quota-increase
  "Retrieves the details of a service quota increase request. The response to this command provides the details in
   the RequestedServiceQuotaChange object.

  request - `com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest`

  returns: Result of the RequestServiceQuotaIncrease operation returned by the service. - `com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseResult`

  throws: com.amazonaws.services.servicequotas.model.ResourceAlreadyExistsException - The specified resource already exists."
  (^com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest request]
    (-> this (.requestServiceQuotaIncrease request))))

(defn disassociate-service-quota-template
  "Disables the Service Quotas template. Once the template is disabled, it does not request quota increases for new
   accounts in your organization. Disabling the quota template does not apply the quota increase requests from the
   template.


   Related operations




   To enable the quota template, call AssociateServiceQuotaTemplate.




   To delete a specific service quota from the template, use DeleteServiceQuotaIncreaseRequestFromTemplate.

  request - `com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest`

  returns: Result of the DisassociateServiceQuotaTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.DependencyAccessDeniedException - You can't perform this action because a dependency does not have access."
  (^com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest request]
    (-> this (.disassociateServiceQuotaTemplate request))))

(defn get-service-quota
  "Returns the details for the specified service quota. This operation provides a different Value than the
   GetAWSDefaultServiceQuota operation. This operation returns the applied value for each quota.
   GetAWSDefaultServiceQuota returns the default AWS value for each quota.

  request - `com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest`

  returns: Result of the GetServiceQuota operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetServiceQuotaResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.GetServiceQuotaResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest request]
    (-> this (.getServiceQuota request))))

(defn list-service-quota-increase-requests-in-template
  "Returns a list of the quota increase requests in the template.

  request - `com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest`

  returns: Result of the ListServiceQuotaIncreaseRequestsInTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest request]
    (-> this (.listServiceQuotaIncreaseRequestsInTemplate request))))

(defn get-aws-default-service-quota
  "Retrieves the default service quotas values. The Value returned for each quota is the AWS default value, even if
   the quotas have been increased..

  request - `com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest`

  returns: Result of the GetAWSDefaultServiceQuota operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest request]
    (-> this (.getAWSDefaultServiceQuota request))))

(defn delete-service-quota-increase-request-from-template
  "Removes a service quota increase request from the Service Quotas template.

  request - `com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest`

  returns: Result of the DeleteServiceQuotaIncreaseRequestFromTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.NoAvailableOrganizationException - The account making this call is not a member of an organization."
  (^com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest request]
    (-> this (.deleteServiceQuotaIncreaseRequestFromTemplate request))))

(defn put-service-quota-increase-request-into-template
  "Defines and adds a quota to the service quota template. To add a quota to the template, you must provide the
   ServiceCode, QuotaCode, AwsRegion, and DesiredValue. Once you
   add a quota to the template, use ListServiceQuotaIncreaseRequestsInTemplate to see the list of quotas in
   the template.

  request - `com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest`

  returns: Result of the PutServiceQuotaIncreaseRequestIntoTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.NoAvailableOrganizationException - The account making this call is not a member of an organization."
  (^com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest request]
    (-> this (.putServiceQuotaIncreaseRequestIntoTemplate request))))

(defn list-requested-service-quota-change-history
  "Requests a list of the changes to quotas for a service.

  request - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest`

  returns: Result of the ListRequestedServiceQuotaChangeHistory operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest request]
    (-> this (.listRequestedServiceQuotaChangeHistory request))))

(defn get-requested-service-quota-change
  "Retrieves the details for a particular increase request.

  request - `com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest`

  returns: Result of the GetRequestedServiceQuotaChange operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest request]
    (-> this (.getRequestedServiceQuotaChange request))))

(defn list-requested-service-quota-change-history-by-quota
  "Requests a list of the changes to specific service quotas. This command provides additional granularity over the
   ListRequestedServiceQuotaChangeHistory command. Once a quota change request has reached
   CASE_CLOSED, APPROVED, or DENIED, the history has been kept for 90 days.

  request - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest`

  returns: Result of the ListRequestedServiceQuotaChangeHistoryByQuota operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest request]
    (-> this (.listRequestedServiceQuotaChangeHistoryByQuota request))))

(defn list-service-quotas
  "Lists all service quotas for the specified AWS service. This request returns a list of the service quotas for the
   specified service. you'll see the default values are the values that AWS provides for the quotas.



   Always check the NextToken response parameter when calling any of the List* operations.
   These operations can return an unexpected list of results, even when there are more results available. When this
   happens, the NextToken response parameter contains a value to pass the next call to the same API to
   request the next part of the list.

  request - `com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest`

  returns: Result of the ListServiceQuotas operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListServiceQuotasResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListServiceQuotasResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest request]
    (-> this (.listServiceQuotas request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSServiceQuotasClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-service-quota-increase-request-from-template
  "Returns the details of the service quota increase request in your template.

  request - `com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest`

  returns: Result of the GetServiceQuotaIncreaseRequestFromTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.NoAvailableOrganizationException - The account making this call is not a member of an organization."
  (^com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateResult [^AWSServiceQuotasClient this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest request]
    (-> this (.getServiceQuotaIncreaseRequestFromTemplate request))))

