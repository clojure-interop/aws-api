(ns com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomain
  "Interface for accessing Amazon CloudSearch Domain.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudSearchDomain instead.



  You use the AmazonCloudSearch2013 API to upload documents to a search domain and search those documents.


  The endpoints for submitting UploadDocuments, Search, and Suggest requests are
  domain-specific. To get the endpoints for your domain, use the Amazon CloudSearch configuration service
  DescribeDomains action. The domain endpoints are also displayed on the domain dashboard in the Amazon
  CloudSearch console. You submit suggest requests to the search endpoint.


  For more information, see the Amazon
  CloudSearch Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchdomain AmazonCloudSearchDomain]))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint or a full URL, including the protocol of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonCloudSearchDomain this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonCloudSearchDomain this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn search
  "Retrieves a list of documents that match the specified search criteria. How you specify the search criteria
   depends on which query parser you use. Amazon CloudSearch supports four query parsers:


   simple: search all text and text-array fields for the specified
   string. Search for phrases, individual terms, and prefixes.
   structured: search specific fields, construct compound queries using Boolean operators, and use
   advanced features such as term boosting and proximity searching.
   lucene: specify search criteria using the Apache Lucene query parser syntax.
   dismax: specify search criteria using the simplified subset of the Apache Lucene query parser
   syntax defined by the DisMax query parser.


   For more information, see Searching Your Data in the
   Amazon CloudSearch Developer Guide.


   The endpoint for submitting Search requests is domain-specific. You submit search requests to a
   domain's search endpoint. To get the search endpoint for your domain, use the Amazon CloudSearch configuration
   service DescribeDomains action. A domain's endpoints are also displayed on the domain dashboard in
   the Amazon CloudSearch console.

  search-request - Container for the parameters to the Search request. - `com.amazonaws.services.cloudsearchdomain.model.SearchRequest`

  returns: Result of the Search operation returned by the service. - `com.amazonaws.services.cloudsearchdomain.model.SearchResult`

  throws: com.amazonaws.services.cloudsearchdomain.model.SearchException - Information about any problems encountered while processing a search request."
  (^com.amazonaws.services.cloudsearchdomain.model.SearchResult [^AmazonCloudSearchDomain this ^com.amazonaws.services.cloudsearchdomain.model.SearchRequest search-request]
    (-> this (.search search-request))))

(defn suggest
  "Retrieves autocomplete suggestions for a partial query string. You can use suggestions enable you to display
   likely matches before users finish typing. In Amazon CloudSearch, suggestions are based on the contents of a
   particular text field. When you request suggestions, Amazon CloudSearch finds all of the documents whose values
   in the suggester field start with the specified query string. The beginning of the field must match the query
   string to be considered a match.


   For more information about configuring suggesters and retrieving suggestions, see Getting
   Suggestions in the Amazon CloudSearch Developer Guide.


   The endpoint for submitting Suggest requests is domain-specific. You submit suggest requests to a
   domain's search endpoint. To get the search endpoint for your domain, use the Amazon CloudSearch configuration
   service DescribeDomains action. A domain's endpoints are also displayed on the domain dashboard in
   the Amazon CloudSearch console.

  suggest-request - Container for the parameters to the Suggest request. - `com.amazonaws.services.cloudsearchdomain.model.SuggestRequest`

  returns: Result of the Suggest operation returned by the service. - `com.amazonaws.services.cloudsearchdomain.model.SuggestResult`

  throws: com.amazonaws.services.cloudsearchdomain.model.SearchException - Information about any problems encountered while processing a search request."
  (^com.amazonaws.services.cloudsearchdomain.model.SuggestResult [^AmazonCloudSearchDomain this ^com.amazonaws.services.cloudsearchdomain.model.SuggestRequest suggest-request]
    (-> this (.suggest suggest-request))))

(defn upload-documents
  "Posts a batch of documents to a search domain for indexing. A document batch is a collection of add and delete
   operations that represent the documents you want to add, update, or delete from your domain. Batches can be
   described in either JSON or XML. Each item that you want Amazon CloudSearch to return as a search result (such as
   a product) is represented as a document. Every document has a unique ID and one or more fields that contain the
   data that you want to search and return in results. Individual documents cannot contain more than 1 MB of data.
   The entire batch cannot exceed 5 MB. To get the best possible upload performance, group add and delete operations
   in batches that are close the 5 MB limit. Submitting a large volume of single-document batches can overload a
   domain's document service.


   The endpoint for submitting UploadDocuments requests is domain-specific. To get the document
   endpoint for your domain, use the Amazon CloudSearch configuration service DescribeDomains action. A
   domain's endpoints are also displayed on the domain dashboard in the Amazon CloudSearch console.


   For more information about formatting your data for Amazon CloudSearch, see Preparing Your Data
   in the Amazon CloudSearch Developer Guide. For more information about uploading data for indexing, see Uploading Data in the
   Amazon CloudSearch Developer Guide.

  upload-documents-request - Container for the parameters to the UploadDocuments request. - `com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest`

  returns: Result of the UploadDocuments operation returned by the service. - `com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult`

  throws: com.amazonaws.services.cloudsearchdomain.model.DocumentServiceException - Information about any problems encountered while processing an upload request."
  (^com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult [^AmazonCloudSearchDomain this ^com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest upload-documents-request]
    (-> this (.uploadDocuments upload-documents-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonCloudSearchDomain this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCloudSearchDomain this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

