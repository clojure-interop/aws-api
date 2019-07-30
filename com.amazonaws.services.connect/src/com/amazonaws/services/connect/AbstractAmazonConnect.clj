(ns com.amazonaws.services.connect.AbstractAmazonConnect
  "Abstract implementation of AmazonConnect. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.connect AbstractAmazonConnect]))

(defn update-user-routing-profile
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest`

  returns: Result of the UpdateUserRoutingProfile operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserRoutingProfileResult`"
  (^com.amazonaws.services.connect.model.UpdateUserRoutingProfileResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest request]
    (-> this (.updateUserRoutingProfile request))))

(defn list-routing-profiles
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.ListRoutingProfilesRequest`

  returns: Result of the ListRoutingProfiles operation returned by the service. - `com.amazonaws.services.connect.model.ListRoutingProfilesResult`"
  (^com.amazonaws.services.connect.model.ListRoutingProfilesResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.ListRoutingProfilesRequest request]
    (-> this (.listRoutingProfiles request))))

(defn update-user-identity-info
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest`

  returns: Result of the UpdateUserIdentityInfo operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserIdentityInfoResult`"
  (^com.amazonaws.services.connect.model.UpdateUserIdentityInfoResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest request]
    (-> this (.updateUserIdentityInfo request))))

(defn get-current-metric-data
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.GetCurrentMetricDataRequest`

  returns: Result of the GetCurrentMetricData operation returned by the service. - `com.amazonaws.services.connect.model.GetCurrentMetricDataResult`"
  (^com.amazonaws.services.connect.model.GetCurrentMetricDataResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.GetCurrentMetricDataRequest request]
    (-> this (.getCurrentMetricData request))))

(defn update-contact-attributes
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.UpdateContactAttributesRequest`

  returns: Result of the UpdateContactAttributes operation returned by the service. - `com.amazonaws.services.connect.model.UpdateContactAttributesResult`"
  (^com.amazonaws.services.connect.model.UpdateContactAttributesResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.UpdateContactAttributesRequest request]
    (-> this (.updateContactAttributes request))))

(defn describe-user-hierarchy-structure
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest`

  returns: Result of the DescribeUserHierarchyStructure operation returned by the service. - `com.amazonaws.services.connect.model.DescribeUserHierarchyStructureResult`"
  (^com.amazonaws.services.connect.model.DescribeUserHierarchyStructureResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest request]
    (-> this (.describeUserHierarchyStructure request))))

(defn list-users
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.connect.model.ListUsersResult`"
  (^com.amazonaws.services.connect.model.ListUsersResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn get-contact-attributes
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.GetContactAttributesRequest`

  returns: Result of the GetContactAttributes operation returned by the service. - `com.amazonaws.services.connect.model.GetContactAttributesResult`"
  (^com.amazonaws.services.connect.model.GetContactAttributesResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.GetContactAttributesRequest request]
    (-> this (.getContactAttributes request))))

(defn create-user
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.connect.model.CreateUserResult`"
  (^com.amazonaws.services.connect.model.CreateUserResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn delete-user
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.connect.model.DeleteUserResult`"
  (^com.amazonaws.services.connect.model.DeleteUserResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn describe-user-hierarchy-group
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest`

  returns: Result of the DescribeUserHierarchyGroup operation returned by the service. - `com.amazonaws.services.connect.model.DescribeUserHierarchyGroupResult`"
  (^com.amazonaws.services.connect.model.DescribeUserHierarchyGroupResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest request]
    (-> this (.describeUserHierarchyGroup request))))

(defn list-security-profiles
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.ListSecurityProfilesRequest`

  returns: Result of the ListSecurityProfiles operation returned by the service. - `com.amazonaws.services.connect.model.ListSecurityProfilesResult`"
  (^com.amazonaws.services.connect.model.ListSecurityProfilesResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.ListSecurityProfilesRequest request]
    (-> this (.listSecurityProfiles request))))

(defn shutdown
  "Description copied from interface: AmazonConnect"
  ([^AbstractAmazonConnect this]
    (-> this (.shutdown))))

(defn start-outbound-voice-contact
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest`

  returns: Result of the StartOutboundVoiceContact operation returned by the service. - `com.amazonaws.services.connect.model.StartOutboundVoiceContactResult`"
  (^com.amazonaws.services.connect.model.StartOutboundVoiceContactResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest request]
    (-> this (.startOutboundVoiceContact request))))

(defn stop-contact
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.StopContactRequest`

  returns: Result of the StopContact operation returned by the service. - `com.amazonaws.services.connect.model.StopContactResult`"
  (^com.amazonaws.services.connect.model.StopContactResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.StopContactRequest request]
    (-> this (.stopContact request))))

(defn update-user-security-profiles
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest`

  returns: Result of the UpdateUserSecurityProfiles operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserSecurityProfilesResult`"
  (^com.amazonaws.services.connect.model.UpdateUserSecurityProfilesResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest request]
    (-> this (.updateUserSecurityProfiles request))))

(defn list-user-hierarchy-groups
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest`

  returns: Result of the ListUserHierarchyGroups operation returned by the service. - `com.amazonaws.services.connect.model.ListUserHierarchyGroupsResult`"
  (^com.amazonaws.services.connect.model.ListUserHierarchyGroupsResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest request]
    (-> this (.listUserHierarchyGroups request))))

(defn get-metric-data
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.GetMetricDataRequest`

  returns: Result of the GetMetricData operation returned by the service. - `com.amazonaws.services.connect.model.GetMetricDataResult`"
  (^com.amazonaws.services.connect.model.GetMetricDataResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.GetMetricDataRequest request]
    (-> this (.getMetricData request))))

(defn describe-user
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.connect.model.DescribeUserResult`"
  (^com.amazonaws.services.connect.model.DescribeUserResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.DescribeUserRequest request]
    (-> this (.describeUser request))))

(defn update-user-hierarchy
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.UpdateUserHierarchyRequest`

  returns: Result of the UpdateUserHierarchy operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserHierarchyResult`"
  (^com.amazonaws.services.connect.model.UpdateUserHierarchyResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.UpdateUserHierarchyRequest request]
    (-> this (.updateUserHierarchy request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonConnect

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonConnect this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-user-phone-config
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest`

  returns: Result of the UpdateUserPhoneConfig operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserPhoneConfigResult`"
  (^com.amazonaws.services.connect.model.UpdateUserPhoneConfigResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest request]
    (-> this (.updateUserPhoneConfig request))))

(defn get-federation-token
  "Description copied from interface: AmazonConnect

  request - `com.amazonaws.services.connect.model.GetFederationTokenRequest`

  returns: Result of the GetFederationToken operation returned by the service. - `com.amazonaws.services.connect.model.GetFederationTokenResult`"
  (^com.amazonaws.services.connect.model.GetFederationTokenResult [^AbstractAmazonConnect this ^com.amazonaws.services.connect.model.GetFederationTokenRequest request]
    (-> this (.getFederationToken request))))

