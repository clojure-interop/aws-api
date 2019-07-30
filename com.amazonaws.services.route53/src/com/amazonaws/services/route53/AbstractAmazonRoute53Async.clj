(ns com.amazonaws.services.route53.AbstractAmazonRoute53Async
  "Abstract implementation of AmazonRoute53Async. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53 AbstractAmazonRoute53Async]))

(defn delete-query-logging-config-async
  "Description copied from interface: AmazonRoute53Async

  request - `com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteQueryLoggingConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteQueryLoggingConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteQueryLoggingConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest request]
    (-> this (.deleteQueryLoggingConfigAsync request))))

(defn change-tags-for-resource-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the tags that you want to add, edit, or delete. - `com.amazonaws.services.route53.model.ChangeTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ChangeTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ChangeTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ChangeTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ChangeTagsForResourceRequest request]
    (-> this (.changeTagsForResourceAsync request))))

(defn change-resource-record-sets-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains change information for the resource record set. - `com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ChangeResourceRecordSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ChangeResourceRecordSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeResourceRecordSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest request]
    (-> this (.changeResourceRecordSetsAsync request))))

(defn create-reusable-delegation-set-async
  "Description copied from interface: AmazonRoute53Async

  request - `com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReusableDelegationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateReusableDelegationSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReusableDelegationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest request]
    (-> this (.createReusableDelegationSetAsync request))))

(defn get-health-check-last-failure-reason-async
  "Description copied from interface: AmazonRoute53Async

  request - A request for the reason that a health check failed most recently. - `com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHealthCheckLastFailureReason operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHealthCheckLastFailureReasonAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest request]
    (-> this (.getHealthCheckLastFailureReasonAsync request))))

(defn associate-vpc-with-hosted-zone-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the request to associate a VPC with a private hosted zone. - `com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateVPCWithHostedZone operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateVPCWithHostedZoneAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest request]
    (-> this (.associateVPCWithHostedZoneAsync request))))

(defn test-dns-answer-async
  "Description copied from interface: AmazonRoute53Async

  request - Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask. - `com.amazonaws.services.route53.model.TestDNSAnswerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestDNSAnswer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.TestDNSAnswerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.TestDNSAnswerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testDNSAnswerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.TestDNSAnswerRequest request]
    (-> this (.testDNSAnswerAsync request))))

(defn create-traffic-policy-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the traffic policy that you want to create. - `com.amazonaws.services.route53.model.CreateTrafficPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateTrafficPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyRequest request]
    (-> this (.createTrafficPolicyAsync request))))

(defn disassociate-vpc-from-hosted-zone-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the VPC that you want to disassociate from a specified private hosted zone. - `com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateVPCFromHostedZone operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateVPCFromHostedZoneAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest request]
    (-> this (.disassociateVPCFromHostedZoneAsync request))))

(defn delete-traffic-policy-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to delete a specified traffic policy version. - `com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteTrafficPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest request]
    (-> this (.deleteTrafficPolicyAsync request))))

(defn get-traffic-policy-instance-count-async
  "Description copied from interface: AmazonRoute53Async

  request - Request to get the number of traffic policy instances that are associated with the current AWS account. - `com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTrafficPolicyInstanceCount operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTrafficPolicyInstanceCountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest request]
    (-> this (.getTrafficPolicyInstanceCountAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.getTrafficPolicyInstanceCountAsync))))

(defn get-checker-ip-ranges-async
  "Description copied from interface: AmazonRoute53Async

  request - Empty request. - `com.amazonaws.services.route53.model.GetCheckerIpRangesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCheckerIpRanges operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetCheckerIpRangesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetCheckerIpRangesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCheckerIpRangesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetCheckerIpRangesRequest request]
    (-> this (.getCheckerIpRangesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.getCheckerIpRangesAsync))))

(defn create-vpc-association-authorization-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the request to authorize associating a VPC with your private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by using different accounts. - `com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVPCAssociationAuthorization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVPCAssociationAuthorizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest request]
    (-> this (.createVPCAssociationAuthorizationAsync request))))

(defn create-hosted-zone-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the request to create a public or private hosted zone. - `com.amazonaws.services.route53.model.CreateHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHostedZone operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateHostedZoneResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateHostedZoneRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHostedZoneAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateHostedZoneRequest request]
    (-> this (.createHostedZoneAsync request))))

