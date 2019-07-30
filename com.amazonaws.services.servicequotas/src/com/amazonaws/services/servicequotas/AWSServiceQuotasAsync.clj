(ns com.amazonaws.services.servicequotas.AWSServiceQuotasAsync
  "Interface for accessing Service Quotas asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSServiceQuotasAsync instead.



  Service Quotas is a web service that you can use to manage many of your AWS service quotas. Quotas, also referred to
  as limits, are the maximum values for a resource, item, or operation. This guide provide descriptions of the Service
  Quotas actions that you can call from an API. For the Service Quotas user guide, which explains how to use Service
  Quotas from the console, see What is
  Service Quotas.



  AWS provides SDKs that consist of libraries and sample code for programming languages and platforms (Java, Ruby,
  .NET, iOS, Android, etc...,). The SDKs provide a convenient way to create programmatic access to Service Quotas and
  AWS. For information about the AWS SDKs, including how to download and install them, see the Tools for Amazon Web Services page."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicequotas AWSServiceQuotasAsync]))

(defn get-requested-service-quota-change-async
  "Retrieves the details for a particular increase request.

  get-requested-service-quota-change-request - `com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRequestedServiceQuotaChange operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest get-requested-service-quota-change-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRequestedServiceQuotaChangeAsync get-requested-service-quota-change-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest get-requested-service-quota-change-request]
    (-> this (.getRequestedServiceQuotaChangeAsync get-requested-service-quota-change-request))))

(defn get-association-for-service-quota-template-async
  "Retrieves the ServiceQuotaTemplateAssociationStatus value from the service. Use this action to
   determine if the Service Quota template is associated, or enabled.

  get-association-for-service-quota-template-request - `com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAssociationForServiceQuotaTemplate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest get-association-for-service-quota-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAssociationForServiceQuotaTemplateAsync get-association-for-service-quota-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest get-association-for-service-quota-template-request]
    (-> this (.getAssociationForServiceQuotaTemplateAsync get-association-for-service-quota-template-request))))

(defn list-requested-service-quota-change-history-by-quota-async
  "Requests a list of the changes to specific service quotas. This command provides additional granularity over the
   ListRequestedServiceQuotaChangeHistory command. Once a quota change request has reached
   CASE_CLOSED, APPROVED, or DENIED, the history has been kept for 90 days.

  list-requested-service-quota-change-history-by-quota-request - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRequestedServiceQuotaChangeHistoryByQuota operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest list-requested-service-quota-change-history-by-quota-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRequestedServiceQuotaChangeHistoryByQuotaAsync list-requested-service-quota-change-history-by-quota-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest list-requested-service-quota-change-history-by-quota-request]
    (-> this (.listRequestedServiceQuotaChangeHistoryByQuotaAsync list-requested-service-quota-change-history-by-quota-request))))

(defn list-service-quotas-async
  "Lists all service quotas for the specified AWS service. This request returns a list of the service quotas for the
   specified service. you'll see the default values are the values that AWS provides for the quotas.



   Always check the NextToken response parameter when calling any of the List* operations.
   These operations can return an unexpected list of results, even when there are more results available. When this
   happens, the NextToken response parameter contains a value to pass the next call to the same API to
   request the next part of the list.

  list-service-quotas-request - `com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServiceQuotas operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListServiceQuotasResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest list-service-quotas-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServiceQuotasAsync list-service-quotas-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest list-service-quotas-request]
    (-> this (.listServiceQuotasAsync list-service-quotas-request))))

(defn list-service-quota-increase-requests-in-template-async
  "Returns a list of the quota increase requests in the template.

  list-service-quota-increase-requests-in-template-request - `com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServiceQuotaIncreaseRequestsInTemplate operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest list-service-quota-increase-requests-in-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServiceQuotaIncreaseRequestsInTemplateAsync list-service-quota-increase-requests-in-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest list-service-quota-increase-requests-in-template-request]
    (-> this (.listServiceQuotaIncreaseRequestsInTemplateAsync list-service-quota-increase-requests-in-template-request))))

(defn associate-service-quota-template-async
  "Associates the Service Quotas template with your organization so that when new accounts are created in your
   organization, the template submits increase requests for the specified service quotas. Use the Service Quotas
   template to request an increase for any adjustable quota value. After you define the Service Quotas template, use
   this operation to associate, or enable, the template.

  associate-service-quota-template-request - `com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateServiceQuotaTemplate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest associate-service-quota-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateServiceQuotaTemplateAsync associate-service-quota-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest associate-service-quota-template-request]
    (-> this (.associateServiceQuotaTemplateAsync associate-service-quota-template-request))))

(defn list-requested-service-quota-change-history-async
  "Requests a list of the changes to quotas for a service.

  list-requested-service-quota-change-history-request - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRequestedServiceQuotaChangeHistory operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest list-requested-service-quota-change-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRequestedServiceQuotaChangeHistoryAsync list-requested-service-quota-change-history-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest list-requested-service-quota-change-history-request]
    (-> this (.listRequestedServiceQuotaChangeHistoryAsync list-requested-service-quota-change-history-request))))

(defn list-services-async
  "Lists the AWS services available in Service Quotas. Not all AWS services are available in Service Quotas. To list
   the see the list of the service quotas for a specific service, use ListServiceQuotas.

  list-services-request - `com.amazonaws.services.servicequotas.model.ListServicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListServicesResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListServicesRequest list-services-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServicesAsync list-services-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListServicesRequest list-services-request]
    (-> this (.listServicesAsync list-services-request))))

