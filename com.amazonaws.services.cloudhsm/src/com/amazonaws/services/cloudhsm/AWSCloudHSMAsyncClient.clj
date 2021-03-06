(ns com.amazonaws.services.cloudhsm.AWSCloudHSMAsyncClient
  "Client for accessing CloudHSM asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  AWS CloudHSM Service

  This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


  For information about the current version of AWS CloudHSM, see AWS
  CloudHSM, the AWS CloudHSM User Guide, and
  the AWS CloudHSM API Reference."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudhsm AWSCloudHSMAsyncClient]))

(defn ->aws-cloud-hsm-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSCloudHSMAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCloudHSMAsyncClient aws-credentials client-configuration executor-service))
  (^AWSCloudHSMAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCloudHSMAsyncClient aws-credentials executor-service))
  (^AWSCloudHSMAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCloudHSMAsyncClient client-configuration))
  (^AWSCloudHSMAsyncClient []
    (new AWSCloudHSMAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.cloudhsm.AWSCloudHSMAsyncClientBuilder`"
  (^com.amazonaws.services.cloudhsm.AWSCloudHSMAsyncClientBuilder []
    (AWSCloudHSMAsyncClient/asyncBuilder )))

(defn modify-hapg-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.ModifyHapgRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyHapg operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ModifyHapgResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ModifyHapgRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyHapgAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ModifyHapgRequest request]
    (-> this (.modifyHapgAsync request))))

(defn delete-hsm-async
  "Description copied from interface: AWSCloudHSMAsync

  request - Contains the inputs for the DeleteHsm operation. - `com.amazonaws.services.cloudhsm.model.DeleteHsmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DeleteHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DeleteHsmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHsmAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DeleteHsmRequest request]
    (-> this (.deleteHsmAsync request))))

(defn modify-luna-client-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyLunaClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyLunaClientAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest request]
    (-> this (.modifyLunaClientAsync request))))

(defn list-hapgs-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.ListHapgsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHapgs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ListHapgsResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ListHapgsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHapgsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ListHapgsRequest request]
    (-> this (.listHapgsAsync request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this]
    (-> this (.listHapgsAsync))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSCloudHSMAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-luna-clients-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLunaClients operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ListLunaClientsResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLunaClientsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest request]
    (-> this (.listLunaClientsAsync request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this]
    (-> this (.listLunaClientsAsync))))

(defn list-available-zones-async
  "Description copied from interface: AWSCloudHSMAsync

  request - Contains the inputs for the ListAvailableZones action. - `com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAvailableZones operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAvailableZonesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest request]
    (-> this (.listAvailableZonesAsync request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this]
    (-> this (.listAvailableZonesAsync))))

(defn create-luna-client-async
  "Description copied from interface: AWSCloudHSMAsync

  request - Contains the inputs for the CreateLunaClient action. - `com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLunaClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.CreateLunaClientResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLunaClientAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest request]
    (-> this (.createLunaClientAsync request))))

(defn delete-hapg-async
  "Description copied from interface: AWSCloudHSMAsync

  request - Contains the inputs for the DeleteHapg action. - `com.amazonaws.services.cloudhsm.model.DeleteHapgRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHapg operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DeleteHapgResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DeleteHapgRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHapgAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DeleteHapgRequest request]
    (-> this (.deleteHapgAsync request))))

(defn modify-hsm-async
  "Description copied from interface: AWSCloudHSMAsync

  request - Contains the inputs for the ModifyHsm operation. - `com.amazonaws.services.cloudhsm.model.ModifyHsmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ModifyHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ModifyHsmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyHsmAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ModifyHsmRequest request]
    (-> this (.modifyHsmAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSCloudHSMAsyncClient this]
    (-> this (.shutdown))))

(defn get-config-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.GetConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.GetConfigResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.GetConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.GetConfigRequest request]
    (-> this (.getConfigAsync request))))

(defn list-hsms-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.ListHsmsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHsms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ListHsmsResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ListHsmsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHsmsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ListHsmsRequest request]
    (-> this (.listHsmsAsync request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this]
    (-> this (.listHsmsAsync))))

(defn describe-hapg-async
  "Description copied from interface: AWSCloudHSMAsync

  request - Contains the inputs for the DescribeHapg action. - `com.amazonaws.services.cloudhsm.model.DescribeHapgRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHapg operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DescribeHapgResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DescribeHapgRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHapgAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DescribeHapgRequest request]
    (-> this (.describeHapgAsync request))))

(defn remove-tags-from-resource-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResourceAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn describe-luna-client-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLunaClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLunaClientAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest request]
    (-> this (.describeLunaClientAsync request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this]
    (-> this (.describeLunaClientAsync))))

(defn delete-luna-client-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLunaClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLunaClientAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest request]
    (-> this (.deleteLunaClientAsync request))))

(defn add-tags-to-resource-async
  "Description copied from interface: AWSCloudHSMAsync

  request - `com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResourceAsync request))))

(defn create-hapg-async
  "Description copied from interface: AWSCloudHSMAsync

  request - Contains the inputs for the CreateHapgRequest action. - `com.amazonaws.services.cloudhsm.model.CreateHapgRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHapg operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.CreateHapgResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.CreateHapgRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHapgAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.CreateHapgRequest request]
    (-> this (.createHapgAsync request))))

(defn create-hsm-async
  "Description copied from interface: AWSCloudHSMAsync

  request - Contains the inputs for the CreateHsm operation. - `com.amazonaws.services.cloudhsm.model.CreateHsmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.CreateHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.CreateHsmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHsmAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.CreateHsmRequest request]
    (-> this (.createHsmAsync request))))

(defn describe-hsm-async
  "Description copied from interface: AWSCloudHSMAsync

  request - Contains the inputs for the DescribeHsm operation. - `com.amazonaws.services.cloudhsm.model.DescribeHsmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DescribeHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DescribeHsmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHsmAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this ^com.amazonaws.services.cloudhsm.model.DescribeHsmRequest request]
    (-> this (.describeHsmAsync request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsyncClient this]
    (-> this (.describeHsmAsync))))

