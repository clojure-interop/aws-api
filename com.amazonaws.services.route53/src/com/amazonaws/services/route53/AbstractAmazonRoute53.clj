(ns com.amazonaws.services.route53.AbstractAmazonRoute53
  "Abstract implementation of AmazonRoute53. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53 AbstractAmazonRoute53]))

(defn change-resource-record-sets
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains change information for the resource record set. - `com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest`

  returns: Result of the ChangeResourceRecordSets operation returned by the service. - `com.amazonaws.services.route53.model.ChangeResourceRecordSetsResult`"
  (^com.amazonaws.services.route53.model.ChangeResourceRecordSetsResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest request]
    (-> this (.changeResourceRecordSets request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonRoute53

  request - A complex type containing information about a request for a list of the tags that are associated with an individual resource. - `com.amazonaws.services.route53.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.route53.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.route53.model.ListTagsForResourceResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-geo-location
  "Description copied from interface: AmazonRoute53

  request - A request for information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets. - `com.amazonaws.services.route53.model.GetGeoLocationRequest`

  returns: Result of the GetGeoLocation operation returned by the service. - `com.amazonaws.services.route53.model.GetGeoLocationResult`"
  (^com.amazonaws.services.route53.model.GetGeoLocationResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetGeoLocationRequest request]
    (-> this (.getGeoLocation request)))
  (^com.amazonaws.services.route53.model.GetGeoLocationResult [^AbstractAmazonRoute53 this]
    (-> this (.getGeoLocation))))

(defn set-region
  "Description copied from interface: AmazonRoute53

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonRoute53 this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn associate-vpc-with-hosted-zone
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the request to associate a VPC with a private hosted zone. - `com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest`

  returns: Result of the AssociateVPCWithHostedZone operation returned by the service. - `com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneResult`"
  (^com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest request]
    (-> this (.associateVPCWithHostedZone request))))

(defn update-health-check
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about a request to update a health check. - `com.amazonaws.services.route53.model.UpdateHealthCheckRequest`

  returns: Result of the UpdateHealthCheck operation returned by the service. - `com.amazonaws.services.route53.model.UpdateHealthCheckResult`"
  (^com.amazonaws.services.route53.model.UpdateHealthCheckResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.UpdateHealthCheckRequest request]
    (-> this (.updateHealthCheck request))))

(defn get-health-check-status
  "Description copied from interface: AmazonRoute53

  request - A request to get the status for a health check. - `com.amazonaws.services.route53.model.GetHealthCheckStatusRequest`

  returns: Result of the GetHealthCheckStatus operation returned by the service. - `com.amazonaws.services.route53.model.GetHealthCheckStatusResult`"
  (^com.amazonaws.services.route53.model.GetHealthCheckStatusResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetHealthCheckStatusRequest request]
    (-> this (.getHealthCheckStatus request))))

(defn waiters
  "returns: `com.amazonaws.services.route53.waiters.AmazonRoute53Waiters`"
  (^com.amazonaws.services.route53.waiters.AmazonRoute53Waiters [^AbstractAmazonRoute53 this]
    (-> this (.waiters))))

(defn list-traffic-policy-instances
  "Description copied from interface: AmazonRoute53

  request - A request to get information about the traffic policy instances that you created by using the current AWS account. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest`

  returns: Result of the ListTrafficPolicyInstances operation returned by the service. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesResult`"
  (^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest request]
    (-> this (.listTrafficPolicyInstances request)))
  (^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesResult [^AbstractAmazonRoute53 this]
    (-> this (.listTrafficPolicyInstances))))

(defn list-traffic-policies
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains the information about the request to list the traffic policies that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListTrafficPoliciesRequest`

  returns: Result of the ListTrafficPolicies operation returned by the service. - `com.amazonaws.services.route53.model.ListTrafficPoliciesResult`"
  (^com.amazonaws.services.route53.model.ListTrafficPoliciesResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListTrafficPoliciesRequest request]
    (-> this (.listTrafficPolicies request)))
  (^com.amazonaws.services.route53.model.ListTrafficPoliciesResult [^AbstractAmazonRoute53 this]
    (-> this (.listTrafficPolicies))))

(defn list-traffic-policy-instances-by-hosted-zone
  "Description copied from interface: AmazonRoute53

  request - A request for the traffic policy instances that you created in a specified hosted zone. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest`

  returns: Result of the ListTrafficPolicyInstancesByHostedZone operation returned by the service. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneResult`"
  (^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest request]
    (-> this (.listTrafficPolicyInstancesByHostedZone request))))

(defn get-traffic-policy
  "Description copied from interface: AmazonRoute53

  request - Gets information about a specific traffic policy version. - `com.amazonaws.services.route53.model.GetTrafficPolicyRequest`

  returns: Result of the GetTrafficPolicy operation returned by the service. - `com.amazonaws.services.route53.model.GetTrafficPolicyResult`"
  (^com.amazonaws.services.route53.model.GetTrafficPolicyResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetTrafficPolicyRequest request]
    (-> this (.getTrafficPolicy request))))

