(ns com.amazonaws.services.importexport.AbstractAmazonImportExport
  "Abstract implementation of AmazonImportExport. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.importexport AbstractAmazonImportExport]))

(defn set-region
  "Description copied from interface: AmazonImportExport

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonImportExport this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-status
  "Description copied from interface: AmazonImportExport

  request - Input structure for the GetStatus operation. - `com.amazonaws.services.importexport.model.GetStatusRequest`

  returns: Result of the GetStatus operation returned by the service. - `com.amazonaws.services.importexport.model.GetStatusResult`"
  (^com.amazonaws.services.importexport.model.GetStatusResult [^AbstractAmazonImportExport this ^com.amazonaws.services.importexport.model.GetStatusRequest request]
    (-> this (.getStatus request))))

(defn update-job
  "Description copied from interface: AmazonImportExport

  request - Input structure for the UpateJob operation. - `com.amazonaws.services.importexport.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.importexport.model.UpdateJobResult`"
  (^com.amazonaws.services.importexport.model.UpdateJobResult [^AbstractAmazonImportExport this ^com.amazonaws.services.importexport.model.UpdateJobRequest request]
    (-> this (.updateJob request))))

(defn shutdown
  "Description copied from interface: AmazonImportExport"
  ([^AbstractAmazonImportExport this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: AmazonImportExport

  endpoint - The endpoint (ex: \"importexport.amazonaws.com\") or a full URL, including the protocol (ex: \"https://importexport.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonImportExport this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn cancel-job
  "Description copied from interface: AmazonImportExport

  request - Input structure for the CancelJob operation. - `com.amazonaws.services.importexport.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.importexport.model.CancelJobResult`"
  (^com.amazonaws.services.importexport.model.CancelJobResult [^AbstractAmazonImportExport this ^com.amazonaws.services.importexport.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn list-jobs
  "Description copied from interface: AmazonImportExport

  request - Input structure for the ListJobs operation. - `com.amazonaws.services.importexport.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.importexport.model.ListJobsResult`"
  (^com.amazonaws.services.importexport.model.ListJobsResult [^AbstractAmazonImportExport this ^com.amazonaws.services.importexport.model.ListJobsRequest request]
    (-> this (.listJobs request)))
  (^com.amazonaws.services.importexport.model.ListJobsResult [^AbstractAmazonImportExport this]
    (-> this (.listJobs))))

(defn get-shipping-label
  "Description copied from interface: AmazonImportExport

  request - `com.amazonaws.services.importexport.model.GetShippingLabelRequest`

  returns: Result of the GetShippingLabel operation returned by the service. - `com.amazonaws.services.importexport.model.GetShippingLabelResult`"
  (^com.amazonaws.services.importexport.model.GetShippingLabelResult [^AbstractAmazonImportExport this ^com.amazonaws.services.importexport.model.GetShippingLabelRequest request]
    (-> this (.getShippingLabel request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonImportExport

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonImportExport this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "Description copied from interface: AmazonImportExport

  request - Input structure for the CreateJob operation. - `com.amazonaws.services.importexport.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.importexport.model.CreateJobResult`"
  (^com.amazonaws.services.importexport.model.CreateJobResult [^AbstractAmazonImportExport this ^com.amazonaws.services.importexport.model.CreateJobRequest request]
    (-> this (.createJob request))))

