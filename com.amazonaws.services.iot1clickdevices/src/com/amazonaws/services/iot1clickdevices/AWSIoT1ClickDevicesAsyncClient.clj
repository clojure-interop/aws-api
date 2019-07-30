(ns com.amazonaws.services.iot1clickdevices.AWSIoT1ClickDevicesAsyncClient
  "Client for accessing AWS IoT 1-Click Devices Service asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.


  Describes all of the AWS IoT 1-Click device-related API operations for the service. Also provides sample requests,
  responses, and errors for the supported web services protocols."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot1clickdevices AWSIoT1ClickDevicesAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.iot1clickdevices.AWSIoT1ClickDevicesAsyncClientBuilder`"
  (^com.amazonaws.services.iot1clickdevices.AWSIoT1ClickDevicesAsyncClientBuilder []
    (AWSIoT1ClickDevicesAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSIoT1ClickDevicesAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-device-events-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeviceEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeviceEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.ListDeviceEventsRequest request]
    (-> this (.listDeviceEventsAsync request))))

(defn finalize-device-claim-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FinalizeDeviceClaim operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.finalizeDeviceClaimAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.FinalizeDeviceClaimRequest request]
    (-> this (.finalizeDeviceClaimAsync request))))

(defn update-device-state-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeviceState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeviceStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.UpdateDeviceStateRequest request]
    (-> this (.updateDeviceStateAsync request))))

(defn invoke-device-method-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InvokeDeviceMethod operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invokeDeviceMethodAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.InvokeDeviceMethodRequest request]
    (-> this (.invokeDeviceMethodAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSIoT1ClickDevicesAsyncClient this]
    (-> this (.shutdown))))

(defn list-devices-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.ListDevicesResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.ListDevicesRequest request]
    (-> this (.listDevicesAsync request))))

(defn unclaim-device-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnclaimDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unclaimDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.UnclaimDeviceRequest request]
    (-> this (.unclaimDeviceAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn initiate-device-claim-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateDeviceClaim operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateDeviceClaimAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.InitiateDeviceClaimRequest request]
    (-> this (.initiateDeviceClaimAsync request))))

(defn describe-device-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.DescribeDeviceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.DescribeDeviceRequest request]
    (-> this (.describeDeviceAsync request))))

(defn get-device-methods-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeviceMethods operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceMethodsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.GetDeviceMethodsRequest request]
    (-> this (.getDeviceMethodsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn claim-devices-by-claim-code-async
  "Description copied from interface: AWSIoT1ClickDevicesAsync

  request - `com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ClaimDevicesByClaimCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.claimDevicesByClaimCodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickDevicesAsyncClient this ^com.amazonaws.services.iot1clickdevices.model.ClaimDevicesByClaimCodeRequest request]
    (-> this (.claimDevicesByClaimCodeAsync request))))

