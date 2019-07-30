(ns com.amazonaws.services.servicequotas.AWSServiceQuotas
  "Interface for accessing Service Quotas.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSServiceQuotas instead.



  Service Quotas is a web service that you can use to manage many of your AWS service quotas. Quotas, also referred to
  as limits, are the maximum values for a resource, item, or operation. This guide provide descriptions of the Service
  Quotas actions that you can call from an API. For the Service Quotas user guide, which explains how to use Service
  Quotas from the console, see What is
  Service Quotas.



  AWS provides SDKs that consist of libraries and sample code for programming languages and platforms (Java, Ruby,
  .NET, iOS, Android, etc...,). The SDKs provide a convenient way to create programmatic access to Service Quotas and
  AWS. For information about the AWS SDKs, including how to download and install them, see the Tools for Amazon Web Services page."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicequotas AWSServiceQuotas]))

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

  list-aws-default-service-quotas-request - `com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest`

  returns: Result of the ListAWSDefaultServiceQuotas operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest list-aws-default-service-quotas-request]
    (-> this (.listAWSDefaultServiceQuotas list-aws-default-service-quotas-request))))

(defn associate-service-quota-template
  "Associates the Service Quotas template with your organization so that when new accounts are created in your
   organization, the template submits increase requests for the specified service quotas. Use the Service Quotas
   template to request an increase for any adjustable quota value. After you define the Service Quotas template, use
   this operation to associate, or enable, the template.

  associate-service-quota-template-request - `com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest`

  returns: Result of the AssociateServiceQuotaTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.DependencyAccessDeniedException - You can't perform this action because a dependency does not have access."
  (^com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest associate-service-quota-template-request]
    (-> this (.associateServiceQuotaTemplate associate-service-quota-template-request))))

(defn list-services
  "Lists the AWS services available in Service Quotas. Not all AWS services are available in Service Quotas. To list
   the see the list of the service quotas for a specific service, use ListServiceQuotas.

  list-services-request - `com.amazonaws.services.servicequotas.model.ListServicesRequest`

  returns: Result of the ListServices operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListServicesResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListServicesResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListServicesRequest list-services-request]
    (-> this (.listServices list-services-request))))

(defn get-association-for-service-quota-template
  "Retrieves the ServiceQuotaTemplateAssociationStatus value from the service. Use this action to
   determine if the Service Quota template is associated, or enabled.

  get-association-for-service-quota-template-request - `com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest`

  returns: Result of the GetAssociationForServiceQuotaTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.DependencyAccessDeniedException - You can't perform this action because a dependency does not have access."
  (^com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest get-association-for-service-quota-template-request]
    (-> this (.getAssociationForServiceQuotaTemplate get-association-for-service-quota-template-request))))

(defn request-service-quota-increase
  "Retrieves the details of a service quota increase request. The response to this command provides the details in
   the RequestedServiceQuotaChange object.

  request-service-quota-increase-request - `com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest`

  returns: Result of the RequestServiceQuotaIncrease operation returned by the service. - `com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseResult`

  throws: com.amazonaws.services.servicequotas.model.ResourceAlreadyExistsException - The specified resource already exists."
  (^com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest request-service-quota-increase-request]
    (-> this (.requestServiceQuotaIncrease request-service-quota-increase-request))))

(defn disassociate-service-quota-template
  "Disables the Service Quotas template. Once the template is disabled, it does not request quota increases for new
   accounts in your organization. Disabling the quota template does not apply the quota increase requests from the
   template.


   Related operations




   To enable the quota template, call AssociateServiceQuotaTemplate.




   To delete a specific service quota from the template, use DeleteServiceQuotaIncreaseRequestFromTemplate.

  disassociate-service-quota-template-request - `com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest`

  returns: Result of the DisassociateServiceQuotaTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.DependencyAccessDeniedException - You can't perform this action because a dependency does not have access."
  (^com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest disassociate-service-quota-template-request]
    (-> this (.disassociateServiceQuotaTemplate disassociate-service-quota-template-request))))

(defn get-service-quota
  "Returns the details for the specified service quota. This operation provides a different Value than the
   GetAWSDefaultServiceQuota operation. This operation returns the applied value for each quota.
   GetAWSDefaultServiceQuota returns the default AWS value for each quota.

  get-service-quota-request - `com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest`

  returns: Result of the GetServiceQuota operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetServiceQuotaResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.GetServiceQuotaResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest get-service-quota-request]
    (-> this (.getServiceQuota get-service-quota-request))))

