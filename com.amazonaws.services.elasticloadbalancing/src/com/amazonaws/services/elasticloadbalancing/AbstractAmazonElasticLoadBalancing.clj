(ns com.amazonaws.services.elasticloadbalancing.AbstractAmazonElasticLoadBalancing
  "Abstract implementation of AmazonElasticLoadBalancing. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticloadbalancing AbstractAmazonElasticLoadBalancing]))

(defn describe-instance-health
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DescribeInstanceHealth. - `com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest`

  returns: Result of the DescribeInstanceHealth operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest request]
    (-> this (.describeInstanceHealth request))))

(defn add-tags
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for AddTags. - `com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.AddTagsResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.AddTagsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn describe-tags
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DescribeTags. - `com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn set-region
  "Description copied from interface: AmazonElasticLoadBalancing

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn waiters
  "returns: `com.amazonaws.services.elasticloadbalancing.waiters.AmazonElasticLoadBalancingWaiters`"
  (^com.amazonaws.services.elasticloadbalancing.waiters.AmazonElasticLoadBalancingWaiters [^AbstractAmazonElasticLoadBalancing this]
    (-> this (.waiters))))

(defn enable-availability-zones-for-load-balancer
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for EnableAvailabilityZonesForLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest`

  returns: Result of the EnableAvailabilityZonesForLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest request]
    (-> this (.enableAvailabilityZonesForLoadBalancer request))))

(defn describe-load-balancers
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DescribeLoadBalancers. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest`

  returns: Result of the DescribeLoadBalancers operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest request]
    (-> this (.describeLoadBalancers request)))
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult [^AbstractAmazonElasticLoadBalancing this]
    (-> this (.describeLoadBalancers))))

(defn create-load-balancer-policy
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for CreateLoadBalancerPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest`

  returns: Result of the CreateLoadBalancerPolicy operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest request]
    (-> this (.createLoadBalancerPolicy request))))

(defn remove-tags
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for RemoveTags. - `com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest request]
    (-> this (.removeTags request))))

(defn delete-load-balancer-listeners
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DeleteLoadBalancerListeners. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest`

  returns: Result of the DeleteLoadBalancerListeners operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest request]
    (-> this (.deleteLoadBalancerListeners request))))

(defn detach-load-balancer-from-subnets
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DetachLoadBalancerFromSubnets. - `com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest`

  returns: Result of the DetachLoadBalancerFromSubnets operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest request]
    (-> this (.detachLoadBalancerFromSubnets request))))

(defn deregister-instances-from-load-balancer
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DeregisterInstancesFromLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest`

  returns: Result of the DeregisterInstancesFromLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest request]
    (-> this (.deregisterInstancesFromLoadBalancer request))))

(defn register-instances-with-load-balancer
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for RegisterInstancesWithLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest`

  returns: Result of the RegisterInstancesWithLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest request]
    (-> this (.registerInstancesWithLoadBalancer request))))

(defn apply-security-groups-to-load-balancer
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for ApplySecurityGroupsToLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest`

  returns: Result of the ApplySecurityGroupsToLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest request]
    (-> this (.applySecurityGroupsToLoadBalancer request))))

(defn modify-load-balancer-attributes
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for ModifyLoadBalancerAttributes. - `com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest`

  returns: Result of the ModifyLoadBalancerAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest request]
    (-> this (.modifyLoadBalancerAttributes request))))

(defn describe-load-balancer-attributes
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DescribeLoadBalancerAttributes. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest`

  returns: Result of the DescribeLoadBalancerAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest request]
    (-> this (.describeLoadBalancerAttributes request))))

(defn set-load-balancer-policies-of-listener
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for SetLoadBalancePoliciesOfListener. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest`

  returns: Result of the SetLoadBalancerPoliciesOfListener operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest request]
    (-> this (.setLoadBalancerPoliciesOfListener request))))

(defn shutdown
  "Description copied from interface: AmazonElasticLoadBalancing"
  ([^AbstractAmazonElasticLoadBalancing this]
    (-> this (.shutdown))))

(defn set-load-balancer-policies-for-backend-server
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for SetLoadBalancerPoliciesForBackendServer. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest`

  returns: Result of the SetLoadBalancerPoliciesForBackendServer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest request]
    (-> this (.setLoadBalancerPoliciesForBackendServer request))))

(defn disable-availability-zones-for-load-balancer
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DisableAvailabilityZonesForLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest`

  returns: Result of the DisableAvailabilityZonesForLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest request]
    (-> this (.disableAvailabilityZonesForLoadBalancer request))))

(defn describe-account-limits
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest`

  returns: Result of the DescribeAccountLimits operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimits request))))

(defn set-endpoint
  "Description copied from interface: AmazonElasticLoadBalancing

  endpoint - The endpoint (ex: \"elasticloadbalancing.amazonaws.com\") or a full URL, including the protocol (ex: \"elasticloadbalancing.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonElasticLoadBalancing this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-load-balancer
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DeleteLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest`

  returns: Result of the DeleteLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest request]
    (-> this (.deleteLoadBalancer request))))

(defn set-load-balancer-listener-ssl-certificate
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for SetLoadBalancerListenerSSLCertificate. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest`

  returns: Result of the SetLoadBalancerListenerSSLCertificate operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest request]
    (-> this (.setLoadBalancerListenerSSLCertificate request))))

(defn create-lb-cookie-stickiness-policy
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for CreateLBCookieStickinessPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest`

  returns: Result of the CreateLBCookieStickinessPolicy operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest request]
    (-> this (.createLBCookieStickinessPolicy request))))

(defn create-load-balancer
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for CreateLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest`

  returns: Result of the CreateLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest request]
    (-> this (.createLoadBalancer request))))

(defn describe-load-balancer-policy-types
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DescribeLoadBalancerPolicyTypes. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest`

  returns: Result of the DescribeLoadBalancerPolicyTypes operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest request]
    (-> this (.describeLoadBalancerPolicyTypes request)))
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult [^AbstractAmazonElasticLoadBalancing this]
    (-> this (.describeLoadBalancerPolicyTypes))))

(defn delete-load-balancer-policy
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DeleteLoadBalancerPolicy. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest`

  returns: Result of the DeleteLoadBalancerPolicy operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest request]
    (-> this (.deleteLoadBalancerPolicy request))))

(defn describe-load-balancer-policies
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for DescribeLoadBalancerPolicies. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest`

  returns: Result of the DescribeLoadBalancerPolicies operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest request]
    (-> this (.describeLoadBalancerPolicies request)))
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult [^AbstractAmazonElasticLoadBalancing this]
    (-> this (.describeLoadBalancerPolicies))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonElasticLoadBalancing

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-load-balancer-listeners
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for CreateLoadBalancerListeners. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest`

  returns: Result of the CreateLoadBalancerListeners operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest request]
    (-> this (.createLoadBalancerListeners request))))

(defn configure-health-check
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for ConfigureHealthCheck. - `com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest`

  returns: Result of the ConfigureHealthCheck operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest request]
    (-> this (.configureHealthCheck request))))

(defn attach-load-balancer-to-subnets
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for AttachLoaBalancerToSubnets. - `com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest`

  returns: Result of the AttachLoadBalancerToSubnets operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest request]
    (-> this (.attachLoadBalancerToSubnets request))))

(defn create-app-cookie-stickiness-policy
  "Description copied from interface: AmazonElasticLoadBalancing

  request - Contains the parameters for CreateAppCookieStickinessPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest`

  returns: Result of the CreateAppCookieStickinessPolicy operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest request]
    (-> this (.createAppCookieStickinessPolicy request))))

