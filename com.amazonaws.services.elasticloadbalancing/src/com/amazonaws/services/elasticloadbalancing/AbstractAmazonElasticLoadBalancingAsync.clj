(ns com.amazonaws.services.elasticloadbalancing.AbstractAmazonElasticLoadBalancingAsync
  "Abstract implementation of AmazonElasticLoadBalancingAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticloadbalancing AbstractAmazonElasticLoadBalancingAsync]))

(defn describe-account-limits-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - `com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimitsAsync request))))

(defn describe-load-balancer-policy-types-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeLoadBalancerPolicyTypes. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancerPolicyTypes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancerPolicyTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest request]
    (-> this (.describeLoadBalancerPolicyTypesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this]
    (-> this (.describeLoadBalancerPolicyTypesAsync))))

(defn describe-load-balancers-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeLoadBalancers. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest request]
    (-> this (.describeLoadBalancersAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this]
    (-> this (.describeLoadBalancersAsync))))

(defn set-load-balancer-policies-of-listener-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for SetLoadBalancePoliciesOfListener. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLoadBalancerPoliciesOfListener operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLoadBalancerPoliciesOfListenerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest request]
    (-> this (.setLoadBalancerPoliciesOfListenerAsync request))))

(defn configure-health-check-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for ConfigureHealthCheck. - `com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfigureHealthCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.configureHealthCheckAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest request]
    (-> this (.configureHealthCheckAsync request))))

(defn describe-load-balancer-attributes-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeLoadBalancerAttributes. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancerAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancerAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest request]
    (-> this (.describeLoadBalancerAttributesAsync request))))

(defn create-load-balancer-listeners-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for CreateLoadBalancerListeners. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancerListeners operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerListenersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest request]
    (-> this (.createLoadBalancerListenersAsync request))))

(defn describe-instance-health-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeInstanceHealth. - `com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceHealth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceHealthAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest request]
    (-> this (.describeInstanceHealthAsync request))))

(defn create-load-balancer-policy-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for CreateLoadBalancerPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancerPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest request]
    (-> this (.createLoadBalancerPolicyAsync request))))

(defn create-app-cookie-stickiness-policy-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for CreateAppCookieStickinessPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAppCookieStickinessPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAppCookieStickinessPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest request]
    (-> this (.createAppCookieStickinessPolicyAsync request))))

(defn modify-load-balancer-attributes-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for ModifyLoadBalancerAttributes. - `com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyLoadBalancerAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyLoadBalancerAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest request]
    (-> this (.modifyLoadBalancerAttributesAsync request))))

(defn delete-load-balancer-listeners-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DeleteLoadBalancerListeners. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancerListeners operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerListenersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest request]
    (-> this (.deleteLoadBalancerListenersAsync request))))

(defn set-load-balancer-policies-for-backend-server-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for SetLoadBalancerPoliciesForBackendServer. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLoadBalancerPoliciesForBackendServer operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLoadBalancerPoliciesForBackendServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest request]
    (-> this (.setLoadBalancerPoliciesForBackendServerAsync request))))

(defn remove-tags-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for RemoveTags. - `com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest request]
    (-> this (.removeTagsAsync request))))

(defn create-lb-cookie-stickiness-policy-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for CreateLBCookieStickinessPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLBCookieStickinessPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLBCookieStickinessPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest request]
    (-> this (.createLBCookieStickinessPolicyAsync request))))

(defn detach-load-balancer-from-subnets-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DetachLoadBalancerFromSubnets. - `com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachLoadBalancerFromSubnets operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachLoadBalancerFromSubnetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest request]
    (-> this (.detachLoadBalancerFromSubnetsAsync request))))

(defn describe-tags-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeTags. - `com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request))))

(defn attach-load-balancer-to-subnets-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for AttachLoaBalancerToSubnets. - `com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachLoadBalancerToSubnets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachLoadBalancerToSubnetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest request]
    (-> this (.attachLoadBalancerToSubnetsAsync request))))

(defn register-instances-with-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for RegisterInstancesWithLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterInstancesWithLoadBalancer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerInstancesWithLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest request]
    (-> this (.registerInstancesWithLoadBalancerAsync request))))

(defn apply-security-groups-to-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for ApplySecurityGroupsToLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplySecurityGroupsToLoadBalancer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applySecurityGroupsToLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest request]
    (-> this (.applySecurityGroupsToLoadBalancerAsync request))))

(defn delete-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DeleteLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest request]
    (-> this (.deleteLoadBalancerAsync request))))

(defn set-load-balancer-listener-ssl-certificate-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for SetLoadBalancerListenerSSLCertificate. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLoadBalancerListenerSSLCertificate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLoadBalancerListenerSSLCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest request]
    (-> this (.setLoadBalancerListenerSSLCertificateAsync request))))

(defn create-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for CreateLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest request]
    (-> this (.createLoadBalancerAsync request))))

(defn enable-availability-zones-for-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for EnableAvailabilityZonesForLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableAvailabilityZonesForLoadBalancer operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableAvailabilityZonesForLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest request]
    (-> this (.enableAvailabilityZonesForLoadBalancerAsync request))))

(defn describe-load-balancer-policies-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DescribeLoadBalancerPolicies. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancerPolicies operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancerPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest request]
    (-> this (.describeLoadBalancerPoliciesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this]
    (-> this (.describeLoadBalancerPoliciesAsync))))

(defn disable-availability-zones-for-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DisableAvailabilityZonesForLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableAvailabilityZonesForLoadBalancer operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableAvailabilityZonesForLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest request]
    (-> this (.disableAvailabilityZonesForLoadBalancerAsync request))))

(defn deregister-instances-from-load-balancer-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DeregisterInstancesFromLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterInstancesFromLoadBalancer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterInstancesFromLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest request]
    (-> this (.deregisterInstancesFromLoadBalancerAsync request))))

(defn add-tags-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for AddTags. - `com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest request]
    (-> this (.addTagsAsync request))))

(defn delete-load-balancer-policy-async
  "Description copied from interface: AmazonElasticLoadBalancingAsync

  request - Contains the parameters for DeleteLoadBalancerPolicy. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancerPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticLoadBalancingAsync this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest request]
    (-> this (.deleteLoadBalancerPolicyAsync request))))

