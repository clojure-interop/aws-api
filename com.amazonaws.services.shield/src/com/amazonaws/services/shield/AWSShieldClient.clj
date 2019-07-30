(ns com.amazonaws.services.shield.AWSShieldClient
  "Client for accessing AWS Shield. All service calls made using this client are blocking, and will not return until the
  service call completes.

  AWS Shield Advanced

  This is the AWS Shield Advanced API Reference. This guide is for developers who need detailed information
  about the AWS Shield Advanced API actions, data types, and errors. For detailed information about AWS WAF and AWS
  Shield Advanced features and an overview of how to use the AWS WAF and AWS Shield Advanced APIs, see the AWS WAF and AWS Shield Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.shield AWSShieldClient]))

(defn ->aws-shield-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Shield (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSShieldClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSShieldClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSShieldClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSShieldClient aws-credentials client-configuration))
  (^AWSShieldClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSShieldClient client-configuration))
  (^AWSShieldClient []
    (new AWSShieldClient )))

(defn *builder
  "returns: `com.amazonaws.services.shield.AWSShieldClientBuilder`"
  (^com.amazonaws.services.shield.AWSShieldClientBuilder []
    (AWSShieldClient/builder )))

(defn disassociate-drt-log-bucket
  "Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your AWS WAF logs.


   To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are
   not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
   account, you can submit a DisassociateDRTLogBucket request to remove this access.

  request - `com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest`

  returns: Result of the DisassociateDRTLogBucket operation returned by the service. - `com.amazonaws.services.shield.model.DisassociateDRTLogBucketResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DisassociateDRTLogBucketResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest request]
    (-> this (.disassociateDRTLogBucket request))))

(defn get-subscription-state
  "Returns the SubscriptionState, either Active or Inactive.

  request - `com.amazonaws.services.shield.model.GetSubscriptionStateRequest`

  returns: Result of the GetSubscriptionState operation returned by the service. - `com.amazonaws.services.shield.model.GetSubscriptionStateResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.GetSubscriptionStateResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.GetSubscriptionStateRequest request]
    (-> this (.getSubscriptionState request))))

(defn describe-drt-access
  "Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your
   AWS account while assisting with attack mitigation.

  request - `com.amazonaws.services.shield.model.DescribeDRTAccessRequest`

  returns: Result of the DescribeDRTAccess operation returned by the service. - `com.amazonaws.services.shield.model.DescribeDRTAccessResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DescribeDRTAccessResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.DescribeDRTAccessRequest request]
    (-> this (.describeDRTAccess request))))

(defn create-protection
  "Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution,
   Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route
   53 hosted zone.


   You can add protection to only a single resource with each CreateProtection request. If you want to add
   protection to multiple resources at once, use the AWS WAF
   console. For more information see Getting Started with AWS
   Shield Advanced and Add AWS Shield
   Advanced Protection to more AWS Resources.

  request - `com.amazonaws.services.shield.model.CreateProtectionRequest`

  returns: Result of the CreateProtection operation returned by the service. - `com.amazonaws.services.shield.model.CreateProtectionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.CreateProtectionResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.CreateProtectionRequest request]
    (-> this (.createProtection request))))

(defn delete-subscription
  "Deprecated.

  request - `com.amazonaws.services.shield.model.DeleteSubscriptionRequest`

  returns: Result of the DeleteSubscription operation returned by the service. - `com.amazonaws.services.shield.model.DeleteSubscriptionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DeleteSubscriptionResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.DeleteSubscriptionRequest request]
    (-> this (.deleteSubscription request))))

(defn delete-protection
  "Deletes an AWS Shield Advanced Protection.

  request - `com.amazonaws.services.shield.model.DeleteProtectionRequest`

  returns: Result of the DeleteProtection operation returned by the service. - `com.amazonaws.services.shield.model.DeleteProtectionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DeleteProtectionResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.DeleteProtectionRequest request]
    (-> this (.deleteProtection request))))

(defn associate-drt-log-bucket
  "Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your AWS WAF logs.
   You can associate up to 10 Amazon S3 buckets with your subscription.


   To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to
   the Business Support plan or the Enterprise Support plan.

  request - `com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest`

  returns: Result of the AssociateDRTLogBucket operation returned by the service. - `com.amazonaws.services.shield.model.AssociateDRTLogBucketResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.AssociateDRTLogBucketResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest request]
    (-> this (.associateDRTLogBucket request))))

(defn update-emergency-contact-settings
  "Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.

  request - `com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest`

  returns: Result of the UpdateEmergencyContactSettings operation returned by the service. - `com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest request]
    (-> this (.updateEmergencyContactSettings request))))

