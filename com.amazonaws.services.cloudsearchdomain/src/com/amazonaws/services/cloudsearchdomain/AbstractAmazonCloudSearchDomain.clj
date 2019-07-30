(ns com.amazonaws.services.cloudsearchdomain.AbstractAmazonCloudSearchDomain
  "Abstract implementation of AmazonCloudSearchDomain. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchdomain AbstractAmazonCloudSearchDomain]))

(defn set-endpoint
  "Description copied from interface: AmazonCloudSearchDomain

  endpoint - The endpoint or a full URL, including the protocol of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonCloudSearchDomain this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Description copied from interface: AmazonCloudSearchDomain

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonCloudSearchDomain this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn search
  "Description copied from interface: AmazonCloudSearchDomain

  request - Container for the parameters to the Search request. - `com.amazonaws.services.cloudsearchdomain.model.SearchRequest`

  returns: Result of the Search operation returned by the service. - `com.amazonaws.services.cloudsearchdomain.model.SearchResult`"
  (^com.amazonaws.services.cloudsearchdomain.model.SearchResult [^AbstractAmazonCloudSearchDomain this ^com.amazonaws.services.cloudsearchdomain.model.SearchRequest request]
    (-> this (.search request))))

(defn suggest
  "Description copied from interface: AmazonCloudSearchDomain

  request - Container for the parameters to the Suggest request. - `com.amazonaws.services.cloudsearchdomain.model.SuggestRequest`

  returns: Result of the Suggest operation returned by the service. - `com.amazonaws.services.cloudsearchdomain.model.SuggestResult`"
  (^com.amazonaws.services.cloudsearchdomain.model.SuggestResult [^AbstractAmazonCloudSearchDomain this ^com.amazonaws.services.cloudsearchdomain.model.SuggestRequest request]
    (-> this (.suggest request))))

(defn upload-documents
  "Description copied from interface: AmazonCloudSearchDomain

  request - Container for the parameters to the UploadDocuments request. - `com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest`

  returns: Result of the UploadDocuments operation returned by the service. - `com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult`"
  (^com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult [^AbstractAmazonCloudSearchDomain this ^com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest request]
    (-> this (.uploadDocuments request))))

(defn shutdown
  "Description copied from interface: AmazonCloudSearchDomain"
  ([^AbstractAmazonCloudSearchDomain this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonCloudSearchDomain

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonCloudSearchDomain this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

