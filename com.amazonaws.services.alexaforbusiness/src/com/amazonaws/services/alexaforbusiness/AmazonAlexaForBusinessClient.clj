(ns com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusinessClient
  "Client for accessing Alexa For Business. All service calls made using this client are blocking, and will not return
  until the service call completes.


  Alexa for Business helps you use Alexa in your organization. Alexa for Business provides you with the tools to manage
  Alexa devices, enroll your users, and assign skills, at scale. You can build your own context-aware voice skills
  using the Alexa Skills Kit and the Alexa for Business API operations. You can also make these available as private
  skills for your organization. Alexa for Business makes it efficient to voice-enable your products and services, thus
  providing context-aware voice experiences for your customers. Device makers building with the Alexa Voice Service
  (AVS) can create fully integrated solutions, register their products with Alexa for Business, and manage them as
  shared devices in their organization."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.alexaforbusiness AmazonAlexaForBusinessClient]))

(defn *builder
  "returns: `com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusinessClientBuilder`"
  (^com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusinessClientBuilder []
    (AmazonAlexaForBusinessClient/builder )))

(defn associate-device-with-room
  "Associates a device with a given room. This applies all the settings from the room profile to the device, and all
   the skills in any skill groups added to that room. This operation requires the device to be online, or else a
   manual sync is required.

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest`

  returns: Result of the AssociateDeviceWithRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest request]
    (-> this (.associateDeviceWithRoom request))))

(defn search-address-books
  "Searches address books and lists the ones that meet a set of filter and sort criteria.

  request - `com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest`

  returns: Result of the SearchAddressBooks operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest request]
    (-> this (.searchAddressBooks request))))

(defn search-contacts
  "Searches contacts and lists the ones that meet a set of filter and sort criteria.

  request - `com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest`

  returns: Result of the SearchContacts operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchContactsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchContactsResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest request]
    (-> this (.searchContacts request))))

(defn delete-gateway-group
  "Deletes a gateway group.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest`

  returns: Result of the DeleteGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ResourceAssociatedException - Another resource is associated with the resource in the request."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest request]
    (-> this (.deleteGatewayGroup request))))

(defn start-smart-home-appliance-discovery
  "Initiates the discovery of any smart home appliances associated with the room.

  request - `com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest`

  returns: Result of the StartSmartHomeApplianceDiscovery operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest request]
    (-> this (.startSmartHomeApplianceDiscovery request))))

(defn disassociate-skill-from-users
  "Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest`

  returns: Result of the DisassociateSkillFromUsers operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest request]
    (-> this (.disassociateSkillFromUsers request))))

(defn update-business-report-schedule
  "Updates the configuration of the report delivery schedule with the specified schedule ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest`

  returns: Result of the UpdateBusinessReportSchedule operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest request]
    (-> this (.updateBusinessReportSchedule request))))

(defn get-skill-group
  "Gets skill group details by skill group ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest`

  returns: Result of the GetSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest request]
    (-> this (.getSkillGroup request))))

(defn search-profiles
  "Searches room profiles and lists the ones that meet a set of filter criteria.

  request - `com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest`

  returns: Result of the SearchProfiles operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest request]
    (-> this (.searchProfiles request))))

(defn start-device-sync
  "Resets a device and its account to the known default settings. This clears all information and settings set by
   previous users in the following ways:




   Bluetooth - This unpairs all bluetooth devices paired with your echo device.




   Volume - This resets the echo device's volume to the default value.




   Notifications - This clears all notifications from your echo device.




   Lists - This clears all to-do items from your echo device.




   Settings - This internally syncs the room's profile (if the device is assigned to a room), contacts, address
   books, delegation access for account linking, and communications (if enabled on the room profile).

  request - `com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest`

  returns: Result of the StartDeviceSync operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult`

  throws: com.amazonaws.services.alexaforbusiness.model.DeviceNotRegisteredException - The request failed because this device is no longer registered and therefore no longer managed by this account."
  (^com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest request]
    (-> this (.startDeviceSync request))))

(defn create-network-profile
  "Creates a network profile with the specified details.

  request - `com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest`

  returns: Result of the CreateNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest request]
    (-> this (.createNetworkProfile request))))

(defn send-announcement
  "Triggers an asynchronous flow to send text, SSML, or audio announcements to rooms that are identified by a search
   or filter.

  request - `com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest`

  returns: Result of the SendAnnouncement operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SendAnnouncementResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.SendAnnouncementResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest request]
    (-> this (.sendAnnouncement request))))

(defn create-room
  "Creates a room with the specified details.

  request - `com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest`

  returns: Result of the CreateRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateRoomResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest request]
    (-> this (.createRoom request))))

(defn list-tags
  "Lists all tags for the specified resource.

  request - `com.amazonaws.services.alexaforbusiness.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListTagsResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.ListTagsResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn update-address-book
  "Updates address book details by the address book ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest`

  returns: Result of the UpdateAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest request]
    (-> this (.updateAddressBook request))))

