(ns com.amazonaws.services.iotevents.AWSIoTEvents
  "Interface for accessing AWS IoT Events.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoTEvents instead.



  AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
  when such events occur. AWS IoT Events API commands enable you to create, read, update and delete inputs and detector
  models, and to list their versions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotevents AWSIoTEvents]))

(defn list-tags-for-resource
  "Lists the tags (metadata) you have assigned to the resource.

  list-tags-for-resource-request - `com.amazonaws.services.iotevents.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iotevents.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.ListTagsForResourceResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn list-inputs
  "Lists the inputs you have created.

  list-inputs-request - `com.amazonaws.services.iotevents.model.ListInputsRequest`

  returns: Result of the ListInputs operation returned by the service. - `com.amazonaws.services.iotevents.model.ListInputsResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.ListInputsResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.ListInputsRequest list-inputs-request]
    (-> this (.listInputs list-inputs-request))))

(defn create-input
  "Creates an input.

  create-input-request - `com.amazonaws.services.iotevents.model.CreateInputRequest`

  returns: Result of the CreateInput operation returned by the service. - `com.amazonaws.services.iotevents.model.CreateInputResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.CreateInputResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.CreateInputRequest create-input-request]
    (-> this (.createInput create-input-request))))

(defn describe-detector-model
  "Describes a detector model. If the \"version\" parameter is not specified, information about the
   latest version is returned.

  describe-detector-model-request - `com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest`

  returns: Result of the DescribeDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.DescribeDetectorModelResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.DescribeDetectorModelResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest describe-detector-model-request]
    (-> this (.describeDetectorModel describe-detector-model-request))))

(defn untag-resource
  "Removes the given tags (metadata) from the resource.

  untag-resource-request - `com.amazonaws.services.iotevents.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iotevents.model.UntagResourceResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.UntagResourceResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn list-detector-model-versions
  "Lists all the versions of a detector model. Only the metadata associated with each detector model version is
   returned.

  list-detector-model-versions-request - `com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest`

  returns: Result of the ListDetectorModelVersions operation returned by the service. - `com.amazonaws.services.iotevents.model.ListDetectorModelVersionsResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.ListDetectorModelVersionsResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest list-detector-model-versions-request]
    (-> this (.listDetectorModelVersions list-detector-model-versions-request))))

(defn describe-logging-options
  "Retrieves the current settings of the AWS IoT Events logging options.

  describe-logging-options-request - `com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest`

  returns: Result of the DescribeLoggingOptions operation returned by the service. - `com.amazonaws.services.iotevents.model.DescribeLoggingOptionsResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.DescribeLoggingOptionsResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest describe-logging-options-request]
    (-> this (.describeLoggingOptions describe-logging-options-request))))

(defn delete-detector-model
  "Deletes a detector model. Any active instances of the detector model are also deleted.

  delete-detector-model-request - `com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest`

  returns: Result of the DeleteDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.DeleteDetectorModelResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.DeleteDetectorModelResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest delete-detector-model-request]
    (-> this (.deleteDetectorModel delete-detector-model-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSIoTEvents this]
    (-> this (.shutdown))))

(defn update-detector-model
  "Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created
   as new inputs arrive.

  update-detector-model-request - `com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest`

  returns: Result of the UpdateDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.UpdateDetectorModelResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.UpdateDetectorModelResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest update-detector-model-request]
    (-> this (.updateDetectorModel update-detector-model-request))))

(defn create-detector-model
  "Creates a detector model.

  create-detector-model-request - `com.amazonaws.services.iotevents.model.CreateDetectorModelRequest`

  returns: Result of the CreateDetectorModel operation returned by the service. - `com.amazonaws.services.iotevents.model.CreateDetectorModelResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.CreateDetectorModelResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.CreateDetectorModelRequest create-detector-model-request]
    (-> this (.createDetectorModel create-detector-model-request))))

(defn describe-input
  "Describes an input.

  describe-input-request - `com.amazonaws.services.iotevents.model.DescribeInputRequest`

  returns: Result of the DescribeInput operation returned by the service. - `com.amazonaws.services.iotevents.model.DescribeInputResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.DescribeInputResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.DescribeInputRequest describe-input-request]
    (-> this (.describeInput describe-input-request))))

(defn put-logging-options
  "Sets or updates the AWS IoT Events logging options.


   If you update the value of any \"loggingOptions\" field, it takes up to one minute for the change to
   take effect. Also, if you change the policy attached to the role you specified in the \"roleArn\"
   field (for example, to correct an invalid policy) it takes up to five minutes for that change to take effect.

  put-logging-options-request - `com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest`

  returns: Result of the PutLoggingOptions operation returned by the service. - `com.amazonaws.services.iotevents.model.PutLoggingOptionsResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.PutLoggingOptionsResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest put-logging-options-request]
    (-> this (.putLoggingOptions put-logging-options-request))))

(defn update-input
  "Updates an input.

  update-input-request - `com.amazonaws.services.iotevents.model.UpdateInputRequest`

  returns: Result of the UpdateInput operation returned by the service. - `com.amazonaws.services.iotevents.model.UpdateInputResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.UpdateInputResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.UpdateInputRequest update-input-request]
    (-> this (.updateInput update-input-request))))

(defn list-detector-models
  "Lists the detector models you have created. Only the metadata associated with each detector model is returned.

  list-detector-models-request - `com.amazonaws.services.iotevents.model.ListDetectorModelsRequest`

  returns: Result of the ListDetectorModels operation returned by the service. - `com.amazonaws.services.iotevents.model.ListDetectorModelsResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.ListDetectorModelsResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.ListDetectorModelsRequest list-detector-models-request]
    (-> this (.listDetectorModels list-detector-models-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoTEvents this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.

  tag-resource-request - `com.amazonaws.services.iotevents.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iotevents.model.TagResourceResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.TagResourceResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn delete-input
  "Deletes an input.

  delete-input-request - `com.amazonaws.services.iotevents.model.DeleteInputRequest`

  returns: Result of the DeleteInput operation returned by the service. - `com.amazonaws.services.iotevents.model.DeleteInputResult`

  throws: com.amazonaws.services.iotevents.model.InvalidRequestException - The request was invalid."
  (^com.amazonaws.services.iotevents.model.DeleteInputResult [^AWSIoTEvents this ^com.amazonaws.services.iotevents.model.DeleteInputRequest delete-input-request]
    (-> this (.deleteInput delete-input-request))))

