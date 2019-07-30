(ns com.amazonaws.services.shield.AWSShieldAsync
  "Interface for accessing AWS Shield asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSShieldAsync instead.


  AWS Shield Advanced

  This is the AWS Shield Advanced API Reference. This guide is for developers who need detailed information
  about the AWS Shield Advanced API actions, data types, and errors. For detailed information about AWS WAF and AWS
  Shield Advanced features and an overview of how to use the AWS WAF and AWS Shield Advanced APIs, see the AWS WAF and AWS Shield Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.shield AWSShieldAsync]))

(defn disassociate-drt-log-bucket-async
  "Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your AWS WAF logs.


   To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are
   not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
   account, you can submit a DisassociateDRTLogBucket request to remove this access.

  disassociate-drt-log-bucket-request - `com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDRTLogBucket operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DisassociateDRTLogBucketResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest disassociate-drt-log-bucket-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDRTLogBucketAsync disassociate-drt-log-bucket-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest disassociate-drt-log-bucket-request]
    (-> this (.disassociateDRTLogBucketAsync disassociate-drt-log-bucket-request))))

(defn describe-drt-access-async
  "Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your
   AWS account while assisting with attack mitigation.

  describe-drt-access-request - `com.amazonaws.services.shield.model.DescribeDRTAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDRTAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DescribeDRTAccessResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeDRTAccessRequest describe-drt-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDRTAccessAsync describe-drt-access-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeDRTAccessRequest describe-drt-access-request]
    (-> this (.describeDRTAccessAsync describe-drt-access-request))))

(defn disassociate-drt-role-async
  "Removes the DDoS Response team's (DRT) access to your AWS account.


   To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are
   not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
   account, you can submit a DisassociateDRTRole request to remove this access.

  disassociate-drt-role-request - `com.amazonaws.services.shield.model.DisassociateDRTRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDRTRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DisassociateDRTRoleResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DisassociateDRTRoleRequest disassociate-drt-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDRTRoleAsync disassociate-drt-role-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DisassociateDRTRoleRequest disassociate-drt-role-request]
    (-> this (.disassociateDRTRoleAsync disassociate-drt-role-request))))

(defn list-attacks-async
  "Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.

  list-attacks-request - `com.amazonaws.services.shield.model.ListAttacksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.ListAttacksResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.ListAttacksRequest list-attacks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttacksAsync list-attacks-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.ListAttacksRequest list-attacks-request]
    (-> this (.listAttacksAsync list-attacks-request))))

(defn update-emergency-contact-settings-async
  "Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.

  update-emergency-contact-settings-request - `com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEmergencyContactSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest update-emergency-contact-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEmergencyContactSettingsAsync update-emergency-contact-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest update-emergency-contact-settings-request]
    (-> this (.updateEmergencyContactSettingsAsync update-emergency-contact-settings-request))))

(defn describe-emergency-contact-settings-async
  "Lists the email addresses that the DRT can use to contact you during a suspected attack.

  describe-emergency-contact-settings-request - `com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEmergencyContactSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest describe-emergency-contact-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEmergencyContactSettingsAsync describe-emergency-contact-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest describe-emergency-contact-settings-request]
    (-> this (.describeEmergencyContactSettingsAsync describe-emergency-contact-settings-request))))

(defn list-protections-async
  "Lists all Protection objects for the account.

  list-protections-request - `com.amazonaws.services.shield.model.ListProtectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProtections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.ListProtectionsResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.ListProtectionsRequest list-protections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProtectionsAsync list-protections-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.ListProtectionsRequest list-protections-request]
    (-> this (.listProtectionsAsync list-protections-request))))

(defn create-protection-async
  "Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution,
   Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route
   53 hosted zone.


   You can add protection to only a single resource with each CreateProtection request. If you want to add
   protection to multiple resources at once, use the AWS WAF
   console. For more information see Getting Started with AWS
   Shield Advanced and Add AWS Shield
   Advanced Protection to more AWS Resources.

  create-protection-request - `com.amazonaws.services.shield.model.CreateProtectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.CreateProtectionResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.CreateProtectionRequest create-protection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProtectionAsync create-protection-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.CreateProtectionRequest create-protection-request]
    (-> this (.createProtectionAsync create-protection-request))))

