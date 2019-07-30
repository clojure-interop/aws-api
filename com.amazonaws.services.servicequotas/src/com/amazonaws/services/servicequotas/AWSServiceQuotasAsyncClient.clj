(ns com.amazonaws.services.servicequotas.AWSServiceQuotasAsyncClient
  "Client for accessing Service Quotas asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Service Quotas is a web service that you can use to manage many of your AWS service quotas. Quotas, also referred to
  as limits, are the maximum values for a resource, item, or operation. This guide provide descriptions of the Service
  Quotas actions that you can call from an API. For the Service Quotas user guide, which explains how to use Service
  Quotas from the console, see What is
  Service Quotas.



  AWS provides SDKs that consist of libraries and sample code for programming languages and platforms (Java, Ruby,
  .NET, iOS, Android, etc...,). The SDKs provide a convenient way to create programmatic access to Service Quotas and
  AWS. For information about the AWS SDKs, including how to download and install them, see the Tools for Amazon Web Services page."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicequotas AWSServiceQuotasAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.servicequotas.AWSServiceQuotasAsyncClientBuilder`"
  (^com.amazonaws.services.servicequotas.AWSServiceQuotasAsyncClientBuilder []
    (AWSServiceQuotasAsyncClient/asyncBuilder )))

(defn get-requested-service-quota-change-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRequestedServiceQuotaChange operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRequestedServiceQuotaChangeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest request]
    (-> this (.getRequestedServiceQuotaChangeAsync request))))

(defn get-association-for-service-quota-template-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAssociationForServiceQuotaTemplate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAssociationForServiceQuotaTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest request]
    (-> this (.getAssociationForServiceQuotaTemplateAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSServiceQuotasAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-requested-service-quota-change-history-by-quota-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRequestedServiceQuotaChangeHistoryByQuota operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRequestedServiceQuotaChangeHistoryByQuotaAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest request]
    (-> this (.listRequestedServiceQuotaChangeHistoryByQuotaAsync request))))

(defn list-service-quotas-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServiceQuotas operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListServiceQuotasResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServiceQuotasAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest request]
    (-> this (.listServiceQuotasAsync request))))

(defn list-service-quota-increase-requests-in-template-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServiceQuotaIncreaseRequestsInTemplate operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServiceQuotaIncreaseRequestsInTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest request]
    (-> this (.listServiceQuotaIncreaseRequestsInTemplateAsync request))))

(defn associate-service-quota-template-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateServiceQuotaTemplate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateServiceQuotaTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest request]
    (-> this (.associateServiceQuotaTemplateAsync request))))

(defn list-requested-service-quota-change-history-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRequestedServiceQuotaChangeHistory operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRequestedServiceQuotaChangeHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest request]
    (-> this (.listRequestedServiceQuotaChangeHistoryAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSServiceQuotasAsyncClient this]
    (-> this (.shutdown))))

(defn list-services-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.ListServicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListServicesResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListServicesRequest request]
    (-> this (.listServicesAsync request))))

(defn get-service-quota-increase-request-from-template-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceQuotaIncreaseRequestFromTemplate operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceQuotaIncreaseRequestFromTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest request]
    (-> this (.getServiceQuotaIncreaseRequestFromTemplateAsync request))))

(defn request-service-quota-increase-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestServiceQuotaIncrease operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestServiceQuotaIncreaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest request]
    (-> this (.requestServiceQuotaIncreaseAsync request))))

(defn get-aws-default-service-quota-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAWSDefaultServiceQuota operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAWSDefaultServiceQuotaAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest request]
    (-> this (.getAWSDefaultServiceQuotaAsync request))))

(defn delete-service-quota-increase-request-from-template-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServiceQuotaIncreaseRequestFromTemplate operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceQuotaIncreaseRequestFromTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest request]
    (-> this (.deleteServiceQuotaIncreaseRequestFromTemplateAsync request))))

(defn disassociate-service-quota-template-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateServiceQuotaTemplate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateServiceQuotaTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest request]
    (-> this (.disassociateServiceQuotaTemplateAsync request))))

(defn get-service-quota-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceQuota operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.GetServiceQuotaResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceQuotaAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest request]
    (-> this (.getServiceQuotaAsync request))))

(defn list-aws-default-service-quotas-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAWSDefaultServiceQuotas operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAWSDefaultServiceQuotasAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest request]
    (-> this (.listAWSDefaultServiceQuotasAsync request))))

(defn put-service-quota-increase-request-into-template-async
  "Description copied from interface: AWSServiceQuotasAsync

  request - `com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutServiceQuotaIncreaseRequestIntoTemplate operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putServiceQuotaIncreaseRequestIntoTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceQuotasAsyncClient this ^com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest request]
    (-> this (.putServiceQuotaIncreaseRequestIntoTemplateAsync request))))

