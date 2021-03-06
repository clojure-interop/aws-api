(ns com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingClient
  "Client for accessing Elastic Load Balancing v2. All service calls made using this client are blocking, and will not
  return until the service call completes.

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
  (:import [com.amazonaws.services.elasticloadbalancingv2 AmazonElasticLoadBalancingClient]))

(defn ->amazon-elastic-load-balancing-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Elastic Load Balancing v2 (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonElasticLoadBalancingClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonElasticLoadBalancingClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonElasticLoadBalancingClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElasticLoadBalancingClient aws-credentials client-configuration))
  (^AmazonElasticLoadBalancingClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElasticLoadBalancingClient client-configuration))
  (^AmazonElasticLoadBalancingClient []
    (new AmazonElasticLoadBalancingClient )))

(defn *builder
  "returns: `com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingClientBuilder`"
  (^com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingClientBuilder []
    (AmazonElasticLoadBalancingClient/builder )))

(defn describe-listeners
  "Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load
   Balancer. You must specify either a load balancer or one or more listeners.


   For an HTTPS or TLS listener, the output includes the default certificate for the listener. To describe the
   certificate list for the listener, use DescribeListenerCertificates.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersRequest`

  returns: Result of the DescribeListeners operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.ListenerNotFoundException - The specified listener does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersRequest request]
    (-> this (.describeListeners request))))

(defn add-tags
  "Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load
   Balancers, Network Load Balancers, and your target groups.


   Each tag consists of a key and an optional value. If a resource already has a tag with the same key,
   AddTags updates its value.


   To list the current tags for your resources, use DescribeTags. To remove tags from your resources, use
   RemoveTags.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.AddTagsResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.elasticloadbalancingv2.model.AddTagsResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn modify-target-group-attributes
  "Modifies the specified attributes of the specified target group.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesRequest`

  returns: Result of the ModifyTargetGroupAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.TargetGroupNotFoundException - The specified target group does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesRequest request]
    (-> this (.modifyTargetGroupAttributes request))))

(defn describe-tags
  "Describes the tags for the specified resources. You can describe the tags for one or more Application Load
   Balancers, Network Load Balancers, and target groups.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn waiters
  "returns: `com.amazonaws.services.elasticloadbalancingv2.waiters.AmazonElasticLoadBalancingWaiters`"
  (^com.amazonaws.services.elasticloadbalancingv2.waiters.AmazonElasticLoadBalancingWaiters [^AmazonElasticLoadBalancingClient this]
    (-> this (.waiters))))

(defn describe-load-balancers
  "Describes the specified load balancers or all of your load balancers.


   To describe the listeners for a load balancer, use DescribeListeners. To describe the attributes for a
   load balancer, use DescribeLoadBalancerAttributes.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest`

  returns: Result of the DescribeLoadBalancers operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest request]
    (-> this (.describeLoadBalancers request))))

(defn describe-target-groups
  "Describes the specified target groups or all of your target groups. By default, all target groups are described.
   Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the
   names of one or more target groups, or the ARNs of one or more target groups.


   To describe the targets for a target group, use DescribeTargetHealth. To describe the attributes of a
   target group, use DescribeTargetGroupAttributes.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsRequest`

  returns: Result of the DescribeTargetGroups operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsRequest request]
    (-> this (.describeTargetGroups request))))

(defn set-rule-priorities
  "Sets the priorities of the specified rules.


   You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that
   you do not specify retain their current priority.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesRequest`

  returns: Result of the SetRulePriorities operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.RuleNotFoundException - The specified rule does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesRequest request]
    (-> this (.setRulePriorities request))))

(defn remove-tags
  "Removes the specified tags from the specified Elastic Load Balancing resource.


   To list the current tags for your resources, use DescribeTags.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsRequest request]
    (-> this (.removeTags request))))

(defn delete-target-group
  "Deletes the specified target group.


   You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any
   associated health checks.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupRequest`

  returns: Result of the DeleteTargetGroup operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.ResourceInUseException - A specified resource is in use."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupRequest request]
    (-> this (.deleteTargetGroup request))))