(defn list-health-checks-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to retrieve a list of the health checks that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListHealthChecksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHealthChecks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListHealthChecksResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHealthChecksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHealthChecksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHealthChecksRequest request]
    (-> this (.listHealthChecksAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.listHealthChecksAsync))))

(defn create-health-check-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains the health check request information. - `com.amazonaws.services.route53.model.CreateHealthCheckRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHealthCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateHealthCheckResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateHealthCheckRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHealthCheckAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateHealthCheckRequest request]
    (-> this (.createHealthCheckAsync request))))

(defn get-query-logging-config-async
  "Description copied from interface: AmazonRoute53Async

  request - `com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueryLoggingConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetQueryLoggingConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueryLoggingConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest request]
    (-> this (.getQueryLoggingConfigAsync request))))

(defn update-hosted-zone-comment-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to update the comment for a hosted zone. - `com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateHostedZoneComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.UpdateHostedZoneCommentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateHostedZoneCommentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest request]
    (-> this (.updateHostedZoneCommentAsync request))))

(defn get-hosted-zone-limit-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the request to create a hosted zone. - `com.amazonaws.services.route53.model.GetHostedZoneLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHostedZoneLimit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHostedZoneLimitResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneLimitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHostedZoneLimitAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneLimitRequest request]
    (-> this (.getHostedZoneLimitAsync request))))

(defn delete-vpc-association-authorization-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the request to remove authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account. - `com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVPCAssociationAuthorization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVPCAssociationAuthorizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest request]
    (-> this (.deleteVPCAssociationAuthorizationAsync request))))

(defn get-geo-location-async
  "Description copied from interface: AmazonRoute53Async

  request - A request for information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets. - `com.amazonaws.services.route53.model.GetGeoLocationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGeoLocation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetGeoLocationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetGeoLocationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGeoLocationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetGeoLocationRequest request]
    (-> this (.getGeoLocationAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.getGeoLocationAsync))))

(defn get-health-check-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to get information about a specified health check. - `com.amazonaws.services.route53.model.GetHealthCheckRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHealthCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHealthCheckResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHealthCheckAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckRequest request]
    (-> this (.getHealthCheckAsync request))))

(defn list-hosted-zones-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to retrieve a list of the public and private hosted zones that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListHostedZonesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHostedZones operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListHostedZonesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHostedZonesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHostedZonesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHostedZonesRequest request]
    (-> this (.listHostedZonesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.listHostedZonesAsync))))

(defn list-tags-for-resources-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the health checks or hosted zones for which you want to list tags. - `com.amazonaws.services.route53.model.ListTagsForResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTagsForResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTagsForResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTagsForResourcesRequest request]
    (-> this (.listTagsForResourcesAsync request))))

(defn list-traffic-policies-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains the information about the request to list the traffic policies that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListTrafficPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrafficPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTrafficPoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrafficPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPoliciesRequest request]
    (-> this (.listTrafficPoliciesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.listTrafficPoliciesAsync))))

(defn get-traffic-policy-async
  "Description copied from interface: AmazonRoute53Async

  request - Gets information about a specific traffic policy version. - `com.amazonaws.services.route53.model.GetTrafficPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTrafficPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetTrafficPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTrafficPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyRequest request]
    (-> this (.getTrafficPolicyAsync request))))

(defn list-resource-record-sets-async
  "Description copied from interface: AmazonRoute53Async

  request - A request for the resource record sets that are associated with a specified hosted zone. - `com.amazonaws.services.route53.model.ListResourceRecordSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceRecordSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListResourceRecordSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListResourceRecordSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceRecordSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListResourceRecordSetsRequest request]
    (-> this (.listResourceRecordSetsAsync request))))

(defn list-reusable-delegation-sets-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to get a list of the reusable delegation sets that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListReusableDelegationSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListReusableDelegationSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listReusableDelegationSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest request]
    (-> this (.listReusableDelegationSetsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.listReusableDelegationSetsAsync))))

