(ns com.amazonaws.services.globalaccelerator.AbstractAWSGlobalAccelerator
  "Abstract implementation of AWSGlobalAccelerator. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.globalaccelerator AbstractAWSGlobalAccelerator]))

(defn describe-accelerator
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest`

  returns: Result of the DescribeAccelerator operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorResult`"
  (^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest request]
    (-> this (.describeAccelerator request))))

(defn create-accelerator
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest`

  returns: Result of the CreateAccelerator operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.CreateAcceleratorResult`"
  (^com.amazonaws.services.globalaccelerator.model.CreateAcceleratorResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest request]
    (-> this (.createAccelerator request))))

(defn list-accelerators
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest`

  returns: Result of the ListAccelerators operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.ListAcceleratorsResult`"
  (^com.amazonaws.services.globalaccelerator.model.ListAcceleratorsResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest request]
    (-> this (.listAccelerators request))))

(defn describe-accelerator-attributes
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest`

  returns: Result of the DescribeAcceleratorAttributes operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesResult`"
  (^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest request]
    (-> this (.describeAcceleratorAttributes request))))

(defn list-endpoint-groups
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest`

  returns: Result of the ListEndpointGroups operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsResult`"
  (^com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest request]
    (-> this (.listEndpointGroups request))))

(defn delete-endpoint-group
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest`

  returns: Result of the DeleteEndpointGroup operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupResult`"
  (^com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest request]
    (-> this (.deleteEndpointGroup request))))

(defn update-accelerator-attributes
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest`

  returns: Result of the UpdateAcceleratorAttributes operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesResult`"
  (^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest request]
    (-> this (.updateAcceleratorAttributes request))))

(defn describe-listener
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest`

  returns: Result of the DescribeListener operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DescribeListenerResult`"
  (^com.amazonaws.services.globalaccelerator.model.DescribeListenerResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest request]
    (-> this (.describeListener request))))

(defn list-listeners
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.ListListenersRequest`

  returns: Result of the ListListeners operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.ListListenersResult`"
  (^com.amazonaws.services.globalaccelerator.model.ListListenersResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.ListListenersRequest request]
    (-> this (.listListeners request))))

(defn update-endpoint-group
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest`

  returns: Result of the UpdateEndpointGroup operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupResult`"
  (^com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest request]
    (-> this (.updateEndpointGroup request))))

(defn update-accelerator
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest`

  returns: Result of the UpdateAccelerator operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorResult`"
  (^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest request]
    (-> this (.updateAccelerator request))))

(defn shutdown
  "Description copied from interface: AWSGlobalAccelerator"
  ([^AbstractAWSGlobalAccelerator this]
    (-> this (.shutdown))))

(defn update-listener
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest`

  returns: Result of the UpdateListener operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.UpdateListenerResult`"
  (^com.amazonaws.services.globalaccelerator.model.UpdateListenerResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest request]
    (-> this (.updateListener request))))

(defn create-endpoint-group
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest`

  returns: Result of the CreateEndpointGroup operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupResult`"
  (^com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest request]
    (-> this (.createEndpointGroup request))))

(defn describe-endpoint-group
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest`

  returns: Result of the DescribeEndpointGroup operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupResult`"
  (^com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest request]
    (-> this (.describeEndpointGroup request))))

(defn create-listener
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.CreateListenerRequest`

  returns: Result of the CreateListener operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.CreateListenerResult`"
  (^com.amazonaws.services.globalaccelerator.model.CreateListenerResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.CreateListenerRequest request]
    (-> this (.createListener request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSGlobalAccelerator

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSGlobalAccelerator this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-accelerator
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest`

  returns: Result of the DeleteAccelerator operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorResult`"
  (^com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest request]
    (-> this (.deleteAccelerator request))))

(defn delete-listener
  "Description copied from interface: AWSGlobalAccelerator

  request - `com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest`

  returns: Result of the DeleteListener operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DeleteListenerResult`"
  (^com.amazonaws.services.globalaccelerator.model.DeleteListenerResult [^AbstractAWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest request]
    (-> this (.deleteListener request))))

