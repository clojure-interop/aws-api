(ns com.amazonaws.services.connect.AmazonConnectClient
  "Client for accessing Amazon Connect. All service calls made using this client are blocking, and will not return until
  the service call completes.


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
  (:import [com.amazonaws.services.connect AmazonConnectClient]))

(defn *builder
  "returns: `com.amazonaws.services.connect.AmazonConnectClientBuilder`"
  (^com.amazonaws.services.connect.AmazonConnectClientBuilder []
    (AmazonConnectClient/builder )))

(defn update-user-routing-profile
  "Assigns the specified routing profile to a user.

  request - `com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest`

  returns: Result of the UpdateUserRoutingProfile operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserRoutingProfileResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateUserRoutingProfileResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.UpdateUserRoutingProfileRequest request]
    (-> this (.updateUserRoutingProfile request))))

(defn list-routing-profiles
  "Returns an array of RoutingProfileSummary objects that includes information about the routing
   profiles in your instance.

  request - `com.amazonaws.services.connect.model.ListRoutingProfilesRequest`

  returns: Result of the ListRoutingProfiles operation returned by the service. - `com.amazonaws.services.connect.model.ListRoutingProfilesResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.ListRoutingProfilesResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.ListRoutingProfilesRequest request]
    (-> this (.listRoutingProfiles request))))

(defn update-user-identity-info
  "Updates the identity information for the specified user in a UserIdentityInfo object, including
   email, first name, and last name.

  request - `com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest`

  returns: Result of the UpdateUserIdentityInfo operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserIdentityInfoResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateUserIdentityInfoResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.UpdateUserIdentityInfoRequest request]
    (-> this (.updateUserIdentityInfo request))))

(defn get-current-metric-data
  "The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance.


   If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.

  request - `com.amazonaws.services.connect.model.GetCurrentMetricDataRequest`

  returns: Result of the GetCurrentMetricData operation returned by the service. - `com.amazonaws.services.connect.model.GetCurrentMetricDataResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.GetCurrentMetricDataResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.GetCurrentMetricDataRequest request]
    (-> this (.getCurrentMetricData request))))

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

  request - `com.amazonaws.services.connect.model.UpdateContactAttributesRequest`

  returns: Result of the UpdateContactAttributes operation returned by the service. - `com.amazonaws.services.connect.model.UpdateContactAttributesResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateContactAttributesResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.UpdateContactAttributesRequest request]
    (-> this (.updateContactAttributes request))))

(defn describe-user-hierarchy-structure
  "Returns a HiearchyGroupStructure object, which contains data about the levels in the agent
   hierarchy.

  request - `com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest`

  returns: Result of the DescribeUserHierarchyStructure operation returned by the service. - `com.amazonaws.services.connect.model.DescribeUserHierarchyStructureResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.DescribeUserHierarchyStructureResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.DescribeUserHierarchyStructureRequest request]
    (-> this (.describeUserHierarchyStructure request))))

(defn list-users
  "Returns a UserSummaryList, which is an array of UserSummary objects.

  request - `com.amazonaws.services.connect.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.connect.model.ListUsersResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.ListUsersResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn get-contact-attributes
  "Retrieves the contact attributes associated with a contact.

  request - `com.amazonaws.services.connect.model.GetContactAttributesRequest`

  returns: Result of the GetContactAttributes operation returned by the service. - `com.amazonaws.services.connect.model.GetContactAttributesResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.GetContactAttributesResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.GetContactAttributesRequest request]
    (-> this (.getContactAttributes request))))

(defn create-user
  "Creates a new user account in your Amazon Connect instance.

  request - `com.amazonaws.services.connect.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.connect.model.CreateUserResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.CreateUserResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn delete-user
  "Deletes a user account from Amazon Connect.

  request - `com.amazonaws.services.connect.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.connect.model.DeleteUserResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.DeleteUserResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn describe-user-hierarchy-group
  "Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.

  request - `com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest`

  returns: Result of the DescribeUserHierarchyGroup operation returned by the service. - `com.amazonaws.services.connect.model.DescribeUserHierarchyGroupResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.DescribeUserHierarchyGroupResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.DescribeUserHierarchyGroupRequest request]
    (-> this (.describeUserHierarchyGroup request))))

(defn list-security-profiles
  "Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your
   instance, including the ARN, Id, and Name of the security profile.

  request - `com.amazonaws.services.connect.model.ListSecurityProfilesRequest`

  returns: Result of the ListSecurityProfiles operation returned by the service. - `com.amazonaws.services.connect.model.ListSecurityProfilesResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.ListSecurityProfilesResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.ListSecurityProfilesRequest request]
    (-> this (.listSecurityProfiles request))))

