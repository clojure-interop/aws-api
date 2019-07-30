(ns com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingAsync
  "Interface for accessing Elastic Load Balancing v2 asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonElasticLoadBalancingAsync instead.


  Elastic Load Balancing

  A load balancer distributes incoming traffic across targets, such as your EC2 instances. This enables you to increase
  the availability of your application. The load balancer also monitors the health of its registered targets and
  ensures that it routes traffic only to healthy targets. You configure your load balancer to accept incoming traffic
  by specifying one or more listeners, which are configured with a protocol and port number for connections from
  clients to the load balancer. You configure a target group with a protocol and port number for connections from the
  load balancer to the targets, and with health check settings to be used when checking the health status of the
  targets.


  Elastic Load Balancing supports the following types of load balancers: Application Load Balancers, Network Load
  Balancers, and Classic Load Balancers.


  An Application Load Balancer makes routing and load balancing decisions at the application layer (HTTP/HTTPS). A
  Network Load Balancer makes routing and load balancing decisions at the transport layer (TCP/TLS). Both Application
  Load Balancers and Network Load Balancers can route requests to one or more ports on each EC2 instance or container
  instance in your virtual private cloud (VPC).


  A Classic Load Balancer makes routing and load balancing decisions either at the transport layer (TCP/SSL) or the
  application layer (HTTP/HTTPS), and supports either EC2-Classic or a VPC. For more information, see the Elastic Load Balancing User Guide.


  This reference covers the 2015-12-01 API, which supports Application Load Balancers and Network Load Balancers. The
  2012-06-01 API supports Classic Load Balancers.


  To get started, complete the following tasks:




  Create a load balancer using CreateLoadBalancer.




  Create a target group using CreateTargetGroup.




  Register targets for the target group using RegisterTargets.




  Create one or more listeners for your load balancer using CreateListener.




  To delete a load balancer and its related resources, complete the following tasks:




  Delete the load balancer using DeleteLoadBalancer.




  Delete the target group using DeleteTargetGroup.




  All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you repeat
  an operation, it succeeds."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticloadbalancingv2 AmazonElasticLoadBalancingAsync]))

(defn describe-account-limits-async
  "Describes the current Elastic Load Balancing resource limits for your AWS account.


   For more information, see Limits for
   Your Application Load Balancers in the Application Load Balancer Guide or Limits for Your
   Network Load Balancers in the Network Load Balancers Guide.

  describe-account-limits-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsRequest describe-account-limits-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountLimitsAsync describe-account-limits-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsRequest describe-account-limits-request]
    (-> this (.describeAccountLimitsAsync describe-account-limits-request))))

(defn describe-listener-certificates-async
  "Describes the default certificate and the certificate list for the specified HTTPS listener.


   If the default certificate is also in the certificate list, it appears twice in the results (once with
   IsDefault set to true and once with IsDefault set to false).


   For more information, see SSL Certificates in the Application Load Balancers Guide.

  describe-listener-certificates-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeListenerCertificates operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesRequest describe-listener-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeListenerCertificatesAsync describe-listener-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesRequest describe-listener-certificates-request]
    (-> this (.describeListenerCertificatesAsync describe-listener-certificates-request))))

(defn register-targets-async
  "Registers the specified targets with the specified target group.


   If the target is an EC2 instance, it must be in the running state when you register it.


   By default, the load balancer routes requests to registered targets using the protocol and port for the target
   group. Alternatively, you can override the port for a target when you register it. You can register each EC2
   instance or IP address with the same target group multiple times using different ports.


   With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance
   types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of
   these types by IP address.


   To remove a target from a target group, use DeregisterTargets.

  register-targets-request - `com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsRequest register-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerTargetsAsync register-targets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsRequest register-targets-request]
    (-> this (.registerTargetsAsync register-targets-request))))

(defn describe-load-balancers-async
  "Describes the specified load balancers or all of your load balancers.


   To describe the listeners for a load balancer, use DescribeListeners. To describe the attributes for a
   load balancer, use DescribeLoadBalancerAttributes.

  describe-load-balancers-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest describe-load-balancers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancersAsync describe-load-balancers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest describe-load-balancers-request]
    (-> this (.describeLoadBalancersAsync describe-load-balancers-request))))

(defn delete-listener-async
  "Deletes the specified listener.


   Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using
   DeleteLoadBalancer.

  delete-listener-request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerRequest delete-listener-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteListenerAsync delete-listener-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerRequest delete-listener-request]
    (-> this (.deleteListenerAsync delete-listener-request))))

(defn add-listener-certificates-async
  "Adds the specified SSL server certificate to the certificate list for the specified HTTPS listener.


   If the certificate in already in the certificate list, the call is successful but the certificate is not added
   again.


   To get the certificate list for a listener, use DescribeListenerCertificates. To remove certificates from
   the certificate list for a listener, use RemoveListenerCertificates. To replace the default certificate
   for a listener, use ModifyListener.


   For more information, see SSL Certificates in the Application Load Balancers Guide.

  add-listener-certificates-request - `com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddListenerCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesRequest add-listener-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addListenerCertificatesAsync add-listener-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesRequest add-listener-certificates-request]
    (-> this (.addListenerCertificatesAsync add-listener-certificates-request))))