(defn get-reusable-delegation-set-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to get information about a specified reusable delegation set. - `com.amazonaws.services.route53.model.GetReusableDelegationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReusableDelegationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetReusableDelegationSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetReusableDelegationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReusableDelegationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetReusableDelegationSetRequest request]
    (-> this (.getReusableDelegationSetAsync request))))

(defn create-traffic-policy-version-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the traffic policy that you want to create a new version for. - `com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficPolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateTrafficPolicyVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficPolicyVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest request]
    (-> this (.createTrafficPolicyVersionAsync request))))

(defn list-traffic-policy-versions-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains the information about the request to list your traffic policies. - `com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrafficPolicyVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTrafficPolicyVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrafficPolicyVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest request]
    (-> this (.listTrafficPolicyVersionsAsync request))))

(defn create-traffic-policy-instance-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the resource record sets that you want to create based on a specified traffic policy. - `com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficPolicyInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficPolicyInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest request]
    (-> this (.createTrafficPolicyInstanceAsync request))))

(defn list-geo-locations-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to get a list of geographic locations that Amazon Route 53 supports for geolocation resource record sets. - `com.amazonaws.services.route53.model.ListGeoLocationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGeoLocations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListGeoLocationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListGeoLocationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGeoLocationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListGeoLocationsRequest request]
    (-> this (.listGeoLocationsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.listGeoLocationsAsync))))

(defn list-traffic-policy-instances-by-hosted-zone-async
  "Description copied from interface: AmazonRoute53Async

  request - A request for the traffic policy instances that you created in a specified hosted zone. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrafficPolicyInstancesByHostedZone operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrafficPolicyInstancesByHostedZoneAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest request]
    (-> this (.listTrafficPolicyInstancesByHostedZoneAsync request))))

(defn get-traffic-policy-instance-async
  "Description copied from interface: AmazonRoute53Async

  request - Gets information about a specified traffic policy instance. - `com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTrafficPolicyInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetTrafficPolicyInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTrafficPolicyInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest request]
    (-> this (.getTrafficPolicyInstanceAsync request))))

(defn update-traffic-policy-comment-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the traffic policy that you want to update the comment for. - `com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTrafficPolicyComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTrafficPolicyCommentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest request]
    (-> this (.updateTrafficPolicyCommentAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type containing information about a request for a list of the tags that are associated with an individual resource. - `com.amazonaws.services.route53.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn list-vpc-association-authorizations-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about that can be associated with your hosted zone. - `com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVPCAssociationAuthorizations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVPCAssociationAuthorizationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest request]
    (-> this (.listVPCAssociationAuthorizationsAsync request))))

(defn update-traffic-policy-instance-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the resource record sets that you want to update based on a specified traffic policy instance. - `com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTrafficPolicyInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTrafficPolicyInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest request]
    (-> this (.updateTrafficPolicyInstanceAsync request))))

(defn update-health-check-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about a request to update a health check. - `com.amazonaws.services.route53.model.UpdateHealthCheckRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateHealthCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.UpdateHealthCheckResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateHealthCheckRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateHealthCheckAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.UpdateHealthCheckRequest request]
    (-> this (.updateHealthCheckAsync request))))

(defn list-traffic-policy-instances-by-policy-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains the information about the request to list your traffic policy instances. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrafficPolicyInstancesByPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrafficPolicyInstancesByPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest request]
    (-> this (.listTrafficPolicyInstancesByPolicyAsync request))))

(defn create-query-logging-config-async
  "Description copied from interface: AmazonRoute53Async

  request - `com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateQueryLoggingConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.CreateQueryLoggingConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createQueryLoggingConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest request]
    (-> this (.createQueryLoggingConfigAsync request))))

(defn delete-reusable-delegation-set-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to delete a reusable delegation set. - `com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReusableDelegationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteReusableDelegationSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReusableDelegationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest request]
    (-> this (.deleteReusableDelegationSetAsync request))))

(defn get-hosted-zone-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to get information about a specified hosted zone. - `com.amazonaws.services.route53.model.GetHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHostedZone operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHostedZoneResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHostedZoneAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneRequest request]
    (-> this (.getHostedZoneAsync request))))

