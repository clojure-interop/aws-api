(ns com.amazonaws.services.ioteventsdata.AbstractAWSIoTEventsDataAsync
  "Abstract implementation of AWSIoTEventsDataAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ioteventsdata AbstractAWSIoTEventsDataAsync]))

(defn batch-put-message-async
  "Description copied from interface: AWSIoTEventsDataAsync

  request - `com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchPutMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.BatchPutMessageResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchPutMessageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest request]
    (-> this (.batchPutMessageAsync request))))

(defn batch-update-detector-async
  "Description copied from interface: AWSIoTEventsDataAsync

  request - `com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUpdateDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUpdateDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest request]
    (-> this (.batchUpdateDetectorAsync request))))

(defn describe-detector-async
  "Description copied from interface: AWSIoTEventsDataAsync

  request - `com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.DescribeDetectorResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest request]
    (-> this (.describeDetectorAsync request))))

(defn list-detectors-async
  "Description copied from interface: AWSIoTEventsDataAsync

  request - `com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDetectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ioteventsdata.model.ListDetectorsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDetectorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIoTEventsDataAsync this ^com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest request]
    (-> this (.listDetectorsAsync request))))