(defn list-skills-store-categories
  "Lists all categories in the Alexa skill store.

  request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest`

  returns: Result of the ListSkillsStoreCategories operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest request]
    (-> this (.listSkillsStoreCategories request))))

(defn delete-network-profile
  "Deletes a network profile by the network profile ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest`

  returns: Result of the DeleteNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ResourceInUseException - The resource in the request is already in use."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest request]
    (-> this (.deleteNetworkProfile request))))

(defn get-gateway
  "Retrieves the details of a gateway.

  request - `com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest`

  returns: Result of the GetGateway operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetGatewayResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetGatewayResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest request]
    (-> this (.getGateway request))))

(defn get-network-profile
  "Gets the network profile details by the network profile ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest`

  returns: Result of the GetNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest request]
    (-> this (.getNetworkProfile request))))

(defn get-invitation-configuration
  "Retrieves the configured values for the user enrollment invitation email template.

  request - `com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest`

  returns: Result of the GetInvitationConfiguration operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest request]
    (-> this (.getInvitationConfiguration request))))

(defn untag-resource
  "Removes metadata tags from a specified resource.

  request - `com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UntagResourceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UntagResourceResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn register-avs-device
  "Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service
   (AVS).

  request - `com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest`

  returns: Result of the RegisterAVSDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest request]
    (-> this (.registerAVSDevice request))))

(defn update-network-profile
  "Updates a network profile by the network profile ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest`

  returns: Result of the UpdateNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest request]
    (-> this (.updateNetworkProfile request))))

(defn list-device-events
  "Lists the device event history, including device connection status, for up to 30 days.

  request - `com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest`

  returns: Result of the ListDeviceEvents operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest request]
    (-> this (.listDeviceEvents request))))

(defn delete-device
  "Removes a device from Alexa For Business.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest`

  returns: Result of the DeleteDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest request]
    (-> this (.deleteDevice request))))

(defn get-gateway-group
  "Retrieves the details of a gateway group.

  request - `com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest`

  returns: Result of the GetGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest request]
    (-> this (.getGatewayGroup request))))

(defn update-room
  "Updates room details by room ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest`

  returns: Result of the UpdateRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest request]
    (-> this (.updateRoom request))))

(defn list-skills
  "Lists all enabled skills in a specific skill group.

  request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest`

  returns: Result of the ListSkills operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSkillsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListSkillsResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest request]
    (-> this (.listSkills request))))

(defn delete-profile
  "Deletes a room profile by the profile ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest`

  returns: Result of the DeleteProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest request]
    (-> this (.deleteProfile request))))

(defn get-room-skill-parameter
  "Gets room skill parameter details by room, skill, and parameter key ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest`

  returns: Result of the GetRoomSkillParameter operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest request]
    (-> this (.getRoomSkillParameter request))))

(defn create-user
  "Creates a user.

  request - `com.amazonaws.services.alexaforbusiness.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateUserResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ResourceInUseException - The resource in the request is already in use."
  (^com.amazonaws.services.alexaforbusiness.model.CreateUserResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn list-skills-store-skills-by-category
  "Lists all skills in the Alexa skill store by category.

  request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest`

  returns: Result of the ListSkillsStoreSkillsByCategory operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest request]
    (-> this (.listSkillsStoreSkillsByCategory request))))

(defn reject-skill
  "Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves
   to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the
   ApproveSkill API.

  request - `com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest`

  returns: Result of the RejectSkill operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.RejectSkillResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.RejectSkillResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest request]
    (-> this (.rejectSkill request))))

