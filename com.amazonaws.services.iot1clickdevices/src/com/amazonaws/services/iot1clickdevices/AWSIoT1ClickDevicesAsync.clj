(ns com.amazonaws.services.iot1clickdevices.AWSIoT1ClickDevicesAsync
  "Interface for accessing AWS IoT 1-Click Devices Service asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoT1ClickDevicesAsync instead.



  Describes all of the AWS IoT 1-Click device-related API operations for the service. Also provides sample requests,
  responses, and errors for the supported web services protocols."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot1clickdevices AWSIoT1ClickDevicesAsync]))

(defn untag-resource-async
  "Using tag keys, deletes the tags (key/value pairs) associated with the specified resource ARN.

  untag-resource-request - `com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn list-device-events-async
  "Using a device ID, returns a DeviceEventsResponse object containing an array of events for the device.

  list-device-events-request - `com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeviceEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest list-device-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeviceEventsAsync list-device-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest list-device-events-request]
    (-> this (.listDeviceEventsAsync list-device-events-request))))

(defn finalize-device-claim-async
  "Given a device ID, finalizes the claim request for the associated device.



   Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
   device of type button, a device event can be published by simply clicking the device.

  finalize-device-claim-request - `com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FinalizeDeviceClaim operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest finalize-device-claim-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.finalizeDeviceClaimAsync finalize-device-claim-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest finalize-device-claim-request]
    (-> this (.finalizeDeviceClaimAsync finalize-device-claim-request))))

(defn update-device-state-async
  "Using a Boolean value (true or false), this operation enables or disables the device given a device ID.

  update-device-state-request - `com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeviceState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest update-device-state-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeviceStateAsync update-device-state-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest update-device-state-request]
    (-> this (.updateDeviceStateAsync update-device-state-request))))

(defn invoke-device-method-async
  "Given a device ID, issues a request to invoke a named device method (with possible parameters). See the
   \"Example POST\" code snippet below.

  invoke-device-method-request - `com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InvokeDeviceMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest invoke-device-method-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invokeDeviceMethodAsync invoke-device-method-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest invoke-device-method-request]
    (-> this (.invokeDeviceMethodAsync invoke-device-method-request))))

(defn list-devices-async
  "Lists the 1-Click compatible devices associated with your AWS account.

  list-devices-request - `com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.ListDevicesResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest list-devices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevicesAsync list-devices-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest list-devices-request]
    (-> this (.listDevicesAsync list-devices-request))))

(defn unclaim-device-async
  "Disassociates a device from your AWS account using its device ID.

  unclaim-device-request - `com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnclaimDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest unclaim-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unclaimDeviceAsync unclaim-device-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest unclaim-device-request]
    (-> this (.unclaimDeviceAsync unclaim-device-request))))

(defn list-tags-for-resource-async
  "Lists the tags associated with the specified resource ARN.

  list-tags-for-resource-request - `com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn initiate-device-claim-async
  "Given a device ID, initiates a claim request for the associated device.



   Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
   device of type button, a device event can be published by simply clicking the device.

  initiate-device-claim-request - `com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateDeviceClaim operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest initiate-device-claim-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateDeviceClaimAsync initiate-device-claim-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest initiate-device-claim-request]
    (-> this (.initiateDeviceClaimAsync initiate-device-claim-request))))

(defn describe-device-async
  "Given a device ID, returns a DescribeDeviceResponse object describing the details of the device.

  describe-device-request - `com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.DescribeDeviceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest describe-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeviceAsync describe-device-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest describe-device-request]
    (-> this (.describeDeviceAsync describe-device-request))))

(defn get-device-methods-async
  "Given a device ID, returns the invokable methods associated with the device.

  get-device-methods-request - `com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeviceMethods operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest get-device-methods-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceMethodsAsync get-device-methods-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest get-device-methods-request]
    (-> this (.getDeviceMethodsAsync get-device-methods-request))))

(defn tag-resource-async
  "Adds or updates the tags associated with the resource ARN. See AWS IoT
   1-Click Service Limits for the maximum number of tags allowed per resource.

  tag-resource-request - `com.amazonaws.services.iot1clickdevices.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn claim-devices-by-claim-code-async
  "Adds device(s) to your account (i.e., claim one or more devices) if and only if you received a claim code with
   the device(s).

  claim-devices-by-claim-code-request - `com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ClaimDevicesByClaimCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest claim-devices-by-claim-code-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.claimDevicesByClaimCodeAsync claim-devices-by-claim-code-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsync this ^com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest claim-devices-by-claim-code-request]
    (-> this (.claimDevicesByClaimCodeAsync claim-devices-by-claim-code-request))))

