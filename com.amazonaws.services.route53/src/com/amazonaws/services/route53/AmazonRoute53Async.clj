(ns com.amazonaws.services.route53.AmazonRoute53Async
  "Interface for accessing Route 53 asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonRoute53Async instead.



  Amazon Route 53 is a highly available and scalable Domain Name System (DNS) web service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53 AmazonRoute53Async]))

(defn delete-query-logging-config-async
  "Deletes a configuration for DNS query logging. If you delete a configuration, Amazon Route 53 stops sending query
   logs to CloudWatch Logs. Route 53 doesn't delete any logs that are already in CloudWatch Logs.


   For more information about DNS query logs, see CreateQueryLoggingConfig.

  delete-query-logging-config-request - `com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteQueryLoggingConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteQueryLoggingConfigResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest delete-query-logging-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteQueryLoggingConfigAsync delete-query-logging-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest delete-query-logging-config-request]
    (-> this (.deleteQueryLoggingConfigAsync delete-query-logging-config-request))))

(defn change-tags-for-resource-async
  "Adds, edits, or deletes tags for a health check or a hosted zone.


   For information about using tags for cost allocation, see Using Cost Allocation
   Tags in the AWS Billing and Cost Management User Guide.

  change-tags-for-resource-request - A complex type that contains information about the tags that you want to add, edit, or delete. - `com.amazonaws.services.route53.model.ChangeTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ChangeTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ChangeTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ChangeTagsForResourceRequest change-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeTagsForResourceAsync change-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ChangeTagsForResourceRequest change-tags-for-resource-request]
    (-> this (.changeTagsForResourceAsync change-tags-for-resource-request))))

(defn change-resource-record-sets-async
  "Creates, changes, or deletes a resource record set, which contains authoritative DNS information for a specified
   domain name or subdomain name. For example, you can use ChangeResourceRecordSets to create a
   resource record set that routes traffic for test.example.com to a web server that has an IP address of
   192.0.2.44.


   Change Batches and Transactional Changes


   The request body must include a document with a ChangeResourceRecordSetsRequest element. The request
   body contains a list of change items, known as a change batch. Change batches are considered transactional
   changes. When using the Amazon Route 53 API to change resource record sets, Route 53 either makes all or none of
   the changes in a change batch request. This ensures that Route 53 never partially implements the intended changes
   to the resource record sets in a hosted zone.


   For example, a change batch request that deletes the CNAME record for www.example.com and creates an
   alias resource record set for www.example.com. Route 53 deletes the first resource record set and creates the
   second resource record set in a single operation. If either the DELETE or the CREATE
   action fails, then both changes (plus any other changes in the batch) fail, and the original CNAME
   record continues to exist.



   Due to the nature of transactional changes, you can't delete the same resource record set more than once in a
   single change batch. If you attempt to delete the same change batch more than once, Route 53 returns an
   InvalidChangeBatch error.



   Traffic Flow


   To create resource record sets for complex routing configurations, use either the traffic flow visual editor in
   the Route 53 console or the API actions for traffic policies and traffic policy instances. Save the configuration
   as a traffic policy, then associate the traffic policy with one or more domain names (such as example.com) or
   subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones. You can roll back
   the updates if the new configuration isn't performing as expected. For more information, see Using Traffic Flow to Route DNS
   Traffic in the Amazon Route 53 Developer Guide.


   Create, Delete, and Upsert


   Use ChangeResourceRecordsSetsRequest to perform the following actions:




   CREATE: Creates a resource record set that has the specified values.




   DELETE: Deletes an existing resource record set that has the specified values.




   UPSERT: If a resource record set does not already exist, AWS creates it. If a resource set does
   exist, Route 53 updates it with the values in the request.




   Syntaxes for Creating, Updating, and Deleting Resource Record Sets


   The syntax for a request depends on the type of resource record set that you want to create, delete, or update,
   such as weighted, alias, or failover. The XML elements in your request must appear in the order listed in the
   syntax.


   For an example for each type of resource record set, see \"Examples.\"


   Don't refer to the syntax in the \"Parameter Syntax\" section, which includes all of the elements for every kind of
   resource record set that you can create, delete, or update by using ChangeResourceRecordSets.


   Change Propagation to Route 53 DNS Servers


   When you submit a ChangeResourceRecordSets request, Route 53 propagates your changes to all of the
   Route 53 authoritative DNS servers. While your changes are propagating, GetChange returns a status
   of PENDING. When propagation is complete, GetChange returns a status of
   INSYNC. Changes generally propagate to all Route 53 name servers within 60 seconds. For more
   information, see GetChange.


   Limits on ChangeResourceRecordSets Requests


   For information about the limits on a ChangeResourceRecordSets request, see Limits in the Amazon
   Route 53 Developer Guide.

  change-resource-record-sets-request - A complex type that contains change information for the resource record set. - `com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ChangeResourceRecordSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ChangeResourceRecordSetsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest change-resource-record-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeResourceRecordSetsAsync change-resource-record-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest change-resource-record-sets-request]
    (-> this (.changeResourceRecordSetsAsync change-resource-record-sets-request))))

(defn create-reusable-delegation-set-async
  "Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones. If a hosted
   zoned ID is specified, CreateReusableDelegationSet marks the delegation set associated with that
   zone as reusable.



   You can't associate a reusable delegation set with a private hosted zone.



   For information about using a reusable delegation set to configure white label name servers, see Configuring White
   Label Name Servers.


   The process for migrating existing hosted zones to use a reusable delegation set is comparable to the process for
   configuring white label name servers. You need to perform the following steps:




   Create a reusable delegation set.




   Recreate hosted zones, and reduce the TTL to 60 seconds or less.




   Recreate resource record sets in the new hosted zones.




   Change the registrar's name servers to use the name servers for the new hosted zones.




   Monitor traffic for the website or application.




   Change TTLs back to their original values.




   If you want to migrate existing hosted zones to use a reusable delegation set, the existing hosted zones can't
   use any of the name servers that are assigned to the reusable delegation set. If one or more hosted zones do use
   one or more name servers that are assigned to the reusable delegation set, you can do one of the following:




   For small numbers of hosted zones—up to a few hundred—it's relatively easy to create reusable delegation sets
   until you get one that has four name servers that don't overlap with any of the name servers in your hosted
   zones.




   For larger numbers of hosted zones, the easiest solution is to use more than one reusable delegation set.




   For larger numbers of hosted zones, you can also migrate hosted zones that have overlapping name servers to
   hosted zones that don't have overlapping name servers, then migrate the hosted zones again to use the reusable
   delegation set.

  create-reusable-delegation-set-request - `com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReusableDelegationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateReusableDelegationSetResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest create-reusable-delegation-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReusableDelegationSetAsync create-reusable-delegation-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest create-reusable-delegation-set-request]
    (-> this (.createReusableDelegationSetAsync create-reusable-delegation-set-request))))

