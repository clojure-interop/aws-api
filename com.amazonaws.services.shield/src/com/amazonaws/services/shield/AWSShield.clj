(ns com.amazonaws.services.shield.AWSShield
  "Interface for accessing AWS Shield.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSShield instead.


  AWS Shield Advanced

  This is the AWS Shield Advanced API Reference. This guide is for developers who need detailed information
  about the AWS Shield Advanced API actions, data types, and errors. For detailed information about AWS WAF and AWS
  Shield Advanced features and an overview of how to use the AWS WAF and AWS Shield Advanced APIs, see the AWS WAF and AWS Shield Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.shield AWSShield]))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSShield this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn disassociate-drt-log-bucket
  "Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your AWS WAF logs.


   To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are
   not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
   account, you can submit a DisassociateDRTLogBucket request to remove this access.

  disassociate-drt-log-bucket-request - `com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest`

  returns: Result of the DisassociateDRTLogBucket operation returned by the service. - `com.amazonaws.services.shield.model.DisassociateDRTLogBucketResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DisassociateDRTLogBucketResult [^AWSShield this ^com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest disassociate-drt-log-bucket-request]
    (-> this (.disassociateDRTLogBucket disassociate-drt-log-bucket-request))))

(defn get-subscription-state
  "Returns the SubscriptionState, either Active or Inactive.

  get-subscription-state-request - `com.amazonaws.services.shield.model.GetSubscriptionStateRequest`

  returns: Result of the GetSubscriptionState operation returned by the service. - `com.amazonaws.services.shield.model.GetSubscriptionStateResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.GetSubscriptionStateResult [^AWSShield this ^com.amazonaws.services.shield.model.GetSubscriptionStateRequest get-subscription-state-request]
    (-> this (.getSubscriptionState get-subscription-state-request))))

(defn describe-drt-access
  "Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your
   AWS account while assisting with attack mitigation.

  describe-drt-access-request - `com.amazonaws.services.shield.model.DescribeDRTAccessRequest`

  returns: Result of the DescribeDRTAccess operation returned by the service. - `com.amazonaws.services.shield.model.DescribeDRTAccessResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DescribeDRTAccessResult [^AWSShield this ^com.amazonaws.services.shield.model.DescribeDRTAccessRequest describe-drt-access-request]
    (-> this (.describeDRTAccess describe-drt-access-request))))

(defn create-protection
  "Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution,
   Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route
   53 hosted zone.


   You can add protection to only a single resource with each CreateProtection request. If you want to add
   protection to multiple resources at once, use the AWS WAF
   console. For more information see Getting Started with AWS
   Shield Advanced and Add AWS Shield
   Advanced Protection to more AWS Resources.

  create-protection-request - `com.amazonaws.services.shield.model.CreateProtectionRequest`

  returns: Result of the CreateProtection operation returned by the service. - `com.amazonaws.services.shield.model.CreateProtectionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.CreateProtectionResult [^AWSShield this ^com.amazonaws.services.shield.model.CreateProtectionRequest create-protection-request]
    (-> this (.createProtection create-protection-request))))

(defn delete-subscription
  "Deprecated.

  delete-subscription-request - `com.amazonaws.services.shield.model.DeleteSubscriptionRequest`

  returns: Result of the DeleteSubscription operation returned by the service. - `com.amazonaws.services.shield.model.DeleteSubscriptionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DeleteSubscriptionResult [^AWSShield this ^com.amazonaws.services.shield.model.DeleteSubscriptionRequest delete-subscription-request]
    (-> this (.deleteSubscription delete-subscription-request))))

(defn delete-protection
  "Deletes an AWS Shield Advanced Protection.

  delete-protection-request - `com.amazonaws.services.shield.model.DeleteProtectionRequest`

  returns: Result of the DeleteProtection operation returned by the service. - `com.amazonaws.services.shield.model.DeleteProtectionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DeleteProtectionResult [^AWSShield this ^com.amazonaws.services.shield.model.DeleteProtectionRequest delete-protection-request]
    (-> this (.deleteProtection delete-protection-request))))

(defn associate-drt-log-bucket
  "Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your AWS WAF logs.
   You can associate up to 10 Amazon S3 buckets with your subscription.


   To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to
   the Business Support plan or the Enterprise Support plan.

  associate-drt-log-bucket-request - `com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest`

  returns: Result of the AssociateDRTLogBucket operation returned by the service. - `com.amazonaws.services.shield.model.AssociateDRTLogBucketResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.AssociateDRTLogBucketResult [^AWSShield this ^com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest associate-drt-log-bucket-request]
    (-> this (.associateDRTLogBucket associate-drt-log-bucket-request))))

(defn update-emergency-contact-settings
  "Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.

  update-emergency-contact-settings-request - `com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest`

  returns: Result of the UpdateEmergencyContactSettings operation returned by the service. - `com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsResult [^AWSShield this ^com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest update-emergency-contact-settings-request]
    (-> this (.updateEmergencyContactSettings update-emergency-contact-settings-request))))

