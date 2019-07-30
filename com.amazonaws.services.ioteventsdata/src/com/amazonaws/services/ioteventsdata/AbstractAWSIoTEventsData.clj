(ns com.amazonaws.services.ioteventsdata.AbstractAWSIoTEventsData
  "Abstract implementation of AWSIoTEventsData. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ioteventsdata AbstractAWSIoTEventsData]))

(defn batch-put-message
  "Description copied from interface: AWSIoTEventsData

  request - `com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest`

  returns: Result of the BatchPutMessage operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.BatchPutMessageResult`"
  (^com.amazonaws.services.ioteventsdata.model.BatchPutMessageResult [^AbstractAWSIoTEventsData this ^com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest request]
    (-> this (.batchPutMessage request))))

(defn batch-update-detector
  "Description copied from interface: AWSIoTEventsData

  request - `com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest`

  returns: Result of the BatchUpdateDetector operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorResult`"
  (^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorResult [^AbstractAWSIoTEventsData this ^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest request]
    (-> this (.batchUpdateDetector request))))

(defn describe-detector
  "Description copied from interface: AWSIoTEventsData

  request - `com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest`

  returns: Result of the DescribeDetector operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.DescribeDetectorResult`"
  (^com.amazonaws.services.ioteventsdata.model.DescribeDetectorResult [^AbstractAWSIoTEventsData this ^com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest request]
    (-> this (.describeDetector request))))

(defn list-detectors
  "Description copied from interface: AWSIoTEventsData

  request - `com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest`

  returns: Result of the ListDetectors operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.ListDetectorsResult`"
  (^com.amazonaws.services.ioteventsdata.model.ListDetectorsResult [^AbstractAWSIoTEventsData this ^com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest request]
    (-> this (.listDetectors request))))

(defn shutdown
  "Description copied from interface: AWSIoTEventsData"
  ([^AbstractAWSIoTEventsData this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSIoTEventsData

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSIoTEventsData this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