(defn get-health-check-last-failure-reason-async
  "Gets the reason that a specified health check failed most recently.

  get-health-check-last-failure-reason-request - A request for the reason that a health check failed most recently. - `com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHealthCheckLastFailureReason operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest get-health-check-last-failure-reason-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHealthCheckLastFailureReasonAsync get-health-check-last-failure-reason-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest get-health-check-last-failure-reason-request]
    (-> this (.getHealthCheckLastFailureReasonAsync get-health-check-last-failure-reason-request))))

(defn associate-vpc-with-hosted-zone-async
  "Associates an Amazon VPC with a private hosted zone.



   To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public
   hosted zone into a private hosted zone.



   If you want to associate a VPC that was created by using one AWS account with a private hosted zone that was
   created by using a different account, the AWS account that created the private hosted zone must first submit a
   CreateVPCAssociationAuthorization request. Then the account that created the VPC must submit an
   AssociateVPCWithHostedZone request.

  associate-vpc-with-hosted-zone-request - A complex type that contains information about the request to associate a VPC with a private hosted zone. - `com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateVPCWithHostedZone operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest associate-vpc-with-hosted-zone-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateVPCWithHostedZoneAsync associate-vpc-with-hosted-zone-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest associate-vpc-with-hosted-zone-request]
    (-> this (.associateVPCWithHostedZoneAsync associate-vpc-with-hosted-zone-request))))

(defn test-dns-answer-async
  "Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type.
   You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet
   mask.

  test-dns-answer-request - Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask. - `com.amazonaws.services.route53.model.TestDNSAnswerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestDNSAnswer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.TestDNSAnswerResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.TestDNSAnswerRequest test-dns-answer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testDNSAnswerAsync test-dns-answer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.TestDNSAnswerRequest test-dns-answer-request]
    (-> this (.testDNSAnswerAsync test-dns-answer-request))))

(defn create-traffic-policy-async
  "Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as
   example.com) or one subdomain name (such as www.example.com).

  create-traffic-policy-request - A complex type that contains information about the traffic policy that you want to create. - `com.amazonaws.services.route53.model.CreateTrafficPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateTrafficPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyRequest create-traffic-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficPolicyAsync create-traffic-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyRequest create-traffic-policy-request]
    (-> this (.createTrafficPolicyAsync create-traffic-policy-request))))

(defn disassociate-vpc-from-hosted-zone-async
  "Disassociates a VPC from a Amazon Route 53 private hosted zone. Note the following:




   You can't disassociate the last VPC from a private hosted zone.




   You can't convert a private hosted zone into a public hosted zone.




   You can submit a DisassociateVPCFromHostedZone request using either the account that created the
   hosted zone or the account that created the VPC.

  disassociate-vpc-from-hosted-zone-request - A complex type that contains information about the VPC that you want to disassociate from a specified private hosted zone. - `com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateVPCFromHostedZone operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest disassociate-vpc-from-hosted-zone-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateVPCFromHostedZoneAsync disassociate-vpc-from-hosted-zone-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest disassociate-vpc-from-hosted-zone-request]
    (-> this (.disassociateVPCFromHostedZoneAsync disassociate-vpc-from-hosted-zone-request))))

(defn delete-traffic-policy-async
  "Deletes a traffic policy.

  delete-traffic-policy-request - A request to delete a specified traffic policy version. - `com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteTrafficPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest delete-traffic-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficPolicyAsync delete-traffic-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest delete-traffic-policy-request]
    (-> this (.deleteTrafficPolicyAsync delete-traffic-policy-request))))

(defn get-traffic-policy-instance-count-async
  "Gets the number of traffic policy instances that are associated with the current AWS account.

  get-traffic-policy-instance-count-request - Request to get the number of traffic policy instances that are associated with the current AWS account. - `com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTrafficPolicyInstanceCount operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest get-traffic-policy-instance-count-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTrafficPolicyInstanceCountAsync get-traffic-policy-instance-count-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest get-traffic-policy-instance-count-request]
    (-> this (.getTrafficPolicyInstanceCountAsync get-traffic-policy-instance-count-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.getTrafficPolicyInstanceCountAsync))))

(defn get-checker-ip-ranges-async
  "GetCheckerIpRanges still works, but we recommend that you download ip-ranges.json, which includes IP
   address ranges for all AWS services. For more information, see IP Address Ranges of
   Amazon Route 53 Servers in the Amazon Route 53 Developer Guide.

  get-checker-ip-ranges-request - Empty request. - `com.amazonaws.services.route53.model.GetCheckerIpRangesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCheckerIpRanges operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetCheckerIpRangesResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetCheckerIpRangesRequest get-checker-ip-ranges-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCheckerIpRangesAsync get-checker-ip-ranges-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetCheckerIpRangesRequest get-checker-ip-ranges-request]
    (-> this (.getCheckerIpRangesAsync get-checker-ip-ranges-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.getCheckerIpRangesAsync))))