(defn get-change-async
  "Description copied from interface: AmazonRoute53Async

  request - The input for a GetChange request. - `com.amazonaws.services.route53.model.GetChangeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetChange operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetChangeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetChangeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getChangeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetChangeRequest request]
    (-> this (.getChangeAsync request))))

(defn get-health-check-status-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to get the status for a health check. - `com.amazonaws.services.route53.model.GetHealthCheckStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHealthCheckStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHealthCheckStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHealthCheckStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckStatusRequest request]
    (-> this (.getHealthCheckStatusAsync request))))

(defn delete-hosted-zone-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to delete a hosted zone. - `com.amazonaws.services.route53.model.DeleteHostedZoneRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHostedZone operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteHostedZoneResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteHostedZoneRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHostedZoneAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteHostedZoneRequest request]
    (-> this (.deleteHostedZoneAsync request))))

(defn list-traffic-policy-instances-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to get information about the traffic policy instances that you created by using the current AWS account. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrafficPolicyInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListTrafficPolicyInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrafficPolicyInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest request]
    (-> this (.listTrafficPolicyInstancesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.listTrafficPolicyInstancesAsync))))

(defn get-account-limit-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the request to create a hosted zone. - `com.amazonaws.services.route53.model.GetAccountLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountLimit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetAccountLimitResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetAccountLimitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountLimitAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetAccountLimitRequest request]
    (-> this (.getAccountLimitAsync request))))

(defn delete-traffic-policy-instance-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to delete a specified traffic policy instance. - `com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficPolicyInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficPolicyInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest request]
    (-> this (.deleteTrafficPolicyInstanceAsync request))))

(defn list-query-logging-configs-async
  "Description copied from interface: AmazonRoute53Async

  request - `com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQueryLoggingConfigs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListQueryLoggingConfigsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQueryLoggingConfigsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest request]
    (-> this (.listQueryLoggingConfigsAsync request))))

(defn delete-health-check-async
  "Description copied from interface: AmazonRoute53Async

  request - This action deletes a health check. - `com.amazonaws.services.route53.model.DeleteHealthCheckRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHealthCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.DeleteHealthCheckResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteHealthCheckRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHealthCheckAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.DeleteHealthCheckRequest request]
    (-> this (.deleteHealthCheckAsync request))))

(defn get-reusable-delegation-set-limit-async
  "Description copied from interface: AmazonRoute53Async

  request - A complex type that contains information about the request to create a hosted zone. - `com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReusableDelegationSetLimit operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetReusableDelegationSetLimitResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReusableDelegationSetLimitAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest request]
    (-> this (.getReusableDelegationSetLimitAsync request))))

(defn get-health-check-count-async
  "Description copied from interface: AmazonRoute53Async

  request - A request for the number of health checks that are associated with the current AWS account. - `com.amazonaws.services.route53.model.GetHealthCheckCountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHealthCheckCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHealthCheckCountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckCountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHealthCheckCountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHealthCheckCountRequest request]
    (-> this (.getHealthCheckCountAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.getHealthCheckCountAsync))))

(defn get-hosted-zone-count-async
  "Description copied from interface: AmazonRoute53Async

  request - A request to retrieve a count of all the hosted zones that are associated with the current AWS account. - `com.amazonaws.services.route53.model.GetHostedZoneCountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHostedZoneCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.GetHostedZoneCountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneCountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHostedZoneCountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.GetHostedZoneCountRequest request]
    (-> this (.getHostedZoneCountAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.getHostedZoneCountAsync))))

(defn list-hosted-zones-by-name-async
  "Description copied from interface: AmazonRoute53Async

  request - Retrieves a list of the public and private hosted zones that are associated with the current AWS account in ASCII order by domain name. - `com.amazonaws.services.route53.model.ListHostedZonesByNameRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHostedZonesByName operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53.model.ListHostedZonesByNameResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHostedZonesByNameRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHostedZonesByNameAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this ^com.amazonaws.services.route53.model.ListHostedZonesByNameRequest request]
    (-> this (.listHostedZonesByNameAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53Async this]
    (-> this (.listHostedZonesByNameAsync))))

