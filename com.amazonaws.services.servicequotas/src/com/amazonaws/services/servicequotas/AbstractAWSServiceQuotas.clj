(ns com.amazonaws.services.servicequotas.AbstractAWSServiceQuotas
  "Abstract implementation of AWSServiceQuotas. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicequotas AbstractAWSServiceQuotas]))

(defn list-aws-default-service-quotas
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest`

  returns: Result of the ListAWSDefaultServiceQuotas operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasResult`"
  (^com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListAWSDefaultServiceQuotasRequest request]
    (-> this (.listAWSDefaultServiceQuotas request))))

(defn associate-service-quota-template
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest`

  returns: Result of the AssociateServiceQuotaTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateResult`"
  (^com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.AssociateServiceQuotaTemplateRequest request]
    (-> this (.associateServiceQuotaTemplate request))))

(defn list-services
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.ListServicesRequest`

  returns: Result of the ListServices operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListServicesResult`"
  (^com.amazonaws.services.servicequotas.model.ListServicesResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListServicesRequest request]
    (-> this (.listServices request))))

(defn get-association-for-service-quota-template
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest`

  returns: Result of the GetAssociationForServiceQuotaTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateResult`"
  (^com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.GetAssociationForServiceQuotaTemplateRequest request]
    (-> this (.getAssociationForServiceQuotaTemplate request))))

(defn request-service-quota-increase
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest`

  returns: Result of the RequestServiceQuotaIncrease operation returned by the service. - `com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseResult`"
  (^com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.RequestServiceQuotaIncreaseRequest request]
    (-> this (.requestServiceQuotaIncrease request))))

(defn disassociate-service-quota-template
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest`

  returns: Result of the DisassociateServiceQuotaTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateResult`"
  (^com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.DisassociateServiceQuotaTemplateRequest request]
    (-> this (.disassociateServiceQuotaTemplate request))))

(defn get-service-quota
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest`

  returns: Result of the GetServiceQuota operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetServiceQuotaResult`"
  (^com.amazonaws.services.servicequotas.model.GetServiceQuotaResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaRequest request]
    (-> this (.getServiceQuota request))))

(defn list-service-quota-increase-requests-in-template
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest`

  returns: Result of the ListServiceQuotaIncreaseRequestsInTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateResult`"
  (^com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListServiceQuotaIncreaseRequestsInTemplateRequest request]
    (-> this (.listServiceQuotaIncreaseRequestsInTemplate request))))

(defn get-aws-default-service-quota
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest`

  returns: Result of the GetAWSDefaultServiceQuota operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaResult`"
  (^com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.GetAWSDefaultServiceQuotaRequest request]
    (-> this (.getAWSDefaultServiceQuota request))))

(defn shutdown
  "Description copied from interface: AWSServiceQuotas"
  ([^AbstractAWSServiceQuotas this]
    (-> this (.shutdown))))

(defn delete-service-quota-increase-request-from-template
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest`

  returns: Result of the DeleteServiceQuotaIncreaseRequestFromTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateResult`"
  (^com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.DeleteServiceQuotaIncreaseRequestFromTemplateRequest request]
    (-> this (.deleteServiceQuotaIncreaseRequestFromTemplate request))))

(defn put-service-quota-increase-request-into-template
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest`

  returns: Result of the PutServiceQuotaIncreaseRequestIntoTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateResult`"
  (^com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.PutServiceQuotaIncreaseRequestIntoTemplateRequest request]
    (-> this (.putServiceQuotaIncreaseRequestIntoTemplate request))))

(defn list-requested-service-quota-change-history
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest`

  returns: Result of the ListRequestedServiceQuotaChangeHistory operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryResult`"
  (^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryRequest request]
    (-> this (.listRequestedServiceQuotaChangeHistory request))))

(defn get-requested-service-quota-change
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest`

  returns: Result of the GetRequestedServiceQuotaChange operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeResult`"
  (^com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.GetRequestedServiceQuotaChangeRequest request]
    (-> this (.getRequestedServiceQuotaChange request))))

(defn list-requested-service-quota-change-history-by-quota
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest`

  returns: Result of the ListRequestedServiceQuotaChangeHistoryByQuota operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaResult`"
  (^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListRequestedServiceQuotaChangeHistoryByQuotaRequest request]
    (-> this (.listRequestedServiceQuotaChangeHistoryByQuota request))))

(defn list-service-quotas
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest`

  returns: Result of the ListServiceQuotas operation returned by the service. - `com.amazonaws.services.servicequotas.model.ListServiceQuotasResult`"
  (^com.amazonaws.services.servicequotas.model.ListServiceQuotasResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.ListServiceQuotasRequest request]
    (-> this (.listServiceQuotas request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSServiceQuotas

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSServiceQuotas this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-service-quota-increase-request-from-template
  "Description copied from interface: AWSServiceQuotas

  request - `com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest`

  returns: Result of the GetServiceQuotaIncreaseRequestFromTemplate operation returned by the service. - `com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateResult`"
  (^com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateResult [^AbstractAWSServiceQuotas this ^com.amazonaws.services.servicequotas.model.GetServiceQuotaIncreaseRequestFromTemplateRequest request]
    (-> this (.getServiceQuotaIncreaseRequestFromTemplate request))))