(defn create-vpc-association-authorization-async
  "Authorizes the AWS account that created a specified VPC to submit an AssociateVPCWithHostedZone
   request to associate the VPC with a specified hosted zone that was created by a different account. To submit a
   CreateVPCAssociationAuthorization request, you must use the account that created the hosted zone.
   After you authorize the association, use the account that created the VPC to submit an
   AssociateVPCWithHostedZone request.



   If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created
   by using a different account, you must submit one authorization request for each VPC.

  create-vpc-association-authorization-request - A complex type that contains information about the request to authorize associating a VPC with your private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by using different accounts. - `com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVPCAssociationAuthorization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest create-vpc-association-authorization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVPCAssociationAuthorizationAsync create-vpc-association-authorization-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest create-vpc-association-authorization-request]
    (-> this (.createVPCAssociationAuthorizationAsync create-vpc-association-authorization-request))))

(defn create-hosted-zone-async
  "Creates a new public or private hosted zone. You create records in a public hosted zone to define how you want to
   route traffic on the internet for a domain, such as example.com, and its subdomains (apex.example.com,
   acme.example.com). You create records in a private hosted zone to define how you want to route traffic for a
   domain and its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).



   You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must create a new
   hosted zone with the same name and create new resource record sets.



   For more information about charges for hosted zones, see Amazon
   Route 53 Pricing.


   Note the following:




   You can't create a hosted zone for a top-level domain (TLD) such as .com.




   For public hosted zones, Amazon Route 53 automatically creates a default SOA record and four NS records for the
   zone. For more information about SOA and NS records, see NS and SOA Records that Route
   53 Creates for a Hosted Zone in the Amazon Route 53 Developer Guide.


   If you want to use the same name servers for multiple public hosted zones, you can optionally associate a
   reusable delegation set with the hosted zone. See the DelegationSetId element.




   If your domain is registered with a registrar other than Route 53, you must update the name servers with your
   registrar to make Route 53 the DNS service for the domain. For more information, see Migrating DNS Service for an
   Existing Domain to Amazon Route 53 in the Amazon Route 53 Developer Guide.




   When you submit a CreateHostedZone request, the initial status of the hosted zone is
   PENDING. For public hosted zones, this means that the NS and SOA records are not yet available on
   all Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to
   INSYNC.

  create-hosted-zone-request - A complex type that contains information about the request to create a public or private hosted zone. - `com.amazonaws.services.route53.model.CreateHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHostedZone operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateHostedZoneResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateHostedZoneRequest create-hosted-zone-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHostedZoneAsync create-hosted-zone-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateHostedZoneRequest create-hosted-zone-request]
    (-> this (.createHostedZoneAsync create-hosted-zone-request))))

(defn list-health-checks-async
  "Retrieve a list of the health checks that are associated with the current AWS account.

  list-health-checks-request - A request to retrieve a list of the health checks that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListHealthChecksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHealthChecks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListHealthChecksResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHealthChecksRequest list-health-checks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHealthChecksAsync list-health-checks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHealthChecksRequest list-health-checks-request]
    (-> this (.listHealthChecksAsync list-health-checks-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.listHealthChecksAsync))))

(defn create-health-check-async
  "Creates a new health check.


   For information about adding health checks to resource record sets, see HealthCheckId in ChangeResourceRecordSets.


   ELB Load Balancers


   If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon
   Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you
   configure settings for an ELB health check, which performs a similar function to a Route 53 health check.


   Private Hosted Zones


   You can associate health checks with failover resource record sets in a private hosted zone. Note the following:




   Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP address, you
   must assign a public IP address to the instance in the VPC.




   You can configure a health checker to check the health of an external resource that the instance relies on, such
   as a database server.




   You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is
   based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the
   Amazon EC2 StatusCheckFailed metric, add an alarm to the metric, and then create a health check that
   is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the
   CloudWatch console, see the Amazon CloudWatch
   User Guide.

  create-health-check-request - A complex type that contains the health check request information. - `com.amazonaws.services.route53.model.CreateHealthCheckRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHealthCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateHealthCheckResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateHealthCheckRequest create-health-check-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHealthCheckAsync create-health-check-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateHealthCheckRequest create-health-check-request]
    (-> this (.createHealthCheckAsync create-health-check-request))))

(defn get-query-logging-config-async
  "Gets information about a specified configuration for DNS query logging.


   For more information about DNS query logs, see CreateQueryLoggingConfig and Logging DNS Queries.

  get-query-logging-config-request - `com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueryLoggingConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetQueryLoggingConfigResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest get-query-logging-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueryLoggingConfigAsync get-query-logging-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest get-query-logging-config-request]
    (-> this (.getQueryLoggingConfigAsync get-query-logging-config-request))))

(defn update-hosted-zone-comment-async
  "Updates the comment for a specified hosted zone.

  update-hosted-zone-comment-request - A request to update the comment for a hosted zone. - `com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateHostedZoneComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.UpdateHostedZoneCommentResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest update-hosted-zone-comment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateHostedZoneCommentAsync update-hosted-zone-comment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest update-hosted-zone-comment-request]
    (-> this (.updateHostedZoneCommentAsync update-hosted-zone-comment-request))))

(defn get-hosted-zone-limit-async
  "Gets the specified limit for a specified hosted zone, for example, the maximum number of records that you can
   create in the hosted zone.


   For the default limit, see Limits in the Amazon
   Route 53 Developer Guide. To request a higher limit, open a case.

  get-hosted-zone-limit-request - A complex type that contains information about the request to create a hosted zone. - `com.amazonaws.services.route53.model.GetHostedZoneLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHostedZoneLimit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHostedZoneLimitResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneLimitRequest get-hosted-zone-limit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHostedZoneLimitAsync get-hosted-zone-limit-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneLimitRequest get-hosted-zone-limit-request]
    (-> this (.getHostedZoneLimitAsync get-hosted-zone-limit-request))))

