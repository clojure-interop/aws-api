(ns com.amazonaws.services.ioteventsdata.AWSIoTEventsData
  "Interface for accessing AWS IoT Events Data.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoTEventsData instead.



  AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
  when such events occur. AWS IoT Events Data API commands enable you to send inputs to detectors, list detectors, and
  view or update a detector's status."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ioteventsdata AWSIoTEventsData]))

(defn batch-put-message
  "Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you
   specify (\"inputName\") and ingested into any detectors that monitor that input. If multiple messages
   are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send
   messages one at a time and wait for a successful response.

  batch-put-message-request - `com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest`

  returns: Result of the BatchPutMessage operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.BatchPutMessageResult`

  throws: com.amazonaws.services.ioteventsdata.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.ioteventsdata.model.BatchPutMessageResult [^AWSIoTEventsData this ^com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest batch-put-message-request]
    (-> this (.batchPutMessage batch-put-message-request))))

(defn batch-update-detector
  "Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified
   detector model.

  batch-update-detector-request - `com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest`

  returns: Result of the BatchUpdateDetector operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorResult`

  throws: com.amazonaws.services.ioteventsdata.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorResult [^AWSIoTEventsData this ^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest batch-update-detector-request]
    (-> this (.batchUpdateDetector batch-update-detector-request))))

(defn describe-detector
  "Returns information about the specified detector (instance).

  describe-detector-request - `com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest`

  returns: Result of the DescribeDetector operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.DescribeDetectorResult`

  throws: com.amazonaws.services.ioteventsdata.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.ioteventsdata.model.DescribeDetectorResult [^AWSIoTEventsData this ^com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest describe-detector-request]
    (-> this (.describeDetector describe-detector-request))))

(defn list-detectors
  "Lists detectors (the instances of a detector model).

  list-detectors-request - `com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest`

  returns: Result of the ListDetectors operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.ListDetectorsResult`

  throws: com.amazonaws.services.ioteventsdata.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.ioteventsdata.model.ListDetectorsResult [^AWSIoTEventsData this ^com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest list-detectors-request]
    (-> this (.listDetectors list-detectors-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSIoTEventsData this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoTEventsData this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

