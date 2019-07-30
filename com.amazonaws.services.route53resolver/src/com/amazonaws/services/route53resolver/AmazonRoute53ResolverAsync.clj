(ns com.amazonaws.services.route53resolver.AmazonRoute53ResolverAsync
  "Interface for accessing Route53Resolver asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonRoute53ResolverAsync instead.



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
  (:import [com.amazonaws.services.route53resolver AmazonRoute53ResolverAsync]))

(defn untag-resource-async
  "Removes one or more tags from a specified resource.

  untag-resource-request - `com.amazonaws.services.route53resolver.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn disassociate-resolver-endpoint-ip-address-async
  "Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP
   address, submit one DisassociateResolverEndpointIpAddress request for each IP address.


   To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress.

  disassociate-resolver-endpoint-ip-address-request - `com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateResolverEndpointIpAddress operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressRequest disassociate-resolver-endpoint-ip-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateResolverEndpointIpAddressAsync disassociate-resolver-endpoint-ip-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressRequest disassociate-resolver-endpoint-ip-address-request]
    (-> this (.disassociateResolverEndpointIpAddressAsync disassociate-resolver-endpoint-ip-address-request))))

(defn get-resolver-rule-async
  "Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for
   and the ID of the outbound resolver endpoint that the rule is associated with.

  get-resolver-rule-request - `com.amazonaws.services.route53resolver.model.GetResolverRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.GetResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.GetResolverRuleRequest get-resolver-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResolverRuleAsync get-resolver-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.GetResolverRuleRequest get-resolver-rule-request]
    (-> this (.getResolverRuleAsync get-resolver-rule-request))))

(defn list-resolver-rules-async
  "Lists the resolver rules that were created using the current AWS account.

  list-resolver-rules-request - `com.amazonaws.services.route53resolver.model.ListResolverRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolverRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.ListResolverRulesResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.ListResolverRulesRequest list-resolver-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolverRulesAsync list-resolver-rules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.ListResolverRulesRequest list-resolver-rules-request]
    (-> this (.listResolverRulesAsync list-resolver-rules-request))))

(defn put-resolver-rule-policy-async
  "Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.

  put-resolver-rule-policy-request - `com.amazonaws.services.route53resolver.model.PutResolverRulePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutResolverRulePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.PutResolverRulePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.PutResolverRulePolicyRequest put-resolver-rule-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putResolverRulePolicyAsync put-resolver-rule-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.PutResolverRulePolicyRequest put-resolver-rule-policy-request]
    (-> this (.putResolverRulePolicyAsync put-resolver-rule-policy-request))))

(defn create-resolver-rule-async
  "For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one
   domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.

  create-resolver-rule-request - `com.amazonaws.services.route53resolver.model.CreateResolverRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.CreateResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.CreateResolverRuleRequest create-resolver-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResolverRuleAsync create-resolver-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.CreateResolverRuleRequest create-resolver-rule-request]
    (-> this (.createResolverRuleAsync create-resolver-rule-request))))

(defn get-resolver-endpoint-async
  "Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver
   endpoint, and the current status of the endpoint.

  get-resolver-endpoint-request - `com.amazonaws.services.route53resolver.model.GetResolverEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResolverEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.GetResolverEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.GetResolverEndpointRequest get-resolver-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResolverEndpointAsync get-resolver-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.GetResolverEndpointRequest get-resolver-endpoint-request]
    (-> this (.getResolverEndpointAsync get-resolver-endpoint-request))))

(defn update-resolver-endpoint-async
  "Updates the name of an inbound or an outbound resolver endpoint.

  update-resolver-endpoint-request - `com.amazonaws.services.route53resolver.model.UpdateResolverEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResolverEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.UpdateResolverEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.UpdateResolverEndpointRequest update-resolver-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResolverEndpointAsync update-resolver-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.UpdateResolverEndpointRequest update-resolver-endpoint-request]
    (-> this (.updateResolverEndpointAsync update-resolver-endpoint-request))))

(defn associate-resolver-endpoint-ip-address-async
  "Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address,
   submit one AssociateResolverEndpointIpAddress request for each IP address.


   To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress.

  associate-resolver-endpoint-ip-address-request - `com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateResolverEndpointIpAddress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressRequest associate-resolver-endpoint-ip-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateResolverEndpointIpAddressAsync associate-resolver-endpoint-ip-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressRequest associate-resolver-endpoint-ip-address-request]
    (-> this (.associateResolverEndpointIpAddressAsync associate-resolver-endpoint-ip-address-request))))

(defn disassociate-resolver-rule-async
  "Removes the association between a specified resolver rule and a specified VPC.



   If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that
   you specified in the resolver rule.

  disassociate-resolver-rule-request - `com.amazonaws.services.route53resolver.model.DisassociateResolverRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.DisassociateResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.DisassociateResolverRuleRequest disassociate-resolver-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateResolverRuleAsync disassociate-resolver-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.DisassociateResolverRuleRequest disassociate-resolver-rule-request]
    (-> this (.disassociateResolverRuleAsync disassociate-resolver-rule-request))))