(defn delete-vpc-association-authorization-async
  "Removes authorization to submit an AssociateVPCWithHostedZone request to associate a specified VPC
   with a hosted zone that was created by a different account. You must use the account that created the hosted zone
   to submit a DeleteVPCAssociationAuthorization request.



   Sending this request only prevents the AWS account that created the VPC from associating the VPC with the Amazon
   Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone,
   DeleteVPCAssociationAuthorization won't disassociate the VPC from the hosted zone. If you want to
   delete an existing association, use DisassociateVPCFromHostedZone.

  delete-vpc-association-authorization-request - A complex type that contains information about the request to remove authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account. - `com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVPCAssociationAuthorization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest delete-vpc-association-authorization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVPCAssociationAuthorizationAsync delete-vpc-association-authorization-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest delete-vpc-association-authorization-request]
    (-> this (.deleteVPCAssociationAuthorizationAsync delete-vpc-association-authorization-request))))

(defn get-geo-location-async
  "Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation
   resource record sets.


   Use the following syntax to determine whether a continent is supported for geolocation:


   GET /2013-04-01/geolocation?continentcode=two-letter abbreviation for a continent


   Use the following syntax to determine whether a country is supported for geolocation:


   GET /2013-04-01/geolocation?countrycode=two-character country code


   Use the following syntax to determine whether a subdivision of a country is supported for geolocation:


   GET /2013-04-01/geolocation?countrycode=two-character country code&subdivisioncode=subdivision code

  get-geo-location-request - A request for information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets. - `com.amazonaws.services.route53.model.GetGeoLocationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGeoLocation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetGeoLocationResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetGeoLocationRequest get-geo-location-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGeoLocationAsync get-geo-location-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetGeoLocationRequest get-geo-location-request]
    (-> this (.getGeoLocationAsync get-geo-location-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.getGeoLocationAsync))))

(defn get-health-check-async
  "Gets information about a specified health check.

  get-health-check-request - A request to get information about a specified health check. - `com.amazonaws.services.route53.model.GetHealthCheckRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHealthCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHealthCheckResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckRequest get-health-check-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHealthCheckAsync get-health-check-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckRequest get-health-check-request]
    (-> this (.getHealthCheckAsync get-health-check-request))))

(defn list-hosted-zones-async
  "Retrieves a list of the public and private hosted zones that are associated with the current AWS account. The
   response includes a HostedZones child element for each hosted zone.


   Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use
   the maxitems parameter to list them in groups of up to 100.

  list-hosted-zones-request - A request to retrieve a list of the public and private hosted zones that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListHostedZonesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHostedZones operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListHostedZonesResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHostedZonesRequest list-hosted-zones-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHostedZonesAsync list-hosted-zones-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHostedZonesRequest list-hosted-zones-request]
    (-> this (.listHostedZonesAsync list-hosted-zones-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.listHostedZonesAsync))))

(defn list-tags-for-resources-async
  "Lists tags for up to 10 health checks or hosted zones.


   For information about using tags for cost allocation, see Using Cost Allocation
   Tags in the AWS Billing and Cost Management User Guide.

  list-tags-for-resources-request - A complex type that contains information about the health checks or hosted zones for which you want to list tags. - `com.amazonaws.services.route53.model.ListTagsForResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTagsForResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTagsForResourcesRequest list-tags-for-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourcesAsync list-tags-for-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTagsForResourcesRequest list-tags-for-resources-request]
    (-> this (.listTagsForResourcesAsync list-tags-for-resources-request))))

(defn list-traffic-policies-async
  "Gets information about the latest version for every traffic policy that is associated with the current AWS
   account. Policies are listed in the order that they were created in.

  list-traffic-policies-request - A complex type that contains the information about the request to list the traffic policies that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListTrafficPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrafficPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTrafficPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPoliciesRequest list-traffic-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrafficPoliciesAsync list-traffic-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPoliciesRequest list-traffic-policies-request]
    (-> this (.listTrafficPoliciesAsync list-traffic-policies-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.listTrafficPoliciesAsync))))

(defn get-traffic-policy-async
  "Gets information about a specific traffic policy version.

  get-traffic-policy-request - Gets information about a specific traffic policy version. - `com.amazonaws.services.route53.model.GetTrafficPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTrafficPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetTrafficPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyRequest get-traffic-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTrafficPolicyAsync get-traffic-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyRequest get-traffic-policy-request]
    (-> this (.getTrafficPolicyAsync get-traffic-policy-request))))

(defn list-resource-record-sets-async
  "Lists the resource record sets in a specified hosted zone.


   ListResourceRecordSets returns up to 100 resource record sets at a time in ASCII order, beginning at
   a position specified by the name and type elements.


   Sort order


   ListResourceRecordSets sorts results first by DNS name with the labels reversed, for example:


   com.example.www.


   Note the trailing dot, which can change the sort order when the record name contains characters that appear
   before . (decimal 46) in the ASCII table. These characters include the following:
   ! \" # $ % & ' ( ) *  , -


   When multiple records have the same DNS name, ListResourceRecordSets sorts results by the record
   type.


   Specifying where to start listing records


   You can use the name and type elements to specify the resource record set that the list begins with:


   If you do not specify Name or Type


   The results begin with the first resource record set that the hosted zone contains.


   If you specify Name but not Type


   The results begin with the first resource record set in the list whose name is greater than or equal to
   Name.


   If you specify Type but not Name


   Amazon Route 53 returns the InvalidInput error.


   If you specify both Name and Type


   The results begin with the first resource record set in the list whose name is greater than or equal to
   Name, and whose type is greater than or equal to Type.




   Resource record sets that are PENDING


   This action returns the most current version of the records. This includes records that are PENDING,
   and that are not yet available on all Route 53 DNS servers.


   Changing resource record sets


   To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do
   not submit a ChangeResourceRecordSets request while you're paging through the results of a
   ListResourceRecordSets request. If you do, some pages may display results without the latest changes
   while other pages display results with the latest changes.


   Displaying the next page of results


   If a ListResourceRecordSets command returns more than one page of results, the value of
   IsTruncated is true. To display the next page of results, get the values of
   NextRecordName, NextRecordType, and NextRecordIdentifier (if any) from the
   response. Then submit another ListResourceRecordSets request, and specify those values for
   StartRecordName, StartRecordType, and StartRecordIdentifier.

  list-resource-record-sets-request - A request for the resource record sets that are associated with a specified hosted zone. - `com.amazonaws.services.route53.model.ListResourceRecordSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceRecordSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListResourceRecordSetsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListResourceRecordSetsRequest list-resource-record-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceRecordSetsAsync list-resource-record-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListResourceRecordSetsRequest list-resource-record-sets-request]
    (-> this (.listResourceRecordSetsAsync list-resource-record-sets-request))))

