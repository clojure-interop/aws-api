(ns com.amazonaws.services.simpledb.AmazonSimpleDBAsyncClient
  "Client for accessing Amazon SimpleDB asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon SimpleDB is a web service providing the core database functions of data indexing and querying in the cloud. By
  offloading the time and effort associated with building and operating a web-scale database, SimpleDB provides
  developers the freedom to focus on application development.

  A traditional, clustered relational database requires a sizable upfront capital outlay, is complex to design, and
  often requires extensive and repetitive database administration. Amazon SimpleDB is dramatically simpler, requiring
  no schema, automatically indexing your data and providing a simple API for storage and access. This approach
  eliminates the administrative burden of data modeling, index maintenance, and performance tuning. Developers gain
  access to this functionality within Amazon's proven computing environment, are able to scale instantly, and pay only
  for what they use.


  Visit http://aws.amazon.com/simpledb/ for more information."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpledb AmazonSimpleDBAsyncClient]))

(defn ->amazon-simple-db-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonSimpleDBAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonSimpleDBAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonSimpleDBAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonSimpleDBAsyncClient aws-credentials executor-service))
  (^AmazonSimpleDBAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonSimpleDBAsyncClient client-configuration))
  (^AmazonSimpleDBAsyncClient []
    (new AmazonSimpleDBAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.simpledb.AmazonSimpleDBAsyncClientBuilder`"
  (^com.amazonaws.services.simpledb.AmazonSimpleDBAsyncClientBuilder []
    (AmazonSimpleDBAsyncClient/asyncBuilder )))

(defn domain-metadata-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.DomainMetadataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DomainMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.DomainMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.DomainMetadataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.domainMetadataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.DomainMetadataRequest request]
    (-> this (.domainMetadataAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonSimpleDBAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-domain-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.DeleteDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.DeleteDomainResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.DeleteDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.DeleteDomainRequest request]
    (-> this (.deleteDomainAsync request))))

(defn select-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.SelectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Select operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.SelectResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.SelectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.selectAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.SelectRequest request]
    (-> this (.selectAsync request))))

(defn get-attributes-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.GetAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.GetAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.GetAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.GetAttributesRequest request]
    (-> this (.getAttributesAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonSimpleDBAsyncClient this]
    (-> this (.shutdown))))

(defn create-domain-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.CreateDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.CreateDomainResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.CreateDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.CreateDomainRequest request]
    (-> this (.createDomainAsync request))))

(defn put-attributes-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.PutAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.PutAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.PutAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.PutAttributesRequest request]
    (-> this (.putAttributesAsync request))))

(defn list-domains-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.ListDomainsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.ListDomainsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.ListDomainsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.ListDomainsRequest request]
    (-> this (.listDomainsAsync request)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this]
    (-> this (.listDomainsAsync))))

(defn batch-put-attributes-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.BatchPutAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchPutAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.BatchPutAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.BatchPutAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchPutAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.BatchPutAttributesRequest request]
    (-> this (.batchPutAttributesAsync request))))

(defn delete-attributes-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.DeleteAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.DeleteAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.DeleteAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.DeleteAttributesRequest request]
    (-> this (.deleteAttributesAsync request))))

(defn batch-delete-attributes-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleDBAsyncClient this ^com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest request]
    (-> this (.batchDeleteAttributesAsync request))))