(defn create-resolver-endpoint-async
  "Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:




   An inbound resolver endpoint forwards DNS queries to the DNS service for a VPC from your network or
   another VPC.




   An outbound resolver endpoint forwards DNS queries from the DNS service for a VPC to your network or
   another VPC.

  create-resolver-endpoint-request - `com.amazonaws.services.route53resolver.model.CreateResolverEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResolverEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.CreateResolverEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.CreateResolverEndpointRequest create-resolver-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResolverEndpointAsync create-resolver-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.CreateResolverEndpointRequest create-resolver-endpoint-request]
    (-> this (.createResolverEndpointAsync create-resolver-endpoint-request))))

(defn list-resolver-endpoints-async
  "Lists all the resolver endpoints that were created using the current AWS account.

  list-resolver-endpoints-request - `com.amazonaws.services.route53resolver.model.ListResolverEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolverEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.ListResolverEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointsRequest list-resolver-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolverEndpointsAsync list-resolver-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointsRequest list-resolver-endpoints-request]
    (-> this (.listResolverEndpointsAsync list-resolver-endpoints-request))))

(defn get-resolver-rule-association-async
  "Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule
   and a VPC using AssociateResolverRule.

  get-resolver-rule-association-request - `com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResolverRuleAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationRequest get-resolver-rule-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResolverRuleAssociationAsync get-resolver-rule-association-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationRequest get-resolver-rule-association-request]
    (-> this (.getResolverRuleAssociationAsync get-resolver-rule-association-request))))

(defn list-tags-for-resource-async
  "Lists the tags that you associated with the specified resource.

  list-tags-for-resource-request - `com.amazonaws.services.route53resolver.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn associate-resolver-rule-async
  "Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries
   for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the
   IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see
   CreateResolverRule.

  associate-resolver-rule-request - `com.amazonaws.services.route53resolver.model.AssociateResolverRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.AssociateResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.AssociateResolverRuleRequest associate-resolver-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateResolverRuleAsync associate-resolver-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.AssociateResolverRuleRequest associate-resolver-rule-request]
    (-> this (.associateResolverRuleAsync associate-resolver-rule-request))))

(defn get-resolver-rule-policy-async
  "Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and
   resources that you want to allow another AWS account to be able to use.

  get-resolver-rule-policy-request - `com.amazonaws.services.route53resolver.model.GetResolverRulePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResolverRulePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.GetResolverRulePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.GetResolverRulePolicyRequest get-resolver-rule-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResolverRulePolicyAsync get-resolver-rule-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.GetResolverRulePolicyRequest get-resolver-rule-policy-request]
    (-> this (.getResolverRulePolicyAsync get-resolver-rule-policy-request))))

(defn list-resolver-rule-associations-async
  "Lists the associations that were created between resolver rules and VPCs using the current AWS account.

  list-resolver-rule-associations-request - `com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolverRuleAssociations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsRequest list-resolver-rule-associations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolverRuleAssociationsAsync list-resolver-rule-associations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsRequest list-resolver-rule-associations-request]
    (-> this (.listResolverRuleAssociationsAsync list-resolver-rule-associations-request))))

(defn update-resolver-rule-async
  "Updates settings for a specified resolver rule. ResolverRuleId is required, and all other parameters
   are optional. If you don't specify a parameter, it retains its current value.

  update-resolver-rule-request - `com.amazonaws.services.route53resolver.model.UpdateResolverRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.UpdateResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.UpdateResolverRuleRequest update-resolver-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResolverRuleAsync update-resolver-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.UpdateResolverRuleRequest update-resolver-rule-request]
    (-> this (.updateResolverRuleAsync update-resolver-rule-request))))

(defn delete-resolver-rule-async
  "Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that
   you associated the resolver rule with. For more infomation, see DisassociateResolverRule.

  delete-resolver-rule-request - `com.amazonaws.services.route53resolver.model.DeleteResolverRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.DeleteResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.DeleteResolverRuleRequest delete-resolver-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResolverRuleAsync delete-resolver-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.DeleteResolverRuleRequest delete-resolver-rule-request]
    (-> this (.deleteResolverRuleAsync delete-resolver-rule-request))))

(defn list-resolver-endpoint-ip-addresses-async
  "Gets the IP addresses for a specified resolver endpoint.

  list-resolver-endpoint-ip-addresses-request - `com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolverEndpointIpAddresses operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesRequest list-resolver-endpoint-ip-addresses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolverEndpointIpAddressesAsync list-resolver-endpoint-ip-addresses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesRequest list-resolver-endpoint-ip-addresses-request]
    (-> this (.listResolverEndpointIpAddressesAsync list-resolver-endpoint-ip-addresses-request))))

(defn delete-resolver-endpoint-async
  "Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an
   outbound resolver endpoint:




   Inbound: DNS queries from your network or another VPC are no longer routed to the DNS service for the
   specified VPC.




   Outbound: DNS queries from a VPC are no longer routed to your network or to another VPC.

  delete-resolver-endpoint-request - `com.amazonaws.services.route53resolver.model.DeleteResolverEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResolverEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.DeleteResolverEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.DeleteResolverEndpointRequest delete-resolver-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResolverEndpointAsync delete-resolver-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.DeleteResolverEndpointRequest delete-resolver-endpoint-request]
    (-> this (.deleteResolverEndpointAsync delete-resolver-endpoint-request))))

(defn tag-resource-async
  "Adds one or more tags to a specified resource.

  tag-resource-request - `com.amazonaws.services.route53resolver.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsync this ^com.amazonaws.services.route53resolver.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

