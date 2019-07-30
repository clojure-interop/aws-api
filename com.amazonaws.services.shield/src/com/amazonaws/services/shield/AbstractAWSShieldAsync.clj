(ns com.amazonaws.services.shield.AbstractAWSShieldAsync
  "Abstract implementation of AWSShieldAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.shield AbstractAWSShieldAsync]))

(defn disassociate-drt-log-bucket-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDRTLogBucket operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DisassociateDRTLogBucketResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDRTLogBucketAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DisassociateDRTLogBucketRequest request]
    (-> this (.disassociateDRTLogBucketAsync request))))

(defn describe-drt-access-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.DescribeDRTAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDRTAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DescribeDRTAccessResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeDRTAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDRTAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeDRTAccessRequest request]
    (-> this (.describeDRTAccessAsync request))))

(defn disassociate-drt-role-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.DisassociateDRTRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDRTRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DisassociateDRTRoleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DisassociateDRTRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDRTRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DisassociateDRTRoleRequest request]
    (-> this (.disassociateDRTRoleAsync request))))

(defn list-attacks-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.ListAttacksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.ListAttacksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.ListAttacksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttacksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.ListAttacksRequest request]
    (-> this (.listAttacksAsync request))))

(defn update-emergency-contact-settings-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEmergencyContactSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEmergencyContactSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.UpdateEmergencyContactSettingsRequest request]
    (-> this (.updateEmergencyContactSettingsAsync request))))

(defn describe-emergency-contact-settings-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEmergencyContactSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEmergencyContactSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeEmergencyContactSettingsRequest request]
    (-> this (.describeEmergencyContactSettingsAsync request))))

(defn list-protections-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.ListProtectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProtections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.ListProtectionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.ListProtectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProtectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.ListProtectionsRequest request]
    (-> this (.listProtectionsAsync request))))

(defn create-protection-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.CreateProtectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.CreateProtectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.CreateProtectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProtectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.CreateProtectionRequest request]
    (-> this (.createProtectionAsync request))))

(defn describe-attack-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.DescribeAttackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAttack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DescribeAttackResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeAttackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAttackAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeAttackRequest request]
    (-> this (.describeAttackAsync request))))

(defn delete-subscription-async
  "Deprecated.

  request - `com.amazonaws.services.shield.model.DeleteSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DeleteSubscriptionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DeleteSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DeleteSubscriptionRequest request]
    (-> this (.deleteSubscriptionAsync request))))

(defn describe-subscription-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.DescribeSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DescribeSubscriptionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeSubscriptionRequest request]
    (-> this (.describeSubscriptionAsync request))))

(defn update-subscription-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.UpdateSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.UpdateSubscriptionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.UpdateSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.UpdateSubscriptionRequest request]
    (-> this (.updateSubscriptionAsync request))))

(defn associate-drt-role-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.AssociateDRTRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDRTRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.AssociateDRTRoleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.AssociateDRTRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDRTRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.AssociateDRTRoleRequest request]
    (-> this (.associateDRTRoleAsync request))))

(defn get-subscription-state-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.GetSubscriptionStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSubscriptionState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.GetSubscriptionStateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.GetSubscriptionStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSubscriptionStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.GetSubscriptionStateRequest request]
    (-> this (.getSubscriptionStateAsync request))))

(defn delete-protection-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.DeleteProtectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DeleteProtectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DeleteProtectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProtectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DeleteProtectionRequest request]
    (-> this (.deleteProtectionAsync request))))

(defn describe-protection-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.DescribeProtectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.DescribeProtectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeProtectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProtectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.DescribeProtectionRequest request]
    (-> this (.describeProtectionAsync request))))

(defn create-subscription-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.CreateSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.CreateSubscriptionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.CreateSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.CreateSubscriptionRequest request]
    (-> this (.createSubscriptionAsync request))))

(defn associate-drt-log-bucket-async
  "Description copied from interface: AWSShieldAsync

  request - `com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDRTLogBucket operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.shield.model.AssociateDRTLogBucketResult>`"
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDRTLogBucketAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSShieldAsync this ^com.amazonaws.services.shield.model.AssociateDRTLogBucketRequest request]
    (-> this (.associateDRTLogBucketAsync request))))