(defn describe-protection
  "Lists the details of a Protection object.

  describe-protection-request - `com.amazonaws.services.shield.model.DescribeProtectionRequest`

  returns: Result of the DescribeProtection operation returned by the service. - `com.amazonaws.services.shield.model.DescribeProtectionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DescribeProtectionResult [^AWSShield this ^com.amazonaws.services.shield.model.DescribeProtectionRequest describe-protection-request]
    (-> this (.describeProtection describe-protection-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSShield this]
    (-> this (.shutdown))))

(defn describe-subscription
  "Provides details about the AWS Shield Advanced subscription for an account.

  describe-subscription-request - `com.amazonaws.services.shield.model.DescribeSubscriptionRequest`

  returns: Result of the DescribeSubscription operation returned by the service. - `com.amazonaws.services.shield.model.DescribeSubscriptionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DescribeSubscriptionResult [^AWSShield this ^com.amazonaws.services.shield.model.DescribeSubscriptionRequest describe-subscription-request]
    (-> this (.describeSubscription describe-subscription-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"shield.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"shield.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSShield this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-attack
  "Describes the details of a DDoS attack.

  describe-attack-request - `com.amazonaws.services.shield.model.DescribeAttackRequest`

  returns: Result of the DescribeAttack operation returned by the service. - `com.amazonaws.services.shield.model.DescribeAttackResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DescribeAttackResult [^AWSShield this ^com.amazonaws.services.shield.model.DescribeAttackRequest describe-attack-request]
    (-> this (.describeAttack describe-attack-request))))

(defn list-protections
  "Lists all Protection objects for the account.

  list-protections-request - `com.amazonaws.services.shield.model.ListProtectionsRequest`

  returns: Result of the ListProtections operation returned by the service. - `com.amazonaws.services.shield.model.ListProtectionsResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.ListProtectionsResult [^AWSShield this ^com.amazonaws.services.shield.model.ListProtectionsRequest list-protections-request]
    (-> this (.listProtections list-protections-request))))

(defn disassociate-drt-role
  "Removes the DDoS Response team's (DRT) access to your AWS account.


   To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are
   not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
   account, you can submit a DisassociateDRTRole request to remove this access.

  disassociate-drt-role-request - `com.amazonaws.services.shield.model.DisassociateDRTRoleRequest`

  returns: Result of the DisassociateDRTRole operation returned by the service. - `com.amazonaws.services.shield.model.DisassociateDRTRoleResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DisassociateDRTRoleResult [^AWSShield this ^com.amazonaws.services.shield.model.DisassociateDRTRoleRequest disassociate-drt-role-request]
    (-> this (.disassociateDRTRole disassociate-drt-role-request))))

(defn update-subscription
  "Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty
   parameters are not updated.

  update-subscription-request - `com.amazonaws.services.shield.model.UpdateSubscriptionRequest`

  returns: Result of the UpdateSubscription operation returned by the service. - `com.amazonaws.services.shield.model.UpdateSubscriptionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.UpdateSubscriptionResult [^AWSShield this ^com.amazonaws.services.shield.model.UpdateSubscriptionRequest update-subscription-request]
    (-> this (.updateSubscription update-subscription-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSShield this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-attacks
  "Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.

  list-attacks-request - `com.amazonaws.services.shield.model.ListAttacksRequest`

  returns: Result of the ListAttacks operation returned by the service. - `com.amazonaws.services.shield.model.ListAttacksResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.ListAttacksResult [^AWSShield this ^com.amazonaws.services.shield.model.ListAttacksRequest list-attacks-request]
    (-> this (.listAttacks list-attacks-request))))

(defn create-subscription
  "Activates AWS Shield Advanced for an account.


   As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response
   team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team
   to Create Rules and Web ACLs on Your Behalf.


   To use the services of the DRT, you must be subscribed to the Business Support plan or the Enterprise Support plan.


   When you initally create a subscription, your subscription is set to be automatically renewed at the end of the
   existing subscription period. You can change this by submitting an UpdateSubscription request.

  create-subscription-request - `com.amazonaws.services.shield.model.CreateSubscriptionRequest`

  returns: Result of the CreateSubscription operation returned by the service. - `com.amazonaws.services.shield.model.CreateSubscriptionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.CreateSubscriptionResult [^AWSShield this ^com.amazonaws.services.shield.model.CreateSubscriptionRequest create-subscription-request]
    (-> this (.createSubscription create-subscription-request))))

(defn describe-emergency-contact-settings
  "Lists the email addresses that the DRT can use to contact you during a suspected attack.

  describe-emergency-contact-settings-request - `com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest`

  returns: Result of the DescribeEmergencyContactSettings operation returned by the service. - `com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsResult [^AWSShield this ^com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest describe-emergency-contact-settings-request]
    (-> this (.describeEmergencyContactSettings describe-emergency-contact-settings-request))))

(defn associate-drt-role
  "Authorizes the DDoS Response team (DRT), using the specified role, to access your AWS account to assist with DDoS
   attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create
   or update AWS WAF rules and web ACLs.


   You can associate only one RoleArn with your subscription. If you submit an
   AssociateDRTRole request for an account that already has an associated role, the new
   RoleArn will replace the existing RoleArn.


   Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information
   see Attaching and
   Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com
   . For more information, see IAM JSON
   Policy Elements: Principal.


   The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the
   DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your
   behalf. The DRT takes these actions only if explicitly authorized by you.


   You must have the iam:PassRole permission to make an AssociateDRTRole request. For more
   information, see Granting a
   User Permissions to Pass a Role to an AWS Service.


   To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the
   Business Support plan or the Enterprise Support plan.

  associate-drt-role-request - `com.amazonaws.services.shield.model.AssociateDRTRoleRequest`

  returns: Result of the AssociateDRTRole operation returned by the service. - `com.amazonaws.services.shield.model.AssociateDRTRoleResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.AssociateDRTRoleResult [^AWSShield this ^com.amazonaws.services.shield.model.AssociateDRTRoleRequest associate-drt-role-request]
    (-> this (.associateDRTRole associate-drt-role-request))))