(defn get-reusable-delegation-set-limit
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the request to create a hosted zone. - `com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest`

  returns: Result of the GetReusableDelegationSetLimit operation returned by the service. - `com.amazonaws.services.route53.model.GetReusableDelegationSetLimitResult`"
  (^com.amazonaws.services.route53.model.GetReusableDelegationSetLimitResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest request]
    (-> this (.getReusableDelegationSetLimit request))))

(defn get-hosted-zone-count
  "Description copied from interface: AmazonRoute53

  request - A request to retrieve a count of all the hosted zones that are associated with the current AWS account. - `com.amazonaws.services.route53.model.GetHostedZoneCountRequest`

  returns: Result of the GetHostedZoneCount operation returned by the service. - `com.amazonaws.services.route53.model.GetHostedZoneCountResult`"
  (^com.amazonaws.services.route53.model.GetHostedZoneCountResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetHostedZoneCountRequest request]
    (-> this (.getHostedZoneCount request)))
  (^com.amazonaws.services.route53.model.GetHostedZoneCountResult [^AbstractAmazonRoute53 this]
    (-> this (.getHostedZoneCount))))

(defn get-reusable-delegation-set
  "Description copied from interface: AmazonRoute53

  request - A request to get information about a specified reusable delegation set. - `com.amazonaws.services.route53.model.GetReusableDelegationSetRequest`

  returns: Result of the GetReusableDelegationSet operation returned by the service. - `com.amazonaws.services.route53.model.GetReusableDelegationSetResult`"
  (^com.amazonaws.services.route53.model.GetReusableDelegationSetResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetReusableDelegationSetRequest request]
    (-> this (.getReusableDelegationSet request))))

(defn create-vpc-association-authorization
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the request to authorize associating a VPC with your private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by using different accounts. - `com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest`

  returns: Result of the CreateVPCAssociationAuthorization operation returned by the service. - `com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationResult`"
  (^com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest request]
    (-> this (.createVPCAssociationAuthorization request))))

(defn list-traffic-policy-instances-by-policy
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains the information about the request to list your traffic policy instances. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest`

  returns: Result of the ListTrafficPolicyInstancesByPolicy operation returned by the service. - `com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyResult`"
  (^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest request]
    (-> this (.listTrafficPolicyInstancesByPolicy request))))

(defn get-traffic-policy-instance
  "Description copied from interface: AmazonRoute53

  request - Gets information about a specified traffic policy instance. - `com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest`

  returns: Result of the GetTrafficPolicyInstance operation returned by the service. - `com.amazonaws.services.route53.model.GetTrafficPolicyInstanceResult`"
  (^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest request]
    (-> this (.getTrafficPolicyInstance request))))

(defn get-health-check
  "Description copied from interface: AmazonRoute53

  request - A request to get information about a specified health check. - `com.amazonaws.services.route53.model.GetHealthCheckRequest`

  returns: Result of the GetHealthCheck operation returned by the service. - `com.amazonaws.services.route53.model.GetHealthCheckResult`"
  (^com.amazonaws.services.route53.model.GetHealthCheckResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetHealthCheckRequest request]
    (-> this (.getHealthCheck request))))

(defn list-vpc-association-authorizations
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about that can be associated with your hosted zone. - `com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest`

  returns: Result of the ListVPCAssociationAuthorizations operation returned by the service. - `com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsResult`"
  (^com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest request]
    (-> this (.listVPCAssociationAuthorizations request))))

(defn list-traffic-policy-versions
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains the information about the request to list your traffic policies. - `com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest`

  returns: Result of the ListTrafficPolicyVersions operation returned by the service. - `com.amazonaws.services.route53.model.ListTrafficPolicyVersionsResult`"
  (^com.amazonaws.services.route53.model.ListTrafficPolicyVersionsResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest request]
    (-> this (.listTrafficPolicyVersions request))))

(defn delete-traffic-policy-instance
  "Description copied from interface: AmazonRoute53

  request - A request to delete a specified traffic policy instance. - `com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest`

  returns: Result of the DeleteTrafficPolicyInstance operation returned by the service. - `com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceResult`"
  (^com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest request]
    (-> this (.deleteTrafficPolicyInstance request))))

(defn delete-health-check
  "Description copied from interface: AmazonRoute53

  request - This action deletes a health check. - `com.amazonaws.services.route53.model.DeleteHealthCheckRequest`

  returns: Result of the DeleteHealthCheck operation returned by the service. - `com.amazonaws.services.route53.model.DeleteHealthCheckResult`"
  (^com.amazonaws.services.route53.model.DeleteHealthCheckResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.DeleteHealthCheckRequest request]
    (-> this (.deleteHealthCheck request))))

(defn list-health-checks
  "Description copied from interface: AmazonRoute53

  request - A request to retrieve a list of the health checks that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListHealthChecksRequest`

  returns: Result of the ListHealthChecks operation returned by the service. - `com.amazonaws.services.route53.model.ListHealthChecksResult`"
  (^com.amazonaws.services.route53.model.ListHealthChecksResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListHealthChecksRequest request]
    (-> this (.listHealthChecks request)))
  (^com.amazonaws.services.route53.model.ListHealthChecksResult [^AbstractAmazonRoute53 this]
    (-> this (.listHealthChecks))))