(defn create-rule-async
  "Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer.


   Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule
   are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are
   performed. For more information, see Listener Rules in the Application Load Balancers Guide.


   To view your current rules, use DescribeRules. To update a rule, use ModifyRule. To set the
   priorities of your rules, use SetRulePriorities. To delete a rule, use DeleteRule.

  create-rule-request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleRequest create-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRuleAsync create-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleRequest create-rule-request]
    (-> this (.createRuleAsync create-rule-request))))

(defn modify-target-group-async
  "Modifies the health checks used when evaluating the health state of the targets in the specified target group.


   To monitor the health of the targets, use DescribeTargetHealth.

  modify-target-group-request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTargetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupRequest modify-target-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTargetGroupAsync modify-target-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupRequest modify-target-group-request]
    (-> this (.modifyTargetGroupAsync modify-target-group-request))))

(defn modify-target-group-attributes-async
  "Modifies the specified attributes of the specified target group.

  modify-target-group-attributes-request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTargetGroupAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesRequest modify-target-group-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTargetGroupAttributesAsync modify-target-group-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesRequest modify-target-group-attributes-request]
    (-> this (.modifyTargetGroupAttributesAsync modify-target-group-attributes-request))))

(defn describe-load-balancer-attributes-async
  "Describes the attributes for the specified Application Load Balancer or Network Load Balancer.


   For more information, see Load Balancer Attributes in the Application Load Balancers Guide or Load Balancer Attributes in the Network Load Balancers Guide.

  describe-load-balancer-attributes-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancerAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesRequest describe-load-balancer-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancerAttributesAsync describe-load-balancer-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesRequest describe-load-balancer-attributes-request]
    (-> this (.describeLoadBalancerAttributesAsync describe-load-balancer-attributes-request))))

(defn describe-target-group-attributes-async
  "Describes the attributes for the specified target group.


   For more information, see Target Group Attributes in the Application Load Balancers Guide or Target Group Attributes in the Network Load Balancers Guide.

  describe-target-group-attributes-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTargetGroupAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesRequest describe-target-group-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTargetGroupAttributesAsync describe-target-group-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesRequest describe-target-group-attributes-request]
    (-> this (.describeTargetGroupAttributesAsync describe-target-group-attributes-request))))

