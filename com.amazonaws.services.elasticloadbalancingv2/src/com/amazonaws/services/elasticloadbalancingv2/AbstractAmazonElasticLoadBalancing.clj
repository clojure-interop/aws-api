(ns com.amazonaws.services.elasticloadbalancingv2.AbstractAmazonElasticLoadBalancing
  "Abstract implementation of AmazonElasticLoadBalancing. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticloadbalancingv2 AbstractAmazonElasticLoadBalancing]))

(defn describe-listeners
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersRequest`

  returns: Result of the DescribeListeners operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenersRequest request]
    (-> this (.describeListeners request))))

(defn add-tags
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.AddTagsResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.AddTagsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn modify-target-group-attributes
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesRequest`

  returns: Result of the ModifyTargetGroupAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupAttributesRequest request]
    (-> this (.modifyTargetGroupAttributes request))))

(defn describe-tags
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn set-region
  "Description copied from interface: AmazonElasticLoadBalancing

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn waiters
  "returns: `com.amazonaws.services.elasticloadbalancingv2.waiters.AmazonElasticLoadBalancingWaiters`"
  (^com.amazonaws.services.elasticloadbalancingv2.waiters.AmazonElasticLoadBalancingWaiters [^AbstractAmazonElasticLoadBalancing this]
    (-> this (.waiters))))

(defn describe-load-balancers
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest`

  returns: Result of the DescribeLoadBalancers operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest request]
    (-> this (.describeLoadBalancers request))))

(defn describe-target-groups
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsRequest`

  returns: Result of the DescribeTargetGroups operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupsRequest request]
    (-> this (.describeTargetGroups request))))

(defn set-rule-priorities
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesRequest`

  returns: Result of the SetRulePriorities operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.SetRulePrioritiesRequest request]
    (-> this (.setRulePriorities request))))

(defn remove-tags
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveTagsRequest request]
    (-> this (.removeTags request))))

(defn delete-target-group
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupRequest`

  returns: Result of the DeleteTargetGroup operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteTargetGroupRequest request]
    (-> this (.deleteTargetGroup request))))

(defn describe-ssl-policies
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesRequest`

  returns: Result of the DescribeSSLPolicies operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeSSLPoliciesRequest request]
    (-> this (.describeSSLPolicies request))))

(defn remove-listener-certificates
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesRequest`

  returns: Result of the RemoveListenerCertificates operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.RemoveListenerCertificatesRequest request]
    (-> this (.removeListenerCertificates request))))

(defn create-target-group
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupRequest`

  returns: Result of the CreateTargetGroup operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateTargetGroupRequest request]
    (-> this (.createTargetGroup request))))

(defn delete-rule
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleRequest`

  returns: Result of the DeleteRule operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteRuleRequest request]
    (-> this (.deleteRule request))))

(defn modify-listener
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerRequest`

  returns: Result of the ModifyListener operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyListenerRequest request]
    (-> this (.modifyListener request))))

(defn modify-rule
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleRequest`

  returns: Result of the ModifyRule operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyRuleRequest request]
    (-> this (.modifyRule request))))

(defn modify-load-balancer-attributes
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesRequest`

  returns: Result of the ModifyLoadBalancerAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyLoadBalancerAttributesRequest request]
    (-> this (.modifyLoadBalancerAttributes request))))

(defn describe-load-balancer-attributes
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesRequest`

  returns: Result of the DescribeLoadBalancerAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancerAttributesRequest request]
    (-> this (.describeLoadBalancerAttributes request))))

(defn describe-listener-certificates
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesRequest`

  returns: Result of the DescribeListenerCertificates operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeListenerCertificatesRequest request]
    (-> this (.describeListenerCertificates request))))

(defn shutdown
  "Description copied from interface: AmazonElasticLoadBalancing"
  ([^AbstractAmazonElasticLoadBalancing this]
    (-> this (.shutdown))))

(defn describe-account-limits
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsRequest`

  returns: Result of the DescribeAccountLimits operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimits request))))

(defn create-rule
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleRequest`

  returns: Result of the CreateRule operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateRuleRequest request]
    (-> this (.createRule request))))

(defn set-endpoint
  "Description copied from interface: AmazonElasticLoadBalancing

  endpoint - The endpoint (ex: \"elasticloadbalancing.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"elasticloadbalancing.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonElasticLoadBalancing this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-load-balancer
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerRequest`

  returns: Result of the DeleteLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteLoadBalancerRequest request]
    (-> this (.deleteLoadBalancer request))))

(defn deregister-targets
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsRequest`

  returns: Result of the DeregisterTargets operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DeregisterTargetsRequest request]
    (-> this (.deregisterTargets request))))

(defn create-load-balancer
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerRequest`

  returns: Result of the CreateLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateLoadBalancerRequest request]
    (-> this (.createLoadBalancer request))))

(defn add-listener-certificates
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesRequest`

  returns: Result of the AddListenerCertificates operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.AddListenerCertificatesRequest request]
    (-> this (.addListenerCertificates request))))

(defn set-ip-address-type
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeRequest`

  returns: Result of the SetIpAddressType operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.SetIpAddressTypeRequest request]
    (-> this (.setIpAddressType request))))

(defn describe-target-group-attributes
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesRequest`

  returns: Result of the DescribeTargetGroupAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetGroupAttributesRequest request]
    (-> this (.describeTargetGroupAttributes request))))

(defn describe-target-health
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthRequest`

  returns: Result of the DescribeTargetHealth operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeTargetHealthRequest request]
    (-> this (.describeTargetHealth request))))

(defn create-listener
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerRequest`

  returns: Result of the CreateListener operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.CreateListenerRequest request]
    (-> this (.createListener request))))

(defn set-security-groups
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsRequest`

  returns: Result of the SetSecurityGroups operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSecurityGroupsRequest request]
    (-> this (.setSecurityGroups request))))

(defn register-targets
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsRequest`

  returns: Result of the RegisterTargets operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.RegisterTargetsRequest request]
    (-> this (.registerTargets request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonElasticLoadBalancing

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn set-subnets
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsRequest`

  returns: Result of the SetSubnets operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.SetSubnetsRequest request]
    (-> this (.setSubnets request))))

(defn modify-target-group
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupRequest`

  returns: Result of the ModifyTargetGroup operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.ModifyTargetGroupRequest request]
    (-> this (.modifyTargetGroup request))))

(defn delete-listener
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerRequest`

  returns: Result of the DeleteListener operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DeleteListenerRequest request]
    (-> this (.deleteListener request))))

(defn describe-rules
  "Description copied from interface: AmazonElasticLoadBalancing

  request - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesRequest`

  returns: Result of the DescribeRules operation returned by the service. - `com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesResult`"
  (^com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesResult [^AbstractAmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancingv2.model.DescribeRulesRequest request]
    (-> this (.describeRules request))))

