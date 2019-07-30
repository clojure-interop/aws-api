(ns com.amazonaws.services.route53resolver.AmazonRoute53ResolverAsyncClient
  "Client for accessing Route53Resolver asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


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
  (:import [com.amazonaws.services.route53resolver AmazonRoute53ResolverAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.route53resolver.AmazonRoute53ResolverAsyncClientBuilder`"
  (^com.amazonaws.services.route53resolver.AmazonRoute53ResolverAsyncClientBuilder []
    (AmazonRoute53ResolverAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonRoute53ResolverAsyncClient this]
    (-> this (.getExecutorService))))

(defn disassociate-resolver-endpoint-ip-address-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateResolverEndpointIpAddress operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateResolverEndpointIpAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.DisassociateResolverEndpointIpAddressRequest request]
    (-> this (.disassociateResolverEndpointIpAddressAsync request))))

(defn get-resolver-rule-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.GetResolverRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.GetResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.GetResolverRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResolverRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.GetResolverRuleRequest request]
    (-> this (.getResolverRuleAsync request))))

(defn list-resolver-rules-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.ListResolverRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolverRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.ListResolverRulesResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.ListResolverRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolverRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.ListResolverRulesRequest request]
    (-> this (.listResolverRulesAsync request))))

(defn put-resolver-rule-policy-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.PutResolverRulePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutResolverRulePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.PutResolverRulePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.PutResolverRulePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putResolverRulePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.PutResolverRulePolicyRequest request]
    (-> this (.putResolverRulePolicyAsync request))))

(defn create-resolver-rule-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.CreateResolverRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.CreateResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.CreateResolverRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResolverRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.CreateResolverRuleRequest request]
    (-> this (.createResolverRuleAsync request))))

(defn get-resolver-endpoint-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.GetResolverEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResolverEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.GetResolverEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.GetResolverEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResolverEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.GetResolverEndpointRequest request]
    (-> this (.getResolverEndpointAsync request))))

(defn update-resolver-endpoint-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.UpdateResolverEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResolverEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.UpdateResolverEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.UpdateResolverEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResolverEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.UpdateResolverEndpointRequest request]
    (-> this (.updateResolverEndpointAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonRoute53ResolverAsyncClient this]
    (-> this (.shutdown))))

(defn associate-resolver-endpoint-ip-address-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateResolverEndpointIpAddress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateResolverEndpointIpAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.AssociateResolverEndpointIpAddressRequest request]
    (-> this (.associateResolverEndpointIpAddressAsync request))))

(defn disassociate-resolver-rule-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.DisassociateResolverRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.DisassociateResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.DisassociateResolverRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateResolverRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.DisassociateResolverRuleRequest request]
    (-> this (.disassociateResolverRuleAsync request))))

(defn create-resolver-endpoint-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.CreateResolverEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResolverEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.CreateResolverEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.CreateResolverEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResolverEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.CreateResolverEndpointRequest request]
    (-> this (.createResolverEndpointAsync request))))

(defn list-resolver-endpoints-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.ListResolverEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolverEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.ListResolverEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolverEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointsRequest request]
    (-> this (.listResolverEndpointsAsync request))))

(defn get-resolver-rule-association-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResolverRuleAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResolverRuleAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.GetResolverRuleAssociationRequest request]
    (-> this (.getResolverRuleAssociationAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn associate-resolver-rule-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.AssociateResolverRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.AssociateResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.AssociateResolverRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateResolverRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.AssociateResolverRuleRequest request]
    (-> this (.associateResolverRuleAsync request))))

(defn get-resolver-rule-policy-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.GetResolverRulePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResolverRulePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.GetResolverRulePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.GetResolverRulePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResolverRulePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.GetResolverRulePolicyRequest request]
    (-> this (.getResolverRulePolicyAsync request))))

(defn list-resolver-rule-associations-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolverRuleAssociations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolverRuleAssociationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.ListResolverRuleAssociationsRequest request]
    (-> this (.listResolverRuleAssociationsAsync request))))

(defn update-resolver-rule-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.UpdateResolverRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.UpdateResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.UpdateResolverRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResolverRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.UpdateResolverRuleRequest request]
    (-> this (.updateResolverRuleAsync request))))

(defn delete-resolver-rule-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.DeleteResolverRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResolverRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.DeleteResolverRuleResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.DeleteResolverRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResolverRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.DeleteResolverRuleRequest request]
    (-> this (.deleteResolverRuleAsync request))))

(defn list-resolver-endpoint-ip-addresses-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResolverEndpointIpAddresses operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResolverEndpointIpAddressesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.ListResolverEndpointIpAddressesRequest request]
    (-> this (.listResolverEndpointIpAddressesAsync request))))

(defn delete-resolver-endpoint-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.DeleteResolverEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResolverEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.DeleteResolverEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.DeleteResolverEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResolverEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.DeleteResolverEndpointRequest request]
    (-> this (.deleteResolverEndpointAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonRoute53ResolverAsync

  request - `com.amazonaws.services.route53resolver.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53resolver.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53ResolverAsyncClient this ^com.amazonaws.services.route53resolver.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

