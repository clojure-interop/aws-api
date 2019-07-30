(ns com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingAsyncClient
  "Client for accessing Elastic Load Balancing asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Elastic Load Balancing

  A load balancer can distribute incoming traffic across your EC2 instances. This enables you to increase the
  availability of your application. The load balancer also monitors the health of its registered instances and ensures
  that it routes traffic only to healthy instances. You configure your load balancer to accept incoming traffic by
  specifying one or more listeners, which are configured with a protocol and port number for connections from clients
  to the load balancer and a protocol and port number for connections from the load balancer to the instances.


  Elastic Load Balancing supports three types of load balancers: Application Load Balancers, Network Load Balancers,
  and Classic Load Balancers. You can select a load balancer based on your application needs. For more information, see
  the Elastic Load Balancing User
  Guide.


  This reference covers the 2012-06-01 API, which supports Classic Load Balancers. The 2015-12-01 API supports
  Application Load Balancers and Network Load Balancers.


  To get started, create a load balancer with one or more listeners using CreateLoadBalancer. Register your
  instances with the load balancer using RegisterInstancesWithLoadBalancer.


  All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you
  repeat an operation, it succeeds with a 200 OK response code."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticloadbalancing AmazonElasticLoadBalancingAsyncClient]))

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
  "returns: `com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingAsyncClientBuilder`"
  (^com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingAsyncClientBuilder []
    (AmazonElasticLoadBalancingAsyncClient/asyncBuilder )))

(defn describe-account-limits-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimitsAsync request))))

(defn describe-load-balancer-policy-types-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeLoadBalancerPolicyTypes. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancerPolicyTypes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancerPolicyTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest request]
    (-> this (.describeLoadBalancerPolicyTypesAsync request)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this]
    (-> this (.describeLoadBalancerPolicyTypesAsync))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonElasticLoadBalancingAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-load-balancers-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeLoadBalancers. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest request]
    (-> this (.describeLoadBalancersAsync request)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this]
    (-> this (.describeLoadBalancersAsync))))

(defn set-load-balancer-policies-of-listener-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for SetLoadBalancePoliciesOfListener. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLoadBalancerPoliciesOfListener operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLoadBalancerPoliciesOfListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest request]
    (-> this (.setLoadBalancerPoliciesOfListenerAsync request))))

(defn configure-health-check-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for ConfigureHealthCheck. - `com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfigureHealthCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.configureHealthCheckAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest request]
    (-> this (.configureHealthCheckAsync request))))

(defn describe-load-balancer-attributes-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeLoadBalancerAttributes. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancerAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancerAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest request]
    (-> this (.describeLoadBalancerAttributesAsync request))))

(defn create-load-balancer-listeners-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for CreateLoadBalancerListeners. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancerListeners operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerListenersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest request]
    (-> this (.createLoadBalancerListenersAsync request))))

(defn describe-instance-health-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeInstanceHealth. - `com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceHealth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceHealthAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest request]
    (-> this (.describeInstanceHealthAsync request))))

(defn create-load-balancer-policy-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for CreateLoadBalancerPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancerPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest request]
    (-> this (.createLoadBalancerPolicyAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonElasticLoadBalancingAsyncClient this]
    (-> this (.shutdown))))

(defn create-app-cookie-stickiness-policy-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for CreateAppCookieStickinessPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAppCookieStickinessPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAppCookieStickinessPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest request]
    (-> this (.createAppCookieStickinessPolicyAsync request))))

(defn modify-load-balancer-attributes-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for ModifyLoadBalancerAttributes. - `com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyLoadBalancerAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyLoadBalancerAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest request]
    (-> this (.modifyLoadBalancerAttributesAsync request))))

(defn delete-load-balancer-listeners-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DeleteLoadBalancerListeners. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancerListeners operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerListenersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest request]
    (-> this (.deleteLoadBalancerListenersAsync request))))

(defn set-load-balancer-policies-for-backend-server-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for SetLoadBalancerPoliciesForBackendServer. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLoadBalancerPoliciesForBackendServer operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLoadBalancerPoliciesForBackendServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest request]
    (-> this (.setLoadBalancerPoliciesForBackendServerAsync request))))

(defn remove-tags-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for RemoveTags. - `com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest request]
    (-> this (.removeTagsAsync request))))

(defn create-lb-cookie-stickiness-policy-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for CreateLBCookieStickinessPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLBCookieStickinessPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLBCookieStickinessPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest request]
    (-> this (.createLBCookieStickinessPolicyAsync request))))

(defn detach-load-balancer-from-subnets-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DetachLoadBalancerFromSubnets. - `com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachLoadBalancerFromSubnets operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachLoadBalancerFromSubnetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest request]
    (-> this (.detachLoadBalancerFromSubnetsAsync request))))

(defn describe-tags-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeTags. - `com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request))))

(defn attach-load-balancer-to-subnets-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for AttachLoaBalancerToSubnets. - `com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachLoadBalancerToSubnets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachLoadBalancerToSubnetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest request]
    (-> this (.attachLoadBalancerToSubnetsAsync request))))

(defn register-instances-with-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for RegisterInstancesWithLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterInstancesWithLoadBalancer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerInstancesWithLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest request]
    (-> this (.registerInstancesWithLoadBalancerAsync request))))

(defn apply-security-groups-to-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for ApplySecurityGroupsToLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplySecurityGroupsToLoadBalancer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applySecurityGroupsToLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest request]
    (-> this (.applySecurityGroupsToLoadBalancerAsync request))))

(defn delete-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DeleteLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest request]
    (-> this (.deleteLoadBalancerAsync request))))

(defn set-load-balancer-listener-ssl-certificate-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for SetLoadBalancerListenerSSLCertificate. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLoadBalancerListenerSSLCertificate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLoadBalancerListenerSSLCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest request]
    (-> this (.setLoadBalancerListenerSSLCertificateAsync request))))

(defn create-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for CreateLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest request]
    (-> this (.createLoadBalancerAsync request))))

(defn enable-availability-zones-for-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for EnableAvailabilityZonesForLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableAvailabilityZonesForLoadBalancer operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableAvailabilityZonesForLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest request]
    (-> this (.enableAvailabilityZonesForLoadBalancerAsync request))))

(defn describe-load-balancer-policies-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeLoadBalancerPolicies. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancerPolicies operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancerPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest request]
    (-> this (.describeLoadBalancerPoliciesAsync request)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this]
    (-> this (.describeLoadBalancerPoliciesAsync))))

(defn disable-availability-zones-for-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DisableAvailabilityZonesForLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableAvailabilityZonesForLoadBalancer operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableAvailabilityZonesForLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest request]
    (-> this (.disableAvailabilityZonesForLoadBalancerAsync request))))

(defn deregister-instances-from-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DeregisterInstancesFromLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterInstancesFromLoadBalancer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterInstancesFromLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest request]
    (-> this (.deregisterInstancesFromLoadBalancerAsync request))))

(defn add-tags-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for AddTags. - `com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest request]
    (-> this (.addTagsAsync request))))

(defn delete-load-balancer-policy-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DeleteLoadBalancerPolicy. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancerPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticLoadBalancingAsyncClient this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest request]
    (-> this (.deleteLoadBalancerPolicyAsync request))))

