(ns com.amazonaws.services.shield.AbstractAWSShield
  "Abstract implementation of AWSShield. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.shield AbstractAWSShield]))

(defn set-region
  "Description copied from interface: AWSShield

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSShield this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn disassociate-drt-log-bucket
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest`

  returns: Result of the DisassociateDRTLogBucket operation returned by the service. - `com.amazonaws.services.shield.model.DisassociateDRTLogBucketResult`"
  (^com.amazonaws.services.shield.model.DisassociateDRTLogBucketResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest request]
    (-> this (.disassociateDRTLogBucket request))))

(defn get-subscription-state
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.GetSubscriptionStateRequest`

  returns: Result of the GetSubscriptionState operation returned by the service. - `com.amazonaws.services.shield.model.GetSubscriptionStateResult`"
  (^com.amazonaws.services.shield.model.GetSubscriptionStateResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.GetSubscriptionStateRequest request]
    (-> this (.getSubscriptionState request))))

(defn describe-drt-access
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.DescribeDRTAccessRequest`

  returns: Result of the DescribeDRTAccess operation returned by the service. - `com.amazonaws.services.shield.model.DescribeDRTAccessResult`"
  (^com.amazonaws.services.shield.model.DescribeDRTAccessResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.DescribeDRTAccessRequest request]
    (-> this (.describeDRTAccess request))))

(defn create-protection
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.CreateProtectionRequest`

  returns: Result of the CreateProtection operation returned by the service. - `com.amazonaws.services.shield.model.CreateProtectionResult`"
  (^com.amazonaws.services.shield.model.CreateProtectionResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.CreateProtectionRequest request]
    (-> this (.createProtection request))))

(defn delete-subscription
  "Deprecated.

  request - `com.amazonaws.services.shield.model.DeleteSubscriptionRequest`

  returns: Result of the DeleteSubscription operation returned by the service. - `com.amazonaws.services.shield.model.DeleteSubscriptionResult`"
  (^com.amazonaws.services.shield.model.DeleteSubscriptionResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.DeleteSubscriptionRequest request]
    (-> this (.deleteSubscription request))))

(defn delete-protection
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.DeleteProtectionRequest`

  returns: Result of the DeleteProtection operation returned by the service. - `com.amazonaws.services.shield.model.DeleteProtectionResult`"
  (^com.amazonaws.services.shield.model.DeleteProtectionResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.DeleteProtectionRequest request]
    (-> this (.deleteProtection request))))

(defn associate-drt-log-bucket
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest`

  returns: Result of the AssociateDRTLogBucket operation returned by the service. - `com.amazonaws.services.shield.model.AssociateDRTLogBucketResult`"
  (^com.amazonaws.services.shield.model.AssociateDRTLogBucketResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest request]
    (-> this (.associateDRTLogBucket request))))

(defn update-emergency-contact-settings
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest`

  returns: Result of the UpdateEmergencyContactSettings operation returned by the service. - `com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsResult`"
  (^com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest request]
    (-> this (.updateEmergencyContactSettings request))))

(defn describe-protection
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.DescribeProtectionRequest`

  returns: Result of the DescribeProtection operation returned by the service. - `com.amazonaws.services.shield.model.DescribeProtectionResult`"
  (^com.amazonaws.services.shield.model.DescribeProtectionResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.DescribeProtectionRequest request]
    (-> this (.describeProtection request))))

(defn shutdown
  "Description copied from interface: AWSShield"
  ([^AbstractAWSShield this]
    (-> this (.shutdown))))

(defn describe-subscription
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.DescribeSubscriptionRequest`

  returns: Result of the DescribeSubscription operation returned by the service. - `com.amazonaws.services.shield.model.DescribeSubscriptionResult`"
  (^com.amazonaws.services.shield.model.DescribeSubscriptionResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.DescribeSubscriptionRequest request]
    (-> this (.describeSubscription request))))

(defn set-endpoint
  "Description copied from interface: AWSShield

  endpoint - The endpoint (ex: \"shield.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"shield.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSShield this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-attack
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.DescribeAttackRequest`

  returns: Result of the DescribeAttack operation returned by the service. - `com.amazonaws.services.shield.model.DescribeAttackResult`"
  (^com.amazonaws.services.shield.model.DescribeAttackResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.DescribeAttackRequest request]
    (-> this (.describeAttack request))))

(defn list-protections
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.ListProtectionsRequest`

  returns: Result of the ListProtections operation returned by the service. - `com.amazonaws.services.shield.model.ListProtectionsResult`"
  (^com.amazonaws.services.shield.model.ListProtectionsResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.ListProtectionsRequest request]
    (-> this (.listProtections request))))

(defn disassociate-drt-role
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.DisassociateDRTRoleRequest`

  returns: Result of the DisassociateDRTRole operation returned by the service. - `com.amazonaws.services.shield.model.DisassociateDRTRoleResult`"
  (^com.amazonaws.services.shield.model.DisassociateDRTRoleResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.DisassociateDRTRoleRequest request]
    (-> this (.disassociateDRTRole request))))

(defn update-subscription
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.UpdateSubscriptionRequest`

  returns: Result of the UpdateSubscription operation returned by the service. - `com.amazonaws.services.shield.model.UpdateSubscriptionResult`"
  (^com.amazonaws.services.shield.model.UpdateSubscriptionResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.UpdateSubscriptionRequest request]
    (-> this (.updateSubscription request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSShield

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSShield this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-attacks
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.ListAttacksRequest`

  returns: Result of the ListAttacks operation returned by the service. - `com.amazonaws.services.shield.model.ListAttacksResult`"
  (^com.amazonaws.services.shield.model.ListAttacksResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.ListAttacksRequest request]
    (-> this (.listAttacks request))))

(defn create-subscription
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.CreateSubscriptionRequest`

  returns: Result of the CreateSubscription operation returned by the service. - `com.amazonaws.services.shield.model.CreateSubscriptionResult`"
  (^com.amazonaws.services.shield.model.CreateSubscriptionResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.CreateSubscriptionRequest request]
    (-> this (.createSubscription request))))

(defn describe-emergency-contact-settings
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest`

  returns: Result of the DescribeEmergencyContactSettings operation returned by the service. - `com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsResult`"
  (^com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest request]
    (-> this (.describeEmergencyContactSettings request))))

(defn associate-drt-role
  "Description copied from interface: AWSShield

  request - `com.amazonaws.services.shield.model.AssociateDRTRoleRequest`

  returns: Result of the AssociateDRTRole operation returned by the service. - `com.amazonaws.services.shield.model.AssociateDRTRoleResult`"
  (^com.amazonaws.services.shield.model.AssociateDRTRoleResult [^AbstractAWSShield this ^com.amazonaws.services.shield.model.AssociateDRTRoleRequest request]
    (-> this (.associateDRTRole request))))

