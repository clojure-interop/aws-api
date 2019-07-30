(ns com.amazonaws.services.iot1clickdevices.AWSIoT1ClickDevices
  "Interface for accessing AWS IoT 1-Click Devices Service.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoT1ClickDevices instead.



  Describes all of the AWS IoT 1-Click device-related API operations for the service. Also provides sample requests,
  responses, and errors for the supported web services protocols."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot1clickdevices AWSIoT1ClickDevices]))

(defn list-tags-for-resource
  "Lists the tags associated with the specified resource ARN.

  list-tags-for-resource-request - `com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn untag-resource
  "Using tag keys, deletes the tags (key/value pairs) associated with the specified resource ARN.

  untag-resource-request - `com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.UntagResourceResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.UntagResourceResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn list-device-events
  "Using a device ID, returns a DeviceEventsResponse object containing an array of events for the device.

  list-device-events-request - `com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest`

  returns: Result of the ListDeviceEvents operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest list-device-events-request]
    (-> this (.listDeviceEvents list-device-events-request))))

(defn update-device-state
  "Using a Boolean value (true or false), this operation enables or disables the device given a device ID.

  update-device-state-request - `com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest`

  returns: Result of the UpdateDeviceState operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest update-device-state-request]
    (-> this (.updateDeviceState update-device-state-request))))

(defn list-devices
  "Lists the 1-Click compatible devices associated with your AWS account.

  list-devices-request - `com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ListDevicesResult`

  throws: com.amazonaws.services.iot1clickdevices.model.RangeNotSatisfiableException - 416 response"
  (^com.amazonaws.services.iot1clickdevices.model.ListDevicesResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest list-devices-request]
    (-> this (.listDevices list-devices-request))))

(defn describe-device
  "Given a device ID, returns a DescribeDeviceResponse object describing the details of the device.

  describe-device-request - `com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest`

  returns: Result of the DescribeDevice operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.DescribeDeviceResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.DescribeDeviceResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest describe-device-request]
    (-> this (.describeDevice describe-device-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSIoT1ClickDevices this]
    (-> this (.shutdown))))

(defn unclaim-device
  "Disassociates a device from your AWS account using its device ID.

  unclaim-device-request - `com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest`

  returns: Result of the UnclaimDevice operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest unclaim-device-request]
    (-> this (.unclaimDevice unclaim-device-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoT1ClickDevices this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn claim-devices-by-claim-code
  "Adds device(s) to your account (i.e., claim one or more devices) if and only if you received a claim code with
   the device(s).

  claim-devices-by-claim-code-request - `com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest`

  returns: Result of the ClaimDevicesByClaimCode operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeResult`

  throws: com.amazonaws.services.iot1clickdevices.model.InvalidRequestException - 400 response"
  (^com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest claim-devices-by-claim-code-request]
    (-> this (.claimDevicesByClaimCode claim-devices-by-claim-code-request))))

(defn get-device-methods
  "Given a device ID, returns the invokable methods associated with the device.

  get-device-methods-request - `com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest`

  returns: Result of the GetDeviceMethods operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest get-device-methods-request]
    (-> this (.getDeviceMethods get-device-methods-request))))

(defn tag-resource
  "Adds or updates the tags associated with the resource ARN. See AWS IoT
   1-Click Service Limits for the maximum number of tags allowed per resource.

  tag-resource-request - `com.amazonaws.services.iot1clickdevices.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.TagResourceResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.TagResourceResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn initiate-device-claim
  "Given a device ID, initiates a claim request for the associated device.



   Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
   device of type button, a device event can be published by simply clicking the device.

  initiate-device-claim-request - `com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest`

  returns: Result of the InitiateDeviceClaim operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest initiate-device-claim-request]
    (-> this (.initiateDeviceClaim initiate-device-claim-request))))

(defn finalize-device-claim
  "Given a device ID, finalizes the claim request for the associated device.



   Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
   device of type button, a device event can be published by simply clicking the device.

  finalize-device-claim-request - `com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest`

  returns: Result of the FinalizeDeviceClaim operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest finalize-device-claim-request]
    (-> this (.finalizeDeviceClaim finalize-device-claim-request))))

(defn invoke-device-method
  "Given a device ID, issues a request to invoke a named device method (with possible parameters). See the
   \"Example POST\" code snippet below.

  invoke-device-method-request - `com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest`

  returns: Result of the InvokeDeviceMethod operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodResult`

  throws: com.amazonaws.services.iot1clickdevices.model.InvalidRequestException - 400 response"
  (^com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodResult [^AWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest invoke-device-method-request]
    (-> this (.invokeDeviceMethod invoke-device-method-request))))

