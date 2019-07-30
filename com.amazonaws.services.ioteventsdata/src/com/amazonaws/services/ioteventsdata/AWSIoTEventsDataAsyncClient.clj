(ns com.amazonaws.services.ioteventsdata.AWSIoTEventsDataAsyncClient
  "Client for accessing AWS IoT Events Data asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
  when such events occur. AWS IoT Events Data API commands enable you to send inputs to detectors, list detectors, and
  view or update a detector's status."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ioteventsdata AWSIoTEventsDataAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.ioteventsdata.AWSIoTEventsDataAsyncClientBuilder`"
  (^com.amazonaws.services.ioteventsdata.AWSIoTEventsDataAsyncClientBuilder []
    (AWSIoTEventsDataAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSIoTEventsDataAsyncClient this]
    (-> this (.getExecutorService))))

(defn batch-put-message-async
  "Description copied from interface: AWSIoTEventsDataAsync

  request - `com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchPutMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.BatchPutMessageResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsyncClient this ^com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchPutMessageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsyncClient this ^com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest request]
    (-> this (.batchPutMessageAsync request))))

(defn batch-update-detector-async
  "Description copied from interface: AWSIoTEventsDataAsync

  request - `com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUpdateDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsyncClient this ^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUpdateDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsyncClient this ^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest request]
    (-> this (.batchUpdateDetectorAsync request))))

(defn describe-detector-async
  "Description copied from interface: AWSIoTEventsDataAsync

  request - `com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.DescribeDetectorResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsyncClient this ^com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsyncClient this ^com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest request]
    (-> this (.describeDetectorAsync request))))

(defn list-detectors-async
  "Description copied from interface: AWSIoTEventsDataAsync

  request - `com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDetectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.ListDetectorsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsyncClient this ^com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDetectorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsyncClient this ^com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest request]
    (-> this (.listDetectorsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSIoTEventsDataAsyncClient this]
    (-> this (.shutdown))))

