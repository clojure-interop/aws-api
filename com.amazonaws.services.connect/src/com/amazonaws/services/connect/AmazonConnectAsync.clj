(ns com.amazonaws.services.connect.AmazonConnectAsync
  "Interface for accessing Amazon Connect asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonConnectAsync instead.



  The Amazon Connect API Reference provides descriptions, syntax, and usage examples for each of the Amazon Connect
  actions, data types, parameters, and errors. Amazon Connect is a cloud-based contact center solution that makes it
  easy to set up and manage a customer contact center and provide reliable customer engagement at any scale.


  Throttling limits for the Amazon Connect API operations:


  For the GetMetricData and GetCurrentMetricData operations, a RateLimit of 5 per second, and
  a BurstLimit of 8 per second.


  For all other operations, a RateLimit of 2 per second, and a BurstLimit of 5 per second.


  You can request an increase to the throttling limits by submitting a Amazon Connect
  service limits increase form. You must be signed in to your AWS account to access the form."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.connect AmazonConnectAsync]))

(defn get-federation-token-async
  "Retrieves a token for federation.

  get-federation-token-request - `com.amazonaws.services.connect.model.GetFederationTokenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFederationToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.GetFederationTokenResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.GetFederationTokenRequest get-federation-token-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFederationTokenAsync get-federation-token-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.GetFederationTokenRequest get-federation-token-request]
    (-> this (.getFederationTokenAsync get-federation-token-request))))

(defn start-outbound-voice-contact-async
  "The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a
   customer.


   If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact
   action.


   There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, the call
   fails.

  start-outbound-voice-contact-request - `com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartOutboundVoiceContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.StartOutboundVoiceContactResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest start-outbound-voice-contact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startOutboundVoiceContactAsync start-outbound-voice-contact-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest start-outbound-voice-contact-request]
    (-> this (.startOutboundVoiceContactAsync start-outbound-voice-contact-request))))

(defn update-user-hierarchy-async
  "Assigns the specified hierarchy group to the user.

  update-user-hierarchy-request - `com.amazonaws.services.connect.model.UpdateUserHierarchyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserHierarchy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateUserHierarchyResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserHierarchyRequest update-user-hierarchy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserHierarchyAsync update-user-hierarchy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserHierarchyRequest update-user-hierarchy-request]
    (-> this (.updateUserHierarchyAsync update-user-hierarchy-request))))

(defn list-user-hierarchy-groups-async
  "Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary
   objects that contain information about the hierarchy groups in your instance.

  list-user-hierarchy-groups-request - `com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserHierarchyGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.ListUserHierarchyGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest list-user-hierarchy-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserHierarchyGroupsAsync list-user-hierarchy-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest list-user-hierarchy-groups-request]
    (-> this (.listUserHierarchyGroupsAsync list-user-hierarchy-groups-request))))

(defn update-user-security-profiles-async
  "Updates the security profiles assigned to the user.

  update-user-security-profiles-request - `com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserSecurityProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateUserSecurityProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest update-user-security-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserSecurityProfilesAsync update-user-security-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest update-user-security-profiles-request]
    (-> this (.updateUserSecurityProfilesAsync update-user-security-profiles-request))))

(defn get-metric-data-async
  "The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance.


   If you are using an IAM account, it must have permission to the connect:GetMetricData action.

  get-metric-data-request - `com.amazonaws.services.connect.model.GetMetricDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.GetMetricDataResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.GetMetricDataRequest get-metric-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMetricDataAsync get-metric-data-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.GetMetricDataRequest get-metric-data-request]
    (-> this (.getMetricDataAsync get-metric-data-request))))

(defn delete-user-async
  "Deletes a user account from Amazon Connect.

  delete-user-request - `com.amazonaws.services.connect.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.DeleteUserRequest delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUserAsync delete-user-request))))

(defn get-contact-attributes-async
  "Retrieves the contact attributes associated with a contact.

  get-contact-attributes-request - `com.amazonaws.services.connect.model.GetContactAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContactAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.GetContactAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.GetContactAttributesRequest get-contact-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContactAttributesAsync get-contact-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.GetContactAttributesRequest get-contact-attributes-request]
    (-> this (.getContactAttributesAsync get-contact-attributes-request))))

(defn create-user-async
  "Creates a new user account in your Amazon Connect instance.

  create-user-request - `com.amazonaws.services.connect.model.CreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.CreateUserRequest create-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync create-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.CreateUserRequest create-user-request]
    (-> this (.createUserAsync create-user-request))))

(defn describe-user-hierarchy-structure-async
  "Returns a HiearchyGroupStructure object, which contains data about the levels in the agent
   hierarchy.

  describe-user-hierarchy-structure-request - `com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserHierarchyStructure operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.DescribeUserHierarchyStructureResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest describe-user-hierarchy-structure-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserHierarchyStructureAsync describe-user-hierarchy-structure-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest describe-user-hierarchy-structure-request]
    (-> this (.describeUserHierarchyStructureAsync describe-user-hierarchy-structure-request))))

