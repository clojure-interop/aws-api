(ns com.amazonaws.services.connect.AmazonConnect
  "Interface for accessing Amazon Connect.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonConnect instead.



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
  (:import [com.amazonaws.services.connect AmazonConnect]))

(defn update-user-routing-profile
  "Assigns the specified routing profile to a user.

  update-user-routing-profile-request - `com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest`

  returns: Result of the UpdateUserRoutingProfile operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserRoutingProfileResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateUserRoutingProfileResult [^AmazonConnect this ^com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest update-user-routing-profile-request]
    (-> this (.updateUserRoutingProfile update-user-routing-profile-request))))

(defn list-routing-profiles
  "Returns an array of RoutingProfileSummary objects that includes information about the routing
   profiles in your instance.

  list-routing-profiles-request - `com.amazonaws.services.connect.model.ListRoutingProfilesRequest`

  returns: Result of the ListRoutingProfiles operation returned by the service. - `com.amazonaws.services.connect.model.ListRoutingProfilesResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.ListRoutingProfilesResult [^AmazonConnect this ^com.amazonaws.services.connect.model.ListRoutingProfilesRequest list-routing-profiles-request]
    (-> this (.listRoutingProfiles list-routing-profiles-request))))

(defn update-user-identity-info
  "Updates the identity information for the specified user in a UserIdentityInfo object, including
   email, first name, and last name.

  update-user-identity-info-request - `com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest`

  returns: Result of the UpdateUserIdentityInfo operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserIdentityInfoResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateUserIdentityInfoResult [^AmazonConnect this ^com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest update-user-identity-info-request]
    (-> this (.updateUserIdentityInfo update-user-identity-info-request))))

(defn get-current-metric-data
  "The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance.


   If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.

  get-current-metric-data-request - `com.amazonaws.services.connect.model.GetCurrentMetricDataRequest`

  returns: Result of the GetCurrentMetricData operation returned by the service. - `com.amazonaws.services.connect.model.GetCurrentMetricDataResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.GetCurrentMetricDataResult [^AmazonConnect this ^com.amazonaws.services.connect.model.GetCurrentMetricDataRequest get-current-metric-data-request]
    (-> this (.getCurrentMetricData get-current-metric-data-request))))

(defn update-contact-attributes
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

  returns: Result of the UpdateContactAttributes operation returned by the service. - `com.amazonaws.services.connect.model.UpdateContactAttributesResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateContactAttributesResult [^AmazonConnect this ^com.amazonaws.services.connect.model.UpdateContactAttributesRequest update-contact-attributes-request]
    (-> this (.updateContactAttributes update-contact-attributes-request))))

(defn describe-user-hierarchy-structure
  "Returns a HiearchyGroupStructure object, which contains data about the levels in the agent
   hierarchy.

  describe-user-hierarchy-structure-request - `com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest`

  returns: Result of the DescribeUserHierarchyStructure operation returned by the service. - `com.amazonaws.services.connect.model.DescribeUserHierarchyStructureResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.DescribeUserHierarchyStructureResult [^AmazonConnect this ^com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest describe-user-hierarchy-structure-request]
    (-> this (.describeUserHierarchyStructure describe-user-hierarchy-structure-request))))

(defn list-users
  "Returns a UserSummaryList, which is an array of UserSummary objects.

  list-users-request - `com.amazonaws.services.connect.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.connect.model.ListUsersResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.ListUsersResult [^AmazonConnect this ^com.amazonaws.services.connect.model.ListUsersRequest list-users-request]
    (-> this (.listUsers list-users-request))))

(defn get-contact-attributes
  "Retrieves the contact attributes associated with a contact.

  get-contact-attributes-request - `com.amazonaws.services.connect.model.GetContactAttributesRequest`

  returns: Result of the GetContactAttributes operation returned by the service. - `com.amazonaws.services.connect.model.GetContactAttributesResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.GetContactAttributesResult [^AmazonConnect this ^com.amazonaws.services.connect.model.GetContactAttributesRequest get-contact-attributes-request]
    (-> this (.getContactAttributes get-contact-attributes-request))))

(defn create-user
  "Creates a new user account in your Amazon Connect instance.

  create-user-request - `com.amazonaws.services.connect.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.connect.model.CreateUserResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.CreateUserResult [^AmazonConnect this ^com.amazonaws.services.connect.model.CreateUserRequest create-user-request]
    (-> this (.createUser create-user-request))))

(defn delete-user
  "Deletes a user account from Amazon Connect.

  delete-user-request - `com.amazonaws.services.connect.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.connect.model.DeleteUserResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.DeleteUserResult [^AmazonConnect this ^com.amazonaws.services.connect.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUser delete-user-request))))