(defn delete-query-logging-config
  "Description copied from interface: AmazonRoute53

  request - `com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest`

  returns: Result of the DeleteQueryLoggingConfig operation returned by the service. - `com.amazonaws.services.route53.model.DeleteQueryLoggingConfigResult`"
  (^com.amazonaws.services.route53.model.DeleteQueryLoggingConfigResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest request]
    (-> this (.deleteQueryLoggingConfig request))))

(defn create-traffic-policy
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the traffic policy that you want to create. - `com.amazonaws.services.route53.model.CreateTrafficPolicyRequest`

  returns: Result of the CreateTrafficPolicy operation returned by the service. - `com.amazonaws.services.route53.model.CreateTrafficPolicyResult`"
  (^com.amazonaws.services.route53.model.CreateTrafficPolicyResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.CreateTrafficPolicyRequest request]
    (-> this (.createTrafficPolicy request))))

(defn get-account-limit
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the request to create a hosted zone. - `com.amazonaws.services.route53.model.GetAccountLimitRequest`

  returns: Result of the GetAccountLimit operation returned by the service. - `com.amazonaws.services.route53.model.GetAccountLimitResult`"
  (^com.amazonaws.services.route53.model.GetAccountLimitResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetAccountLimitRequest request]
    (-> this (.getAccountLimit request))))

(defn test-dns-answer
  "Description copied from interface: AmazonRoute53

  request - Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask. - `com.amazonaws.services.route53.model.TestDNSAnswerRequest`

  returns: Result of the TestDNSAnswer operation returned by the service. - `com.amazonaws.services.route53.model.TestDNSAnswerResult`"
  (^com.amazonaws.services.route53.model.TestDNSAnswerResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.TestDNSAnswerRequest request]
    (-> this (.testDNSAnswer request))))

(defn shutdown
  "Description copied from interface: AmazonRoute53"
  ([^AbstractAmazonRoute53 this]
    (-> this (.shutdown))))

(defn create-traffic-policy-instance
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the resource record sets that you want to create based on a specified traffic policy. - `com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest`

  returns: Result of the CreateTrafficPolicyInstance operation returned by the service. - `com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceResult`"
  (^com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest request]
    (-> this (.createTrafficPolicyInstance request))))

(defn get-query-logging-config
  "Description copied from interface: AmazonRoute53

  request - `com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest`

  returns: Result of the GetQueryLoggingConfig operation returned by the service. - `com.amazonaws.services.route53.model.GetQueryLoggingConfigResult`"
  (^com.amazonaws.services.route53.model.GetQueryLoggingConfigResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest request]
    (-> this (.getQueryLoggingConfig request))))

