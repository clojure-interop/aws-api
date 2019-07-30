(ns com.amazonaws.services.route53resolver.AmazonRoute53ResolverClient
  "Client for accessing Route53Resolver. All service calls made using this client are blocking, and will not return
  until the service call completes.


  Here's how you set up to query an Amazon Route 53 private hosted zone from your network:




  Connect your network to a VPC using AWS Direct Connect or a VPN.




  Run the following AWS CLI command to create a Resolver endpoint:


  create-resolver-endpoint --name [endpoint_name] --direction INBOUND --creator-request-id [unique_string] --security-group-ids [security_group_with_inbound_rules] --ip-addresses SubnetId=[subnet_id] SubnetId=[subnet_id_in_different_AZ]


  Note the resolver endpoint ID that appears in the response. You'll use it in step 3.




  Get the IP addresses for the Resolver endpoints:


  get-resolver-endpoint --resolver-endpoint-id [resolver_endpoint_id]




  In your network configuration, define the IP addresses that you got in step 3 as DNS servers.


  You can now query instance names in your VPCs and the names of records in your private hosted zone.




  You can also perform the following operations using the AWS CLI:




  list-resolver-endpoints: List all endpoints. The syntax includes options for pagination and filtering.




  update-resolver-endpoints: Add IP addresses to an endpoint or remove IP addresses from an endpoint.




  To delete an endpoint, use the following AWS CLI command:


  delete-resolver-endpoint --resolver-endpoint-id [resolver_endpoint_id]"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53resolver AmazonRoute53ResolverClient]))

(defn *builder
  "returns: `com.amazonaws.services.route53resolver.AmazonRoute53ResolverClientBuilder`"
  (^com.amazonaws.services.route53resolver.AmazonRoute53ResolverClientBuilder []
    (AmazonRoute53ResolverClient/builder )))

(defn list-tags-for-resource
  "Lists the tags that you associated with the specified resource.

  request - `com.amazonaws.services.route53resolver.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.route53resolver.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.ListTagsForResourceResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-resolver-endpoint
  "Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an
   outbound resolver endpoint:




   Inbound: DNS queries from your network or another VPC are no longer routed to the DNS service for the
   specified VPC.




   Outbound: DNS queries from a VPC are no longer routed to your network or to another VPC.

  request - `com.amazonaws.services.route53resolver.model.DeleteResolverEndpointRequest`

  returns: Result of the DeleteResolverEndpoint operation returned by the service. - `com.amazonaws.services.route53resolver.model.DeleteResolverEndpointResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.DeleteResolverEndpointResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.DeleteResolverEndpointRequest request]
    (-> this (.deleteResolverEndpoint request))))

(defn list-resolver-rule-associations
  "Lists the associations that were created between resolver rules and VPCs using the current AWS account.

  request - `com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsRequest`

  returns: Result of the ListResolverRuleAssociations operation returned by the service. - `com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsResult`

  throws: com.amazonaws.services.route53resolver.model.InvalidNextTokenException - The value that you specified for NextToken in a List request isn't valid."
  (^com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsRequest request]
    (-> this (.listResolverRuleAssociations request))))

