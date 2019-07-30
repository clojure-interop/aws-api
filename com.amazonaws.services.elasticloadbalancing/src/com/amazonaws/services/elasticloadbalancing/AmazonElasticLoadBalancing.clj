(ns com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing
  "Interface for accessing Elastic Load Balancing.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonElasticLoadBalancing instead.


  Elastic Load Balancing

  A load balancer can distribute incoming traffic across your EC2 instances. This enables you to increase the
  availability of your application. The load balancer also monitors the health of its registered instances and ensures
  that it routes traffic only to healthy instances. You configure your load balancer to accept incoming traffic by
  specifying one or more listeners, which are configured with a protocol and port number for connections from clients
  to the load balancer and a protocol and port number for connections from the load balancer to the instances.


  Elastic Load Balancing supports three types of load balancers: Application Load Balancers, Network Load Balancers,
  and Classic Load Balancers. You can select a load balancer based on your application needs. For more information, see
  the Elastic Load Balancing User
  Guide.


  This reference covers the 2012-06-01 API, which supports Classic Load Balancers. The 2015-12-01 API supports
  Application Load Balancers and Network Load Balancers.


  To get started, create a load balancer with one or more listeners using CreateLoadBalancer. Register your
  instances with the load balancer using RegisterInstancesWithLoadBalancer.


  All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you
  repeat an operation, it succeeds with a 200 OK response code."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticloadbalancing AmazonElasticLoadBalancing]))

(defn describe-instance-health
  "Describes the state of the specified instances with respect to the specified load balancer. If no instances are
   specified, the call describes the state of all instances that are currently registered with the load balancer. If
   instances are specified, their state is returned even if they are no longer registered with the load balancer.
   The state of terminated instances is not returned.

  describe-instance-health-request - Contains the parameters for DescribeInstanceHealth. - `com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest`

  returns: Result of the DescribeInstanceHealth operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest describe-instance-health-request]
    (-> this (.describeInstanceHealth describe-instance-health-request))))

(defn add-tags
  "Adds the specified tags to the specified load balancer. Each load balancer can have a maximum of 10 tags.


   Each tag consists of a key and an optional value. If a tag with the same key is already associated with the load
   balancer, AddTags updates its value.


   For more information, see Tag Your Classic Load
   Balancer in the Classic Load Balancers Guide.

  add-tags-request - Contains the parameters for AddTags. - `com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.AddTagsResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.AddTagsResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest add-tags-request]
    (-> this (.addTags add-tags-request))))

(defn describe-tags
  "Describes the tags associated with the specified load balancers.

  describe-tags-request - Contains the parameters for DescribeTags. - `com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTags describe-tags-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonElasticLoadBalancing this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn waiters
  "returns: `com.amazonaws.services.elasticloadbalancing.waiters.AmazonElasticLoadBalancingWaiters`"
  (^com.amazonaws.services.elasticloadbalancing.waiters.AmazonElasticLoadBalancingWaiters [^AmazonElasticLoadBalancing this]
    (-> this (.waiters))))

(defn enable-availability-zones-for-load-balancer
  "Adds the specified Availability Zones to the set of Availability Zones for the specified load balancer in
   EC2-Classic or a default VPC.


   For load balancers in a non-default VPC, use AttachLoadBalancerToSubnets.


   The load balancer evenly distributes requests across all its registered Availability Zones that contain
   instances. For more information, see Add or Remove
   Availability Zones in the Classic Load Balancers Guide.

  enable-availability-zones-for-load-balancer-request - Contains the parameters for EnableAvailabilityZonesForLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest`

  returns: Result of the EnableAvailabilityZonesForLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest enable-availability-zones-for-load-balancer-request]
    (-> this (.enableAvailabilityZonesForLoadBalancer enable-availability-zones-for-load-balancer-request))))

(defn describe-load-balancers
  "Describes the specified the load balancers. If no load balancers are specified, the call describes all of your
   load balancers.

  describe-load-balancers-request - Contains the parameters for DescribeLoadBalancers. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest`

  returns: Result of the DescribeLoadBalancers operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest describe-load-balancers-request]
    (-> this (.describeLoadBalancers describe-load-balancers-request)))
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult [^AmazonElasticLoadBalancing this]
    (-> this (.describeLoadBalancers))))