(defn list-reusable-delegation-sets-async
  "Retrieves a list of the reusable delegation sets that are associated with the current AWS account.

  list-reusable-delegation-sets-request - A request to get a list of the reusable delegation sets that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListReusableDelegationSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListReusableDelegationSetsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest list-reusable-delegation-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listReusableDelegationSetsAsync list-reusable-delegation-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest list-reusable-delegation-sets-request]
    (-> this (.listReusableDelegationSetsAsync list-reusable-delegation-sets-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.listReusableDelegationSetsAsync))))

(defn get-reusable-delegation-set-async
  "Retrieves information about a specified reusable delegation set, including the four name servers that are
   assigned to the delegation set.

  get-reusable-delegation-set-request - A request to get information about a specified reusable delegation set. - `com.amazonaws.services.route53.model.GetReusableDelegationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReusableDelegationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetReusableDelegationSetResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetReusableDelegationSetRequest get-reusable-delegation-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReusableDelegationSetAsync get-reusable-delegation-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetReusableDelegationSetRequest get-reusable-delegation-set-request]
    (-> this (.getReusableDelegationSetAsync get-reusable-delegation-set-request))))

(defn create-traffic-policy-version-async
  "Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you
   specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new
   version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as
   example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a
   traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic
   policy.

  create-traffic-policy-version-request - A complex type that contains information about the traffic policy that you want to create a new version for. - `com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficPolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateTrafficPolicyVersionResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest create-traffic-policy-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficPolicyVersionAsync create-traffic-policy-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest create-traffic-policy-version-request]
    (-> this (.createTrafficPolicyVersionAsync create-traffic-policy-version-request))))

(defn list-traffic-policy-versions-async
  "Gets information about all of the versions for a specified traffic policy.


   Traffic policy versions are listed in numerical order by VersionNumber.

  list-traffic-policy-versions-request - A complex type that contains the information about the request to list your traffic policies. - `com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrafficPolicyVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTrafficPolicyVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest list-traffic-policy-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrafficPolicyVersionsAsync list-traffic-policy-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest list-traffic-policy-versions-request]
    (-> this (.listTrafficPolicyVersionsAsync list-traffic-policy-versions-request))))

(defn create-traffic-policy-instance-async
  "Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy
   version. In addition, CreateTrafficPolicyInstance associates the resource record sets with a
   specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds
   to DNS queries for the domain or subdomain name by using the resource record sets that
   CreateTrafficPolicyInstance created.

  create-traffic-policy-instance-request - A complex type that contains information about the resource record sets that you want to create based on a specified traffic policy. - `com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficPolicyInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest create-traffic-policy-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficPolicyInstanceAsync create-traffic-policy-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest create-traffic-policy-instance-request]
    (-> this (.createTrafficPolicyInstanceAsync create-traffic-policy-instance-request))))

(defn list-geo-locations-async
  "Retrieves a list of supported geographic locations.


   Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a
   country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order
   immediately after the corresponding country.

  list-geo-locations-request - A request to get a list of geographic locations that Amazon Route 53 supports for geolocation resource record sets. - `com.amazonaws.services.route53.model.ListGeoLocationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGeoLocations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListGeoLocationsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListGeoLocationsRequest list-geo-locations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGeoLocationsAsync list-geo-locations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListGeoLocationsRequest list-geo-locations-request]
    (-> this (.listGeoLocationsAsync list-geo-locations-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.listGeoLocationsAsync))))

(defn list-traffic-policy-instances-by-hosted-zone-async
  "Gets information about the traffic policy instances that you created in a specified hosted zone.



   After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance
   request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
   traffic policy definition. For more information, see the State response element.



   Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
   use the MaxItems parameter to list them in groups of up to 100.

  list-traffic-policy-instances-by-hosted-zone-request - A request for the traffic policy instances that you created in a specified hosted zone. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrafficPolicyInstancesByHostedZone operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest list-traffic-policy-instances-by-hosted-zone-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrafficPolicyInstancesByHostedZoneAsync list-traffic-policy-instances-by-hosted-zone-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest list-traffic-policy-instances-by-hosted-zone-request]
    (-> this (.listTrafficPolicyInstancesByHostedZoneAsync list-traffic-policy-instances-by-hosted-zone-request))))

(defn get-traffic-policy-instance-async
  "Gets information about a specified traffic policy instance.



   After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance
   request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
   traffic policy definition. For more information, see the State response element.



   In the Route 53 console, traffic policy instances are known as policy records.

  get-traffic-policy-instance-request - Gets information about a specified traffic policy instance. - `com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTrafficPolicyInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetTrafficPolicyInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest get-traffic-policy-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTrafficPolicyInstanceAsync get-traffic-policy-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest get-traffic-policy-instance-request]
    (-> this (.getTrafficPolicyInstanceAsync get-traffic-policy-instance-request))))