(defn describe-protection
  "Lists the details of a Protection object.

  request - `com.amazonaws.services.shield.model.DescribeProtectionRequest`

  returns: Result of the DescribeProtection operation returned by the service. - `com.amazonaws.services.shield.model.DescribeProtectionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DescribeProtectionResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.DescribeProtectionRequest request]
    (-> this (.describeProtection request))))

(defn describe-subscription
  "Provides details about the AWS Shield Advanced subscription for an account.

  request - `com.amazonaws.services.shield.model.DescribeSubscriptionRequest`

  returns: Result of the DescribeSubscription operation returned by the service. - `com.amazonaws.services.shield.model.DescribeSubscriptionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DescribeSubscriptionResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.DescribeSubscriptionRequest request]
    (-> this (.describeSubscription request))))

(defn describe-attack
  "Describes the details of a DDoS attack.

  request - `com.amazonaws.services.shield.model.DescribeAttackRequest`

  returns: Result of the DescribeAttack operation returned by the service. - `com.amazonaws.services.shield.model.DescribeAttackResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DescribeAttackResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.DescribeAttackRequest request]
    (-> this (.describeAttack request))))

(defn list-protections
  "Lists all Protection objects for the account.

  request - `com.amazonaws.services.shield.model.ListProtectionsRequest`

  returns: Result of the ListProtections operation returned by the service. - `com.amazonaws.services.shield.model.ListProtectionsResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.ListProtectionsResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.ListProtectionsRequest request]
    (-> this (.listProtections request))))

(defn disassociate-drt-role
  "Removes the DDoS Response team's (DRT) access to your AWS account.


   To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are
   not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
   account, you can submit a DisassociateDRTRole request to remove this access.

  request - `com.amazonaws.services.shield.model.DisassociateDRTRoleRequest`

  returns: Result of the DisassociateDRTRole operation returned by the service. - `com.amazonaws.services.shield.model.DisassociateDRTRoleResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DisassociateDRTRoleResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.DisassociateDRTRoleRequest request]
    (-> this (.disassociateDRTRole request))))

(defn update-subscription
  "Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty
   parameters are not updated.

  request - `com.amazonaws.services.shield.model.UpdateSubscriptionRequest`

  returns: Result of the UpdateSubscription operation returned by the service. - `com.amazonaws.services.shield.model.UpdateSubscriptionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.UpdateSubscriptionResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.UpdateSubscriptionRequest request]
    (-> this (.updateSubscription request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSShieldClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-attacks
  "Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.

  request - `com.amazonaws.services.shield.model.ListAttacksRequest`

  returns: Result of the ListAttacks operation returned by the service. - `com.amazonaws.services.shield.model.ListAttacksResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.ListAttacksResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.ListAttacksRequest request]
    (-> this (.listAttacks request))))

(defn create-subscription
  "Activates AWS Shield Advanced for an account.


   As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response
   team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team
   to Create Rules and Web ACLs on Your Behalf.


   To use the services of the DRT, you must be subscribed to the Business Support plan or the Enterprise Support plan.


   When you initally create a subscription, your subscription is set to be automatically renewed at the end of the
   existing subscription period. You can change this by submitting an UpdateSubscription request.

  request - `com.amazonaws.services.shield.model.CreateSubscriptionRequest`

  returns: Result of the CreateSubscription operation returned by the service. - `com.amazonaws.services.shield.model.CreateSubscriptionResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.CreateSubscriptionResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.CreateSubscriptionRequest request]
    (-> this (.createSubscription request))))

(defn describe-emergency-contact-settings
  "Lists the email addresses that the DRT can use to contact you during a suspected attack.

  request - `com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest`

  returns: Result of the DescribeEmergencyContactSettings operation returned by the service. - `com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest request]
    (-> this (.describeEmergencyContactSettings request))))

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

  request - `com.amazonaws.services.shield.model.AssociateDRTRoleRequest`

  returns: Result of the AssociateDRTRole operation returned by the service. - `com.amazonaws.services.shield.model.AssociateDRTRoleResult`

  throws: com.amazonaws.services.shield.model.InternalErrorException - Exception that indicates that a problem occurred with the service infrastructure. You can retry the request."
  (^com.amazonaws.services.shield.model.AssociateDRTRoleResult [^AWSShieldClient this ^com.amazonaws.services.shield.model.AssociateDRTRoleRequest request]
    (-> this (.associateDRTRole request))))

