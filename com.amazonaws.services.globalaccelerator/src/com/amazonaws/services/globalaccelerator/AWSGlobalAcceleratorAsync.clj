(ns com.amazonaws.services.globalaccelerator.AWSGlobalAcceleratorAsync
  "Interface for accessing AWS Global Accelerator asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSGlobalAcceleratorAsync instead.


  AWS Global Accelerator

  This is the AWS Global Accelerator API Reference. This guide is for developers who need detailed information
  about AWS Global Accelerator API actions, data types, and errors. For more information about Global Accelerator
  features, see the AWS Global
  Accelerator Developer Guide.


  AWS Global Accelerator is a network layer service in which you create accelerators to improve availability and
  performance for internet applications used by a global audience.


  Global Accelerator provides you with static IP addresses that you associate with your accelerator. These IP addresses
  are anycast from the AWS edge network and distribute incoming application traffic across multiple endpoint resources
  in multiple AWS Regions, which increases the availability of your applications. Endpoints can be Elastic IP
  addresses, Network Load Balancers, and Application Load Balancers that are located in one AWS Region or multiple
  Regions.


  Global Accelerator uses the AWS global network to route traffic to the optimal regional endpoint based on health,
  client location, and policies that you configure. The service reacts instantly to changes in health or configuration
  to ensure that internet traffic from clients is directed to only healthy endpoints.


  Global Accelerator includes components that work together to help you improve performance and availability for your
  applications:


  Static IP address


  AWS Global Accelerator provides you with a set of static IP addresses which are anycast from the AWS edge network and
  serve as the single fixed entry points for your clients. If you already have Elastic Load Balancing or Elastic IP
  address resources set up for your applications, you can easily add those to Global Accelerator to allow the resources
  to be accessed by a Global Accelerator static IP address.


  Accelerator


  An accelerator directs traffic to optimal endpoints over the AWS global network to improve availability and
  performance for your internet applications that have a global audience. Each accelerator includes one or more
  listeners.


  Network zone


  A network zone services the static IP addresses for your accelerator from a unique IP subnet. Similar to an AWS
  Availability Zone, a network zone is an isolated unit with its own set of physical infrastructure. When you configure
  an accelerator, Global Accelerator allocates two IPv4 addresses for it. If one IP address from a network zone becomes
  unavailable due to IP address blocking by certain client networks, or network disruptions, then client applications
  can retry on the healthy static IP address from the other isolated network zone.


  Listener


  A listener processes inbound connections from clients to Global Accelerator, based on the protocol and port that you
  configure. Each listener has one or more endpoint groups associated with it, and traffic is forwarded to endpoints in
  one of the groups. You associate endpoint groups with listeners by specifying the Regions that you want to distribute
  traffic to. Traffic is distributed to optimal endpoints within the endpoint groups associated with a listener.


  Endpoint group


  Each endpoint group is associated with a specific AWS Region. Endpoint groups include one or more endpoints in the
  Region. You can increase or reduce the percentage of traffic that would be otherwise directed to an endpoint group by
  adjusting a setting called a traffic dial. The traffic dial lets you easily do performance testing or
  blue/green deployment testing for new releases across different AWS Regions, for example.


  Endpoint


  An endpoint is an Elastic IP address, Network Load Balancer, or Application Load Balancer. Traffic is routed to
  endpoints based on several factors, including the geo-proximity to the user, the health of the endpoint, and the
  configuration options that you choose, such as endpoint weights. For each endpoint, you can configure weights, which
  are numbers that you can use to specify the proportion of traffic to route to each one. This can be useful, for
  example, to do performance testing within a Region."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.globalaccelerator AWSGlobalAcceleratorAsync]))

(defn list-accelerators-async
  "List the accelerators for an AWS account.

  list-accelerators-request - `com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccelerators operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.ListAcceleratorsResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest list-accelerators-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAcceleratorsAsync list-accelerators-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest list-accelerators-request]
    (-> this (.listAcceleratorsAsync list-accelerators-request))))

(defn describe-listener-async
  "Describe a listener.

  describe-listener-request - `com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeListenerResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest describe-listener-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeListenerAsync describe-listener-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest describe-listener-request]
    (-> this (.describeListenerAsync describe-listener-request))))