(defn describe-attack-async
  "Describes the details of a DDoS attack.

  describe-attack-request - `com.amazonaws.services.shield.model.DescribeAttackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAttack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DescribeAttackResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeAttackRequest describe-attack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAttackAsync describe-attack-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeAttackRequest describe-attack-request]
    (-> this (.describeAttackAsync describe-attack-request))))

(defn delete-subscription-async
  "Deprecated.

  delete-subscription-request - `com.amazonaws.services.shield.model.DeleteSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DeleteSubscriptionResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DeleteSubscriptionRequest delete-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubscriptionAsync delete-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DeleteSubscriptionRequest delete-subscription-request]
    (-> this (.deleteSubscriptionAsync delete-subscription-request))))

(defn describe-subscription-async
  "Provides details about the AWS Shield Advanced subscription for an account.

  describe-subscription-request - `com.amazonaws.services.shield.model.DescribeSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DescribeSubscriptionResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeSubscriptionRequest describe-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubscriptionAsync describe-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeSubscriptionRequest describe-subscription-request]
    (-> this (.describeSubscriptionAsync describe-subscription-request))))

(defn update-subscription-async
  "Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty
   parameters are not updated.

  update-subscription-request - `com.amazonaws.services.shield.model.UpdateSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.UpdateSubscriptionResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.UpdateSubscriptionRequest update-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSubscriptionAsync update-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.UpdateSubscriptionRequest update-subscription-request]
    (-> this (.updateSubscriptionAsync update-subscription-request))))

(defn associate-drt-role-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDRTRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.AssociateDRTRoleResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.AssociateDRTRoleRequest associate-drt-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDRTRoleAsync associate-drt-role-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.AssociateDRTRoleRequest associate-drt-role-request]
    (-> this (.associateDRTRoleAsync associate-drt-role-request))))

(defn get-subscription-state-async
  "Returns the SubscriptionState, either Active or Inactive.

  get-subscription-state-request - `com.amazonaws.services.shield.model.GetSubscriptionStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSubscriptionState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.GetSubscriptionStateResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.GetSubscriptionStateRequest get-subscription-state-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSubscriptionStateAsync get-subscription-state-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.GetSubscriptionStateRequest get-subscription-state-request]
    (-> this (.getSubscriptionStateAsync get-subscription-state-request))))

(defn delete-protection-async
  "Deletes an AWS Shield Advanced Protection.

  delete-protection-request - `com.amazonaws.services.shield.model.DeleteProtectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DeleteProtectionResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DeleteProtectionRequest delete-protection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProtectionAsync delete-protection-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DeleteProtectionRequest delete-protection-request]
    (-> this (.deleteProtectionAsync delete-protection-request))))

(defn describe-protection-async
  "Lists the details of a Protection object.

  describe-protection-request - `com.amazonaws.services.shield.model.DescribeProtectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DescribeProtectionResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeProtectionRequest describe-protection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProtectionAsync describe-protection-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeProtectionRequest describe-protection-request]
    (-> this (.describeProtectionAsync describe-protection-request))))

(defn create-subscription-async
  "Activates AWS Shield Advanced for an account.


   As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response
   team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team
   to Create Rules and Web ACLs on Your Behalf.


   To use the services of the DRT, you must be subscribed to the Business Support plan or the Enterprise Support plan.


   When you initally create a subscription, your subscription is set to be automatically renewed at the end of the
   existing subscription period. You can change this by submitting an UpdateSubscription request.

  create-subscription-request - `com.amazonaws.services.shield.model.CreateSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.CreateSubscriptionResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.CreateSubscriptionRequest create-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubscriptionAsync create-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.CreateSubscriptionRequest create-subscription-request]
    (-> this (.createSubscriptionAsync create-subscription-request))))

(defn associate-drt-log-bucket-async
  "Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your AWS WAF logs.
   You can associate up to 10 Amazon S3 buckets with your subscription.


   To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to
   the Business Support plan or the Enterprise Support plan.

  associate-drt-log-bucket-request - `com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDRTLogBucket operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.AssociateDRTLogBucketResult>`"
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest associate-drt-log-bucket-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDRTLogBucketAsync associate-drt-log-bucket-request async-handler)))
  (^java.util.concurrent.Future [^AWSShieldAsync this ^com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest associate-drt-log-bucket-request]
    (-> this (.associateDRTLogBucketAsync associate-drt-log-bucket-request))))

