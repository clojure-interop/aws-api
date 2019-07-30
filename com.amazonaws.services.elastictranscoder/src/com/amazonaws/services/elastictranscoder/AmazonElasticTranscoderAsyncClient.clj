(ns com.amazonaws.services.elastictranscoder.AmazonElasticTranscoderAsyncClient
  "Client for accessing Amazon Elastic Transcoder asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Elastic Transcoder Service

  The AWS Elastic Transcoder Service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elastictranscoder AmazonElasticTranscoderAsyncClient]))

(defn ->amazon-elastic-transcoder-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonElasticTranscoderAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonElasticTranscoderAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonElasticTranscoderAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonElasticTranscoderAsyncClient aws-credentials executor-service))
  (^AmazonElasticTranscoderAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElasticTranscoderAsyncClient client-configuration))
  (^AmazonElasticTranscoderAsyncClient []
    (new AmazonElasticTranscoderAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.elastictranscoder.AmazonElasticTranscoderAsyncClientBuilder`"
  (^com.amazonaws.services.elastictranscoder.AmazonElasticTranscoderAsyncClientBuilder []
    (AmazonElasticTranscoderAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonElasticTranscoderAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-preset-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The CreatePresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreatePresetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.CreatePresetResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.CreatePresetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPresetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.CreatePresetRequest request]
    (-> this (.createPresetAsync request))))

(defn delete-preset-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The DeletePresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.DeletePresetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.DeletePresetResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.DeletePresetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePresetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.DeletePresetRequest request]
    (-> this (.deletePresetAsync request))))

(defn list-jobs-by-status-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The ListJobsByStatusRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobsByStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsByStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest request]
    (-> this (.listJobsByStatusAsync request))))

(defn update-pipeline-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The UpdatePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest request]
    (-> this (.updatePipelineAsync request))))

(defn test-role-async
  "Deprecated.

  request - The TestRoleRequest structure. - `com.amazonaws.services.elastictranscoder.model.TestRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.TestRoleResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.TestRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.TestRoleRequest request]
    (-> this (.testRoleAsync request))))

(defn list-presets-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The ListPresetsRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListPresetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPresets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ListPresetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ListPresetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPresetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ListPresetsRequest request]
    (-> this (.listPresetsAsync request)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this]
    (-> this (.listPresetsAsync))))

(defn update-pipeline-status-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The UpdatePipelineStatusRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipelineStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest request]
    (-> this (.updatePipelineStatusAsync request))))

(defn list-pipelines-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The ListPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ListPipelinesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelinesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest request]
    (-> this (.listPipelinesAsync request)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this]
    (-> this (.listPipelinesAsync))))

(defn update-pipeline-notifications-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The UpdatePipelineNotificationsRequest structure. - `com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipelineNotifications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineNotificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest request]
    (-> this (.updatePipelineNotificationsAsync request))))

(defn read-job-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The ReadJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReadJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ReadJobResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ReadJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.readJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ReadJobRequest request]
    (-> this (.readJobAsync request))))

(defn delete-pipeline-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The DeletePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.DeletePipelineResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest request]
    (-> this (.deletePipelineAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonElasticTranscoderAsyncClient this]
    (-> this (.shutdown))))

(defn cancel-job-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The CancelJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.CancelJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.CancelJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.CancelJobRequest request]
    (-> this (.cancelJobAsync request))))

(defn read-pipeline-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The ReadPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReadPipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ReadPipelineResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.readPipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest request]
    (-> this (.readPipelineAsync request))))

(defn list-jobs-by-pipeline-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The ListJobsByPipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobsByPipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsByPipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest request]
    (-> this (.listJobsByPipelineAsync request))))

(defn create-job-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The CreateJobRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.CreateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.CreateJobRequest request]
    (-> this (.createJobAsync request))))

(defn create-pipeline-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The CreatePipelineRequest structure. - `com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.CreatePipelineResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest request]
    (-> this (.createPipelineAsync request))))

(defn read-preset-async
  "Description copied from interface: AmazonElasticTranscoderAsync

  request - The ReadPresetRequest structure. - `com.amazonaws.services.elastictranscoder.model.ReadPresetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReadPreset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elastictranscoder.model.ReadPresetResult>`"
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ReadPresetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.readPresetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticTranscoderAsyncClient this ^com.amazonaws.services.elastictranscoder.model.ReadPresetRequest request]
    (-> this (.readPresetAsync request))))

