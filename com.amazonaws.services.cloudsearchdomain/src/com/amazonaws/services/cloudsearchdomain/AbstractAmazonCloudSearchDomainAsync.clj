(ns com.amazonaws.services.cloudsearchdomain.AbstractAmazonCloudSearchDomainAsync
  "Abstract implementation of AmazonCloudSearchDomainAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchdomain AbstractAmazonCloudSearchDomainAsync]))

(defn search-async
  "Description copied from interface: AmazonCloudSearchDomainAsync

  request - Container for the parameters to the Search request. - `com.amazonaws.services.cloudsearchdomain.model.SearchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Search operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchdomain.model.SearchResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.SearchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.SearchRequest request]
    (-> this (.searchAsync request))))

(defn suggest-async
  "Description copied from interface: AmazonCloudSearchDomainAsync

  request - Container for the parameters to the Suggest request. - `com.amazonaws.services.cloudsearchdomain.model.SuggestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Suggest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchdomain.model.SuggestResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.SuggestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.suggestAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.SuggestRequest request]
    (-> this (.suggestAsync request))))

(defn upload-documents-async
  "Description copied from interface: AmazonCloudSearchDomainAsync

  request - Container for the parameters to the UploadDocuments request. - `com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadDocuments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadDocumentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudSearchDomainAsync this ^com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest request]
    (-> this (.uploadDocumentsAsync request))))