(defn set-rule-priorities-async
  "Sets the priorities of the specified rules.


   You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that
   you do not specify retain their current priority.

  set-rule-priorities-request - `com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetRulePriorities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesRequest set-rule-priorities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setRulePrioritiesAsync set-rule-priorities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesRequest set-rule-priorities-request]
    (-> this (.setRulePrioritiesAsync set-rule-priorities-request))))

(defn delete-rule-async
  "Deletes the specified rule.

  delete-rule-request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleRequest delete-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRuleAsync delete-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleRequest delete-rule-request]
    (-> this (.deleteRuleAsync delete-rule-request))))

(defn describe-target-groups-async
  "Describes the specified target groups or all of your target groups. By default, all target groups are described.
   Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the
   names of one or more target groups, or the ARNs of one or more target groups.


   To describe the targets for a target group, use DescribeTargetHealth. To describe the attributes of a
   target group, use DescribeTargetGroupAttributes.

  describe-target-groups-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTargetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsRequest describe-target-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTargetGroupsAsync describe-target-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsRequest describe-target-groups-request]
    (-> this (.describeTargetGroupsAsync describe-target-groups-request))))

(defn create-listener-async
  "Creates a listener for the specified Application Load Balancer or Network Load Balancer.


   To update a listener, use ModifyListener. When you are finished with a listener, you can delete it using
   DeleteListener. If you are finished with both the listener and the load balancer, you can delete them both
   using DeleteLoadBalancer.


   This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
   listeners with the same settings, each call succeeds.


   For more information, see Listeners
   for Your Application Load Balancers in the Application Load Balancers Guide and Listeners for
   Your Network Load Balancers in the Network Load Balancers Guide.

  create-listener-request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerRequest create-listener-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createListenerAsync create-listener-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerRequest create-listener-request]
    (-> this (.createListenerAsync create-listener-request))))

(defn modify-load-balancer-attributes-async
  "Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer.


   If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that
   you do not modify retain their current values.

  modify-load-balancer-attributes-request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyLoadBalancerAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesRequest modify-load-balancer-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyLoadBalancerAttributesAsync modify-load-balancer-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesRequest modify-load-balancer-attributes-request]
    (-> this (.modifyLoadBalancerAttributesAsync modify-load-balancer-attributes-request))))

(defn set-subnets-async
  "Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The
   specified subnets replace the previously enabled subnets.


   You can't change the subnets for a Network Load Balancer.

  set-subnets-request - `com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetSubnets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsRequest set-subnets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSubnetsAsync set-subnets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsRequest set-subnets-request]
    (-> this (.setSubnetsAsync set-subnets-request))))

(defn describe-target-health-async
  "Describes the health of the specified targets or all of your targets.

  describe-target-health-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTargetHealth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthRequest describe-target-health-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTargetHealthAsync describe-target-health-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthRequest describe-target-health-request]
    (-> this (.describeTargetHealthAsync describe-target-health-request))))

(defn deregister-targets-async
  "Deregisters the specified targets from the specified target group. After the targets are deregistered, they no
   longer receive traffic from the load balancer.

  deregister-targets-request - `com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsRequest deregister-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterTargetsAsync deregister-targets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsRequest deregister-targets-request]
    (-> this (.deregisterTargetsAsync deregister-targets-request))))

(defn remove-tags-async
  "Removes the specified tags from the specified Elastic Load Balancing resource.


   To list the current tags for your resources, use DescribeTags.

  remove-tags-request - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsRequest remove-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync remove-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsRequest remove-tags-request]
    (-> this (.removeTagsAsync remove-tags-request))))

(defn delete-target-group-async
  "Deletes the specified target group.


   You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any
   associated health checks.

  delete-target-group-request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTargetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupRequest delete-target-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTargetGroupAsync delete-target-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupRequest delete-target-group-request]
    (-> this (.deleteTargetGroupAsync delete-target-group-request))))

(defn modify-rule-async
  "Modifies the specified rule.


   Any existing properties that you do not modify retain their current values.


   To modify the actions for the default rule, use ModifyListener.

  modify-rule-request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleRequest modify-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyRuleAsync modify-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleRequest modify-rule-request]
    (-> this (.modifyRuleAsync modify-rule-request))))

(defn describe-ssl-policies-async
  "Describes the specified policies or all policies used for SSL negotiation.


   For more information, see Security Policies in the Application Load Balancers Guide.

  describe-ssl-policies-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSSLPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesRequest describe-ssl-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSSLPoliciesAsync describe-ssl-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesRequest describe-ssl-policies-request]
    (-> this (.describeSSLPoliciesAsync describe-ssl-policies-request))))

(defn remove-listener-certificates-async
  "Removes the specified certificate from the certificate list for the specified HTTPS listener.


   You can't remove the default certificate for a listener. To replace the default certificate, call
   ModifyListener.


   To list the certificates for your listener, use DescribeListenerCertificates.

  remove-listener-certificates-request - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveListenerCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesRequest remove-listener-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeListenerCertificatesAsync remove-listener-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesRequest remove-listener-certificates-request]
    (-> this (.removeListenerCertificatesAsync remove-listener-certificates-request))))

(defn describe-tags-async
  "Describes the tags for the specified resources. You can describe the tags for one or more Application Load
   Balancers, Network Load Balancers, and target groups.

  describe-tags-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsRequest describe-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync describe-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTagsAsync describe-tags-request))))

(defn modify-listener-async
  "Modifies the specified properties of the specified listener.


   Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to
   HTTP, or from TLS to TCP, removes the security policy and default certificate properties. If you change the
   protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy and default certificate
   properties.

  modify-listener-request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerRequest modify-listener-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyListenerAsync modify-listener-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerRequest modify-listener-request]
    (-> this (.modifyListenerAsync modify-listener-request))))

(defn set-ip-address-type-async
  "Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load
   Balancer.

  set-ip-address-type-request - `com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIpAddressType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeRequest set-ip-address-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIpAddressTypeAsync set-ip-address-type-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeRequest set-ip-address-type-request]
    (-> this (.setIpAddressTypeAsync set-ip-address-type-request))))