(defn list-hosted-zones
  "Description copied from interface: AmazonRoute53

  request - A request to retrieve a list of the public and private hosted zones that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListHostedZonesRequest`

  returns: Result of the ListHostedZones operation returned by the service. - `com.amazonaws.services.route53.model.ListHostedZonesResult`"
  (^com.amazonaws.services.route53.model.ListHostedZonesResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListHostedZonesRequest request]
    (-> this (.listHostedZones request)))
  (^com.amazonaws.services.route53.model.ListHostedZonesResult [^AbstractAmazonRoute53 this]
    (-> this (.listHostedZones))))

(defn get-health-check-count
  "Description copied from interface: AmazonRoute53

  request - A request for the number of health checks that are associated with the current AWS account. - `com.amazonaws.services.route53.model.GetHealthCheckCountRequest`

  returns: Result of the GetHealthCheckCount operation returned by the service. - `com.amazonaws.services.route53.model.GetHealthCheckCountResult`"
  (^com.amazonaws.services.route53.model.GetHealthCheckCountResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetHealthCheckCountRequest request]
    (-> this (.getHealthCheckCount request)))
  (^com.amazonaws.services.route53.model.GetHealthCheckCountResult [^AbstractAmazonRoute53 this]
    (-> this (.getHealthCheckCount))))

(defn get-hosted-zone-limit
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the request to create a hosted zone. - `com.amazonaws.services.route53.model.GetHostedZoneLimitRequest`

  returns: Result of the GetHostedZoneLimit operation returned by the service. - `com.amazonaws.services.route53.model.GetHostedZoneLimitResult`"
  (^com.amazonaws.services.route53.model.GetHostedZoneLimitResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetHostedZoneLimitRequest request]
    (-> this (.getHostedZoneLimit request))))

(defn update-hosted-zone-comment
  "Description copied from interface: AmazonRoute53

  request - A request to update the comment for a hosted zone. - `com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest`

  returns: Result of the UpdateHostedZoneComment operation returned by the service. - `com.amazonaws.services.route53.model.UpdateHostedZoneCommentResult`"
  (^com.amazonaws.services.route53.model.UpdateHostedZoneCommentResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest request]
    (-> this (.updateHostedZoneComment request))))

(defn set-endpoint
  "Description copied from interface: AmazonRoute53

  endpoint - The endpoint (ex: \"route53.amazonaws.com\") or a full URL, including the protocol (ex: \"https://route53.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonRoute53 this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn create-traffic-policy-version
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the traffic policy that you want to create a new version for. - `com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest`

  returns: Result of the CreateTrafficPolicyVersion operation returned by the service. - `com.amazonaws.services.route53.model.CreateTrafficPolicyVersionResult`"
  (^com.amazonaws.services.route53.model.CreateTrafficPolicyVersionResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest request]
    (-> this (.createTrafficPolicyVersion request))))

(defn create-query-logging-config
  "Description copied from interface: AmazonRoute53

  request - `com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest`

  returns: Result of the CreateQueryLoggingConfig operation returned by the service. - `com.amazonaws.services.route53.model.CreateQueryLoggingConfigResult`"
  (^com.amazonaws.services.route53.model.CreateQueryLoggingConfigResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest request]
    (-> this (.createQueryLoggingConfig request))))

(defn delete-traffic-policy
  "Description copied from interface: AmazonRoute53

  request - A request to delete a specified traffic policy version. - `com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest`

  returns: Result of the DeleteTrafficPolicy operation returned by the service. - `com.amazonaws.services.route53.model.DeleteTrafficPolicyResult`"
  (^com.amazonaws.services.route53.model.DeleteTrafficPolicyResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest request]
    (-> this (.deleteTrafficPolicy request))))

(defn disassociate-vpc-from-hosted-zone
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the VPC that you want to disassociate from a specified private hosted zone. - `com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest`

  returns: Result of the DisassociateVPCFromHostedZone operation returned by the service. - `com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneResult`"
  (^com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest request]
    (-> this (.disassociateVPCFromHostedZone request))))

(defn list-hosted-zones-by-name
  "Description copied from interface: AmazonRoute53

  request - Retrieves a list of the public and private hosted zones that are associated with the current AWS account in ASCII order by domain name. - `com.amazonaws.services.route53.model.ListHostedZonesByNameRequest`

  returns: Result of the ListHostedZonesByName operation returned by the service. - `com.amazonaws.services.route53.model.ListHostedZonesByNameResult`"
  (^com.amazonaws.services.route53.model.ListHostedZonesByNameResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListHostedZonesByNameRequest request]
    (-> this (.listHostedZonesByName request)))
  (^com.amazonaws.services.route53.model.ListHostedZonesByNameResult [^AbstractAmazonRoute53 this]
    (-> this (.listHostedZonesByName))))

(defn create-health-check
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains the health check request information. - `com.amazonaws.services.route53.model.CreateHealthCheckRequest`

  returns: Result of the CreateHealthCheck operation returned by the service. - `com.amazonaws.services.route53.model.CreateHealthCheckResult`"
  (^com.amazonaws.services.route53.model.CreateHealthCheckResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.CreateHealthCheckRequest request]
    (-> this (.createHealthCheck request))))

(defn list-tags-for-resources
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the health checks or hosted zones for which you want to list tags. - `com.amazonaws.services.route53.model.ListTagsForResourcesRequest`

  returns: Result of the ListTagsForResources operation returned by the service. - `com.amazonaws.services.route53.model.ListTagsForResourcesResult`"
  (^com.amazonaws.services.route53.model.ListTagsForResourcesResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListTagsForResourcesRequest request]
    (-> this (.listTagsForResources request))))

(defn get-checker-ip-ranges
  "Description copied from interface: AmazonRoute53

  request - Empty request. - `com.amazonaws.services.route53.model.GetCheckerIpRangesRequest`

  returns: Result of the GetCheckerIpRanges operation returned by the service. - `com.amazonaws.services.route53.model.GetCheckerIpRangesResult`"
  (^com.amazonaws.services.route53.model.GetCheckerIpRangesResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetCheckerIpRangesRequest request]
    (-> this (.getCheckerIpRanges request)))
  (^com.amazonaws.services.route53.model.GetCheckerIpRangesResult [^AbstractAmazonRoute53 this]
    (-> this (.getCheckerIpRanges))))

(defn create-hosted-zone
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the request to create a public or private hosted zone. - `com.amazonaws.services.route53.model.CreateHostedZoneRequest`

  returns: Result of the CreateHostedZone operation returned by the service. - `com.amazonaws.services.route53.model.CreateHostedZoneResult`"
  (^com.amazonaws.services.route53.model.CreateHostedZoneResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.CreateHostedZoneRequest request]
    (-> this (.createHostedZone request))))

(defn get-health-check-last-failure-reason
  "Description copied from interface: AmazonRoute53

  request - A request for the reason that a health check failed most recently. - `com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest`

  returns: Result of the GetHealthCheckLastFailureReason operation returned by the service. - `com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonResult`"
  (^com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest request]
    (-> this (.getHealthCheckLastFailureReason request))))

(defn list-resource-record-sets
  "Description copied from interface: AmazonRoute53

  request - A request for the resource record sets that are associated with a specified hosted zone. - `com.amazonaws.services.route53.model.ListResourceRecordSetsRequest`

  returns: Result of the ListResourceRecordSets operation returned by the service. - `com.amazonaws.services.route53.model.ListResourceRecordSetsResult`"
  (^com.amazonaws.services.route53.model.ListResourceRecordSetsResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListResourceRecordSetsRequest request]
    (-> this (.listResourceRecordSets request))))

(defn get-change
  "Description copied from interface: AmazonRoute53

  request - The input for a GetChange request. - `com.amazonaws.services.route53.model.GetChangeRequest`

  returns: Result of the GetChange operation returned by the service. - `com.amazonaws.services.route53.model.GetChangeResult`"
  (^com.amazonaws.services.route53.model.GetChangeResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetChangeRequest request]
    (-> this (.getChange request))))

(defn update-traffic-policy-instance
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the resource record sets that you want to update based on a specified traffic policy instance. - `com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest`

  returns: Result of the UpdateTrafficPolicyInstance operation returned by the service. - `com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceResult`"
  (^com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest request]
    (-> this (.updateTrafficPolicyInstance request))))

(defn list-reusable-delegation-sets
  "Description copied from interface: AmazonRoute53

  request - A request to get a list of the reusable delegation sets that are associated with the current AWS account. - `com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest`

  returns: Result of the ListReusableDelegationSets operation returned by the service. - `com.amazonaws.services.route53.model.ListReusableDelegationSetsResult`"
  (^com.amazonaws.services.route53.model.ListReusableDelegationSetsResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest request]
    (-> this (.listReusableDelegationSets request)))
  (^com.amazonaws.services.route53.model.ListReusableDelegationSetsResult [^AbstractAmazonRoute53 this]
    (-> this (.listReusableDelegationSets))))

(defn change-tags-for-resource
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the tags that you want to add, edit, or delete. - `com.amazonaws.services.route53.model.ChangeTagsForResourceRequest`

  returns: Result of the ChangeTagsForResource operation returned by the service. - `com.amazonaws.services.route53.model.ChangeTagsForResourceResult`"
  (^com.amazonaws.services.route53.model.ChangeTagsForResourceResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ChangeTagsForResourceRequest request]
    (-> this (.changeTagsForResource request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonRoute53

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonRoute53 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-vpc-association-authorization
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the request to remove authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account. - `com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest`

  returns: Result of the DeleteVPCAssociationAuthorization operation returned by the service. - `com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationResult`"
  (^com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest request]
    (-> this (.deleteVPCAssociationAuthorization request))))

(defn list-geo-locations
  "Description copied from interface: AmazonRoute53

  request - A request to get a list of geographic locations that Amazon Route 53 supports for geolocation resource record sets. - `com.amazonaws.services.route53.model.ListGeoLocationsRequest`

  returns: Result of the ListGeoLocations operation returned by the service. - `com.amazonaws.services.route53.model.ListGeoLocationsResult`"
  (^com.amazonaws.services.route53.model.ListGeoLocationsResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListGeoLocationsRequest request]
    (-> this (.listGeoLocations request)))
  (^com.amazonaws.services.route53.model.ListGeoLocationsResult [^AbstractAmazonRoute53 this]
    (-> this (.listGeoLocations))))

(defn get-traffic-policy-instance-count
  "Description copied from interface: AmazonRoute53

  request - Request to get the number of traffic policy instances that are associated with the current AWS account. - `com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest`

  returns: Result of the GetTrafficPolicyInstanceCount operation returned by the service. - `com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountResult`"
  (^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest request]
    (-> this (.getTrafficPolicyInstanceCount request)))
  (^com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountResult [^AbstractAmazonRoute53 this]
    (-> this (.getTrafficPolicyInstanceCount))))

(defn create-reusable-delegation-set
  "Description copied from interface: AmazonRoute53

  request - `com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest`

  returns: Result of the CreateReusableDelegationSet operation returned by the service. - `com.amazonaws.services.route53.model.CreateReusableDelegationSetResult`"
  (^com.amazonaws.services.route53.model.CreateReusableDelegationSetResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest request]
    (-> this (.createReusableDelegationSet request))))

(defn update-traffic-policy-comment
  "Description copied from interface: AmazonRoute53

  request - A complex type that contains information about the traffic policy that you want to update the comment for. - `com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest`

  returns: Result of the UpdateTrafficPolicyComment operation returned by the service. - `com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentResult`"
  (^com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest request]
    (-> this (.updateTrafficPolicyComment request))))

(defn list-query-logging-configs
  "Description copied from interface: AmazonRoute53

  request - `com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest`

  returns: Result of the ListQueryLoggingConfigs operation returned by the service. - `com.amazonaws.services.route53.model.ListQueryLoggingConfigsResult`"
  (^com.amazonaws.services.route53.model.ListQueryLoggingConfigsResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest request]
    (-> this (.listQueryLoggingConfigs request))))

(defn delete-hosted-zone
  "Description copied from interface: AmazonRoute53

  request - A request to delete a hosted zone. - `com.amazonaws.services.route53.model.DeleteHostedZoneRequest`

  returns: Result of the DeleteHostedZone operation returned by the service. - `com.amazonaws.services.route53.model.DeleteHostedZoneResult`"
  (^com.amazonaws.services.route53.model.DeleteHostedZoneResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.DeleteHostedZoneRequest request]
    (-> this (.deleteHostedZone request))))

(defn delete-reusable-delegation-set
  "Description copied from interface: AmazonRoute53

  request - A request to delete a reusable delegation set. - `com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest`

  returns: Result of the DeleteReusableDelegationSet operation returned by the service. - `com.amazonaws.services.route53.model.DeleteReusableDelegationSetResult`"
  (^com.amazonaws.services.route53.model.DeleteReusableDelegationSetResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest request]
    (-> this (.deleteReusableDelegationSet request))))

(defn get-hosted-zone
  "Description copied from interface: AmazonRoute53

  request - A request to get information about a specified hosted zone. - `com.amazonaws.services.route53.model.GetHostedZoneRequest`

  returns: Result of the GetHostedZone operation returned by the service. - `com.amazonaws.services.route53.model.GetHostedZoneResult`"
  (^com.amazonaws.services.route53.model.GetHostedZoneResult [^AbstractAmazonRoute53 this ^com.amazonaws.services.route53.model.GetHostedZoneRequest request]
    (-> this (.getHostedZone request))))

