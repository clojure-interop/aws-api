(ns com.amazonaws.services.iotevents.AWSIoTEventsAsyncClient
  "Client for accessing AWS IoT Events asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
  when such events occur. AWS IoT Events API commands enable you to create, read, update and delete inputs and detector
  models, and to list their versions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotevents AWSIoTEventsAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.iotevents.AWSIoTEventsAsyncClientBuilder`"
  (^com.amazonaws.services.iotevents.AWSIoTEventsAsyncClientBuilder []
    (AWSIoTEventsAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-detector-model-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDetectorModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.UpdateDetectorModelResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDetectorModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest request]
    (-> this (.updateDetectorModelAsync request))))

(defn list-detector-models-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.ListDetectorModelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDetectorModels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.ListDetectorModelsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.ListDetectorModelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDetectorModelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.ListDetectorModelsRequest request]
    (-> this (.listDetectorModelsAsync request))))

(defn update-input-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.UpdateInputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.UpdateInputResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.UpdateInputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInputAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.UpdateInputRequest request]
    (-> this (.updateInputAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSIoTEventsAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-input-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.DeleteInputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.DeleteInputResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.DeleteInputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInputAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.DeleteInputRequest request]
    (-> this (.deleteInputAsync request))))

(defn create-input-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.CreateInputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.CreateInputResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.CreateInputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInputAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.CreateInputRequest request]
    (-> this (.createInputAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSIoTEventsAsyncClient this]
    (-> this (.shutdown))))

(defn describe-logging-options-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.DescribeLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoggingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest request]
    (-> this (.describeLoggingOptionsAsync request))))

(defn list-inputs-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.ListInputsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInputs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.ListInputsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.ListInputsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInputsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.ListInputsRequest request]
    (-> this (.listInputsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn describe-detector-model-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDetectorModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.DescribeDetectorModelResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDetectorModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest request]
    (-> this (.describeDetectorModelAsync request))))

(defn create-detector-model-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.CreateDetectorModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDetectorModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.CreateDetectorModelResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.CreateDetectorModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDetectorModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.CreateDetectorModelRequest request]
    (-> this (.createDetectorModelAsync request))))

(defn delete-detector-model-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDetectorModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.DeleteDetectorModelResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDetectorModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest request]
    (-> this (.deleteDetectorModelAsync request))))

(defn put-logging-options-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.PutLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLoggingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest request]
    (-> this (.putLoggingOptionsAsync request))))

(defn list-detector-model-versions-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDetectorModelVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.ListDetectorModelVersionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDetectorModelVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest request]
    (-> this (.listDetectorModelVersionsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn describe-input-async
  "Description copied from interface: AWSIoTEventsAsync

  request - `com.amazonaws.services.iotevents.model.DescribeInputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.DescribeInputResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.DescribeInputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInputAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsyncClient this ^com.amazonaws.services.iotevents.model.DescribeInputRequest request]
    (-> this (.describeInputAsync request))))

