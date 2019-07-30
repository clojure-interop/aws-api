(ns com.amazonaws.services.globalaccelerator.AbstractAWSGlobalAcceleratorAsync
  "Abstract implementation of AWSGlobalAcceleratorAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.globalaccelerator AbstractAWSGlobalAcceleratorAsync]))

(defn list-accelerators-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccelerators operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.ListAcceleratorsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAcceleratorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest request]
    (-> this (.listAcceleratorsAsync request))))

(defn describe-listener-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeListenerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest request]
    (-> this (.describeListenerAsync request))))

(defn create-accelerator-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.CreateAcceleratorResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAcceleratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest request]
    (-> this (.createAcceleratorAsync request))))

(defn delete-listener-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DeleteListenerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest request]
    (-> this (.deleteListenerAsync request))))

(defn create-endpoint-group-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest request]
    (-> this (.createEndpointGroupAsync request))))

(defn update-endpoint-group-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest request]
    (-> this (.updateEndpointGroupAsync request))))

(defn delete-endpoint-group-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest request]
    (-> this (.deleteEndpointGroupAsync request))))

(defn create-listener-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.CreateListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.CreateListenerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateListenerRequest request]
    (-> this (.createListenerAsync request))))

(defn update-listener-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateListenerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest request]
    (-> this (.updateListenerAsync request))))

(defn update-accelerator-attributes-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAcceleratorAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAcceleratorAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest request]
    (-> this (.updateAcceleratorAttributesAsync request))))

(defn describe-endpoint-group-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest request]
    (-> this (.describeEndpointGroupAsync request))))

(defn update-accelerator-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAcceleratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest request]
    (-> this (.updateAcceleratorAsync request))))

(defn list-endpoint-groups-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEndpointGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEndpointGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest request]
    (-> this (.listEndpointGroupsAsync request))))

(defn list-listeners-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.ListListenersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListListeners operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.ListListenersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListListenersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listListenersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListListenersRequest request]
    (-> this (.listListenersAsync request))))

(defn describe-accelerator-attributes-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAcceleratorAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAcceleratorAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest request]
    (-> this (.describeAcceleratorAttributesAsync request))))

(defn delete-accelerator-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAcceleratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest request]
    (-> this (.deleteAcceleratorAsync request))))

(defn describe-accelerator-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAcceleratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest request]
    (-> this (.describeAcceleratorAsync request))))

