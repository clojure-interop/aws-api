(ns com.amazonaws.services.iotevents.AWSIoTEventsClient
  "Client for accessing AWS IoT Events. All service calls made using this client are blocking, and will not return until
  the service call completes.


  AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
  when such events occur. AWS IoT Events API commands enable you to create, read, update and delete inputs and detector
  models, and to list their versions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotevents AWSIoTEventsClient]))

(defn *builder
  "returns: `com.amazonaws.services.iotevents.AWSIoTEventsClientBuilder`"
  (^com.amazonaws.services.iotevents.AWSIoTEventsClientBuilder []
    (AWSIoTEventsClient/builder )))

(defn list-tags-for-resource
  "Lists the tags (metadata) you have assigned to the resource.

  request - `com.amazonaws.services.iotevents.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iotevents.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.ListTagsForResourceResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-inputs
  "Lists the inputs you have created.

  request - `com.amazonaws.services.iotevents.model.ListInputsRequest`

  returns: Result of the ListInputs operation returned by the service. - `com.amazonaws.services.iotevents.model.ListInputsResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.ListInputsResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.ListInputsRequest request]
    (-> this (.listInputs request))))

(defn create-input
  "Creates an input.

  request - `com.amazonaws.services.iotevents.model.CreateInputRequest`

  returns: Result of the CreateInput operation returned by the service. - `com.amazonaws.services.iotevents.model.CreateInputResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.CreateInputResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.CreateInputRequest request]
    (-> this (.createInput request))))

(defn describe-detector-model
  "Describes a detector model. If the \"version\" parameter is not specified, information about the
   latest version is returned.

  request - `com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest`

  returns: Result of the DescribeDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.DescribeDetectorModelResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.DescribeDetectorModelResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest request]
    (-> this (.describeDetectorModel request))))

(defn untag-resource
  "Removes the given tags (metadata) from the resource.

  request - `com.amazonaws.services.iotevents.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iotevents.model.UntagResourceResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.UntagResourceResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-detector-model-versions
  "Lists all the versions of a detector model. Only the metadata associated with each detector model version is
   returned.

  request - `com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest`

  returns: Result of the ListDetectorModelVersions operation returned by the service. - `com.amazonaws.services.iotevents.model.ListDetectorModelVersionsResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.ListDetectorModelVersionsResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest request]
    (-> this (.listDetectorModelVersions request))))

(defn describe-logging-options
  "Retrieves the current settings of the AWS IoT Events logging options.

  request - `com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest`

  returns: Result of the DescribeLoggingOptions operation returned by the service. - `com.amazonaws.services.iotevents.model.DescribeLoggingOptionsResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.DescribeLoggingOptionsResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest request]
    (-> this (.describeLoggingOptions request))))

(defn delete-detector-model
  "Deletes a detector model. Any active instances of the detector model are also deleted.

  request - `com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest`

  returns: Result of the DeleteDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.DeleteDetectorModelResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.DeleteDetectorModelResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest request]
    (-> this (.deleteDetectorModel request))))

(defn update-detector-model
  "Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created
   as new inputs arrive.

  request - `com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest`

  returns: Result of the UpdateDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.UpdateDetectorModelResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.UpdateDetectorModelResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest request]
    (-> this (.updateDetectorModel request))))

(defn create-detector-model
  "Creates a detector model.

  request - `com.amazonaws.services.iotevents.model.CreateDetectorModelRequest`

  returns: Result of the CreateDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.CreateDetectorModelResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.CreateDetectorModelResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.CreateDetectorModelRequest request]
    (-> this (.createDetectorModel request))))

(defn describe-input
  "Describes an input.

  request - `com.amazonaws.services.iotevents.model.DescribeInputRequest`

  returns: Result of the DescribeInput operation returned by the service. - `com.amazonaws.services.iotevents.model.DescribeInputResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.DescribeInputResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.DescribeInputRequest request]
    (-> this (.describeInput request))))

(defn put-logging-options
  "Sets or updates the AWS IoT Events logging options.


   If you update the value of any \"loggingOptions\" field, it takes up to one minute for the change to
   take effect. Also, if you change the policy attached to the role you specified in the \"roleArn\"
   field (for example, to correct an invalid policy) it takes up to five minutes for that change to take effect.

  request - `com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest`

  returns: Result of the PutLoggingOptions operation returned by the service. - `com.amazonaws.services.iotevents.model.PutLoggingOptionsResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.PutLoggingOptionsResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest request]
    (-> this (.putLoggingOptions request))))

(defn update-input
  "Updates an input.

  request - `com.amazonaws.services.iotevents.model.UpdateInputRequest`

  returns: Result of the UpdateInput operation returned by the service. - `com.amazonaws.services.iotevents.model.UpdateInputResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.UpdateInputResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.UpdateInputRequest request]
    (-> this (.updateInput request))))

(defn list-detector-models
  "Lists the detector models you have created. Only the metadata associated with each detector model is returned.

  request - `com.amazonaws.services.iotevents.model.ListDetectorModelsRequest`

  returns: Result of the ListDetectorModels operation returned by the service. - `com.amazonaws.services.iotevents.model.ListDetectorModelsResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.ListDetectorModelsResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.ListDetectorModelsRequest request]
    (-> this (.listDetectorModels request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoTEventsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.

  request - `com.amazonaws.services.iotevents.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iotevents.model.TagResourceResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.TagResourceResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-input
  "Deletes an input.

  request - `com.amazonaws.services.iotevents.model.DeleteInputRequest`

  returns: Result of the DeleteInput operation returned by the service. - `com.amazonaws.services.iotevents.model.DeleteInputResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.DeleteInputResult [^AWSIoTEventsClient this ^com.amazonaws.services.iotevents.model.DeleteInputRequest request]
    (-> this (.deleteInput request))))

