(ns com.amazonaws.services.iot1clickdevices.AWSIoT1ClickDevicesClient
  "Client for accessing AWS IoT 1-Click Devices Service. All service calls made using this client are blocking, and will
  not return until the service call completes.


  Describes all of the AWS IoT 1-Click device-related API operations for the service. Also provides sample requests,
  responses, and errors for the supported web services protocols."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot1clickdevices AWSIoT1ClickDevicesClient]))

(defn *builder
  "returns: `com.amazonaws.services.iot1clickdevices.AWSIoT1ClickDevicesClientBuilder`"
  (^com.amazonaws.services.iot1clickdevices.AWSIoT1ClickDevicesClientBuilder []
    (AWSIoT1ClickDevicesClient/builder )))

(defn list-tags-for-resource
  "Lists the tags associated with the specified resource ARN.

  request - `com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn untag-resource
  "Using tag keys, deletes the tags (key/value pairs) associated with the specified resource ARN.

  request - `com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.UntagResourceResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.UntagResourceResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-device-events
  "Using a device ID, returns a DeviceEventsResponse object containing an array of events for the device.

  request - `com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest`

  returns: Result of the ListDeviceEvents operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest request]
    (-> this (.listDeviceEvents request))))

(defn update-device-state
  "Using a Boolean value (true or false), this operation enables or disables the device given a device ID.

  request - `com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest`

  returns: Result of the UpdateDeviceState operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest request]
    (-> this (.updateDeviceState request))))

(defn list-devices
  "Lists the 1-Click compatible devices associated with your AWS account.

  request - `com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ListDevicesResult`

  throws: com.amazonaws.services.iot1clickdevices.model.RangeNotSatisfiableException - 416 response"
  (^com.amazonaws.services.iot1clickdevices.model.ListDevicesResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest request]
    (-> this (.listDevices request))))

(defn describe-device
  "Given a device ID, returns a DescribeDeviceResponse object describing the details of the device.

  request - `com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest`

  returns: Result of the DescribeDevice operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.DescribeDeviceResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.DescribeDeviceResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest request]
    (-> this (.describeDevice request))))

(defn unclaim-device
  "Disassociates a device from your AWS account using its device ID.

  request - `com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest`

  returns: Result of the UnclaimDevice operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest request]
    (-> this (.unclaimDevice request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoT1ClickDevicesClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn claim-devices-by-claim-code
  "Adds device(s) to your account (i.e., claim one or more devices) if and only if you received a claim code with
   the device(s).

  request - `com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest`

  returns: Result of the ClaimDevicesByClaimCode operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeResult`

  throws: com.amazonaws.services.iot1clickdevices.model.InvalidRequestException - 400 response"
  (^com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest request]
    (-> this (.claimDevicesByClaimCode request))))

(defn get-device-methods
  "Given a device ID, returns the invokable methods associated with the device.

  request - `com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest`

  returns: Result of the GetDeviceMethods operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest request]
    (-> this (.getDeviceMethods request))))

(defn tag-resource
  "Adds or updates the tags associated with the resource ARN. See AWS IoT
   1-Click Service Limits for the maximum number of tags allowed per resource.

  request - `com.amazonaws.services.iot1clickdevices.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.TagResourceResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.TagResourceResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn initiate-device-claim
  "Given a device ID, initiates a claim request for the associated device.



   Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
   device of type button, a device event can be published by simply clicking the device.

  request - `com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest`

  returns: Result of the InitiateDeviceClaim operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest request]
    (-> this (.initiateDeviceClaim request))))

(defn finalize-device-claim
  "Given a device ID, finalizes the claim request for the associated device.



   Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
   device of type button, a device event can be published by simply clicking the device.

  request - `com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest`

  returns: Result of the FinalizeDeviceClaim operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimResult`

  throws: com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException - 404 response"
  (^com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest request]
    (-> this (.finalizeDeviceClaim request))))

(defn invoke-device-method
  "Given a device ID, issues a request to invoke a named device method (with possible parameters). See the
   \"Example POST\" code snippet below.

  request - `com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest`

  returns: Result of the InvokeDeviceMethod operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodResult`

  throws: com.amazonaws.services.iot1clickdevices.model.InvalidRequestException - 400 response"
  (^com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodResult [^AWSIoT1ClickDevicesClient this ^com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest request]
    (-> this (.invokeDeviceMethod request))))