(defn delete-load-balancer-async
  "Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners.


   You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has
   already been deleted, the call succeeds.


   Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run
   and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or
   terminate them.

  delete-load-balancer-request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerRequest delete-load-balancer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerAsync delete-load-balancer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerRequest delete-load-balancer-request]
    (-> this (.deleteLoadBalancerAsync delete-load-balancer-request))))

(defn set-security-groups-async
  "Associates the specified security groups with the specified Application Load Balancer. The specified security
   groups override the previously associated security groups.


   You can't specify a security group for a Network Load Balancer.

  set-security-groups-request - `com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsRequest set-security-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSecurityGroupsAsync set-security-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsRequest set-security-groups-request]
    (-> this (.setSecurityGroupsAsync set-security-groups-request))))

(defn create-load-balancer-async
  "Creates an Application Load Balancer or a Network Load Balancer.


   When you create a load balancer, you can specify security groups, public subnets, IP address type, and tags.
   Otherwise, you could do so later using SetSecurityGroups, SetSubnets, SetIpAddressType, and
   AddTags.


   To create listeners for your load balancer, use CreateListener. To describe your current load balancers,
   see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using
   DeleteLoadBalancer.


   For limit information, see Limits for
   Your Application Load Balancer in the Application Load Balancers Guide and Limits for Your
   Network Load Balancer in the Network Load Balancers Guide.


   This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
   load balancers with the same settings, each call succeeds.


   For more information, see Application Load Balancers in the Application Load Balancers Guide and Network Load
   Balancers in the Network Load Balancers Guide.

  create-load-balancer-request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerRequest create-load-balancer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerAsync create-load-balancer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerRequest create-load-balancer-request]
    (-> this (.createLoadBalancerAsync create-load-balancer-request))))

(defn create-target-group-async
  "Creates a target group.


   To register targets with the target group, use RegisterTargets. To update the health check settings for
   the target group, use ModifyTargetGroup. To monitor the health of targets in the target group, use
   DescribeTargetHealth.


   To route traffic to the targets in a target group, specify the target group in an action using
   CreateListener or CreateRule.


   To delete a target group, use DeleteTargetGroup.


   This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
   target groups with the same settings, each call succeeds.


   For more information, see Target Groups for Your Application Load Balancers in the Application Load Balancers Guide or Target
   Groups for Your Network Load Balancers in the Network Load Balancers Guide.

  create-target-group-request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTargetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupRequest create-target-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTargetGroupAsync create-target-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupRequest create-target-group-request]
    (-> this (.createTargetGroupAsync create-target-group-request))))

(defn add-tags-async
  "Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load
   Balancers, Network Load Balancers, and your target groups.


   Each tag consists of a key and an optional value. If a resource already has a tag with the same key,
   AddTags updates its value.


   To list the current tags for your resources, use DescribeTags. To remove tags from your resources, use
   RemoveTags.

  add-tags-request - `com.amazonaws.services.elasticloadbalancingv2.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.AddTagsRequest add-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync add-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.AddTagsRequest add-tags-request]
    (-> this (.addTagsAsync add-tags-request))))

(defn describe-rules-async
  "Describes the specified rules or the rules for the specified listener. You must specify either a listener or one
   or more rules.

  describe-rules-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesRequest describe-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRulesAsync describe-rules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesRequest describe-rules-request]
    (-> this (.describeRulesAsync describe-rules-request))))

(defn describe-listeners-async
  "Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load
   Balancer. You must specify either a load balancer or one or more listeners.


   For an HTTPS or TLS listener, the output includes the default certificate for the listener. To describe the
   certificate list for the listener, use DescribeListenerCertificates.

  describe-listeners-request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeListeners operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersRequest describe-listeners-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeListenersAsync describe-listeners-request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersRequest describe-listeners-request]
    (-> this (.describeListenersAsync describe-listeners-request))))