(defn get-service-quota-increase-request-from-template-async
  "Returns the details of the service quota increase request in your template.

  get-service-quota-increase-request-from-template-request - `com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceQuotaIncreaseRequestFromTemplate operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest get-service-quota-increase-request-from-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceQuotaIncreaseRequestFromTemplateAsync get-service-quota-increase-request-from-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest get-service-quota-increase-request-from-template-request]
    (-> this (.getServiceQuotaIncreaseRequestFromTemplateAsync get-service-quota-increase-request-from-template-request))))

(defn request-service-quota-increase-async
  "Retrieves the details of a service quota increase request. The response to this command provides the details in
   the RequestedServiceQuotaChange object.

  request-service-quota-increase-request - `com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestServiceQuotaIncrease operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest request-service-quota-increase-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestServiceQuotaIncreaseAsync request-service-quota-increase-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest request-service-quota-increase-request]
    (-> this (.requestServiceQuotaIncreaseAsync request-service-quota-increase-request))))

(defn get-aws-default-service-quota-async
  "Retrieves the default service quotas values. The Value returned for each quota is the AWS default value, even if
   the quotas have been increased..

  get-aws-default-service-quota-request - `com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAWSDefaultServiceQuota operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest get-aws-default-service-quota-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAWSDefaultServiceQuotaAsync get-aws-default-service-quota-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest get-aws-default-service-quota-request]
    (-> this (.getAWSDefaultServiceQuotaAsync get-aws-default-service-quota-request))))

(defn delete-service-quota-increase-request-from-template-async
  "Removes a service quota increase request from the Service Quotas template.

  delete-service-quota-increase-request-from-template-request - `com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServiceQuotaIncreaseRequestFromTemplate operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest delete-service-quota-increase-request-from-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceQuotaIncreaseRequestFromTemplateAsync delete-service-quota-increase-request-from-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest delete-service-quota-increase-request-from-template-request]
    (-> this (.deleteServiceQuotaIncreaseRequestFromTemplateAsync delete-service-quota-increase-request-from-template-request))))

(defn disassociate-service-quota-template-async
  "Disables the Service Quotas template. Once the template is disabled, it does not request quota increases for new
   accounts in your organization. Disabling the quota template does not apply the quota increase requests from the
   template.


   Related operations




   To enable the quota template, call AssociateServiceQuotaTemplate.




   To delete a specific service quota from the template, use DeleteServiceQuotaIncreaseRequestFromTemplate.

  disassociate-service-quota-template-request - `com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateServiceQuotaTemplate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest disassociate-service-quota-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateServiceQuotaTemplateAsync disassociate-service-quota-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest disassociate-service-quota-template-request]
    (-> this (.disassociateServiceQuotaTemplateAsync disassociate-service-quota-template-request))))

(defn get-service-quota-async
  "Returns the details for the specified service quota. This operation provides a different Value than the
   GetAWSDefaultServiceQuota operation. This operation returns the applied value for each quota.
   GetAWSDefaultServiceQuota returns the default AWS value for each quota.

  get-service-quota-request - `com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceQuota operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.GetServiceQuotaResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest get-service-quota-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceQuotaAsync get-service-quota-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest get-service-quota-request]
    (-> this (.getServiceQuotaAsync get-service-quota-request))))

(defn list-aws-default-service-quotas-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAWSDefaultServiceQuotas operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest list-aws-default-service-quotas-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAWSDefaultServiceQuotasAsync list-aws-default-service-quotas-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest list-aws-default-service-quotas-request]
    (-> this (.listAWSDefaultServiceQuotasAsync list-aws-default-service-quotas-request))))

(defn put-service-quota-increase-request-into-template-async
  "Defines and adds a quota to the service quota template. To add a quota to the template, you must provide the
   ServiceCode, QuotaCode, AwsRegion, and DesiredValue. Once you
   add a quota to the template, use ListServiceQuotaIncreaseRequestsInTemplate to see the list of quotas in
   the template.

  put-service-quota-increase-request-into-template-request - `com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutServiceQuotaIncreaseRequestIntoTemplate operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest put-service-quota-increase-request-into-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putServiceQuotaIncreaseRequestIntoTemplateAsync put-service-quota-increase-request-into-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsync this ^com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest put-service-quota-increase-request-into-template-request]
    (-> this (.putServiceQuotaIncreaseRequestIntoTemplateAsync put-service-quota-increase-request-into-template-request))))