(defn create-conference-provider
  "Adds a new conference provider under the user's AWS account.

  request - `com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest`

  returns: Result of the CreateConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest request]
    (-> this (.createConferenceProvider request))))

(defn delete-user
  "Deletes a specified user by user ARN and enrollment ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteUserResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteUserResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn delete-address-book
  "Deletes an address book by the address book ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest`

  returns: Result of the DeleteAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest request]
    (-> this (.deleteAddressBook request))))

(defn revoke-invitation
  "Revokes an invitation and invalidates the enrollment URL.

  request - `com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest`

  returns: Result of the RevokeInvitation operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest request]
    (-> this (.revokeInvitation request))))

(defn create-profile
  "Creates a new room profile with the specified details.

  request - `com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest`

  returns: Result of the CreateProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.CreateProfileResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest request]
    (-> this (.createProfile request))))

(defn search-network-profiles
  "Searches network profiles and lists the ones that meet a set of filter and sort criteria.

  request - `com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest`

  returns: Result of the SearchNetworkProfiles operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest request]
    (-> this (.searchNetworkProfiles request))))

(defn put-room-skill-parameter
  "Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill
   parameter.

  request - `com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest`

  returns: Result of the PutRoomSkillParameter operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest request]
    (-> this (.putRoomSkillParameter request))))

(defn forget-smart-home-appliances
  "Forgets smart home appliances associated to a room.

  request - `com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest`

  returns: Result of the ForgetSmartHomeAppliances operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest request]
    (-> this (.forgetSmartHomeAppliances request))))

(defn delete-device-usage-data
  "When this action is called for a specified shared device, it allows authorized users to delete the device's
   entire previous history of voice input data and associated response data. This action can be called once every 24
   hours for a specific shared device.


   When this action is called for a specified shared device, it allows authorized users to delete the device's
   entire previous history of voice input data. This action can be called once every 24 hours for a specific shared
   device.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest`

  returns: Result of the DeleteDeviceUsageData operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest request]
    (-> this (.deleteDeviceUsageData request))))

(defn list-smart-home-appliances
  "Lists all of the smart home appliances associated with a room.

  request - `com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest`

  returns: Result of the ListSmartHomeAppliances operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest request]
    (-> this (.listSmartHomeAppliances request))))

(defn list-business-report-schedules
  "Lists the details of the schedules that a user configured.

  request - `com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest`

  returns: Result of the ListBusinessReportSchedules operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest request]
    (-> this (.listBusinessReportSchedules request))))

(defn send-invitation
  "Sends an enrollment invitation email with a URL to a user. The URL is valid for 30 days or until you call this
   operation again, whichever comes first.

  request - `com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest`

  returns: Result of the SendInvitation operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SendInvitationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.SendInvitationResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest request]
    (-> this (.sendInvitation request))))

(defn get-room
  "Gets room details by room ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.GetRoomRequest`

  returns: Result of the GetRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetRoomResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetRoomRequest request]
    (-> this (.getRoom request))))

(defn delete-conference-provider
  "Deletes a conference provider.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest`

  returns: Result of the DeleteConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest request]
    (-> this (.deleteConferenceProvider request))))

(defn create-gateway-group
  "Creates a gateway group with the specified details.

  request - `com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest`

  returns: Result of the CreateGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest request]
    (-> this (.createGatewayGroup request))))

(defn delete-business-report-schedule
  "Deletes the recurring report delivery schedule with the specified schedule ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest`

  returns: Result of the DeleteBusinessReportSchedule operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest request]
    (-> this (.deleteBusinessReportSchedule request))))

(defn resolve-room
  "Determines the details for the room from which a skill request was invoked. This operation is used by skill
   developers.

  request - `com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest`

  returns: Result of the ResolveRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest request]
    (-> this (.resolveRoom request))))

(defn disassociate-device-from-room
  "Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is
   still registered to the account. The device settings and skills are removed from the room.

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest`

  returns: Result of the DisassociateDeviceFromRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest request]
    (-> this (.disassociateDeviceFromRoom request))))

(defn list-gateways
  "Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional
   gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that
   gateway group ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest`

  returns: Result of the ListGateways operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListGatewaysResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListGatewaysResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest request]
    (-> this (.listGateways request))))