(defn create-load-balancer-policy
  "Creates a policy with the specified attributes for the specified load balancer.


   Policies are settings that are saved for your load balancer and that can be applied to the listener or the
   application server, depending on the policy type.

  create-load-balancer-policy-request - Contains the parameters for CreateLoadBalancerPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest`

  returns: Result of the CreateLoadBalancerPolicy operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest create-load-balancer-policy-request]
    (-> this (.createLoadBalancerPolicy create-load-balancer-policy-request))))

(defn remove-tags
  "Removes one or more tags from the specified load balancer.

  remove-tags-request - Contains the parameters for RemoveTags. - `com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest remove-tags-request]
    (-> this (.removeTags remove-tags-request))))

(defn delete-load-balancer-listeners
  "Deletes the specified listeners from the specified load balancer.

  delete-load-balancer-listeners-request - Contains the parameters for DeleteLoadBalancerListeners. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest`

  returns: Result of the DeleteLoadBalancerListeners operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest delete-load-balancer-listeners-request]
    (-> this (.deleteLoadBalancerListeners delete-load-balancer-listeners-request))))

(defn detach-load-balancer-from-subnets
  "Removes the specified subnets from the set of configured subnets for the load balancer.


   After a subnet is removed, all EC2 instances registered with the load balancer in the removed subnet go into the
   OutOfService state. Then, the load balancer balances the traffic among the remaining routable
   subnets.

  detach-load-balancer-from-subnets-request - Contains the parameters for DetachLoadBalancerFromSubnets. - `com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest`

  returns: Result of the DetachLoadBalancerFromSubnets operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest detach-load-balancer-from-subnets-request]
    (-> this (.detachLoadBalancerFromSubnets detach-load-balancer-from-subnets-request))))

(defn deregister-instances-from-load-balancer
  "Deregisters the specified instances from the specified load balancer. After the instance is deregistered, it no
   longer receives traffic from the load balancer.


   You can use DescribeLoadBalancers to verify that the instance is deregistered from the load balancer.


   For more information, see Register or De-Register EC2 Instances in the Classic Load Balancers Guide.

  deregister-instances-from-load-balancer-request - Contains the parameters for DeregisterInstancesFromLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest`

  returns: Result of the DeregisterInstancesFromLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest deregister-instances-from-load-balancer-request]
    (-> this (.deregisterInstancesFromLoadBalancer deregister-instances-from-load-balancer-request))))

(defn register-instances-with-load-balancer
  "Adds the specified instances to the specified load balancer.


   The instance must be a running instance in the same network as the load balancer (EC2-Classic or the same VPC).
   If you have EC2-Classic instances and a load balancer in a VPC with ClassicLink enabled, you can link the
   EC2-Classic instances to that VPC and then register the linked EC2-Classic instances with the load balancer in
   the VPC.


   Note that RegisterInstanceWithLoadBalancer completes when the request has been registered. Instance
   registration takes a little time to complete. To check the state of the registered instances, use
   DescribeLoadBalancers or DescribeInstanceHealth.


   After the instance is registered, it starts receiving traffic and requests from the load balancer. Any instance
   that is not in one of the Availability Zones registered for the load balancer is moved to the
   OutOfService state. If an Availability Zone is added to the load balancer later, any instances
   registered with the load balancer move to the InService state.


   To deregister instances from a load balancer, use DeregisterInstancesFromLoadBalancer.


   For more information, see Register or De-Register EC2 Instances in the Classic Load Balancers Guide.

  register-instances-with-load-balancer-request - Contains the parameters for RegisterInstancesWithLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest`

  returns: Result of the RegisterInstancesWithLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest register-instances-with-load-balancer-request]
    (-> this (.registerInstancesWithLoadBalancer register-instances-with-load-balancer-request))))

(defn apply-security-groups-to-load-balancer
  "Associates one or more security groups with your load balancer in a virtual private cloud (VPC). The specified
   security groups override the previously associated security groups.


   For more information, see Security Groups for Load Balancers in a VPC in the Classic Load Balancers Guide.

  apply-security-groups-to-load-balancer-request - Contains the parameters for ApplySecurityGroupsToLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest`

  returns: Result of the ApplySecurityGroupsToLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest apply-security-groups-to-load-balancer-request]
    (-> this (.applySecurityGroupsToLoadBalancer apply-security-groups-to-load-balancer-request))))