(defn update-resolver-rule
  "Updates settings for a specified resolver rule. ResolverRuleId is required, and all other parameters
   are optional. If you don't specify a parameter, it retains its current value.

  request - `com.amazonaws.services.route53resolver.model.UpdateResolverRuleRequest`

  returns: Result of the UpdateResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.UpdateResolverRuleResult`

  throws: com.amazonaws.services.route53resolver.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.route53resolver.model.UpdateResolverRuleResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.UpdateResolverRuleRequest request]
    (-> this (.updateResolverRule request))))

(defn put-resolver-rule-policy
  "Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.

  request - `com.amazonaws.services.route53resolver.model.PutResolverRulePolicyRequest`

  returns: Result of the PutResolverRulePolicy operation returned by the service. - `com.amazonaws.services.route53resolver.model.PutResolverRulePolicyResult`

  throws: com.amazonaws.services.route53resolver.model.InvalidPolicyDocumentException - The specified resolver rule policy is invalid."
  (^com.amazonaws.services.route53resolver.model.PutResolverRulePolicyResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.PutResolverRulePolicyRequest request]
    (-> this (.putResolverRulePolicy request))))

(defn untag-resource
  "Removes one or more tags from a specified resource.

  request - `com.amazonaws.services.route53resolver.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.route53resolver.model.UntagResourceResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.UntagResourceResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-resolver-endpoint
  "Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver
   endpoint, and the current status of the endpoint.

  request - `com.amazonaws.services.route53resolver.model.GetResolverEndpointRequest`

  returns: Result of the GetResolverEndpoint operation returned by the service. - `com.amazonaws.services.route53resolver.model.GetResolverEndpointResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.GetResolverEndpointResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.GetResolverEndpointRequest request]
    (-> this (.getResolverEndpoint request))))

(defn disassociate-resolver-endpoint-ip-address
  "Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP
   address, submit one DisassociateResolverEndpointIpAddress request for each IP address.


   To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress.

  request - `com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressRequest`

  returns: Result of the DisassociateResolverEndpointIpAddress operation returned by the service. - `com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressRequest request]
    (-> this (.disassociateResolverEndpointIpAddress request))))

(defn disassociate-resolver-rule
  "Removes the association between a specified resolver rule and a specified VPC.



   If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that
   you specified in the resolver rule.

  request - `com.amazonaws.services.route53resolver.model.DisassociateResolverRuleRequest`

  returns: Result of the DisassociateResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.DisassociateResolverRuleResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.DisassociateResolverRuleResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.DisassociateResolverRuleRequest request]
    (-> this (.disassociateResolverRule request))))

(defn get-resolver-rule
  "Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for
   and the ID of the outbound resolver endpoint that the rule is associated with.

  request - `com.amazonaws.services.route53resolver.model.GetResolverRuleRequest`

  returns: Result of the GetResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.GetResolverRuleResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.GetResolverRuleResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.GetResolverRuleRequest request]
    (-> this (.getResolverRule request))))

(defn associate-resolver-rule
  "Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries
   for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the
   IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see
   CreateResolverRule.

  request - `com.amazonaws.services.route53resolver.model.AssociateResolverRuleRequest`

  returns: Result of the AssociateResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.AssociateResolverRuleResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.AssociateResolverRuleResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.AssociateResolverRuleRequest request]
    (-> this (.associateResolverRule request))))

(defn associate-resolver-endpoint-ip-address
  "Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address,
   submit one AssociateResolverEndpointIpAddress request for each IP address.


   To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress.

  request - `com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressRequest`

  returns: Result of the AssociateResolverEndpointIpAddress operation returned by the service. - `com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressRequest request]
    (-> this (.associateResolverEndpointIpAddress request))))

(defn list-resolver-endpoint-ip-addresses
  "Gets the IP addresses for a specified resolver endpoint.

  request - `com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesRequest`

  returns: Result of the ListResolverEndpointIpAddresses operation returned by the service. - `com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesRequest request]
    (-> this (.listResolverEndpointIpAddresses request))))

(defn delete-resolver-rule
  "Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that
   you associated the resolver rule with. For more infomation, see DisassociateResolverRule.

  request - `com.amazonaws.services.route53resolver.model.DeleteResolverRuleRequest`

  returns: Result of the DeleteResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.DeleteResolverRuleResult`

  throws: com.amazonaws.services.route53resolver.model.InvalidParameterException - One or more parameters in this request are not valid."
  (^com.amazonaws.services.route53resolver.model.DeleteResolverRuleResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.DeleteResolverRuleRequest request]
    (-> this (.deleteResolverRule request))))

(defn list-resolver-endpoints
  "Lists all the resolver endpoints that were created using the current AWS account.

  request - `com.amazonaws.services.route53resolver.model.ListResolverEndpointsRequest`

  returns: Result of the ListResolverEndpoints operation returned by the service. - `com.amazonaws.services.route53resolver.model.ListResolverEndpointsResult`

  throws: com.amazonaws.services.route53resolver.model.InvalidNextTokenException - The value that you specified for NextToken in a List request isn't valid."
  (^com.amazonaws.services.route53resolver.model.ListResolverEndpointsResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointsRequest request]
    (-> this (.listResolverEndpoints request))))

(defn get-resolver-rule-association
  "Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule
   and a VPC using AssociateResolverRule.

  request - `com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationRequest`

  returns: Result of the GetResolverRuleAssociation operation returned by the service. - `com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationRequest request]
    (-> this (.getResolverRuleAssociation request))))