(defn list-service-quota-increase-requests-in-template
  "Returns a list of the quota increase requests in the template.

  list-service-quota-increase-requests-in-template-request - `com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest`

  returns: Result of the ListServiceQuotaIncreaseRequestsInTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest list-service-quota-increase-requests-in-template-request]
    (-> this (.listServiceQuotaIncreaseRequestsInTemplate list-service-quota-increase-requests-in-template-request))))

(defn get-aws-default-service-quota
  "Retrieves the default service quotas values. The Value returned for each quota is the AWS default value, even if
   the quotas have been increased..

  get-aws-default-service-quota-request - `com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest`

  returns: Result of the GetAWSDefaultServiceQuota operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest get-aws-default-service-quota-request]
    (-> this (.getAWSDefaultServiceQuota get-aws-default-service-quota-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSServiceQuotas this]
    (-> this (.shutdown))))

(defn delete-service-quota-increase-request-from-template
  "Removes a service quota increase request from the Service Quotas template.

  delete-service-quota-increase-request-from-template-request - `com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest`

  returns: Result of the DeleteServiceQuotaIncreaseRequestFromTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.NoAvailableOrganizationException - The account making this call is not a member of an organization."
  (^com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest delete-service-quota-increase-request-from-template-request]
    (-> this (.deleteServiceQuotaIncreaseRequestFromTemplate delete-service-quota-increase-request-from-template-request))))

(defn put-service-quota-increase-request-into-template
  "Defines and adds a quota to the service quota template. To add a quota to the template, you must provide the
   ServiceCode, QuotaCode, AwsRegion, and DesiredValue. Once you
   add a quota to the template, use ListServiceQuotaIncreaseRequestsInTemplate to see the list of quotas in
   the template.

  put-service-quota-increase-request-into-template-request - `com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest`

  returns: Result of the PutServiceQuotaIncreaseRequestIntoTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.NoAvailableOrganizationException - The account making this call is not a member of an organization."
  (^com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest put-service-quota-increase-request-into-template-request]
    (-> this (.putServiceQuotaIncreaseRequestIntoTemplate put-service-quota-increase-request-into-template-request))))

(defn list-requested-service-quota-change-history
  "Requests a list of the changes to quotas for a service.

  list-requested-service-quota-change-history-request - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest`

  returns: Result of the ListRequestedServiceQuotaChangeHistory operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest list-requested-service-quota-change-history-request]
    (-> this (.listRequestedServiceQuotaChangeHistory list-requested-service-quota-change-history-request))))

(defn get-requested-service-quota-change
  "Retrieves the details for a particular increase request.

  get-requested-service-quota-change-request - `com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest`

  returns: Result of the GetRequestedServiceQuotaChange operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest get-requested-service-quota-change-request]
    (-> this (.getRequestedServiceQuotaChange get-requested-service-quota-change-request))))

(defn list-requested-service-quota-change-history-by-quota
  "Requests a list of the changes to specific service quotas. This command provides additional granularity over the
   ListRequestedServiceQuotaChangeHistory command. Once a quota change request has reached
   CASE_CLOSED, APPROVED, or DENIED, the history has been kept for 90 days.

  list-requested-service-quota-change-history-by-quota-request - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest`

  returns: Result of the ListRequestedServiceQuotaChangeHistoryByQuota operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest list-requested-service-quota-change-history-by-quota-request]
    (-> this (.listRequestedServiceQuotaChangeHistoryByQuota list-requested-service-quota-change-history-by-quota-request))))

(defn list-service-quotas
  "Lists all service quotas for the specified AWS service. This request returns a list of the service quotas for the
   specified service. you'll see the default values are the values that AWS provides for the quotas.



   Always check the NextToken response parameter when calling any of the List* operations.
   These operations can return an unexpected list of results, even when there are more results available. When this
   happens, the NextToken response parameter contains a value to pass the next call to the same API to
   request the next part of the list.

  list-service-quotas-request - `com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest`

  returns: Result of the ListServiceQuotas operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListServiceQuotasResult`

  throws: com.amazonaws.services.servicequotas.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.servicequotas.model.ListServiceQuotasResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest list-service-quotas-request]
    (-> this (.listServiceQuotas list-service-quotas-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSServiceQuotas this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-service-quota-increase-request-from-template
  "Returns the details of the service quota increase request in your template.

  get-service-quota-increase-request-from-template-request - `com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest`

  returns: Result of the GetServiceQuotaIncreaseRequestFromTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateResult`

  throws: com.amazonaws.services.servicequotas.model.NoAvailableOrganizationException - The account making this call is not a member of an organization."
  (^com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateResult [^AWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest get-service-quota-increase-request-from-template-request]
    (-> this (.getServiceQuotaIncreaseRequestFromTemplate get-service-quota-increase-request-from-template-request))))