(defn modify-load-balancer-attributes
  "Modifies the attributes of the specified load balancer.


   You can modify the load balancer attributes, such as AccessLogs, ConnectionDraining,
   and CrossZoneLoadBalancing by either enabling or disabling them. Or, you can modify the load
   balancer attribute ConnectionSettings by specifying an idle connection timeout value for your load
   balancer.


   For more information, see the following in the Classic Load Balancers Guide:




   Cross-
   Zone Load Balancing




   Connection
   Draining




   Access
   Logs




   Idle Connection
   Timeout

  modify-load-balancer-attributes-request - Contains the parameters for ModifyLoadBalancerAttributes. - `com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest`

  returns: Result of the ModifyLoadBalancerAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest modify-load-balancer-attributes-request]
    (-> this (.modifyLoadBalancerAttributes modify-load-balancer-attributes-request))))

(defn describe-load-balancer-attributes
  "Describes the attributes for the specified load balancer.

  describe-load-balancer-attributes-request - Contains the parameters for DescribeLoadBalancerAttributes. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest`

  returns: Result of the DescribeLoadBalancerAttributes operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest describe-load-balancer-attributes-request]
    (-> this (.describeLoadBalancerAttributes describe-load-balancer-attributes-request))))

(defn set-load-balancer-policies-of-listener
  "Replaces the current set of policies for the specified load balancer port with the specified set of policies.


   To enable back-end server authentication, use SetLoadBalancerPoliciesForBackendServer.


   For more information about setting policies, see Update the SSL
   Negotiation Configuration, Duration-Based Session Stickiness, and Application-Controlled Session Stickiness in the Classic Load Balancers Guide.

  set-load-balancer-policies-of-listener-request - Contains the parameters for SetLoadBalancePoliciesOfListener. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest`

  returns: Result of the SetLoadBalancerPoliciesOfListener operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest set-load-balancer-policies-of-listener-request]
    (-> this (.setLoadBalancerPoliciesOfListener set-load-balancer-policies-of-listener-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonElasticLoadBalancing this]
    (-> this (.shutdown))))

(defn set-load-balancer-policies-for-backend-server
  "Replaces the set of policies associated with the specified port on which the EC2 instance is listening with a new
   set of policies. At this time, only the back-end server authentication policy type can be applied to the instance
   ports; this policy type is composed of multiple public key policies.


   Each time you use SetLoadBalancerPoliciesForBackendServer to enable the policies, use the
   PolicyNames parameter to list the policies that you want to enable.


   You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to verify that the policy is
   associated with the EC2 instance.


   For more information about enabling back-end instance authentication, see Configure Back-end Instance Authentication in the Classic Load Balancers Guide. For more information
   about Proxy Protocol, see Configure Proxy
   Protocol Support in the Classic Load Balancers Guide.

  set-load-balancer-policies-for-backend-server-request - Contains the parameters for SetLoadBalancerPoliciesForBackendServer. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest`

  returns: Result of the SetLoadBalancerPoliciesForBackendServer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest set-load-balancer-policies-for-backend-server-request]
    (-> this (.setLoadBalancerPoliciesForBackendServer set-load-balancer-policies-for-backend-server-request))))

(defn disable-availability-zones-for-load-balancer
  "Removes the specified Availability Zones from the set of Availability Zones for the specified load balancer in
   EC2-Classic or a default VPC.


   For load balancers in a non-default VPC, use DetachLoadBalancerFromSubnets.


   There must be at least one Availability Zone registered with a load balancer at all times. After an Availability
   Zone is removed, all instances registered with the load balancer that are in the removed Availability Zone go
   into the OutOfService state. Then, the load balancer attempts to equally balance the traffic among
   its remaining Availability Zones.


   For more information, see Add or Remove
   Availability Zones in the Classic Load Balancers Guide.

  disable-availability-zones-for-load-balancer-request - Contains the parameters for DisableAvailabilityZonesForLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest`

  returns: Result of the DisableAvailabilityZonesForLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest disable-availability-zones-for-load-balancer-request]
    (-> this (.disableAvailabilityZonesForLoadBalancer disable-availability-zones-for-load-balancer-request))))

