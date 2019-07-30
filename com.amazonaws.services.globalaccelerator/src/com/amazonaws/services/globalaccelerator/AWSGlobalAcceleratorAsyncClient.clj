(ns com.amazonaws.services.globalaccelerator.AWSGlobalAcceleratorAsyncClient
  "Client for accessing AWS Global Accelerator asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

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
  (:import [com.amazonaws.services.globalaccelerator AWSGlobalAcceleratorAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.globalaccelerator.AWSGlobalAcceleratorAsyncClientBuilder`"
  (^com.amazonaws.services.globalaccelerator.AWSGlobalAcceleratorAsyncClientBuilder []
    (AWSGlobalAcceleratorAsyncClient/asyncBuilder )))

(defn list-accelerators-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccelerators operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.ListAcceleratorsResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAcceleratorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest request]
    (-> this (.listAcceleratorsAsync request))))

(defn describe-listener-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeListenerResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest request]
    (-> this (.describeListenerAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSGlobalAcceleratorAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-accelerator-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.CreateAcceleratorResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAcceleratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest request]
    (-> this (.createAcceleratorAsync request))))

(defn delete-listener-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DeleteListenerResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest request]
    (-> this (.deleteListenerAsync request))))

(defn create-endpoint-group-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest request]
    (-> this (.createEndpointGroupAsync request))))

(defn update-endpoint-group-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest request]
    (-> this (.updateEndpointGroupAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSGlobalAcceleratorAsyncClient this]
    (-> this (.shutdown))))

(defn delete-endpoint-group-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest request]
    (-> this (.deleteEndpointGroupAsync request))))

(defn create-listener-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.CreateListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.CreateListenerResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.CreateListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.CreateListenerRequest request]
    (-> this (.createListenerAsync request))))

(defn update-listener-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateListenerResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest request]
    (-> this (.updateListenerAsync request))))

(defn update-accelerator-attributes-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAcceleratorAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAcceleratorAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest request]
    (-> this (.updateAcceleratorAttributesAsync request))))

(defn describe-endpoint-group-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest request]
    (-> this (.describeEndpointGroupAsync request))))

(defn update-accelerator-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAcceleratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest request]
    (-> this (.updateAcceleratorAsync request))))

(defn list-endpoint-groups-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEndpointGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEndpointGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest request]
    (-> this (.listEndpointGroupsAsync request))))

(defn list-listeners-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.ListListenersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListListeners operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.ListListenersResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.ListListenersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listListenersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.ListListenersRequest request]
    (-> this (.listListenersAsync request))))

(defn describe-accelerator-attributes-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAcceleratorAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAcceleratorAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest request]
    (-> this (.describeAcceleratorAttributesAsync request))))

(defn delete-accelerator-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAcceleratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest request]
    (-> this (.deleteAcceleratorAsync request))))

(defn describe-accelerator-async
  "Description copied from interface: AWSGlobalAcceleratorAsync

  request - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccelerator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorResult>`"
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAcceleratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSGlobalAcceleratorAsyncClient this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest request]
    (-> this (.describeAcceleratorAsync request))))

