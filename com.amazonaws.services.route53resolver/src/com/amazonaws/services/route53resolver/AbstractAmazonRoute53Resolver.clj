(ns com.amazonaws.services.route53resolver.AbstractAmazonRoute53Resolver
  "Abstract implementation of AmazonRoute53Resolver. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53resolver AbstractAmazonRoute53Resolver]))

(defn list-tags-for-resource
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.route53resolver.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.route53resolver.model.ListTagsForResourceResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-resolver-endpoint
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.DeleteResolverEndpointRequest`

  returns: Result of the DeleteResolverEndpoint operation returned by the service. - `com.amazonaws.services.route53resolver.model.DeleteResolverEndpointResult`"
  (^com.amazonaws.services.route53resolver.model.DeleteResolverEndpointResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.DeleteResolverEndpointRequest request]
    (-> this (.deleteResolverEndpoint request))))

(defn list-resolver-rule-associations
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsRequest`

  returns: Result of the ListResolverRuleAssociations operation returned by the service. - `com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsResult`"
  (^com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsRequest request]
    (-> this (.listResolverRuleAssociations request))))

(defn update-resolver-rule
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.UpdateResolverRuleRequest`

  returns: Result of the UpdateResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.UpdateResolverRuleResult`"
  (^com.amazonaws.services.route53resolver.model.UpdateResolverRuleResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.UpdateResolverRuleRequest request]
    (-> this (.updateResolverRule request))))

(defn put-resolver-rule-policy
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.PutResolverRulePolicyRequest`

  returns: Result of the PutResolverRulePolicy operation returned by the service. - `com.amazonaws.services.route53resolver.model.PutResolverRulePolicyResult`"
  (^com.amazonaws.services.route53resolver.model.PutResolverRulePolicyResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.PutResolverRulePolicyRequest request]
    (-> this (.putResolverRulePolicy request))))

(defn untag-resource
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.route53resolver.model.UntagResourceResult`"
  (^com.amazonaws.services.route53resolver.model.UntagResourceResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-resolver-endpoint
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.GetResolverEndpointRequest`

  returns: Result of the GetResolverEndpoint operation returned by the service. - `com.amazonaws.services.route53resolver.model.GetResolverEndpointResult`"
  (^com.amazonaws.services.route53resolver.model.GetResolverEndpointResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.GetResolverEndpointRequest request]
    (-> this (.getResolverEndpoint request))))

(defn shutdown
  "Description copied from interface: AmazonRoute53Resolver"
  ([^AbstractAmazonRoute53Resolver this]
    (-> this (.shutdown))))

(defn disassociate-resolver-endpoint-ip-address
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressRequest`

  returns: Result of the DisassociateResolverEndpointIpAddress operation returned by the service. - `com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressResult`"
  (^com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressRequest request]
    (-> this (.disassociateResolverEndpointIpAddress request))))

(defn disassociate-resolver-rule
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.DisassociateResolverRuleRequest`

  returns: Result of the DisassociateResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.DisassociateResolverRuleResult`"
  (^com.amazonaws.services.route53resolver.model.DisassociateResolverRuleResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.DisassociateResolverRuleRequest request]
    (-> this (.disassociateResolverRule request))))

(defn get-resolver-rule
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.GetResolverRuleRequest`

  returns: Result of the GetResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.GetResolverRuleResult`"
  (^com.amazonaws.services.route53resolver.model.GetResolverRuleResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.GetResolverRuleRequest request]
    (-> this (.getResolverRule request))))

(defn associate-resolver-rule
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.AssociateResolverRuleRequest`

  returns: Result of the AssociateResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.AssociateResolverRuleResult`"
  (^com.amazonaws.services.route53resolver.model.AssociateResolverRuleResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.AssociateResolverRuleRequest request]
    (-> this (.associateResolverRule request))))

(defn associate-resolver-endpoint-ip-address
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressRequest`

  returns: Result of the AssociateResolverEndpointIpAddress operation returned by the service. - `com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressResult`"
  (^com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressRequest request]
    (-> this (.associateResolverEndpointIpAddress request))))

(defn list-resolver-endpoint-ip-addresses
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesRequest`

  returns: Result of the ListResolverEndpointIpAddresses operation returned by the service. - `com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesResult`"
  (^com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesRequest request]
    (-> this (.listResolverEndpointIpAddresses request))))

(defn delete-resolver-rule
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.DeleteResolverRuleRequest`

  returns: Result of the DeleteResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.DeleteResolverRuleResult`"
  (^com.amazonaws.services.route53resolver.model.DeleteResolverRuleResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.DeleteResolverRuleRequest request]
    (-> this (.deleteResolverRule request))))

(defn list-resolver-endpoints
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.ListResolverEndpointsRequest`

  returns: Result of the ListResolverEndpoints operation returned by the service. - `com.amazonaws.services.route53resolver.model.ListResolverEndpointsResult`"
  (^com.amazonaws.services.route53resolver.model.ListResolverEndpointsResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointsRequest request]
    (-> this (.listResolverEndpoints request))))

(defn get-resolver-rule-association
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationRequest`

  returns: Result of the GetResolverRuleAssociation operation returned by the service. - `com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationResult`"
  (^com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationRequest request]
    (-> this (.getResolverRuleAssociation request))))

(defn create-resolver-rule
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.CreateResolverRuleRequest`

  returns: Result of the CreateResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.CreateResolverRuleResult`"
  (^com.amazonaws.services.route53resolver.model.CreateResolverRuleResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.CreateResolverRuleRequest request]
    (-> this (.createResolverRule request))))

(defn create-resolver-endpoint
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.CreateResolverEndpointRequest`

  returns: Result of the CreateResolverEndpoint operation returned by the service. - `com.amazonaws.services.route53resolver.model.CreateResolverEndpointResult`"
  (^com.amazonaws.services.route53resolver.model.CreateResolverEndpointResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.CreateResolverEndpointRequest request]
    (-> this (.createResolverEndpoint request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonRoute53Resolver

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonRoute53Resolver this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-resolver-rules
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.ListResolverRulesRequest`

  returns: Result of the ListResolverRules operation returned by the service. - `com.amazonaws.services.route53resolver.model.ListResolverRulesResult`"
  (^com.amazonaws.services.route53resolver.model.ListResolverRulesResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.ListResolverRulesRequest request]
    (-> this (.listResolverRules request))))

(defn update-resolver-endpoint
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.UpdateResolverEndpointRequest`

  returns: Result of the UpdateResolverEndpoint operation returned by the service. - `com.amazonaws.services.route53resolver.model.UpdateResolverEndpointResult`"
  (^com.amazonaws.services.route53resolver.model.UpdateResolverEndpointResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.UpdateResolverEndpointRequest request]
    (-> this (.updateResolverEndpoint request))))

(defn tag-resource
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.route53resolver.model.TagResourceResult`"
  (^com.amazonaws.services.route53resolver.model.TagResourceResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-resolver-rule-policy
  "Description copied from interface: AmazonRoute53Resolver

  request - `com.amazonaws.services.route53resolver.model.GetResolverRulePolicyRequest`

  returns: Result of the GetResolverRulePolicy operation returned by the service. - `com.amazonaws.services.route53resolver.model.GetResolverRulePolicyResult`"
  (^com.amazonaws.services.route53resolver.model.GetResolverRulePolicyResult [^AbstractAmazonRoute53Resolver this ^com.amazonaws.services.route53resolver.model.GetResolverRulePolicyRequest request]
    (-> this (.getResolverRulePolicy request))))