(defn describe-account-limits
  "Describes the current Elastic Load Balancing resource limits for your AWS account.


   For more information, see Limits for Your Classic
   Load Balancer in the Classic Load Balancers Guide.

  describe-account-limits-request - `com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest`

  returns: Result of the DescribeAccountLimits operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest describe-account-limits-request]
    (-> this (.describeAccountLimits describe-account-limits-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"elasticloadbalancing.amazonaws.com\") or a full URL, including the protocol (ex: \"elasticloadbalancing.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonElasticLoadBalancing this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-load-balancer
  "Deletes the specified load balancer.


   If you are attempting to recreate a load balancer, you must reconfigure all settings. The DNS name associated
   with a deleted load balancer are no longer usable. The name and associated DNS record of the deleted load
   balancer no longer exist and traffic sent to any of its IP addresses is no longer delivered to your instances.


   If the load balancer does not exist or has already been deleted, the call to DeleteLoadBalancer
   still succeeds.

  delete-load-balancer-request - Contains the parameters for DeleteLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest`

  returns: Result of the DeleteLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult`"
  (^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest delete-load-balancer-request]
    (-> this (.deleteLoadBalancer delete-load-balancer-request))))

(defn set-load-balancer-listener-ssl-certificate
  "Sets the certificate that terminates the specified listener's SSL connections. The specified certificate replaces
   any prior certificate that was used on the same load balancer and port.


   For more information about updating your SSL certificate, see Replace the SSL
   Certificate for Your Load Balancer in the Classic Load Balancers Guide.

  set-load-balancer-listener-ssl-certificate-request - Contains the parameters for SetLoadBalancerListenerSSLCertificate. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest`

  returns: Result of the SetLoadBalancerListenerSSLCertificate operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.CertificateNotFoundException - The specified ARN does not refer to a valid SSL certificate in AWS Identity and Access Management (IAM) or AWS Certificate Manager (ACM). Note that if you recently uploaded the certificate to IAM, this error might indicate that the certificate is not fully available yet."
  (^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest set-load-balancer-listener-ssl-certificate-request]
    (-> this (.setLoadBalancerListenerSSLCertificate set-load-balancer-listener-ssl-certificate-request))))

(defn create-lb-cookie-stickiness-policy
  "Generates a stickiness policy with sticky session lifetimes controlled by the lifetime of the browser
   (user-agent) or a specified expiration period. This policy can be associated only with HTTP/HTTPS listeners.


   When a load balancer implements this policy, the load balancer uses a special cookie to track the instance for
   each request. When the load balancer receives a request, it first checks to see if this cookie is present in the
   request. If so, the load balancer sends the request to the application server specified in the cookie. If not,
   the load balancer sends the request to a server that is chosen based on the existing load-balancing algorithm.


   A cookie is inserted into the response for binding subsequent requests from the same user to that server. The
   validity of the cookie is based on the cookie expiration time, which is specified in the policy configuration.


   For more information, see Duration-Based Session Stickiness in the Classic Load Balancers Guide.

  create-lb-cookie-stickiness-policy-request - Contains the parameters for CreateLBCookieStickinessPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest`

  returns: Result of the CreateLBCookieStickinessPolicy operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest create-lb-cookie-stickiness-policy-request]
    (-> this (.createLBCookieStickinessPolicy create-lb-cookie-stickiness-policy-request))))

(defn create-load-balancer
  "Creates a Classic Load Balancer.


   You can add listeners, security groups, subnets, and tags when you create your load balancer, or you can add them
   later using CreateLoadBalancerListeners, ApplySecurityGroupsToLoadBalancer,
   AttachLoadBalancerToSubnets, and AddTags.


   To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load
   balancer, you can delete it using DeleteLoadBalancer.


   You can create up to 20 load balancers per region per account. You can request an increase for the number of load
   balancers for your account. For more information, see Limits for Your Classic
   Load Balancer in the Classic Load Balancers Guide.

  create-load-balancer-request - Contains the parameters for CreateLoadBalancer. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest`

  returns: Result of the CreateLoadBalancer operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.InvalidSubnetException - The specified VPC has no associated Internet gateway."
  (^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest create-load-balancer-request]
    (-> this (.createLoadBalancer create-load-balancer-request))))

(defn describe-load-balancer-policy-types
  "Describes the specified load balancer policy types or all load balancer policy types.


   The description of each type indicates how it can be used. For example, some policies can be used only with layer
   7 listeners, some policies can be used only with layer 4 listeners, and some policies can be used only with your
   EC2 instances.


   You can use CreateLoadBalancerPolicy to create a policy configuration for any of these policy types. Then,
   depending on the policy type, use either SetLoadBalancerPoliciesOfListener or
   SetLoadBalancerPoliciesForBackendServer to set the policy.

  describe-load-balancer-policy-types-request - Contains the parameters for DescribeLoadBalancerPolicyTypes. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest`

  returns: Result of the DescribeLoadBalancerPolicyTypes operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.PolicyTypeNotFoundException - One or more of the specified policy types do not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest describe-load-balancer-policy-types-request]
    (-> this (.describeLoadBalancerPolicyTypes describe-load-balancer-policy-types-request)))
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult [^AmazonElasticLoadBalancing this]
    (-> this (.describeLoadBalancerPolicyTypes))))