(defn list-security-profiles-async
  "Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your
   instance, including the ARN, Id, and Name of the security profile.

  list-security-profiles-request - `com.amazonaws.services.connect.model.ListSecurityProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecurityProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.ListSecurityProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.ListSecurityProfilesRequest list-security-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecurityProfilesAsync list-security-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.ListSecurityProfilesRequest list-security-profiles-request]
    (-> this (.listSecurityProfilesAsync list-security-profiles-request))))

(defn stop-contact-async
  "Ends the contact initiated by the StartOutboundVoiceContact operation.


   If you are using an IAM account, it must have permission to the connect:StopContact action.

  stop-contact-request - `com.amazonaws.services.connect.model.StopContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.StopContactResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.StopContactRequest stop-contact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopContactAsync stop-contact-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.StopContactRequest stop-contact-request]
    (-> this (.stopContactAsync stop-contact-request))))

(defn get-current-metric-data-async
  "The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance.


   If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.

  get-current-metric-data-request - `com.amazonaws.services.connect.model.GetCurrentMetricDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCurrentMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.GetCurrentMetricDataResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.GetCurrentMetricDataRequest get-current-metric-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCurrentMetricDataAsync get-current-metric-data-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.GetCurrentMetricDataRequest get-current-metric-data-request]
    (-> this (.getCurrentMetricDataAsync get-current-metric-data-request))))

(defn describe-user-hierarchy-group-async
  "Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.

  describe-user-hierarchy-group-request - `com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserHierarchyGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.DescribeUserHierarchyGroupResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest describe-user-hierarchy-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserHierarchyGroupAsync describe-user-hierarchy-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest describe-user-hierarchy-group-request]
    (-> this (.describeUserHierarchyGroupAsync describe-user-hierarchy-group-request))))

(defn describe-user-async
  "Returns a User object that contains information about the user account specified by the
   UserId.

  describe-user-request - `com.amazonaws.services.connect.model.DescribeUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.DescribeUserResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserRequest describe-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserAsync describe-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.DescribeUserRequest describe-user-request]
    (-> this (.describeUserAsync describe-user-request))))

(defn update-user-phone-config-async
  "Updates the phone configuration settings in the UserPhoneConfig object for the specified user.

  update-user-phone-config-request - `com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserPhoneConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateUserPhoneConfigResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest update-user-phone-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserPhoneConfigAsync update-user-phone-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest update-user-phone-config-request]
    (-> this (.updateUserPhoneConfigAsync update-user-phone-config-request))))

(defn list-routing-profiles-async
  "Returns an array of RoutingProfileSummary objects that includes information about the routing
   profiles in your instance.

  list-routing-profiles-request - `com.amazonaws.services.connect.model.ListRoutingProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoutingProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.ListRoutingProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.ListRoutingProfilesRequest list-routing-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRoutingProfilesAsync list-routing-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.ListRoutingProfilesRequest list-routing-profiles-request]
    (-> this (.listRoutingProfilesAsync list-routing-profiles-request))))

(defn update-contact-attributes-async
  "The UpdateContactAttributes operation lets you programmatically create new, or update existing,
   contact attributes associated with a contact. You can use the operation to add or update attributes for both
   ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called
   while the call is active, or add notes about steps that the agent took during the call that are displayed to the
   next agent that takes the call. You can also use the UpdateContactAttributes operation to update
   attributes for a contact using data from your CRM application and save the data with the contact in Amazon
   Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers.


   Contact attributes are available in Amazon Connect for 24 months, and are then deleted.


   Important:


   You cannot use the operation to update attributes for contacts that occurred prior to the release of the API,
   September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you
   attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is
   returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still
   active in your instance.

  update-contact-attributes-request - `com.amazonaws.services.connect.model.UpdateContactAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateContactAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateContactAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateContactAttributesRequest update-contact-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateContactAttributesAsync update-contact-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateContactAttributesRequest update-contact-attributes-request]
    (-> this (.updateContactAttributesAsync update-contact-attributes-request))))

(defn update-user-routing-profile-async
  "Assigns the specified routing profile to a user.

  update-user-routing-profile-request - `com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserRoutingProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateUserRoutingProfileResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest update-user-routing-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserRoutingProfileAsync update-user-routing-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest update-user-routing-profile-request]
    (-> this (.updateUserRoutingProfileAsync update-user-routing-profile-request))))

(defn update-user-identity-info-async
  "Updates the identity information for the specified user in a UserIdentityInfo object, including
   email, first name, and last name.

  update-user-identity-info-request - `com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserIdentityInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.UpdateUserIdentityInfoResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest update-user-identity-info-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserIdentityInfoAsync update-user-identity-info-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest update-user-identity-info-request]
    (-> this (.updateUserIdentityInfoAsync update-user-identity-info-request))))

(defn list-users-async
  "Returns a UserSummaryList, which is an array of UserSummary objects.

  list-users-request - `com.amazonaws.services.connect.model.ListUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.connect.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.ListUsersRequest list-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync list-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConnectAsync this ^com.amazonaws.services.connect.model.ListUsersRequest list-users-request]
    (-> this (.listUsersAsync list-users-request))))