(defn search-users
  "Searches users and lists the ones that meet a set of filter and sort criteria.

  request - `com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest`

  returns: Result of the SearchUsers operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchUsersResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchUsersResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest request]
    (-> this (.searchUsers request))))

(defn disassociate-skill-from-skill-group
  "Disassociates a skill from a skill group.

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest`

  returns: Result of the DisassociateSkillFromSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest request]
    (-> this (.disassociateSkillFromSkillGroup request))))

(defn update-profile
  "Updates an existing room profile by room profile ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest`

  returns: Result of the UpdateProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest request]
    (-> this (.updateProfile request))))

(defn approve-skill
  "Associates a skill with the organization under the customer's AWS account. If a skill is private, the user
   implicitly accepts access to this skill during enablement.

  request - `com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest`

  returns: Result of the ApproveSkill operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ApproveSkillResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.ApproveSkillResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest request]
    (-> this (.approveSkill request))))

(defn delete-room-skill-parameter
  "Deletes room skill parameter details by room, skill, and parameter key ID.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest`

  returns: Result of the DeleteRoomSkillParameter operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest request]
    (-> this (.deleteRoomSkillParameter request))))

(defn get-device
  "Gets the details of a device by device ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest`

  returns: Result of the GetDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetDeviceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetDeviceResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest request]
    (-> this (.getDevice request))))

(defn get-address-book
  "Gets address the book details by the address book ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest`

  returns: Result of the GetAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest request]
    (-> this (.getAddressBook request))))

(defn get-contact
  "Gets the contact details by the contact ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.GetContactRequest`

  returns: Result of the GetContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetContactResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetContactResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetContactRequest request]
    (-> this (.getContact request))))

(defn put-invitation-configuration
  "Configures the email template for the user enrollment invitation with the specified attributes.

  request - `com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest`

  returns: Result of the PutInvitationConfiguration operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest request]
    (-> this (.putInvitationConfiguration request))))

(defn create-contact
  "Creates a contact with the specified details.

  request - `com.amazonaws.services.alexaforbusiness.model.CreateContactRequest`

  returns: Result of the CreateContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateContactResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateContactResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.CreateContactRequest request]
    (-> this (.createContact request))))

(defn create-address-book
  "Creates an address book with the specified details.

  request - `com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest`

  returns: Result of the CreateAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest request]
    (-> this (.createAddressBook request))))

(defn update-gateway
  "Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left
   unmodified.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest`

  returns: Result of the UpdateGateway operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest request]
    (-> this (.updateGateway request))))

(defn associate-skill-with-users
  "Makes a private skill available for enrolled users to enable on their devices.

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest`

  returns: Result of the AssociateSkillWithUsers operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest request]
    (-> this (.associateSkillWithUsers request))))

(defn update-skill-group
  "Updates skill group details by skill group ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest`

  returns: Result of the UpdateSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest request]
    (-> this (.updateSkillGroup request))))

(defn associate-skill-group-with-room
  "Associates a skill group with a given room. This enables all skills in the associated skill group on all devices
   in the room.

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest`

  returns: Result of the AssociateSkillGroupWithRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest request]
    (-> this (.associateSkillGroupWithRoom request))))

(defn associate-skill-with-skill-group
  "Associates a skill with a skill group.

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest`

  returns: Result of the AssociateSkillWithSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest request]
    (-> this (.associateSkillWithSkillGroup request))))

(defn delete-skill-authorization
  "Unlinks a third-party account from a skill.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest`

  returns: Result of the DeleteSkillAuthorization operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest request]
    (-> this (.deleteSkillAuthorization request))))

(defn update-device
  "Updates the device name by device ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest`

  returns: Result of the UpdateDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest request]
    (-> this (.updateDevice request))))

(defn associate-device-with-network-profile
  "Associates a device with the specified network profile.

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest`

  returns: Result of the AssociateDeviceWithNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest request]
    (-> this (.associateDeviceWithNetworkProfile request))))

(defn update-conference-provider
  "Updates an existing conference provider's settings.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest`

  returns: Result of the UpdateConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest request]
    (-> this (.updateConferenceProvider request))))

