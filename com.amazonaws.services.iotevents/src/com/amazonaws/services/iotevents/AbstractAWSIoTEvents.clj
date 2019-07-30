(ns com.amazonaws.services.iotevents.AbstractAWSIoTEvents
  "Abstract implementation of AWSIoTEvents. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotevents AbstractAWSIoTEvents]))

(defn list-tags-for-resource
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iotevents.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.iotevents.model.ListTagsForResourceResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-inputs
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.ListInputsRequest`

  returns: Result of the ListInputs operation returned by the service. - `com.amazonaws.services.iotevents.model.ListInputsResult`"
  (^com.amazonaws.services.iotevents.model.ListInputsResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.ListInputsRequest request]
    (-> this (.listInputs request))))

(defn create-input
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.CreateInputRequest`

  returns: Result of the CreateInput operation returned by the service. - `com.amazonaws.services.iotevents.model.CreateInputResult`"
  (^com.amazonaws.services.iotevents.model.CreateInputResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.CreateInputRequest request]
    (-> this (.createInput request))))

(defn describe-detector-model
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest`

  returns: Result of the DescribeDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.DescribeDetectorModelResult`"
  (^com.amazonaws.services.iotevents.model.DescribeDetectorModelResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest request]
    (-> this (.describeDetectorModel request))))

(defn untag-resource
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iotevents.model.UntagResourceResult`"
  (^com.amazonaws.services.iotevents.model.UntagResourceResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-detector-model-versions
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest`

  returns: Result of the ListDetectorModelVersions operation returned by the service. - `com.amazonaws.services.iotevents.model.ListDetectorModelVersionsResult`"
  (^com.amazonaws.services.iotevents.model.ListDetectorModelVersionsResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest request]
    (-> this (.listDetectorModelVersions request))))

(defn describe-logging-options
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest`

  returns: Result of the DescribeLoggingOptions operation returned by the service. - `com.amazonaws.services.iotevents.model.DescribeLoggingOptionsResult`"
  (^com.amazonaws.services.iotevents.model.DescribeLoggingOptionsResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest request]
    (-> this (.describeLoggingOptions request))))

(defn delete-detector-model
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest`

  returns: Result of the DeleteDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.DeleteDetectorModelResult`"
  (^com.amazonaws.services.iotevents.model.DeleteDetectorModelResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest request]
    (-> this (.deleteDetectorModel request))))

(defn shutdown
  "Description copied from interface: AWSIoTEvents"
  ([^AbstractAWSIoTEvents this]
    (-> this (.shutdown))))

(defn update-detector-model
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest`

  returns: Result of the UpdateDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.UpdateDetectorModelResult`"
  (^com.amazonaws.services.iotevents.model.UpdateDetectorModelResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest request]
    (-> this (.updateDetectorModel request))))

(defn create-detector-model
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.CreateDetectorModelRequest`

  returns: Result of the CreateDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.CreateDetectorModelResult`"
  (^com.amazonaws.services.iotevents.model.CreateDetectorModelResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.CreateDetectorModelRequest request]
    (-> this (.createDetectorModel request))))

(defn describe-input
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.DescribeInputRequest`

  returns: Result of the DescribeInput operation returned by the service. - `com.amazonaws.services.iotevents.model.DescribeInputResult`"
  (^com.amazonaws.services.iotevents.model.DescribeInputResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.DescribeInputRequest request]
    (-> this (.describeInput request))))

(defn put-logging-options
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest`

  returns: Result of the PutLoggingOptions operation returned by the service. - `com.amazonaws.services.iotevents.model.PutLoggingOptionsResult`"
  (^com.amazonaws.services.iotevents.model.PutLoggingOptionsResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest request]
    (-> this (.putLoggingOptions request))))

(defn update-input
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.UpdateInputRequest`

  returns: Result of the UpdateInput operation returned by the service. - `com.amazonaws.services.iotevents.model.UpdateInputResult`"
  (^com.amazonaws.services.iotevents.model.UpdateInputResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.UpdateInputRequest request]
    (-> this (.updateInput request))))

(defn list-detector-models
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.ListDetectorModelsRequest`

  returns: Result of the ListDetectorModels operation returned by the service. - `com.amazonaws.services.iotevents.model.ListDetectorModelsResult`"
  (^com.amazonaws.services.iotevents.model.ListDetectorModelsResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.ListDetectorModelsRequest request]
    (-> this (.listDetectorModels request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSIoTEvents

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSIoTEvents this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iotevents.model.TagResourceResult`"
  (^com.amazonaws.services.iotevents.model.TagResourceResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-input
  "Description copied from interface: AWSIoTEvents

  request - `com.amazonaws.services.iotevents.model.DeleteInputRequest`

  returns: Result of the DeleteInput operation returned by the service. - `com.amazonaws.services.iotevents.model.DeleteInputResult`"
  (^com.amazonaws.services.iotevents.model.DeleteInputResult [^AbstractAWSIoTEvents this ^com.amazonaws.services.iotevents.model.DeleteInputRequest request]
    (-> this (.deleteInput request))))

