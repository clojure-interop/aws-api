(ns com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomainAsyncClient
  "Client for accessing Amazon CloudSearch Domain asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  You use the AmazonCloudSearch2013 API to upload documents to a search domain and search those documents.


  The endpoints for submitting UploadDocuments, Search, and Suggest requests are
  domain-specific. To get the endpoints for your domain, use the Amazon CloudSearch configuration service
  DescribeDomains action. The domain endpoints are also displayed on the domain dashboard in the Amazon
  CloudSearch console. You submit suggest requests to the search endpoint.


  For more information, see the Amazon
  CloudSearch Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchdomain AmazonCloudSearchDomainAsyncClient]))

(defn ->amazon-cloud-search-domain-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonCloudSearchDomainAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudSearchDomainAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonCloudSearchDomainAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudSearchDomainAsyncClient aws-credentials executor-service))
  (^AmazonCloudSearchDomainAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudSearchDomainAsyncClient client-configuration))
  (^AmazonCloudSearchDomainAsyncClient []
    (new AmazonCloudSearchDomainAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomainAsyncClientBuilder`"
  (^com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomainAsyncClientBuilder []
    (AmazonCloudSearchDomainAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonCloudSearchDomainAsyncClient this]
    (-> this (.getExecutorService))))

(defn search-async
  "Description copied from interface: AmazonCloudSearchDomainAsync

  request - Container for the parameters to the Search request. - `com.amazonaws.services.cloudsearchdomain.model.SearchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Search operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchdomain.model.SearchResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsyncClient this ^com.amazonaws.services.cloudsearchdomain.model.SearchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsyncClient this ^com.amazonaws.services.cloudsearchdomain.model.SearchRequest request]
    (-> this (.searchAsync request))))

(defn suggest-async
  "Description copied from interface: AmazonCloudSearchDomainAsync

  request - Container for the parameters to the Suggest request. - `com.amazonaws.services.cloudsearchdomain.model.SuggestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Suggest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchdomain.model.SuggestResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsyncClient this ^com.amazonaws.services.cloudsearchdomain.model.SuggestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.suggestAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsyncClient this ^com.amazonaws.services.cloudsearchdomain.model.SuggestRequest request]
    (-> this (.suggestAsync request))))

(defn upload-documents-async
  "Description copied from interface: AmazonCloudSearchDomainAsync

  request - Container for the parameters to the UploadDocuments request. - `com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadDocuments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsyncClient this ^com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadDocumentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchDomainAsyncClient this ^com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest request]
    (-> this (.uploadDocumentsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonCloudSearchDomainAsyncClient this]
    (-> this (.shutdown))))

