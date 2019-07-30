(ns com.amazonaws.services.iotdata.AWSIotDataAsync
  "Interface for accessing AWS IoT Data Plane asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIotDataAsync instead.


  AWS IoT

  AWS IoT-Data enables secure, bi-directional communication between Internet-connected things (such as sensors,
  actuators, embedded devices, or smart appliances) and the AWS cloud. It implements a broker for applications and
  things to publish messages over HTTP (Publish) and retrieve, update, and delete thing shadows. A thing shadow is a
  persistent representation of your things and their state in the AWS cloud."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotdata AWSIotDataAsync]))

(defn delete-thing-shadow-async
  "Deletes the thing shadow for the specified thing.


   For more information, see DeleteThingShadow in
   the AWS IoT Developer Guide.

  delete-thing-shadow-request - The input for the DeleteThingShadow operation. - `com.amazonaws.services.iotdata.model.DeleteThingShadowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThingShadow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.DeleteThingShadowResult>`"
  (^java.util.concurrent.Future [^AWSIotDataAsync this ^com.amazonaws.services.iotdata.model.DeleteThingShadowRequest delete-thing-shadow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThingShadowAsync delete-thing-shadow-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotDataAsync this ^com.amazonaws.services.iotdata.model.DeleteThingShadowRequest delete-thing-shadow-request]
    (-> this (.deleteThingShadowAsync delete-thing-shadow-request))))

(defn get-thing-shadow-async
  "Gets the thing shadow for the specified thing.


   For more information, see GetThingShadow in the
   AWS IoT Developer Guide.

  get-thing-shadow-request - The input for the GetThingShadow operation. - `com.amazonaws.services.iotdata.model.GetThingShadowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetThingShadow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.GetThingShadowResult>`"
  (^java.util.concurrent.Future [^AWSIotDataAsync this ^com.amazonaws.services.iotdata.model.GetThingShadowRequest get-thing-shadow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getThingShadowAsync get-thing-shadow-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotDataAsync this ^com.amazonaws.services.iotdata.model.GetThingShadowRequest get-thing-shadow-request]
    (-> this (.getThingShadowAsync get-thing-shadow-request))))

(defn publish-async
  "Publishes state information.


   For more information, see HTTP
   Protocol in the AWS IoT Developer Guide.

  publish-request - The input for the Publish operation. - `com.amazonaws.services.iotdata.model.PublishRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Publish operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.PublishResult>`"
  (^java.util.concurrent.Future [^AWSIotDataAsync this ^com.amazonaws.services.iotdata.model.PublishRequest publish-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishAsync publish-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotDataAsync this ^com.amazonaws.services.iotdata.model.PublishRequest publish-request]
    (-> this (.publishAsync publish-request))))

(defn update-thing-shadow-async
  "Updates the thing shadow for the specified thing.


   For more information, see UpdateThingShadow in
   the AWS IoT Developer Guide.

  update-thing-shadow-request - The input for the UpdateThingShadow operation. - `com.amazonaws.services.iotdata.model.UpdateThingShadowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThingShadow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotdata.model.UpdateThingShadowResult>`"
  (^java.util.concurrent.Future [^AWSIotDataAsync this ^com.amazonaws.services.iotdata.model.UpdateThingShadowRequest update-thing-shadow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThingShadowAsync update-thing-shadow-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotDataAsync this ^com.amazonaws.services.iotdata.model.UpdateThingShadowRequest update-thing-shadow-request]
    (-> this (.updateThingShadowAsync update-thing-shadow-request))))

