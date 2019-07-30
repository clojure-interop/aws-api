(ns com.amazonaws.services.iotevents.AWSIoTEventsAsync
  "Interface for accessing AWS IoT Events asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoTEventsAsync instead.



  AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
  when such events occur. AWS IoT Events API commands enable you to create, read, update and delete inputs and detector
  models, and to list their versions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotevents AWSIoTEventsAsync]))

(defn untag-resource-async
  "Removes the given tags (metadata) from the resource.

  untag-resource-request - `com.amazonaws.services.iotevents.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn update-detector-model-async
  "Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created
   as new inputs arrive.

  update-detector-model-request - `com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDetectorModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.UpdateDetectorModelResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest update-detector-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDetectorModelAsync update-detector-model-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.UpdateDetectorModelRequest update-detector-model-request]
    (-> this (.updateDetectorModelAsync update-detector-model-request))))

(defn list-detector-models-async
  "Lists the detector models you have created. Only the metadata associated with each detector model is returned.

  list-detector-models-request - `com.amazonaws.services.iotevents.model.ListDetectorModelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDetectorModels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.ListDetectorModelsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.ListDetectorModelsRequest list-detector-models-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDetectorModelsAsync list-detector-models-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.ListDetectorModelsRequest list-detector-models-request]
    (-> this (.listDetectorModelsAsync list-detector-models-request))))

(defn update-input-async
  "Updates an input.

  update-input-request - `com.amazonaws.services.iotevents.model.UpdateInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.UpdateInputResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.UpdateInputRequest update-input-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInputAsync update-input-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.UpdateInputRequest update-input-request]
    (-> this (.updateInputAsync update-input-request))))

(defn delete-input-async
  "Deletes an input.

  delete-input-request - `com.amazonaws.services.iotevents.model.DeleteInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.DeleteInputResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.DeleteInputRequest delete-input-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInputAsync delete-input-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.DeleteInputRequest delete-input-request]
    (-> this (.deleteInputAsync delete-input-request))))

(defn create-input-async
  "Creates an input.

  create-input-request - `com.amazonaws.services.iotevents.model.CreateInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.CreateInputResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.CreateInputRequest create-input-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInputAsync create-input-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.CreateInputRequest create-input-request]
    (-> this (.createInputAsync create-input-request))))

(defn describe-logging-options-async
  "Retrieves the current settings of the AWS IoT Events logging options.

  describe-logging-options-request - `com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.DescribeLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest describe-logging-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoggingOptionsAsync describe-logging-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.DescribeLoggingOptionsRequest describe-logging-options-request]
    (-> this (.describeLoggingOptionsAsync describe-logging-options-request))))

(defn list-inputs-async
  "Lists the inputs you have created.

  list-inputs-request - `com.amazonaws.services.iotevents.model.ListInputsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInputs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.ListInputsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.ListInputsRequest list-inputs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInputsAsync list-inputs-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.ListInputsRequest list-inputs-request]
    (-> this (.listInputsAsync list-inputs-request))))

(defn list-tags-for-resource-async
  "Lists the tags (metadata) you have assigned to the resource.

  list-tags-for-resource-request - `com.amazonaws.services.iotevents.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn describe-detector-model-async
  "Describes a detector model. If the \"version\" parameter is not specified, information about the
   latest version is returned.

  describe-detector-model-request - `com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDetectorModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.DescribeDetectorModelResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest describe-detector-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDetectorModelAsync describe-detector-model-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.DescribeDetectorModelRequest describe-detector-model-request]
    (-> this (.describeDetectorModelAsync describe-detector-model-request))))

(defn create-detector-model-async
  "Creates a detector model.

  create-detector-model-request - `com.amazonaws.services.iotevents.model.CreateDetectorModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDetectorModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.CreateDetectorModelResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.CreateDetectorModelRequest create-detector-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDetectorModelAsync create-detector-model-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.CreateDetectorModelRequest create-detector-model-request]
    (-> this (.createDetectorModelAsync create-detector-model-request))))

(defn delete-detector-model-async
  "Deletes a detector model. Any active instances of the detector model are also deleted.

  delete-detector-model-request - `com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDetectorModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.DeleteDetectorModelResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest delete-detector-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDetectorModelAsync delete-detector-model-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.DeleteDetectorModelRequest delete-detector-model-request]
    (-> this (.deleteDetectorModelAsync delete-detector-model-request))))

(defn put-logging-options-async
  "Sets or updates the AWS IoT Events logging options.


   If you update the value of any \"loggingOptions\" field, it takes up to one minute for the change to
   take effect. Also, if you change the policy attached to the role you specified in the \"roleArn\"
   field (for example, to correct an invalid policy) it takes up to five minutes for that change to take effect.

  put-logging-options-request - `com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.PutLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest put-logging-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLoggingOptionsAsync put-logging-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.PutLoggingOptionsRequest put-logging-options-request]
    (-> this (.putLoggingOptionsAsync put-logging-options-request))))

(defn list-detector-model-versions-async
  "Lists all the versions of a detector model. Only the metadata associated with each detector model version is
   returned.

  list-detector-model-versions-request - `com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDetectorModelVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.ListDetectorModelVersionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest list-detector-model-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDetectorModelVersionsAsync list-detector-model-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.ListDetectorModelVersionsRequest list-detector-model-versions-request]
    (-> this (.listDetectorModelVersionsAsync list-detector-model-versions-request))))

(defn tag-resource-async
  "Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.

  tag-resource-request - `com.amazonaws.services.iotevents.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn describe-input-async
  "Describes an input.

  describe-input-request - `com.amazonaws.services.iotevents.model.DescribeInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotevents.model.DescribeInputResult>`"
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.DescribeInputRequest describe-input-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInputAsync describe-input-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTEventsAsync this ^com.amazonaws.services.iotevents.model.DescribeInputRequest describe-input-request]
    (-> this (.describeInputAsync describe-input-request))))