(defn update-traffic-policy-comment-async
  "Updates the comment for a specified traffic policy version.

  update-traffic-policy-comment-request - A complex type that contains information about the traffic policy that you want to update the comment for. - `com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTrafficPolicyComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest update-traffic-policy-comment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTrafficPolicyCommentAsync update-traffic-policy-comment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest update-traffic-policy-comment-request]
    (-> this (.updateTrafficPolicyCommentAsync update-traffic-policy-comment-request))))

(defn list-tags-for-resource-async
  "Lists tags for one health check or hosted zone.


   For information about using tags for cost allocation, see Using Cost Allocation
   Tags in the AWS Billing and Cost Management User Guide.

  list-tags-for-resource-request - A complex type containing information about a request for a list of the tags that are associated with an individual resource. - `com.amazonaws.services.route53.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn list-vpc-association-authorizations-async
  "Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted
   zone because you've submitted one or more CreateVPCAssociationAuthorization requests.


   The response includes a VPCs element with a VPC child element for each VPC that can be
   associated with the hosted zone.

  list-vpc-association-authorizations-request - A complex type that contains information about that can be associated with your hosted zone. - `com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVPCAssociationAuthorizations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest list-vpc-association-authorizations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVPCAssociationAuthorizationsAsync list-vpc-association-authorizations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest list-vpc-association-authorizations-request]
    (-> this (.listVPCAssociationAuthorizationsAsync list-vpc-association-authorizations-request))))

(defn update-traffic-policy-instance-async
  "Updates the resource record sets in a specified hosted zone that were created based on the settings in a
   specified traffic policy version.


   When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root
   resource record set name (such as example.com) while it replaces one group of resource record sets with another.
   Route 53 performs the following operations:




   Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true
   regardless of how significant the differences are between the existing resource record sets and the new resource
   record sets.




   When all of the new resource record sets have been created, Route 53 starts to respond to DNS queries for the
   root resource record set name (such as example.com) by using the new resource record sets.




   Route 53 deletes the old group of resource record sets that are associated with the root resource record set
   name.

  update-traffic-policy-instance-request - A complex type that contains information about the resource record sets that you want to update based on a specified traffic policy instance. - `com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTrafficPolicyInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest update-traffic-policy-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTrafficPolicyInstanceAsync update-traffic-policy-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest update-traffic-policy-instance-request]
    (-> this (.updateTrafficPolicyInstanceAsync update-traffic-policy-instance-request))))

(defn update-health-check-async
  "Updates an existing health check. Note that some values can't be updated.


   For more information about updating health checks, see Creating,
   Updating, and Deleting Health Checks in the Amazon Route 53 Developer Guide.

  update-health-check-request - A complex type that contains information about a request to update a health check. - `com.amazonaws.services.route53.model.UpdateHealthCheckRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateHealthCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.UpdateHealthCheckResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateHealthCheckRequest update-health-check-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateHealthCheckAsync update-health-check-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateHealthCheckRequest update-health-check-request]
    (-> this (.updateHealthCheckAsync update-health-check-request))))

(defn list-traffic-policy-instances-by-policy-async
  "Gets information about the traffic policy instances that you created by using a specify traffic policy version.



   After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance
   request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
   traffic policy definition. For more information, see the State response element.



   Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
   use the MaxItems parameter to list them in groups of up to 100.

  list-traffic-policy-instances-by-policy-request - A complex type that contains the information about the request to list your traffic policy instances. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrafficPolicyInstancesByPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest list-traffic-policy-instances-by-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrafficPolicyInstancesByPolicyAsync list-traffic-policy-instances-by-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest list-traffic-policy-instances-by-policy-request]
    (-> this (.listTrafficPolicyInstancesByPolicyAsync list-traffic-policy-instances-by-policy-request))))

(defn create-query-logging-config-async
  "Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53
   begins to publish log data to an Amazon CloudWatch Logs log group.


   DNS query logs contain information about the queries that Route 53 receives for a specified public hosted zone,
   such as the following:




   Route 53 edge location that responded to the DNS query




   Domain or subdomain that was requested




   DNS record type, such as A or AAAA




   DNS response code, such as NoError or ServFail




   Log Group and Resource Policy


   Before you create a query logging configuration, perform the following operations.



   If you create a query logging configuration using the Route 53 console, Route 53 performs these operations
   automatically.





   Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you create a query logging
   configuration. Note the following:




   You must create the log group in the us-east-1 region.




   You must use the same AWS account to create the log group and the hosted zone that you want to configure query
   logging for.




   When you create log groups for query logging, we recommend that you use a consistent prefix, for example:


   /aws/route53/hosted zone name


   In the next step, you'll create a resource policy, which controls access to one or more log groups and the
   associated AWS resources, such as Route 53 hosted zones. There's a limit on the number of resource policies that
   you can create, so we recommend that you use a consistent prefix so you can use the same resource policy for all
   the log groups that you create for query logging.






   Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to create log streams
   and to send query logs to log streams. For the value of Resource, specify the ARN for the log group
   that you created in the previous step. To use the same resource policy for all the CloudWatch Logs log groups
   that you created for query logging configurations, replace the hosted zone name with *, for example:


   arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/*



   You can't use the CloudWatch console to create or edit a resource policy. You must use the CloudWatch API, one of
   the AWS SDKs, or the AWS CLI.




   Log Streams and Edge Locations


   When Route 53 finishes creating the configuration for DNS query logging, it does the following:




   Creates a log stream for an edge location the first time that the edge location responds to DNS queries for the
   specified hosted zone. That log stream is used to log all queries that Route 53 responds to for that edge
   location.




   Begins to send query logs to the applicable log stream.




   The name of each log stream is in the following format:


    hosted zone ID/edge location code


   The edge location code is a three-letter code and an arbitrarily assigned number, for example, DFW3. The
   three-letter code typically corresponds with the International Air Transport Association airport code for an
   airport near the edge location. (These abbreviations might change in the future.) For a list of edge locations,
   see \"The Route 53 Global Network\" on the Route 53 Product
   Details page.


   Queries That Are Logged


   Query logs contain only the queries that DNS resolvers forward to Route 53. If a DNS resolver has already cached
   the response to a query (such as the IP address for a load balancer for example.com), the resolver will continue
   to return the cached response. It doesn't forward another query to Route 53 until the TTL for the corresponding
   resource record set expires. Depending on how many DNS queries are submitted for a resource record set, and
   depending on the TTL for that resource record set, query logs might contain information about only one query out
   of every several thousand queries that are submitted to DNS. For more information about how DNS works, see Routing Internet
   Traffic to Your Website or Web Application in the Amazon Route 53 Developer Guide.


   Log File Format


   For a list of the values in each query log and the format of each value, see Logging DNS Queries in the
   Amazon Route 53 Developer Guide.


   Pricing


   For information about charges for query logs, see Amazon
   CloudWatch Pricing.


   How to Stop Logging


   If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the query logging configuration. For
   more information, see DeleteQueryLoggingConfig.

  create-query-logging-config-request - `com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateQueryLoggingConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateQueryLoggingConfigResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest create-query-logging-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createQueryLoggingConfigAsync create-query-logging-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest create-query-logging-config-request]
    (-> this (.createQueryLoggingConfigAsync create-query-logging-config-request))))

