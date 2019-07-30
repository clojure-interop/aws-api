(ns com.amazonaws.services.ioteventsdata.AWSIoTEventsDataAsync
  "Interface for accessing AWS IoT Events Data asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoTEventsDataAsync instead.



  AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
  when such events occur. AWS IoT Events Data API commands enable you to send inputs to detectors, list detectors, and
  view or update a detector's status."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ioteventsdata AWSIoTEventsDataAsync]))

(defn batch-put-message-async
  "Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you
   specify (\"inputName\") and ingested into any detectors that monitor that input. If multiple messages
   are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send
   messages one at a time and wait for a successful response.

  batch-put-message-request - `com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchPutMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.BatchPutMessageResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest batch-put-message-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchPutMessageAsync batch-put-message-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest batch-put-message-request]
    (-> this (.batchPutMessageAsync batch-put-message-request))))

(defn batch-update-detector-async
  "Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified
   detector model.

  batch-update-detector-request - `com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUpdateDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest batch-update-detector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUpdateDetectorAsync batch-update-detector-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest batch-update-detector-request]
    (-> this (.batchUpdateDetectorAsync batch-update-detector-request))))

(defn describe-detector-async
  "Returns information about the specified detector (instance).

  describe-detector-request - `com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.DescribeDetectorResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest describe-detector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDetectorAsync describe-detector-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest describe-detector-request]
    (-> this (.describeDetectorAsync describe-detector-request))))

(defn list-detectors-async
  "Lists detectors (the instances of a detector model).

  list-detectors-request - `com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDetectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.ListDetectorsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest list-detectors-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDetectorsAsync list-detectors-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest list-detectors-request]
    (-> this (.listDetectorsAsync list-detectors-request))))

