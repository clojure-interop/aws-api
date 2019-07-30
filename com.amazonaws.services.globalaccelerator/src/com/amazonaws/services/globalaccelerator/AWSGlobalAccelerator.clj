(ns com.amazonaws.services.globalaccelerator.AWSGlobalAccelerator
  "Interface for accessing AWS Global Accelerator.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSGlobalAccelerator instead.


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
  (:import [com.amazonaws.services.globalaccelerator AWSGlobalAccelerator]))

(defn describe-accelerator
  "Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.

  describe-accelerator-request - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest`

  returns: Result of the DescribeAccelerator operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorResult`

  throws: com.amazonaws.services.globalaccelerator.model.AcceleratorNotFoundException - The accelerator that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorRequest describe-accelerator-request]
    (-> this (.describeAccelerator describe-accelerator-request))))

(defn create-accelerator
  "Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct
   traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see
   an AWS CLI example of creating an accelerator, scroll down to Example.

  create-accelerator-request - `com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest`

  returns: Result of the CreateAccelerator operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.CreateAcceleratorResult`

  throws: com.amazonaws.services.globalaccelerator.model.InternalServiceErrorException - There was an internal error for AWS Global Accelerator."
  (^com.amazonaws.services.globalaccelerator.model.CreateAcceleratorResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.CreateAcceleratorRequest create-accelerator-request]
    (-> this (.createAccelerator create-accelerator-request))))

(defn list-accelerators
  "List the accelerators for an AWS account.

  list-accelerators-request - `com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest`

  returns: Result of the ListAccelerators operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.ListAcceleratorsResult`

  throws: com.amazonaws.services.globalaccelerator.model.InvalidNextTokenException - There isn't another item to return."
  (^com.amazonaws.services.globalaccelerator.model.ListAcceleratorsResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.ListAcceleratorsRequest list-accelerators-request]
    (-> this (.listAccelerators list-accelerators-request))))

(defn describe-accelerator-attributes
  "Describe the attributes of an accelerator.

  describe-accelerator-attributes-request - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest`

  returns: Result of the DescribeAcceleratorAttributes operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesResult`

  throws: com.amazonaws.services.globalaccelerator.model.AcceleratorNotFoundException - The accelerator that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DescribeAcceleratorAttributesRequest describe-accelerator-attributes-request]
    (-> this (.describeAcceleratorAttributes describe-accelerator-attributes-request))))

(defn list-endpoint-groups
  "List the endpoint groups that are associated with a listener.

  list-endpoint-groups-request - `com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest`

  returns: Result of the ListEndpointGroups operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsResult`

  throws: com.amazonaws.services.globalaccelerator.model.ListenerNotFoundException - The listener that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.ListEndpointGroupsRequest list-endpoint-groups-request]
    (-> this (.listEndpointGroups list-endpoint-groups-request))))

(defn delete-endpoint-group
  "Delete an endpoint group from a listener.

  delete-endpoint-group-request - `com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest`

  returns: Result of the DeleteEndpointGroup operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupResult`

  throws: com.amazonaws.services.globalaccelerator.model.EndpointGroupNotFoundException - The endpoint group that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DeleteEndpointGroupRequest delete-endpoint-group-request]
    (-> this (.deleteEndpointGroup delete-endpoint-group-request))))

(defn update-accelerator-attributes
  "Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow
   logs, scroll down to Example.

  update-accelerator-attributes-request - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest`

  returns: Result of the UpdateAcceleratorAttributes operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesResult`

  throws: com.amazonaws.services.globalaccelerator.model.AcceleratorNotFoundException - The accelerator that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorAttributesRequest update-accelerator-attributes-request]
    (-> this (.updateAcceleratorAttributes update-accelerator-attributes-request))))

(defn describe-listener
  "Describe a listener.

  describe-listener-request - `com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest`

  returns: Result of the DescribeListener operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DescribeListenerResult`

  throws: com.amazonaws.services.globalaccelerator.model.InvalidArgumentException - An argument that you specified is invalid."
  (^com.amazonaws.services.globalaccelerator.model.DescribeListenerResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DescribeListenerRequest describe-listener-request]
    (-> this (.describeListener describe-listener-request))))

(defn list-listeners
  "List the listeners for an accelerator.

  list-listeners-request - `com.amazonaws.services.globalaccelerator.model.ListListenersRequest`

  returns: Result of the ListListeners operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.ListListenersResult`

  throws: com.amazonaws.services.globalaccelerator.model.AcceleratorNotFoundException - The accelerator that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.ListListenersResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.ListListenersRequest list-listeners-request]
    (-> this (.listListeners list-listeners-request))))

