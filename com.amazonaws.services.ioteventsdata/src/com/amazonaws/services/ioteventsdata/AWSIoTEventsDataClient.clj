(ns com.amazonaws.services.ioteventsdata.AWSIoTEventsDataClient
  "Client for accessing AWS IoT Events Data. All service calls made using this client are blocking, and will not return
  until the service call completes.


  AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
  when such events occur. AWS IoT Events Data API commands enable you to send inputs to detectors, list detectors, and
  view or update a detector's status."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ioteventsdata AWSIoTEventsDataClient]))

(defn *builder
  "returns: `com.amazonaws.services.ioteventsdata.AWSIoTEventsDataClientBuilder`"
  (^com.amazonaws.services.ioteventsdata.AWSIoTEventsDataClientBuilder []
    (AWSIoTEventsDataClient/builder )))

(defn batch-put-message
  "Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you
   specify (\"inputName\") and ingested into any detectors that monitor that input. If multiple messages
   are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send
   messages one at a time and wait for a successful response.

  request - `com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest`

  returns: Result of the BatchPutMessage operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.BatchPutMessageResult`

  throws: com.amazonaws.services.ioteventsdata.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.ioteventsdata.model.BatchPutMessageResult [^AWSIoTEventsDataClient this ^com.amazonaws.services.ioteventsdata.model.BatchPutMessageRequest request]
    (-> this (.batchPutMessage request))))

(defn batch-update-detector
  "Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified
   detector model.

  request - `com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest`

  returns: Result of the BatchUpdateDetector operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorResult`

  throws: com.amazonaws.services.ioteventsdata.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorResult [^AWSIoTEventsDataClient this ^com.amazonaws.services.ioteventsdata.model.BatchUpdateDetectorRequest request]
    (-> this (.batchUpdateDetector request))))

(defn describe-detector
  "Returns information about the specified detector (instance).

  request - `com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest`

  returns: Result of the DescribeDetector operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.DescribeDetectorResult`

  throws: com.amazonaws.services.ioteventsdata.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.ioteventsdata.model.DescribeDetectorResult [^AWSIoTEventsDataClient this ^com.amazonaws.services.ioteventsdata.model.DescribeDetectorRequest request]
    (-> this (.describeDetector request))))

(defn list-detectors
  "Lists detectors (the instances of a detector model).

  request - `com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest`

  returns: Result of the ListDetectors operation returned by the service. - `com.amazonaws.services.ioteventsdata.model.ListDetectorsResult`

  throws: com.amazonaws.services.ioteventsdata.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.ioteventsdata.model.ListDetectorsResult [^AWSIoTEventsDataClient this ^com.amazonaws.services.ioteventsdata.model.ListDetectorsRequest request]
    (-> this (.listDetectors request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoTEventsDataClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

