(ns com.amazonaws.services.iotdata.AbstractAWSIotDataAsync
  "Abstract implementation of AWSIotDataAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotdata AbstractAWSIotDataAsync]))

(defn delete-thing-shadow-async
  "Description copied from interface: AWSIotDataAsync

  request - The input for the DeleteThingShadow operation. - `com.amazonaws.services.iotdata.model.DeleteThingShadowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThingShadow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.DeleteThingShadowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotDataAsync this ^com.amazonaws.services.iotdata.model.DeleteThingShadowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThingShadowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotDataAsync this ^com.amazonaws.services.iotdata.model.DeleteThingShadowRequest request]
    (-> this (.deleteThingShadowAsync request))))

(defn get-thing-shadow-async
  "Description copied from interface: AWSIotDataAsync

  request - The input for the GetThingShadow operation. - `com.amazonaws.services.iotdata.model.GetThingShadowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetThingShadow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.GetThingShadowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotDataAsync this ^com.amazonaws.services.iotdata.model.GetThingShadowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getThingShadowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotDataAsync this ^com.amazonaws.services.iotdata.model.GetThingShadowRequest request]
    (-> this (.getThingShadowAsync request))))

(defn publish-async
  "Description copied from interface: AWSIotDataAsync

  request - The input for the Publish operation. - `com.amazonaws.services.iotdata.model.PublishRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Publish operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.PublishResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotDataAsync this ^com.amazonaws.services.iotdata.model.PublishRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotDataAsync this ^com.amazonaws.services.iotdata.model.PublishRequest request]
    (-> this (.publishAsync request))))

(defn update-thing-shadow-async
  "Description copied from interface: AWSIotDataAsync

  request - The input for the UpdateThingShadow operation. - `com.amazonaws.services.iotdata.model.UpdateThingShadowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThingShadow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.UpdateThingShadowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotDataAsync this ^com.amazonaws.services.iotdata.model.UpdateThingShadowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThingShadowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotDataAsync this ^com.amazonaws.services.iotdata.model.UpdateThingShadowRequest request]
    (-> this (.updateThingShadowAsync request))))