(defn delete-load-balancer-policy
  "Deletes the specified policy from the specified load balancer. This policy must not be enabled for any listeners.

  delete-load-balancer-policy-request - Contains the parameters for DeleteLoadBalancerPolicy. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest`

  returns: Result of the DeleteLoadBalancerPolicy operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest delete-load-balancer-policy-request]
    (-> this (.deleteLoadBalancerPolicy delete-load-balancer-policy-request))))

(defn describe-load-balancer-policies
  "Describes the specified policies.


   If you specify a load balancer name, the action returns the descriptions of all policies created for the load
   balancer. If you specify a policy name associated with your load balancer, the action returns the description of
   that policy. If you don't specify a load balancer name, the action returns descriptions of the specified sample
   policies, or descriptions of all sample policies. The names of the sample policies have the
   ELBSample- prefix.

  describe-load-balancer-policies-request - Contains the parameters for DescribeLoadBalancerPolicies. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest`

  returns: Result of the DescribeLoadBalancerPolicies operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest describe-load-balancer-policies-request]
    (-> this (.describeLoadBalancerPolicies describe-load-balancer-policies-request)))
  (^com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult [^AmazonElasticLoadBalancing this]
    (-> this (.describeLoadBalancerPolicies))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonElasticLoadBalancing this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-load-balancer-listeners
  "Creates one or more listeners for the specified load balancer. If a listener with the specified port does not
   already exist, it is created; otherwise, the properties of the new listener must match the properties of the
   existing listener.


   For more information, see Listeners for Your
   Classic Load Balancer in the Classic Load Balancers Guide.

  create-load-balancer-listeners-request - Contains the parameters for CreateLoadBalancerListeners. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest`

  returns: Result of the CreateLoadBalancerListeners operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest create-load-balancer-listeners-request]
    (-> this (.createLoadBalancerListeners create-load-balancer-listeners-request))))

(defn configure-health-check
  "Specifies the health check settings to use when evaluating the health state of your EC2 instances.


   For more information, see Configure Health
   Checks for Your Load Balancer in the Classic Load Balancers Guide.

  configure-health-check-request - Contains the parameters for ConfigureHealthCheck. - `com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest`

  returns: Result of the ConfigureHealthCheck operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest configure-health-check-request]
    (-> this (.configureHealthCheck configure-health-check-request))))

(defn attach-load-balancer-to-subnets
  "Adds one or more subnets to the set of configured subnets for the specified load balancer.


   The load balancer evenly distributes requests across all registered subnets. For more information, see Add or Remove
   Subnets for Your Load Balancer in a VPC in the Classic Load Balancers Guide.

  attach-load-balancer-to-subnets-request - Contains the parameters for AttachLoaBalancerToSubnets. - `com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest`

  returns: Result of the AttachLoadBalancerToSubnets operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest attach-load-balancer-to-subnets-request]
    (-> this (.attachLoadBalancerToSubnets attach-load-balancer-to-subnets-request))))

(defn create-app-cookie-stickiness-policy
  "Generates a stickiness policy with sticky session lifetimes that follow that of an application-generated cookie.
   This policy can be associated only with HTTP/HTTPS listeners.


   This policy is similar to the policy created by CreateLBCookieStickinessPolicy, except that the lifetime
   of the special Elastic Load Balancing cookie, AWSELB, follows the lifetime of the
   application-generated cookie specified in the policy configuration. The load balancer only inserts a new
   stickiness cookie when the application response includes a new application cookie.


   If the application cookie is explicitly removed or expires, the session stops being sticky until a new
   application cookie is issued.


   For more information, see Application-Controlled Session Stickiness in the Classic Load Balancers Guide.

  create-app-cookie-stickiness-policy-request - Contains the parameters for CreateAppCookieStickinessPolicy. - `com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest`

  returns: Result of the CreateAppCookieStickinessPolicy operation returned by the service. - `com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult`

  throws: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerNotFoundException - The specified load balancer does not exist."
  (^com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult [^AmazonElasticLoadBalancing this ^com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest create-app-cookie-stickiness-policy-request]
    (-> this (.createAppCookieStickinessPolicy create-app-cookie-stickiness-policy-request))))