(defn delete-reusable-delegation-set-async
  "Deletes a reusable delegation set.



   You can delete a reusable delegation set only if it isn't associated with any hosted zones.



   To verify that the reusable delegation set is not associated with any hosted zones, submit a GetReusableDelegationSet request and specify the ID of the reusable delegation set that you want to delete.

  delete-reusable-delegation-set-request - A request to delete a reusable delegation set. - `com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReusableDelegationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteReusableDelegationSetResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest delete-reusable-delegation-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReusableDelegationSetAsync delete-reusable-delegation-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest delete-reusable-delegation-set-request]
    (-> this (.deleteReusableDelegationSetAsync delete-reusable-delegation-set-request))))

(defn get-hosted-zone-async
  "Gets information about a specified hosted zone including the four name servers assigned to the hosted zone.

  get-hosted-zone-request - A request to get information about a specified hosted zone. - `com.amazonaws.services.route53.model.GetHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHostedZone operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHostedZoneResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneRequest get-hosted-zone-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHostedZoneAsync get-hosted-zone-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneRequest get-hosted-zone-request]
    (-> this (.getHostedZoneAsync get-hosted-zone-request))))

(defn get-change-async
  "Returns the current status of a change batch request. The status is one of the following values:




   PENDING indicates that the changes in this request have not propagated to all Amazon Route 53 DNS
   servers. This is the initial status of all change batch requests.




   INSYNC indicates that the changes have propagated to all Route 53 DNS servers.

  get-change-request - The input for a GetChange request. - `com.amazonaws.services.route53.model.GetChangeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetChange operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetChangeResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetChangeRequest get-change-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getChangeAsync get-change-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetChangeRequest get-change-request]
    (-> this (.getChangeAsync get-change-request))))

(defn get-health-check-status-async
  "Gets status of a specified health check.

  get-health-check-status-request - A request to get the status for a health check. - `com.amazonaws.services.route53.model.GetHealthCheckStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHealthCheckStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHealthCheckStatusResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckStatusRequest get-health-check-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHealthCheckStatusAsync get-health-check-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckStatusRequest get-health-check-status-request]
    (-> this (.getHealthCheckStatusAsync get-health-check-status-request))))

(defn delete-hosted-zone-async
  "Deletes a hosted zone.


   If the hosted zone was created by another service, such as AWS Cloud Map, see Deleting Public Hosted Zones That Were Created by Another Service in the Amazon Route 53 Developer
   Guide for information about how to delete it. (The process is the same for public and private hosted zones
   that were created by another service.)


   If you want to keep your domain registration but you want to stop routing internet traffic to your website or web
   application, we recommend that you delete resource record sets in the hosted zone instead of deleting the hosted
   zone.



   If you delete a hosted zone, you can't undelete it. You must create a new hosted zone and update the name servers
   for your domain registration, which can require up to 48 hours to take effect. (If you delegated responsibility
   for a subdomain to a hosted zone and you delete the child hosted zone, you must update the name servers in the
   parent hosted zone.) In addition, if you delete a hosted zone, someone could hijack the domain and route traffic
   to their own resources using your domain name.



   If you want to avoid the monthly charge for the hosted zone, you can transfer DNS service for the domain to a
   free DNS service. When you transfer DNS service, you have to update the name servers for the domain registration.
   If the domain is registered with Route 53, see UpdateDomainNameservers for information about how to replace Route 53 name servers with name servers for the
   new DNS service. If the domain is registered with another registrar, use the method provided by the registrar to
   update name servers for the domain registration. For more information, perform an internet search on
   \"free DNS service.\"


   You can delete a hosted zone only if it contains only the default SOA record and NS resource record sets. If the
   hosted zone contains other resource record sets, you must delete them before you can delete the hosted zone. If
   you try to delete a hosted zone that contains other resource record sets, the request fails, and Route 53 returns
   a HostedZoneNotEmpty error. For information about deleting records from your hosted zone, see
   ChangeResourceRecordSets.


   To verify that the hosted zone has been deleted, do one of the following:




   Use the GetHostedZone action to request information about the hosted zone.




   Use the ListHostedZones action to get a list of the hosted zones associated with the current AWS
   account.

  delete-hosted-zone-request - A request to delete a hosted zone. - `com.amazonaws.services.route53.model.DeleteHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHostedZone operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteHostedZoneResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteHostedZoneRequest delete-hosted-zone-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHostedZoneAsync delete-hosted-zone-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteHostedZoneRequest delete-hosted-zone-request]
    (-> this (.deleteHostedZoneAsync delete-hosted-zone-request))))

(defn list-traffic-policy-instances-async
  "Gets information about the traffic policy instances that you created by using the current AWS account.



   After you submit an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53
   creates the resource record sets that are specified in the traffic policy definition. For more information, see
   the State response element.



   Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
   use the MaxItems parameter to list them in groups of up to 100.

  list-traffic-policy-instances-request - A request to get information about the traffic policy instances that you created by using the current AWS account. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrafficPolicyInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTrafficPolicyInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest list-traffic-policy-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrafficPolicyInstancesAsync list-traffic-policy-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest list-traffic-policy-instances-request]
    (-> this (.listTrafficPolicyInstancesAsync list-traffic-policy-instances-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.listTrafficPolicyInstancesAsync))))

(defn get-account-limit-async
  "Gets the specified limit for the current account, for example, the maximum number of health checks that you can
   create using the account.


   For the default limit, see Limits in the Amazon
   Route 53 Developer Guide. To request a higher limit, open a case.



   You can also view account limits in AWS Trusted Advisor. Sign in to the AWS Management Console and open the
   Trusted Advisor console at https://console.aws.amazon.com/trustedadvisor/. Then
   choose Service limits in the navigation pane.

  get-account-limit-request - A complex type that contains information about the request to create a hosted zone. - `com.amazonaws.services.route53.model.GetAccountLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountLimit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetAccountLimitResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetAccountLimitRequest get-account-limit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountLimitAsync get-account-limit-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetAccountLimitRequest get-account-limit-request]
    (-> this (.getAccountLimitAsync get-account-limit-request))))