(defn describe-user-hierarchy-group
  "Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.

  describe-user-hierarchy-group-request - `com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest`

  returns: Result of the DescribeUserHierarchyGroup operation returned by the service. - `com.amazonaws.services.connect.model.DescribeUserHierarchyGroupResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.DescribeUserHierarchyGroupResult [^AmazonConnect this ^com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest describe-user-hierarchy-group-request]
    (-> this (.describeUserHierarchyGroup describe-user-hierarchy-group-request))))

(defn list-security-profiles
  "Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your
   instance, including the ARN, Id, and Name of the security profile.

  list-security-profiles-request - `com.amazonaws.services.connect.model.ListSecurityProfilesRequest`

  returns: Result of the ListSecurityProfiles operation returned by the service. - `com.amazonaws.services.connect.model.ListSecurityProfilesResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.ListSecurityProfilesResult [^AmazonConnect this ^com.amazonaws.services.connect.model.ListSecurityProfilesRequest list-security-profiles-request]
    (-> this (.listSecurityProfiles list-security-profiles-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonConnect this]
    (-> this (.shutdown))))

(defn start-outbound-voice-contact
  "The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a
   customer.


   If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact
   action.


   There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, the call
   fails.

  start-outbound-voice-contact-request - `com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest`

  returns: Result of the StartOutboundVoiceContact operation returned by the service. - `com.amazonaws.services.connect.model.StartOutboundVoiceContactResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.StartOutboundVoiceContactResult [^AmazonConnect this ^com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest start-outbound-voice-contact-request]
    (-> this (.startOutboundVoiceContact start-outbound-voice-contact-request))))

(defn stop-contact
  "Ends the contact initiated by the StartOutboundVoiceContact operation.


   If you are using an IAM account, it must have permission to the connect:StopContact action.

  stop-contact-request - `com.amazonaws.services.connect.model.StopContactRequest`

  returns: Result of the StopContact operation returned by the service. - `com.amazonaws.services.connect.model.StopContactResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.StopContactResult [^AmazonConnect this ^com.amazonaws.services.connect.model.StopContactRequest stop-contact-request]
    (-> this (.stopContact stop-contact-request))))

(defn update-user-security-profiles
  "Updates the security profiles assigned to the user.

  update-user-security-profiles-request - `com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest`

  returns: Result of the UpdateUserSecurityProfiles operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserSecurityProfilesResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateUserSecurityProfilesResult [^AmazonConnect this ^com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest update-user-security-profiles-request]
    (-> this (.updateUserSecurityProfiles update-user-security-profiles-request))))

(defn list-user-hierarchy-groups
  "Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary
   objects that contain information about the hierarchy groups in your instance.

  list-user-hierarchy-groups-request - `com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest`

  returns: Result of the ListUserHierarchyGroups operation returned by the service. - `com.amazonaws.services.connect.model.ListUserHierarchyGroupsResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.ListUserHierarchyGroupsResult [^AmazonConnect this ^com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest list-user-hierarchy-groups-request]
    (-> this (.listUserHierarchyGroups list-user-hierarchy-groups-request))))

(defn get-metric-data
  "The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance.


   If you are using an IAM account, it must have permission to the connect:GetMetricData action.

  get-metric-data-request - `com.amazonaws.services.connect.model.GetMetricDataRequest`

  returns: Result of the GetMetricData operation returned by the service. - `com.amazonaws.services.connect.model.GetMetricDataResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.GetMetricDataResult [^AmazonConnect this ^com.amazonaws.services.connect.model.GetMetricDataRequest get-metric-data-request]
    (-> this (.getMetricData get-metric-data-request))))

(defn describe-user
  "Returns a User object that contains information about the user account specified by the
   UserId.

  describe-user-request - `com.amazonaws.services.connect.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.connect.model.DescribeUserResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.DescribeUserResult [^AmazonConnect this ^com.amazonaws.services.connect.model.DescribeUserRequest describe-user-request]
    (-> this (.describeUser describe-user-request))))

(defn update-user-hierarchy
  "Assigns the specified hierarchy group to the user.

  update-user-hierarchy-request - `com.amazonaws.services.connect.model.UpdateUserHierarchyRequest`

  returns: Result of the UpdateUserHierarchy operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserHierarchyResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateUserHierarchyResult [^AmazonConnect this ^com.amazonaws.services.connect.model.UpdateUserHierarchyRequest update-user-hierarchy-request]
    (-> this (.updateUserHierarchy update-user-hierarchy-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonConnect this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-user-phone-config
  "Updates the phone configuration settings in the UserPhoneConfig object for the specified user.

  update-user-phone-config-request - `com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest`

  returns: Result of the UpdateUserPhoneConfig operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserPhoneConfigResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateUserPhoneConfigResult [^AmazonConnect this ^com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest update-user-phone-config-request]
    (-> this (.updateUserPhoneConfig update-user-phone-config-request))))

(defn get-federation-token
  "Retrieves a token for federation.

  get-federation-token-request - `com.amazonaws.services.connect.model.GetFederationTokenRequest`

  returns: Result of the GetFederationToken operation returned by the service. - `com.amazonaws.services.connect.model.GetFederationTokenResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.GetFederationTokenResult [^AmazonConnect this ^com.amazonaws.services.connect.model.GetFederationTokenRequest get-federation-token-request]
    (-> this (.getFederationToken get-federation-token-request))))

