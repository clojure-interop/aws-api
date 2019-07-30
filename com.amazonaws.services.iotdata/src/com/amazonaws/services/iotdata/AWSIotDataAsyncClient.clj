(ns com.amazonaws.services.iotdata.AWSIotDataAsyncClient
  "Client for accessing AWS IoT Data Plane asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS IoT

  AWS IoT-Data enables secure, bi-directional communication between Internet-connected things (such as sensors,
  actuators, embedded devices, or smart appliances) and the AWS cloud. It implements a broker for applications and
  things to publish messages over HTTP (Publish) and retrieve, update, and delete thing shadows. A thing shadow is a
  persistent representation of your things and their state in the AWS cloud."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotdata AWSIotDataAsyncClient]))

(defn ->aws-iot-data-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSIotDataAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSIotDataAsyncClient aws-credentials client-configuration executor-service))
  (^AWSIotDataAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSIotDataAsyncClient aws-credentials executor-service))
  (^AWSIotDataAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSIotDataAsyncClient client-configuration))
  (^AWSIotDataAsyncClient []
    (new AWSIotDataAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.iotdata.AWSIotDataAsyncClientBuilder`"
  (^com.amazonaws.services.iotdata.AWSIotDataAsyncClientBuilder []
    (AWSIotDataAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSIotDataAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-thing-shadow-async
  "Description copied from interface: AWSIotDataAsync

  request - The input for the DeleteThingShadow operation. - `com.amazonaws.services.iotdata.model.DeleteThingShadowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThingShadow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.DeleteThingShadowResult>`"
  (^java.util.concurrent.Future [^AWSIotDataAsyncClient this ^com.amazonaws.services.iotdata.model.DeleteThingShadowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThingShadowAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIotDataAsyncClient this ^com.amazonaws.services.iotdata.model.DeleteThingShadowRequest request]
    (-> this (.deleteThingShadowAsync request))))

(defn get-thing-shadow-async
  "Description copied from interface: AWSIotDataAsync

  request - The input for the GetThingShadow operation. - `com.amazonaws.services.iotdata.model.GetThingShadowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetThingShadow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.GetThingShadowResult>`"
  (^java.util.concurrent.Future [^AWSIotDataAsyncClient this ^com.amazonaws.services.iotdata.model.GetThingShadowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getThingShadowAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIotDataAsyncClient this ^com.amazonaws.services.iotdata.model.GetThingShadowRequest request]
    (-> this (.getThingShadowAsync request))))

(defn publish-async
  "Description copied from interface: AWSIotDataAsync

  request - The input for the Publish operation. - `com.amazonaws.services.iotdata.model.PublishRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Publish operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.PublishResult>`"
  (^java.util.concurrent.Future [^AWSIotDataAsyncClient this ^com.amazonaws.services.iotdata.model.PublishRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIotDataAsyncClient this ^com.amazonaws.services.iotdata.model.PublishRequest request]
    (-> this (.publishAsync request))))

(defn update-thing-shadow-async
  "Description copied from interface: AWSIotDataAsync

  request - The input for the UpdateThingShadow operation. - `com.amazonaws.services.iotdata.model.UpdateThingShadowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThingShadow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.UpdateThingShadowResult>`"
  (^java.util.concurrent.Future [^AWSIotDataAsyncClient this ^com.amazonaws.services.iotdata.model.UpdateThingShadowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThingShadowAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIotDataAsyncClient this ^com.amazonaws.services.iotdata.model.UpdateThingShadowRequest request]
    (-> this (.updateThingShadowAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSIotDataAsyncClient this]
    (-> this (.shutdown))))