(defn delete-traffic-policy-instance-async
  "Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you
   created the instance.



   In the Route 53 console, traffic policy instances are known as policy records.

  delete-traffic-policy-instance-request - A request to delete a specified traffic policy instance. - `com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficPolicyInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest delete-traffic-policy-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficPolicyInstanceAsync delete-traffic-policy-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest delete-traffic-policy-instance-request]
    (-> this (.deleteTrafficPolicyInstanceAsync delete-traffic-policy-instance-request))))

(defn list-query-logging-configs-async
  "Lists the configurations for DNS query logging that are associated with the current AWS account or the
   configuration that is associated with a specified hosted zone.


   For more information about DNS query logs, see CreateQueryLoggingConfig. Additional information, including the format of DNS query logs, appears in Logging DNS Queries in the
   Amazon Route 53 Developer Guide.

  list-query-logging-configs-request - `com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQueryLoggingConfigs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListQueryLoggingConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest list-query-logging-configs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQueryLoggingConfigsAsync list-query-logging-configs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest list-query-logging-configs-request]
    (-> this (.listQueryLoggingConfigsAsync list-query-logging-configs-request))))

(defn delete-health-check-async
  "Deletes a health check.



   Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one
   or more resource record sets. If you delete a health check and you don't update the associated resource record
   sets, the future status of the health check can't be predicted and may change. This will affect the routing of
   DNS queries for your DNS failover configuration. For more information, see Replacing and Deleting Health Checks in the Amazon Route 53 Developer Guide.

  delete-health-check-request - This action deletes a health check. - `com.amazonaws.services.route53.model.DeleteHealthCheckRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHealthCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteHealthCheckResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteHealthCheckRequest delete-health-check-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHealthCheckAsync delete-health-check-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteHealthCheckRequest delete-health-check-request]
    (-> this (.deleteHealthCheckAsync delete-health-check-request))))

(defn get-reusable-delegation-set-limit-async
  "Gets the maximum number of hosted zones that you can associate with the specified reusable delegation set.


   For the default limit, see Limits in the Amazon
   Route 53 Developer Guide. To request a higher limit, open a case.

  get-reusable-delegation-set-limit-request - A complex type that contains information about the request to create a hosted zone. - `com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReusableDelegationSetLimit operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetReusableDelegationSetLimitResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest get-reusable-delegation-set-limit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReusableDelegationSetLimitAsync get-reusable-delegation-set-limit-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest get-reusable-delegation-set-limit-request]
    (-> this (.getReusableDelegationSetLimitAsync get-reusable-delegation-set-limit-request))))

(defn get-health-check-count-async
  "Retrieves the number of health checks that are associated with the current AWS account.

  get-health-check-count-request - A request for the number of health checks that are associated with the current AWS account. - `com.amazonaws.services.route53.model.GetHealthCheckCountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHealthCheckCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHealthCheckCountResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckCountRequest get-health-check-count-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHealthCheckCountAsync get-health-check-count-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckCountRequest get-health-check-count-request]
    (-> this (.getHealthCheckCountAsync get-health-check-count-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.getHealthCheckCountAsync))))

(defn get-hosted-zone-count-async
  "Retrieves the number of hosted zones that are associated with the current AWS account.

  get-hosted-zone-count-request - A request to retrieve a count of all the hosted zones that are associated with the current AWS account. - `com.amazonaws.services.route53.model.GetHostedZoneCountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHostedZoneCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHostedZoneCountResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneCountRequest get-hosted-zone-count-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHostedZoneCountAsync get-hosted-zone-count-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneCountRequest get-hosted-zone-count-request]
    (-> this (.getHostedZoneCountAsync get-hosted-zone-count-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.getHostedZoneCountAsync))))

(defn list-hosted-zones-by-name-async
  "Retrieves a list of your hosted zones in lexicographic order. The response includes a HostedZones
   child element for each hosted zone created by the current AWS account.


   ListHostedZonesByName sorts hosted zones by name with the labels reversed. For example:


   com.example.www.


   Note the trailing dot, which can change the sort order in some circumstances.


   If the domain name includes escape characters or Punycode, ListHostedZonesByName alphabetizes the
   domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database.
   For example, to create a hosted zone for exämple.com, you specify ex\\344mple.com for the domain name.
   ListHostedZonesByName alphabetizes it as:


   com.ex\\344mple.


   The labels are reversed and alphabetized using the escaped value. For more information about valid domain name
   formats, including internationalized domain names, see DNS Domain Name Format
   in the Amazon Route 53 Developer Guide.


   Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the
   MaxItems parameter to list them in groups of up to 100. The response includes values that help
   navigate from one group of MaxItems hosted zones to the next:




   The DNSName and HostedZoneId elements in the response contain the values, if any,
   specified for the dnsname and hostedzoneid parameters in the request that produced the
   current response.




   The MaxItems element in the response contains the value, if any, that you specified for the
   maxitems parameter in the request that produced the current response.




   If the value of IsTruncated in the response is true, there are more hosted zones associated with the
   current AWS account.


   If IsTruncated is false, this response includes the last hosted zone that is associated with the
   current account. The NextDNSName element and NextHostedZoneId elements are omitted from
   the response.




   The NextDNSName and NextHostedZoneId elements in the response contain the domain name
   and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to
   list more hosted zones, make another call to ListHostedZonesByName, and specify the value of
   NextDNSName and NextHostedZoneId in the dnsname and
   hostedzoneid parameters, respectively.

  list-hosted-zones-by-name-request - Retrieves a list of the public and private hosted zones that are associated with the current AWS account in ASCII order by domain name. - `com.amazonaws.services.route53.model.ListHostedZonesByNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHostedZonesByName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListHostedZonesByNameResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHostedZonesByNameRequest list-hosted-zones-by-name-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHostedZonesByNameAsync list-hosted-zones-by-name-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHostedZonesByNameRequest list-hosted-zones-by-name-request]
    (-> this (.listHostedZonesByNameAsync list-hosted-zones-by-name-request)))
  (^java.util.concurrent.Future [^AmazonRoute53Async this]
    (-> this (.listHostedZonesByNameAsync))))