(defn update-endpoint-group
  "Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.

  update-endpoint-group-request - `com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest`

  returns: Result of the UpdateEndpointGroup operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupResult`

  throws: com.amazonaws.services.globalaccelerator.model.InvalidArgumentException - An argument that you specified is invalid."
  (^com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.UpdateEndpointGroupRequest update-endpoint-group-request]
    (-> this (.updateEndpointGroup update-endpoint-group-request))))

(defn update-accelerator
  "Update an accelerator.

  update-accelerator-request - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest`

  returns: Result of the UpdateAccelerator operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorResult`

  throws: com.amazonaws.services.globalaccelerator.model.AcceleratorNotFoundException - The accelerator that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.UpdateAcceleratorRequest update-accelerator-request]
    (-> this (.updateAccelerator update-accelerator-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSGlobalAccelerator this]
    (-> this (.shutdown))))

(defn update-listener
  "Update a listener.

  update-listener-request - `com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest`

  returns: Result of the UpdateListener operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.UpdateListenerResult`

  throws: com.amazonaws.services.globalaccelerator.model.InvalidArgumentException - An argument that you specified is invalid."
  (^com.amazonaws.services.globalaccelerator.model.UpdateListenerResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.UpdateListenerRequest update-listener-request]
    (-> this (.updateListener update-listener-request))))

(defn create-endpoint-group
  "Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS
   Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.

  create-endpoint-group-request - `com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest`

  returns: Result of the CreateEndpointGroup operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupResult`

  throws: com.amazonaws.services.globalaccelerator.model.AcceleratorNotFoundException - The accelerator that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.CreateEndpointGroupRequest create-endpoint-group-request]
    (-> this (.createEndpointGroup create-endpoint-group-request))))

(defn describe-endpoint-group
  "Describe an endpoint group.

  describe-endpoint-group-request - `com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest`

  returns: Result of the DescribeEndpointGroup operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupResult`

  throws: com.amazonaws.services.globalaccelerator.model.EndpointGroupNotFoundException - The endpoint group that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DescribeEndpointGroupRequest describe-endpoint-group-request]
    (-> this (.describeEndpointGroup describe-endpoint-group-request))))

(defn create-listener
  "Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned
   static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of
   creating a listener, scroll down to Example.

  create-listener-request - `com.amazonaws.services.globalaccelerator.model.CreateListenerRequest`

  returns: Result of the CreateListener operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.CreateListenerResult`

  throws: com.amazonaws.services.globalaccelerator.model.InvalidArgumentException - An argument that you specified is invalid."
  (^com.amazonaws.services.globalaccelerator.model.CreateListenerResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.CreateListenerRequest create-listener-request]
    (-> this (.createListener create-listener-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSGlobalAccelerator this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-accelerator
  "Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent
   resources (listeners and endpoint groups).

  delete-accelerator-request - `com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest`

  returns: Result of the DeleteAccelerator operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorResult`

  throws: com.amazonaws.services.globalaccelerator.model.AcceleratorNotFoundException - The accelerator that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DeleteAcceleratorRequest delete-accelerator-request]
    (-> this (.deleteAccelerator delete-accelerator-request))))

(defn delete-listener
  "Delete a listener from an accelerator.

  delete-listener-request - `com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest`

  returns: Result of the DeleteListener operation returned by the service. - `com.amazonaws.services.globalaccelerator.model.DeleteListenerResult`

  throws: com.amazonaws.services.globalaccelerator.model.ListenerNotFoundException - The listener that you specified doesn't exist."
  (^com.amazonaws.services.globalaccelerator.model.DeleteListenerResult [^AWSGlobalAccelerator this ^com.amazonaws.services.globalaccelerator.model.DeleteListenerRequest delete-listener-request]
    (-> this (.deleteListener delete-listener-request))))

