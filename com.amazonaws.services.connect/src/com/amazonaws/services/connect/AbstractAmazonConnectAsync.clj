(ns com.amazonaws.services.connect.AbstractAmazonConnectAsync
  "Abstract implementation of AmazonConnectAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.connect AbstractAmazonConnectAsync]))

(defn get-federation-token-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.GetFederationTokenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFederationToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.GetFederationTokenResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.GetFederationTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFederationTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.GetFederationTokenRequest request]
    (-> this (.getFederationTokenAsync request))))

(defn start-outbound-voice-contact-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartOutboundVoiceContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.StartOutboundVoiceContactResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startOutboundVoiceContactAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest request]
    (-> this (.startOutboundVoiceContactAsync request))))

(defn update-user-hierarchy-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.UpdateUserHierarchyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserHierarchy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateUserHierarchyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserHierarchyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserHierarchyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserHierarchyRequest request]
    (-> this (.updateUserHierarchyAsync request))))

(defn list-user-hierarchy-groups-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserHierarchyGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.ListUserHierarchyGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserHierarchyGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest request]
    (-> this (.listUserHierarchyGroupsAsync request))))

(defn update-user-security-profiles-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserSecurityProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateUserSecurityProfilesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserSecurityProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest request]
    (-> this (.updateUserSecurityProfilesAsync request))))

(defn get-metric-data-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.GetMetricDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.GetMetricDataResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.GetMetricDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMetricDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.GetMetricDataRequest request]
    (-> this (.getMetricDataAsync request))))

(defn delete-user-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.DeleteUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.DeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.DeleteUserRequest request]
    (-> this (.deleteUserAsync request))))

(defn get-contact-attributes-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.GetContactAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContactAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.GetContactAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.GetContactAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContactAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.GetContactAttributesRequest request]
    (-> this (.getContactAttributesAsync request))))

(defn create-user-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.CreateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.CreateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.CreateUserRequest request]
    (-> this (.createUserAsync request))))

(defn describe-user-hierarchy-structure-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserHierarchyStructure operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.DescribeUserHierarchyStructureResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserHierarchyStructureAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest request]
    (-> this (.describeUserHierarchyStructureAsync request))))

(defn list-security-profiles-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.ListSecurityProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecurityProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.ListSecurityProfilesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.ListSecurityProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecurityProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.ListSecurityProfilesRequest request]
    (-> this (.listSecurityProfilesAsync request))))

(defn stop-contact-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.StopContactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.StopContactResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.StopContactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopContactAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.StopContactRequest request]
    (-> this (.stopContactAsync request))))

(defn get-current-metric-data-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.GetCurrentMetricDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCurrentMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.GetCurrentMetricDataResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.GetCurrentMetricDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCurrentMetricDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.GetCurrentMetricDataRequest request]
    (-> this (.getCurrentMetricDataAsync request))))

(defn describe-user-hierarchy-group-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserHierarchyGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.DescribeUserHierarchyGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserHierarchyGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest request]
    (-> this (.describeUserHierarchyGroupAsync request))))

(defn describe-user-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.DescribeUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.DescribeUserResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserRequest request]
    (-> this (.describeUserAsync request))))

(defn update-user-phone-config-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserPhoneConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateUserPhoneConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserPhoneConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest request]
    (-> this (.updateUserPhoneConfigAsync request))))

(defn list-routing-profiles-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.ListRoutingProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoutingProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.ListRoutingProfilesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.ListRoutingProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRoutingProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.ListRoutingProfilesRequest request]
    (-> this (.listRoutingProfilesAsync request))))

(defn update-contact-attributes-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.UpdateContactAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateContactAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateContactAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateContactAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateContactAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateContactAttributesRequest request]
    (-> this (.updateContactAttributesAsync request))))

(defn update-user-routing-profile-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserRoutingProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateUserRoutingProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserRoutingProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest request]
    (-> this (.updateUserRoutingProfileAsync request))))

(defn update-user-identity-info-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserIdentityInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateUserIdentityInfoResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserIdentityInfoAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest request]
    (-> this (.updateUserIdentityInfoAsync request))))

(defn list-users-async
  "Description copied from interface: AmazonConnectAsync

  request - `com.amazonaws.services.connect.model.ListUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.ListUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConnectAsync this ^com.amazonaws.services.connect.model.ListUsersRequest request]
    (-> this (.listUsersAsync request))))