(defn create-accelerator-async
  "Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct
   traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see
   an AWS CLI example of creating an accelerator, scroll down to Example.

  create-accelerator-request - `com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.CreateAcceleratorResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest create-accelerator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAcceleratorAsync create-accelerator-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest create-accelerator-request]
    (-> this (.createAcceleratorAsync create-accelerator-request))))

(defn delete-listener-async
  "Delete a listener from an accelerator.

  delete-listener-request - `com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DeleteListenerResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest delete-listener-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteListenerAsync delete-listener-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest delete-listener-request]
    (-> this (.deleteListenerAsync delete-listener-request))))

(defn create-endpoint-group-async
  "Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS
   Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.

  create-endpoint-group-request - `com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest create-endpoint-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEndpointGroupAsync create-endpoint-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest create-endpoint-group-request]
    (-> this (.createEndpointGroupAsync create-endpoint-group-request))))

(defn update-endpoint-group-async
  "Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.

  update-endpoint-group-request - `com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest update-endpoint-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointGroupAsync update-endpoint-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest update-endpoint-group-request]
    (-> this (.updateEndpointGroupAsync update-endpoint-group-request))))

(defn delete-endpoint-group-async
  "Delete an endpoint group from a listener.

  delete-endpoint-group-request - `com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest delete-endpoint-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointGroupAsync delete-endpoint-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest delete-endpoint-group-request]
    (-> this (.deleteEndpointGroupAsync delete-endpoint-group-request))))

(defn create-listener-async
  "Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned
   static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of
   creating a listener, scroll down to Example.

  create-listener-request - `com.amazonaws.services.globalaccelerator.model.CreateListenerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.CreateListenerResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateListenerRequest create-listener-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createListenerAsync create-listener-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.CreateListenerRequest create-listener-request]
    (-> this (.createListenerAsync create-listener-request))))

(defn update-listener-async
  "Update a listener.

  update-listener-request - `com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateListenerResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest update-listener-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateListenerAsync update-listener-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest update-listener-request]
    (-> this (.updateListenerAsync update-listener-request))))

(defn update-accelerator-attributes-async
  "Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow
   logs, scroll down to Example.

  update-accelerator-attributes-request - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAcceleratorAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest update-accelerator-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAcceleratorAttributesAsync update-accelerator-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest update-accelerator-attributes-request]
    (-> this (.updateAcceleratorAttributesAsync update-accelerator-attributes-request))))

(defn describe-endpoint-group-async
  "Describe an endpoint group.

  describe-endpoint-group-request - `com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest describe-endpoint-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointGroupAsync describe-endpoint-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest describe-endpoint-group-request]
    (-> this (.describeEndpointGroupAsync describe-endpoint-group-request))))

(defn update-accelerator-async
  "Update an accelerator.

  update-accelerator-request - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest update-accelerator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAcceleratorAsync update-accelerator-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest update-accelerator-request]
    (-> this (.updateAcceleratorAsync update-accelerator-request))))

(defn list-endpoint-groups-async
  "List the endpoint groups that are associated with a listener.

  list-endpoint-groups-request - `com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEndpointGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest list-endpoint-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEndpointGroupsAsync list-endpoint-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest list-endpoint-groups-request]
    (-> this (.listEndpointGroupsAsync list-endpoint-groups-request))))

(defn list-listeners-async
  "List the listeners for an accelerator.

  list-listeners-request - `com.amazonaws.services.globalaccelerator.model.ListListenersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListListeners operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.ListListenersResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListListenersRequest list-listeners-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listListenersAsync list-listeners-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.ListListenersRequest list-listeners-request]
    (-> this (.listListenersAsync list-listeners-request))))

(defn describe-accelerator-attributes-async
  "Describe the attributes of an accelerator.

  describe-accelerator-attributes-request - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAcceleratorAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest describe-accelerator-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAcceleratorAttributesAsync describe-accelerator-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest describe-accelerator-attributes-request]
    (-> this (.describeAcceleratorAttributesAsync describe-accelerator-attributes-request))))

(defn delete-accelerator-async
  "Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent
   resources (listeners and endpoint groups).

  delete-accelerator-request - `com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest delete-accelerator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAcceleratorAsync delete-accelerator-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest delete-accelerator-request]
    (-> this (.deleteAcceleratorAsync delete-accelerator-request))))

(defn describe-accelerator-async
  "Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.

  describe-accelerator-request - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest describe-accelerator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAcceleratorAsync describe-accelerator-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsync this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest describe-accelerator-request]
    (-> this (.describeAcceleratorAsync describe-accelerator-request))))