(defn describe-ssl-policies
  "Describes the specified policies or all policies used for SSL negotiation.


   For more information, see Security Policies in the Application Load Balancers Guide.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesRequest`

  returns: Result of the DescribeSSLPolicies operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.SSLPolicyNotFoundException - The specified SSL policy does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesRequest request]
    (-> this (.describeSSLPolicies request))))

(defn remove-listener-certificates
  "Removes the specified certificate from the certificate list for the specified HTTPS listener.


   You can't remove the default certificate for a listener. To replace the default certificate, call
   ModifyListener.


   To list the certificates for your listener, use DescribeListenerCertificates.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesRequest`

  returns: Result of the RemoveListenerCertificates operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.ListenerNotFoundException - The specified listener does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesRequest request]
    (-> this (.removeListenerCertificates request))))

(defn create-target-group
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

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupRequest`

  returns: Result of the CreateTargetGroup operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.DuplicateTargetGroupNameException - A target group with the specified name already exists."
  (^com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupRequest request]
    (-> this (.createTargetGroup request))))

(defn delete-rule
  "Deletes the specified rule.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleRequest`

  returns: Result of the DeleteRule operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.RuleNotFoundException - The specified rule does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleRequest request]
    (-> this (.deleteRule request))))

(defn modify-listener
  "Modifies the specified properties of the specified listener.


   Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to
   HTTP, or from TLS to TCP, removes the security policy and default certificate properties. If you change the
   protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy and default certificate
   properties.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerRequest`

  returns: Result of the ModifyListener operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.InvalidConfigurationRequestException - The requested configuration is not valid."
  (^com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerRequest request]
    (-> this (.modifyListener request))))

(defn modify-rule
  "Modifies the specified rule.


   Any existing properties that you do not modify retain their current values.


   To modify the actions for the default rule, use ModifyListener.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleRequest`

  returns: Result of the ModifyRule operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.TooManyTargetsException - You've reached the limit on the number of targets."
  (^com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleRequest request]
    (-> this (.modifyRule request))))

(defn modify-load-balancer-attributes
  "Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer.


   If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that
   you do not modify retain their current values.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesRequest`

  returns: Result of the ModifyLoadBalancerAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesRequest request]
    (-> this (.modifyLoadBalancerAttributes request))))

(defn describe-load-balancer-attributes
  "Describes the attributes for the specified Application Load Balancer or Network Load Balancer.


   For more information, see Load Balancer Attributes in the Application Load Balancers Guide or Load Balancer Attributes in the Network Load Balancers Guide.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesRequest`

  returns: Result of the DescribeLoadBalancerAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesRequest request]
    (-> this (.describeLoadBalancerAttributes request))))

(defn describe-listener-certificates
  "Describes the default certificate and the certificate list for the specified HTTPS listener.


   If the default certificate is also in the certificate list, it appears twice in the results (once with
   IsDefault set to true and once with IsDefault set to false).


   For more information, see SSL Certificates in the Application Load Balancers Guide.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesRequest`

  returns: Result of the DescribeListenerCertificates operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.ListenerNotFoundException - The specified listener does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesRequest request]
    (-> this (.describeListenerCertificates request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonElasticLoadBalancingClient this]
    (-> this (.shutdown))))

(defn describe-account-limits
  "Describes the current Elastic Load Balancing resource limits for your AWS account.


   For more information, see Limits for
   Your Application Load Balancers in the Application Load Balancer Guide or Limits for Your
   Network Load Balancers in the Network Load Balancers Guide.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsRequest`

  returns: Result of the DescribeAccountLimits operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimits request))))

(defn create-rule
  "Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer.


   Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule
   are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are
   performed. For more information, see Listener Rules in the Application Load Balancers Guide.


   To view your current rules, use DescribeRules. To update a rule, use ModifyRule. To set the
   priorities of your rules, use SetRulePriorities. To delete a rule, use DeleteRule.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleRequest`

  returns: Result of the CreateRule operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.InvalidConfigurationRequestException - The requested configuration is not valid."
  (^com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleRequest request]
    (-> this (.createRule request))))

(defn delete-load-balancer
  "Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners.


   You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has
   already been deleted, the call succeeds.


   Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run
   and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or
   terminate them.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerRequest`

  returns: Result of the DeleteLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerRequest request]
    (-> this (.deleteLoadBalancer request))))

(defn deregister-targets
  "Deregisters the specified targets from the specified target group. After the targets are deregistered, they no
   longer receive traffic from the load balancer.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsRequest`

  returns: Result of the DeregisterTargets operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.TargetGroupNotFoundException - The specified target group does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsRequest request]
    (-> this (.deregisterTargets request))))

(defn create-load-balancer
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

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerRequest`

  returns: Result of the CreateLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.ResourceInUseException - A specified resource is in use."
  (^com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerRequest request]
    (-> this (.createLoadBalancer request))))

