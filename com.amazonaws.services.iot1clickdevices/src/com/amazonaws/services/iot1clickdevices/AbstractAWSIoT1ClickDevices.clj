(ns com.amazonaws.services.iot1clickdevices.AbstractAWSIoT1ClickDevices
  "Abstract implementation of AWSIoT1ClickDevices. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot1clickdevices AbstractAWSIoT1ClickDevices]))

(defn list-tags-for-resource
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn untag-resource
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.UntagResourceResult`"
  (^com.amazonaws.services.iot1clickdevices.model.UntagResourceResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-device-events
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest`

  returns: Result of the ListDeviceEvents operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsResult`"
  (^com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest request]
    (-> this (.listDeviceEvents request))))

(defn update-device-state
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest`

  returns: Result of the UpdateDeviceState operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateResult`"
  (^com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest request]
    (-> this (.updateDeviceState request))))

(defn list-devices
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ListDevicesResult`"
  (^com.amazonaws.services.iot1clickdevices.model.ListDevicesResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest request]
    (-> this (.listDevices request))))

(defn describe-device
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest`

  returns: Result of the DescribeDevice operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.DescribeDeviceResult`"
  (^com.amazonaws.services.iot1clickdevices.model.DescribeDeviceResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest request]
    (-> this (.describeDevice request))))

(defn shutdown
  "Description copied from interface: AWSIoT1ClickDevices"
  ([^AbstractAWSIoT1ClickDevices this]
    (-> this (.shutdown))))

(defn unclaim-device
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest`

  returns: Result of the UnclaimDevice operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceResult`"
  (^com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest request]
    (-> this (.unclaimDevice request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSIoT1ClickDevices

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn claim-devices-by-claim-code
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest`

  returns: Result of the ClaimDevicesByClaimCode operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeResult`"
  (^com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest request]
    (-> this (.claimDevicesByClaimCode request))))

(defn get-device-methods
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest`

  returns: Result of the GetDeviceMethods operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsResult`"
  (^com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest request]
    (-> this (.getDeviceMethods request))))

(defn tag-resource
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.TagResourceResult`"
  (^com.amazonaws.services.iot1clickdevices.model.TagResourceResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn initiate-device-claim
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest`

  returns: Result of the InitiateDeviceClaim operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimResult`"
  (^com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest request]
    (-> this (.initiateDeviceClaim request))))

(defn finalize-device-claim
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest`

  returns: Result of the FinalizeDeviceClaim operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimResult`"
  (^com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest request]
    (-> this (.finalizeDeviceClaim request))))

(defn invoke-device-method
  "Description copied from interface: AWSIoT1ClickDevices

  request - `com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest`

  returns: Result of the InvokeDeviceMethod operation returned by the service. - `com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodResult`"
  (^com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodResult [^AbstractAWSIoT1ClickDevices this ^com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest request]
    (-> this (.invokeDeviceMethod request))))