(defn create-skill-group
  "Creates a skill group with a specified name and description.

  request - `com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest`

  returns: Result of the CreateSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest request]
    (-> this (.createSkillGroup request))))

(defn create-business-report-schedule
  "Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or
   weekly interval.

  request - `com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest`

  returns: Result of the CreateBusinessReportSchedule operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest request]
    (-> this (.createBusinessReportSchedule request))))

(defn put-conference-preference
  "Sets the conference preferences on a specific conference provider at the account level.

  request - `com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest`

  returns: Result of the PutConferencePreference operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest request]
    (-> this (.putConferencePreference request))))

(defn search-rooms
  "Searches rooms and lists the ones that meet a set of filter and sort criteria.

  request - `com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest`

  returns: Result of the SearchRooms operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest request]
    (-> this (.searchRooms request))))

(defn disassociate-contact-from-address-book
  "Disassociates a contact from a given address book.

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest`

  returns: Result of the DisassociateContactFromAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest request]
    (-> this (.disassociateContactFromAddressBook request))))

(defn delete-room
  "Deletes a room by the room ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest`

  returns: Result of the DeleteRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest request]
    (-> this (.deleteRoom request))))

(defn put-skill-authorization
  "Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role,
   the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the
   IAM role.

  request - `com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest`

  returns: Result of the PutSkillAuthorization operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.UnauthorizedException - The caller has no permissions to operate on the resource involved in the API call."
  (^com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest request]
    (-> this (.putSkillAuthorization request))))

(defn delete-contact
  "Deletes a contact by the contact ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest`

  returns: Result of the DeleteContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteContactResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteContactResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest request]
    (-> this (.deleteContact request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonAlexaForBusinessClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-conference-provider
  "Gets details about a specific conference provider.

  request - `com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest`

  returns: Result of the GetConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest request]
    (-> this (.getConferenceProvider request))))

(defn list-gateway-groups
  "Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.

  request - `com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest`

  returns: Result of the ListGatewayGroups operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest request]
    (-> this (.listGatewayGroups request))))

(defn list-conference-providers
  "Lists conference providers under a specific AWS account.

  request - `com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest`

  returns: Result of the ListConferenceProviders operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest request]
    (-> this (.listConferenceProviders request))))

(defn get-profile
  "Gets the details of a room profile by profile ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.GetProfileRequest`

  returns: Result of the GetProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetProfileResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetProfileRequest request]
    (-> this (.getProfile request))))

(defn tag-resource
  "Adds metadata tags to a specified resource.

  request - `com.amazonaws.services.alexaforbusiness.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.TagResourceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.TagResourceResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn update-gateway-group
  "Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value
   is left unmodified.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest`

  returns: Result of the UpdateGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest request]
    (-> this (.updateGatewayGroup request))))

(defn search-skill-groups
  "Searches skill groups and lists the ones that meet a set of filter and sort criteria.

  request - `com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest`

  returns: Result of the SearchSkillGroups operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest request]
    (-> this (.searchSkillGroups request))))

(defn associate-contact-with-address-book
  "Associates a contact with a given address book.

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest`

  returns: Result of the AssociateContactWithAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest request]
    (-> this (.associateContactWithAddressBook request))))

(defn search-devices
  "Searches devices and lists the ones that meet a set of filter criteria.

  request - `com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest`

  returns: Result of the SearchDevices operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest request]
    (-> this (.searchDevices request))))

(defn delete-skill-group
  "Deletes a skill group by skill group ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest`

  returns: Result of the DeleteSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest request]
    (-> this (.deleteSkillGroup request))))

(defn update-contact
  "Updates the contact details by the contact ARN.

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest`

  returns: Result of the UpdateContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateContactResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateContactResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest request]
    (-> this (.updateContact request))))

(defn disassociate-skill-group-from-room
  "Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in
   the room.

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest`

  returns: Result of the DisassociateSkillGroupFromRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest request]
    (-> this (.disassociateSkillGroupFromRoom request))))

(defn get-conference-preference
  "Retrieves the existing conference preferences.

  request - `com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest`

  returns: Result of the GetConferencePreference operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceResult [^AmazonAlexaForBusinessClient this ^com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest request]
    (-> this (.getConferencePreference request))))