(defn start-outbound-voice-contact
  "The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a
   customer.


   If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact
   action.


   There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, the call
   fails.

  request - `com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest`

  returns: Result of the StartOutboundVoiceContact operation returned by the service. - `com.amazonaws.services.connect.model.StartOutboundVoiceContactResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.StartOutboundVoiceContactResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest request]
    (-> this (.startOutboundVoiceContact request))))

(defn stop-contact
  "Ends the contact initiated by the StartOutboundVoiceContact operation.


   If you are using an IAM account, it must have permission to the connect:StopContact action.

  request - `com.amazonaws.services.connect.model.StopContactRequest`

  returns: Result of the StopContact operation returned by the service. - `com.amazonaws.services.connect.model.StopContactResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.StopContactResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.StopContactRequest request]
    (-> this (.stopContact request))))

(defn update-user-security-profiles
  "Updates the security profiles assigned to the user.

  request - `com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest`

  returns: Result of the UpdateUserSecurityProfiles operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserSecurityProfilesResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateUserSecurityProfilesResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.UpdateUserSecurityProfilesRequest request]
    (-> this (.updateUserSecurityProfiles request))))

(defn list-user-hierarchy-groups
  "Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary
   objects that contain information about the hierarchy groups in your instance.

  request - `com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest`

  returns: Result of the ListUserHierarchyGroups operation returned by the service. - `com.amazonaws.services.connect.model.ListUserHierarchyGroupsResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.ListUserHierarchyGroupsResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.ListUserHierarchyGroupsRequest request]
    (-> this (.listUserHierarchyGroups request))))

(defn get-metric-data
  "The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance.


   If you are using an IAM account, it must have permission to the connect:GetMetricData action.

  request - `com.amazonaws.services.connect.model.GetMetricDataRequest`

  returns: Result of the GetMetricData operation returned by the service. - `com.amazonaws.services.connect.model.GetMetricDataResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.GetMetricDataResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.GetMetricDataRequest request]
    (-> this (.getMetricData request))))

(defn describe-user
  "Returns a User object that contains information about the user account specified by the
   UserId.

  request - `com.amazonaws.services.connect.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.connect.model.DescribeUserResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.DescribeUserResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.DescribeUserRequest request]
    (-> this (.describeUser request))))

(defn update-user-hierarchy
  "Assigns the specified hierarchy group to the user.

  request - `com.amazonaws.services.connect.model.UpdateUserHierarchyRequest`

  returns: Result of the UpdateUserHierarchy operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserHierarchyResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateUserHierarchyResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.UpdateUserHierarchyRequest request]
    (-> this (.updateUserHierarchy request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonConnectClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-user-phone-config
  "Updates the phone configuration settings in the UserPhoneConfig object for the specified user.

  request - `com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest`

  returns: Result of the UpdateUserPhoneConfig operation returned by the service. - `com.amazonaws.services.connect.model.UpdateUserPhoneConfigResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.UpdateUserPhoneConfigResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.UpdateUserPhoneConfigRequest request]
    (-> this (.updateUserPhoneConfig request))))

(defn get-federation-token
  "Retrieves a token for federation.

  request - `com.amazonaws.services.connect.model.GetFederationTokenRequest`

  returns: Result of the GetFederationToken operation returned by the service. - `com.amazonaws.services.connect.model.GetFederationTokenResult`

  throws: com.amazonaws.services.connect.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.connect.model.GetFederationTokenResult [^AmazonConnectClient this ^com.amazonaws.services.connect.model.GetFederationTokenRequest request]
    (-> this (.getFederationToken request))))

