(ns com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingAsyncClient
  "Client for accessing Elastic Load Balancing v2 asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

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
  (:import [com.amazonaws.services.elasticloadbalancingv2 AmazonElasticLoadBalancingAsyncClient]))

(defn ->amazon-elastic-load-balancing-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonElasticLoadBalancingAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonElasticLoadBalancingAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonElasticLoadBalancingAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonElasticLoadBalancingAsyncClient aws-credentials executor-service))
  (^AmazonElasticLoadBalancingAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElasticLoadBalancingAsyncClient client-configuration))
  (^AmazonElasticLoadBalancingAsyncClient []
    (new AmazonElasticLoadBalancingAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingAsyncClientBuilder`"
  (^com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingAsyncClientBuilder []
    (AmazonElasticLoadBalancingAsyncClient/asyncBuilder )))

(defn describe-account-limits-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimitsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonElasticLoadBalancingAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-listener-certificates-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeListenerCertificates operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeListenerCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesRequest request]
    (-> this (.describeListenerCertificatesAsync request))))

(defn register-targets-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsRequest request]
    (-> this (.registerTargetsAsync request))))

(defn describe-load-balancers-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest request]
    (-> this (.describeLoadBalancersAsync request))))

(defn delete-listener-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerRequest request]
    (-> this (.deleteListenerAsync request))))

(defn add-listener-certificates-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddListenerCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addListenerCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesRequest request]
    (-> this (.addListenerCertificatesAsync request))))

(defn create-rule-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleRequest request]
    (-> this (.createRuleAsync request))))

(defn modify-target-group-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTargetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTargetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupRequest request]
    (-> this (.modifyTargetGroupAsync request))))

(defn modify-target-group-attributes-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTargetGroupAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTargetGroupAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesRequest request]
    (-> this (.modifyTargetGroupAttributesAsync request))))

(defn describe-load-balancer-attributes-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancerAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancerAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesRequest request]
    (-> this (.describeLoadBalancerAttributesAsync request))))

(defn describe-target-group-attributes-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTargetGroupAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTargetGroupAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesRequest request]
    (-> this (.describeTargetGroupAttributesAsync request))))

(defn set-rule-priorities-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetRulePriorities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setRulePrioritiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesRequest request]
    (-> this (.setRulePrioritiesAsync request))))

(defn delete-rule-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleRequest request]
    (-> this (.deleteRuleAsync request))))

(defn describe-target-groups-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTargetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTargetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsRequest request]
    (-> this (.describeTargetGroupsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonElasticLoadBalancingAsyncClient this]
    (-> this (.shutdown))))

(defn create-listener-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerRequest request]
    (-> this (.createListenerAsync request))))

(defn modify-load-balancer-attributes-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyLoadBalancerAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyLoadBalancerAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesRequest request]
    (-> this (.modifyLoadBalancerAttributesAsync request))))

(defn set-subnets-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetSubnets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSubnetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsRequest request]
    (-> this (.setSubnetsAsync request))))

(defn describe-target-health-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTargetHealth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTargetHealthAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthRequest request]
    (-> this (.describeTargetHealthAsync request))))

(defn deregister-targets-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsRequest request]
    (-> this (.deregisterTargetsAsync request))))

(defn remove-tags-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsRequest request]
    (-> this (.removeTagsAsync request))))

(defn delete-target-group-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTargetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTargetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupRequest request]
    (-> this (.deleteTargetGroupAsync request))))

(defn modify-rule-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleRequest request]
    (-> this (.modifyRuleAsync request))))

(defn describe-ssl-policies-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSSLPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSSLPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesRequest request]
    (-> this (.describeSSLPoliciesAsync request))))

(defn remove-listener-certificates-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveListenerCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeListenerCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesRequest request]
    (-> this (.removeListenerCertificatesAsync request))))

(defn describe-tags-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request))))

(defn modify-listener-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyListener operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerRequest request]
    (-> this (.modifyListenerAsync request))))

(defn set-ip-address-type-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIpAddressType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIpAddressTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeRequest request]
    (-> this (.setIpAddressTypeAsync request))))

(defn delete-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerRequest request]
    (-> this (.deleteLoadBalancerAsync request))))

(defn set-security-groups-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsRequest request]
    (-> this (.setSecurityGroupsAsync request))))

(defn create-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerRequest request]
    (-> this (.createLoadBalancerAsync request))))

(defn create-target-group-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTargetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTargetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupRequest request]
    (-> this (.createTargetGroupAsync request))))

(defn add-tags-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.AddTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.AddTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.AddTagsRequest request]
    (-> this (.addTagsAsync request))))

(defn describe-rules-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesRequest request]
    (-> this (.describeRulesAsync request))))

(defn describe-listeners-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeListeners operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeListenersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersRequest request]
    (-> this (.describeListenersAsync request))))

