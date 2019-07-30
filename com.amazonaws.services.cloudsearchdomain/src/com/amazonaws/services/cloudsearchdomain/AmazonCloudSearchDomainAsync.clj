(ns com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomainAsync
  "Interface for accessing Amazon CloudSearch Domain asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudSearchDomainAsync instead.



  You use the AmazonCloudSearch2013 API to upload documents to a search domain and search those documents.


  The endpoints for submitting UploadDocuments, Search, and Suggest requests are
  domain-specific. To get the endpoints for your domain, use the Amazon CloudSearch configuration service
  DescribeDomains action. The domain endpoints are also displayed on the domain dashboard in the Amazon
  CloudSearch console. You submit suggest requests to the search endpoint.


  For more information, see the Amazon
  CloudSearch Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchdomain AmazonCloudSearchDomainAsync]))

(defn search-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Search operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchdomain.model.SearchResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.SearchRequest search-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchAsync search-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.SearchRequest search-request]
    (-> this (.searchAsync search-request))))

(defn suggest-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Suggest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchdomain.model.SuggestResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.SuggestRequest suggest-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.suggestAsync suggest-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.SuggestRequest suggest-request]
    (-> this (.suggestAsync suggest-request))))

(defn upload-documents-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadDocuments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest upload-documents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadDocumentsAsync upload-documents-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest upload-documents-request]
    (-> this (.uploadDocumentsAsync upload-documents-request))))