(defn create-resolver-rule
  "For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one
   domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.

  request - `com.amazonaws.services.route53resolver.model.CreateResolverRuleRequest`

  returns: Result of the CreateResolverRule operation returned by the service. - `com.amazonaws.services.route53resolver.model.CreateResolverRuleResult`

  throws: com.amazonaws.services.route53resolver.model.InvalidParameterException - One or more parameters in this request are not valid."
  (^com.amazonaws.services.route53resolver.model.CreateResolverRuleResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.CreateResolverRuleRequest request]
    (-> this (.createResolverRule request))))

(defn create-resolver-endpoint
  "Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:




   An inbound resolver endpoint forwards DNS queries to the DNS service for a VPC from your network or
   another VPC.




   An outbound resolver endpoint forwards DNS queries from the DNS service for a VPC to your network or
   another VPC.

  request - `com.amazonaws.services.route53resolver.model.CreateResolverEndpointRequest`

  returns: Result of the CreateResolverEndpoint operation returned by the service. - `com.amazonaws.services.route53resolver.model.CreateResolverEndpointResult`

  throws: com.amazonaws.services.route53resolver.model.InvalidParameterException - One or more parameters in this request are not valid."
  (^com.amazonaws.services.route53resolver.model.CreateResolverEndpointResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.CreateResolverEndpointRequest request]
    (-> this (.createResolverEndpoint request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonRoute53ResolverClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-resolver-rules
  "Lists the resolver rules that were created using the current AWS account.

  request - `com.amazonaws.services.route53resolver.model.ListResolverRulesRequest`

  returns: Result of the ListResolverRules operation returned by the service. - `com.amazonaws.services.route53resolver.model.ListResolverRulesResult`

  throws: com.amazonaws.services.route53resolver.model.InvalidNextTokenException - The value that you specified for NextToken in a List request isn't valid."
  (^com.amazonaws.services.route53resolver.model.ListResolverRulesResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.ListResolverRulesRequest request]
    (-> this (.listResolverRules request))))

(defn update-resolver-endpoint
  "Updates the name of an inbound or an outbound resolver endpoint.

  request - `com.amazonaws.services.route53resolver.model.UpdateResolverEndpointRequest`

  returns: Result of the UpdateResolverEndpoint operation returned by the service. - `com.amazonaws.services.route53resolver.model.UpdateResolverEndpointResult`

  throws: com.amazonaws.services.route53resolver.model.ResourceNotFoundException - The specified resource doesn't exist."
  (^com.amazonaws.services.route53resolver.model.UpdateResolverEndpointResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.UpdateResolverEndpointRequest request]
    (-> this (.updateResolverEndpoint request))))

(defn tag-resource
  "Adds one or more tags to a specified resource.

  request - `com.amazonaws.services.route53resolver.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.route53resolver.model.TagResourceResult`

  throws: com.amazonaws.services.route53resolver.model.LimitExceededException - The request caused one or more limits to be exceeded."
  (^com.amazonaws.services.route53resolver.model.TagResourceResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-resolver-rule-policy
  "Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and
   resources that you want to allow another AWS account to be able to use.

  request - `com.amazonaws.services.route53resolver.model.GetResolverRulePolicyRequest`

  returns: Result of the GetResolverRulePolicy operation returned by the service. - `com.amazonaws.services.route53resolver.model.GetResolverRulePolicyResult`

  throws: com.amazonaws.services.route53resolver.model.InvalidParameterException - One or more parameters in this request are not valid."
  (^com.amazonaws.services.route53resolver.model.GetResolverRulePolicyResult [^AmazonRoute53ResolverClient this ^com.amazonaws.services.route53resolver.model.GetResolverRulePolicyRequest request]
    (-> this (.getResolverRulePolicy request))))