(defn add-listener-certificates
  "Adds the specified SSL server certificate to the certificate list for the specified HTTPS listener.


   If the certificate in already in the certificate list, the call is successful but the certificate is not added
   again.


   To get the certificate list for a listener, use DescribeListenerCertificates. To remove certificates from
   the certificate list for a listener, use RemoveListenerCertificates. To replace the default certificate
   for a listener, use ModifyListener.


   For more information, see SSL Certificates in the Application Load Balancers Guide.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesRequest`

  returns: Result of the AddListenerCertificates operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.ListenerNotFoundException - The specified listener does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesRequest request]
    (-> this (.addListenerCertificates request))))

(defn set-ip-address-type
  "Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load
   Balancer.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeRequest`

  returns: Result of the SetIpAddressType operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeRequest request]
    (-> this (.setIpAddressType request))))

(defn describe-target-group-attributes
  "Describes the attributes for the specified target group.


   For more information, see Target Group Attributes in the Application Load Balancers Guide or Target Group Attributes in the Network Load Balancers Guide.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesRequest`

  returns: Result of the DescribeTargetGroupAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.TargetGroupNotFoundException - The specified target group does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesRequest request]
    (-> this (.describeTargetGroupAttributes request))))

(defn describe-target-health
  "Describes the health of the specified targets or all of your targets.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthRequest`

  returns: Result of the DescribeTargetHealth operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.InvalidTargetException - The specified target does not exist, is not in the same VPC as the target group, or has an unsupported instance type."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthRequest request]
    (-> this (.describeTargetHealth request))))

(defn create-listener
  "Creates a listener for the specified Application Load Balancer or Network Load Balancer.


   To update a listener, use ModifyListener. When you are finished with a listener, you can delete it using
   DeleteListener. If you are finished with both the listener and the load balancer, you can delete them both
   using DeleteLoadBalancer.


   This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
   listeners with the same settings, each call succeeds.


   For more information, see Listeners
   for Your Application Load Balancers in the Application Load Balancers Guide and Listeners for
   Your Network Load Balancers in the Network Load Balancers Guide.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerRequest`

  returns: Result of the CreateListener operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.InvalidConfigurationRequestException - The requested configuration is not valid."
  (^com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerRequest request]
    (-> this (.createListener request))))

(defn set-security-groups
  "Associates the specified security groups with the specified Application Load Balancer. The specified security
   groups override the previously associated security groups.


   You can't specify a security group for a Network Load Balancer.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsRequest`

  returns: Result of the SetSecurityGroups operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsRequest request]
    (-> this (.setSecurityGroups request))))

(defn register-targets
  "Registers the specified targets with the specified target group.


   If the target is an EC2 instance, it must be in the running state when you register it.


   By default, the load balancer routes requests to registered targets using the protocol and port for the target
   group. Alternatively, you can override the port for a target when you register it. You can register each EC2
   instance or IP address with the same target group multiple times using different ports.


   With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance
   types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of
   these types by IP address.


   To remove a target from a target group, use DeregisterTargets.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsRequest`

  returns: Result of the RegisterTargets operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.TargetGroupNotFoundException - The specified target group does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsRequest request]
    (-> this (.registerTargets request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonElasticLoadBalancingClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn set-subnets
  "Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The
   specified subnets replace the previously enabled subnets.


   You can't change the subnets for a Network Load Balancer.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsRequest`

  returns: Result of the SetSubnets operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsRequest request]
    (-> this (.setSubnets request))))

(defn modify-target-group
  "Modifies the health checks used when evaluating the health state of the targets in the specified target group.


   To monitor the health of the targets, use DescribeTargetHealth.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupRequest`

  returns: Result of the ModifyTargetGroup operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.TargetGroupNotFoundException - The specified target group does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupRequest request]
    (-> this (.modifyTargetGroup request))))

(defn delete-listener
  "Deletes the specified listener.


   Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using
   DeleteLoadBalancer.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerRequest`

  returns: Result of the DeleteListener operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.ListenerNotFoundException - The specified listener does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerRequest request]
    (-> this (.deleteListener request))))

(defn describe-rules
  "Describes the specified rules or the rules for the specified listener. You must specify either a listener or one
   or more rules.

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesRequest`

  returns: Result of the DescribeRules operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesResult`

  throws: com.amazonaws.services.elasticloadbalancingv2.model.ListenerNotFoundException - The specified listener does not exist."
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesResult [^AmazonElasticLoadBalancingClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesRequest request]
    (-> this (.describeRules request))))

