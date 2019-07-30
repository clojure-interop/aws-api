(ns com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusiness
  "Interface for accessing Alexa For Business.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonAlexaForBusiness instead.



  Alexa for Business helps you use Alexa in your organization. Alexa for Business provides you with the tools to manage
  Alexa devices, enroll your users, and assign skills, at scale. You can build your own context-aware voice skills
  using the Alexa Skills Kit and the Alexa for Business API operations. You can also make these available as private
  skills for your organization. Alexa for Business makes it efficient to voice-enable your products and services, thus
  providing context-aware voice experiences for your customers. Device makers building with the Alexa Voice Service
  (AVS) can create fully integrated solutions, register their products with Alexa for Business, and manage them as
  shared devices in their organization."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.alexaforbusiness AmazonAlexaForBusiness]))

(defn associate-device-with-room
  "Associates a device with a given room. This applies all the settings from the room profile to the device, and all
   the skills in any skill groups added to that room. This operation requires the device to be online, or else a
   manual sync is required.

  associate-device-with-room-request - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest`

  returns: Result of the AssociateDeviceWithRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest associate-device-with-room-request]
    (-> this (.associateDeviceWithRoom associate-device-with-room-request))))

(defn search-address-books
  "Searches address books and lists the ones that meet a set of filter and sort criteria.

  search-address-books-request - `com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest`

  returns: Result of the SearchAddressBooks operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest search-address-books-request]
    (-> this (.searchAddressBooks search-address-books-request))))

(defn search-contacts
  "Searches contacts and lists the ones that meet a set of filter and sort criteria.

  search-contacts-request - `com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest`

  returns: Result of the SearchContacts operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchContactsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchContactsResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest search-contacts-request]
    (-> this (.searchContacts search-contacts-request))))

(defn delete-gateway-group
  "Deletes a gateway group.

  delete-gateway-group-request - `com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest`

  returns: Result of the DeleteGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ResourceAssociatedException - Another resource is associated with the resource in the request."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest delete-gateway-group-request]
    (-> this (.deleteGatewayGroup delete-gateway-group-request))))

(defn start-smart-home-appliance-discovery
  "Initiates the discovery of any smart home appliances associated with the room.

  start-smart-home-appliance-discovery-request - `com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest`

  returns: Result of the StartSmartHomeApplianceDiscovery operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest start-smart-home-appliance-discovery-request]
    (-> this (.startSmartHomeApplianceDiscovery start-smart-home-appliance-discovery-request))))

(defn disassociate-skill-from-users
  "Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.

  disassociate-skill-from-users-request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest`

  returns: Result of the DisassociateSkillFromUsers operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest disassociate-skill-from-users-request]
    (-> this (.disassociateSkillFromUsers disassociate-skill-from-users-request))))

(defn update-business-report-schedule
  "Updates the configuration of the report delivery schedule with the specified schedule ARN.

  update-business-report-schedule-request - `com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest`

  returns: Result of the UpdateBusinessReportSchedule operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest update-business-report-schedule-request]
    (-> this (.updateBusinessReportSchedule update-business-report-schedule-request))))

(defn get-skill-group
  "Gets skill group details by skill group ARN.

  get-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest`

  returns: Result of the GetSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest get-skill-group-request]
    (-> this (.getSkillGroup get-skill-group-request))))

(defn search-profiles
  "Searches room profiles and lists the ones that meet a set of filter criteria.

  search-profiles-request - `com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest`

  returns: Result of the SearchProfiles operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest search-profiles-request]
    (-> this (.searchProfiles search-profiles-request))))

(defn start-device-sync
  "Resets a device and its account to the known default settings. This clears all information and settings set by
   previous users in the following ways:




   Bluetooth - This unpairs all bluetooth devices paired with your echo device.




   Volume - This resets the echo device's volume to the default value.




   Notifications - This clears all notifications from your echo device.




   Lists - This clears all to-do items from your echo device.




   Settings - This internally syncs the room's profile (if the device is assigned to a room), contacts, address
   books, delegation access for account linking, and communications (if enabled on the room profile).

  start-device-sync-request - `com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest`

  returns: Result of the StartDeviceSync operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult`

  throws: com.amazonaws.services.alexaforbusiness.model.DeviceNotRegisteredException - The request failed because this device is no longer registered and therefore no longer managed by this account."
  (^com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest start-device-sync-request]
    (-> this (.startDeviceSync start-device-sync-request))))

(defn create-network-profile
  "Creates a network profile with the specified details.

  create-network-profile-request - `com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest`

  returns: Result of the CreateNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest create-network-profile-request]
    (-> this (.createNetworkProfile create-network-profile-request))))

(defn send-announcement
  "Triggers an asynchronous flow to send text, SSML, or audio announcements to rooms that are identified by a search
   or filter.

  send-announcement-request - `com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest`

  returns: Result of the SendAnnouncement operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SendAnnouncementResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.SendAnnouncementResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest send-announcement-request]
    (-> this (.sendAnnouncement send-announcement-request))))

(defn create-room
  "Creates a room with the specified details.

  create-room-request - `com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest`

  returns: Result of the CreateRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateRoomResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest create-room-request]
    (-> this (.createRoom create-room-request))))

(defn list-tags
  "Lists all tags for the specified resource.

  list-tags-request - `com.amazonaws.services.alexaforbusiness.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListTagsResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.ListTagsResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListTagsRequest list-tags-request]
    (-> this (.listTags list-tags-request))))

(defn update-address-book
  "Updates address book details by the address book ARN.

  update-address-book-request - `com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest`

  returns: Result of the UpdateAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest update-address-book-request]
    (-> this (.updateAddressBook update-address-book-request))))

(defn list-skills-store-categories
  "Lists all categories in the Alexa skill store.

  list-skills-store-categories-request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest`

  returns: Result of the ListSkillsStoreCategories operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest list-skills-store-categories-request]
    (-> this (.listSkillsStoreCategories list-skills-store-categories-request))))

(defn delete-network-profile
  "Deletes a network profile by the network profile ARN.

  delete-network-profile-request - `com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest`

  returns: Result of the DeleteNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ResourceInUseException - The resource in the request is already in use."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest delete-network-profile-request]
    (-> this (.deleteNetworkProfile delete-network-profile-request))))

(defn get-gateway
  "Retrieves the details of a gateway.

  get-gateway-request - `com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest`

  returns: Result of the GetGateway operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetGatewayResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetGatewayResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest get-gateway-request]
    (-> this (.getGateway get-gateway-request))))

(defn get-network-profile
  "Gets the network profile details by the network profile ARN.

  get-network-profile-request - `com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest`

  returns: Result of the GetNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest get-network-profile-request]
    (-> this (.getNetworkProfile get-network-profile-request))))

(defn get-invitation-configuration
  "Retrieves the configured values for the user enrollment invitation email template.

  get-invitation-configuration-request - `com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest`

  returns: Result of the GetInvitationConfiguration operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest get-invitation-configuration-request]
    (-> this (.getInvitationConfiguration get-invitation-configuration-request))))

(defn untag-resource
  "Removes metadata tags from a specified resource.

  untag-resource-request - `com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UntagResourceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UntagResourceResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn register-avs-device
  "Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service
   (AVS).

  register-avs-device-request - `com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest`

  returns: Result of the RegisterAVSDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest register-avs-device-request]
    (-> this (.registerAVSDevice register-avs-device-request))))

(defn update-network-profile
  "Updates a network profile by the network profile ARN.

  update-network-profile-request - `com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest`

  returns: Result of the UpdateNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest update-network-profile-request]
    (-> this (.updateNetworkProfile update-network-profile-request))))

(defn list-device-events
  "Lists the device event history, including device connection status, for up to 30 days.

  list-device-events-request - `com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest`

  returns: Result of the ListDeviceEvents operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest list-device-events-request]
    (-> this (.listDeviceEvents list-device-events-request))))

(defn delete-device
  "Removes a device from Alexa For Business.

  delete-device-request - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest`

  returns: Result of the DeleteDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest delete-device-request]
    (-> this (.deleteDevice delete-device-request))))

(defn get-gateway-group
  "Retrieves the details of a gateway group.

  get-gateway-group-request - `com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest`

  returns: Result of the GetGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest get-gateway-group-request]
    (-> this (.getGatewayGroup get-gateway-group-request))))

(defn update-room
  "Updates room details by room ARN.

  update-room-request - `com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest`

  returns: Result of the UpdateRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest update-room-request]
    (-> this (.updateRoom update-room-request))))

(defn list-skills
  "Lists all enabled skills in a specific skill group.

  list-skills-request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest`

  returns: Result of the ListSkills operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSkillsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListSkillsResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest list-skills-request]
    (-> this (.listSkills list-skills-request))))

(defn delete-profile
  "Deletes a room profile by the profile ARN.

  delete-profile-request - `com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest`

  returns: Result of the DeleteProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest delete-profile-request]
    (-> this (.deleteProfile delete-profile-request))))

(defn get-room-skill-parameter
  "Gets room skill parameter details by room, skill, and parameter key ARN.

  get-room-skill-parameter-request - `com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest`

  returns: Result of the GetRoomSkillParameter operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest get-room-skill-parameter-request]
    (-> this (.getRoomSkillParameter get-room-skill-parameter-request))))

(defn create-user
  "Creates a user.

  create-user-request - `com.amazonaws.services.alexaforbusiness.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateUserResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ResourceInUseException - The resource in the request is already in use."
  (^com.amazonaws.services.alexaforbusiness.model.CreateUserResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateUserRequest create-user-request]
    (-> this (.createUser create-user-request))))

(defn list-skills-store-skills-by-category
  "Lists all skills in the Alexa skill store by category.

  list-skills-store-skills-by-category-request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest`

  returns: Result of the ListSkillsStoreSkillsByCategory operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest list-skills-store-skills-by-category-request]
    (-> this (.listSkillsStoreSkillsByCategory list-skills-store-skills-by-category-request))))

(defn reject-skill
  "Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves
   to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the
   ApproveSkill API.

  reject-skill-request - `com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest`

  returns: Result of the RejectSkill operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.RejectSkillResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.RejectSkillResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest reject-skill-request]
    (-> this (.rejectSkill reject-skill-request))))

(defn create-conference-provider
  "Adds a new conference provider under the user's AWS account.

  create-conference-provider-request - `com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest`

  returns: Result of the CreateConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest create-conference-provider-request]
    (-> this (.createConferenceProvider create-conference-provider-request))))

(defn delete-user
  "Deletes a specified user by user ARN and enrollment ARN.

  delete-user-request - `com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteUserResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteUserResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUser delete-user-request))))

(defn delete-address-book
  "Deletes an address book by the address book ARN.

  delete-address-book-request - `com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest`

  returns: Result of the DeleteAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest delete-address-book-request]
    (-> this (.deleteAddressBook delete-address-book-request))))

(defn revoke-invitation
  "Revokes an invitation and invalidates the enrollment URL.

  revoke-invitation-request - `com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest`

  returns: Result of the RevokeInvitation operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest revoke-invitation-request]
    (-> this (.revokeInvitation revoke-invitation-request))))

(defn create-profile
  "Creates a new room profile with the specified details.

  create-profile-request - `com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest`

  returns: Result of the CreateProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.CreateProfileResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest create-profile-request]
    (-> this (.createProfile create-profile-request))))

(defn search-network-profiles
  "Searches network profiles and lists the ones that meet a set of filter and sort criteria.

  search-network-profiles-request - `com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest`

  returns: Result of the SearchNetworkProfiles operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest search-network-profiles-request]
    (-> this (.searchNetworkProfiles search-network-profiles-request))))

(defn put-room-skill-parameter
  "Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill
   parameter.

  put-room-skill-parameter-request - `com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest`

  returns: Result of the PutRoomSkillParameter operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest put-room-skill-parameter-request]
    (-> this (.putRoomSkillParameter put-room-skill-parameter-request))))

(defn forget-smart-home-appliances
  "Forgets smart home appliances associated to a room.

  forget-smart-home-appliances-request - `com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest`

  returns: Result of the ForgetSmartHomeAppliances operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest forget-smart-home-appliances-request]
    (-> this (.forgetSmartHomeAppliances forget-smart-home-appliances-request))))

(defn delete-device-usage-data
  "When this action is called for a specified shared device, it allows authorized users to delete the device's
   entire previous history of voice input data and associated response data. This action can be called once every 24
   hours for a specific shared device.


   When this action is called for a specified shared device, it allows authorized users to delete the device's
   entire previous history of voice input data. This action can be called once every 24 hours for a specific shared
   device.

  delete-device-usage-data-request - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest`

  returns: Result of the DeleteDeviceUsageData operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest delete-device-usage-data-request]
    (-> this (.deleteDeviceUsageData delete-device-usage-data-request))))

(defn list-smart-home-appliances
  "Lists all of the smart home appliances associated with a room.

  list-smart-home-appliances-request - `com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest`

  returns: Result of the ListSmartHomeAppliances operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest list-smart-home-appliances-request]
    (-> this (.listSmartHomeAppliances list-smart-home-appliances-request))))

(defn list-business-report-schedules
  "Lists the details of the schedules that a user configured.

  list-business-report-schedules-request - `com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest`

  returns: Result of the ListBusinessReportSchedules operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest list-business-report-schedules-request]
    (-> this (.listBusinessReportSchedules list-business-report-schedules-request))))

(defn send-invitation
  "Sends an enrollment invitation email with a URL to a user. The URL is valid for 30 days or until you call this
   operation again, whichever comes first.

  send-invitation-request - `com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest`

  returns: Result of the SendInvitation operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SendInvitationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.SendInvitationResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest send-invitation-request]
    (-> this (.sendInvitation send-invitation-request))))

(defn get-room
  "Gets room details by room ARN.

  get-room-request - `com.amazonaws.services.alexaforbusiness.model.GetRoomRequest`

  returns: Result of the GetRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetRoomResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetRoomRequest get-room-request]
    (-> this (.getRoom get-room-request))))

(defn delete-conference-provider
  "Deletes a conference provider.

  delete-conference-provider-request - `com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest`

  returns: Result of the DeleteConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest delete-conference-provider-request]
    (-> this (.deleteConferenceProvider delete-conference-provider-request))))

(defn create-gateway-group
  "Creates a gateway group with the specified details.

  create-gateway-group-request - `com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest`

  returns: Result of the CreateGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest create-gateway-group-request]
    (-> this (.createGatewayGroup create-gateway-group-request))))

(defn delete-business-report-schedule
  "Deletes the recurring report delivery schedule with the specified schedule ARN.

  delete-business-report-schedule-request - `com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest`

  returns: Result of the DeleteBusinessReportSchedule operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest delete-business-report-schedule-request]
    (-> this (.deleteBusinessReportSchedule delete-business-report-schedule-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonAlexaForBusiness this]
    (-> this (.shutdown))))

(defn resolve-room
  "Determines the details for the room from which a skill request was invoked. This operation is used by skill
   developers.

  resolve-room-request - `com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest`

  returns: Result of the ResolveRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest resolve-room-request]
    (-> this (.resolveRoom resolve-room-request))))

(defn disassociate-device-from-room
  "Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is
   still registered to the account. The device settings and skills are removed from the room.

  disassociate-device-from-room-request - `com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest`

  returns: Result of the DisassociateDeviceFromRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest disassociate-device-from-room-request]
    (-> this (.disassociateDeviceFromRoom disassociate-device-from-room-request))))

(defn list-gateways
  "Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional
   gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that
   gateway group ARN.

  list-gateways-request - `com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest`

  returns: Result of the ListGateways operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListGatewaysResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListGatewaysResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest list-gateways-request]
    (-> this (.listGateways list-gateways-request))))

(defn search-users
  "Searches users and lists the ones that meet a set of filter and sort criteria.

  search-users-request - `com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest`

  returns: Result of the SearchUsers operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchUsersResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchUsersResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest search-users-request]
    (-> this (.searchUsers search-users-request))))

(defn disassociate-skill-from-skill-group
  "Disassociates a skill from a skill group.

  disassociate-skill-from-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest`

  returns: Result of the DisassociateSkillFromSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest disassociate-skill-from-skill-group-request]
    (-> this (.disassociateSkillFromSkillGroup disassociate-skill-from-skill-group-request))))

(defn update-profile
  "Updates an existing room profile by room profile ARN.

  update-profile-request - `com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest`

  returns: Result of the UpdateProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest update-profile-request]
    (-> this (.updateProfile update-profile-request))))

(defn approve-skill
  "Associates a skill with the organization under the customer's AWS account. If a skill is private, the user
   implicitly accepts access to this skill during enablement.

  approve-skill-request - `com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest`

  returns: Result of the ApproveSkill operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ApproveSkillResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.ApproveSkillResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest approve-skill-request]
    (-> this (.approveSkill approve-skill-request))))

(defn delete-room-skill-parameter
  "Deletes room skill parameter details by room, skill, and parameter key ID.

  delete-room-skill-parameter-request - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest`

  returns: Result of the DeleteRoomSkillParameter operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest delete-room-skill-parameter-request]
    (-> this (.deleteRoomSkillParameter delete-room-skill-parameter-request))))

(defn get-device
  "Gets the details of a device by device ARN.

  get-device-request - `com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest`

  returns: Result of the GetDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetDeviceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetDeviceResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest get-device-request]
    (-> this (.getDevice get-device-request))))

(defn get-address-book
  "Gets address the book details by the address book ARN.

  get-address-book-request - `com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest`

  returns: Result of the GetAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest get-address-book-request]
    (-> this (.getAddressBook get-address-book-request))))

(defn get-contact
  "Gets the contact details by the contact ARN.

  get-contact-request - `com.amazonaws.services.alexaforbusiness.model.GetContactRequest`

  returns: Result of the GetContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetContactResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetContactResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetContactRequest get-contact-request]
    (-> this (.getContact get-contact-request))))

(defn put-invitation-configuration
  "Configures the email template for the user enrollment invitation with the specified attributes.

  put-invitation-configuration-request - `com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest`

  returns: Result of the PutInvitationConfiguration operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest put-invitation-configuration-request]
    (-> this (.putInvitationConfiguration put-invitation-configuration-request))))

(defn create-contact
  "Creates a contact with the specified details.

  create-contact-request - `com.amazonaws.services.alexaforbusiness.model.CreateContactRequest`

  returns: Result of the CreateContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateContactResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateContactResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateContactRequest create-contact-request]
    (-> this (.createContact create-contact-request))))

(defn create-address-book
  "Creates an address book with the specified details.

  create-address-book-request - `com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest`

  returns: Result of the CreateAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest create-address-book-request]
    (-> this (.createAddressBook create-address-book-request))))

(defn update-gateway
  "Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left
   unmodified.

  update-gateway-request - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest`

  returns: Result of the UpdateGateway operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest update-gateway-request]
    (-> this (.updateGateway update-gateway-request))))

(defn associate-skill-with-users
  "Makes a private skill available for enrolled users to enable on their devices.

  associate-skill-with-users-request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest`

  returns: Result of the AssociateSkillWithUsers operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest associate-skill-with-users-request]
    (-> this (.associateSkillWithUsers associate-skill-with-users-request))))

(defn update-skill-group
  "Updates skill group details by skill group ARN.

  update-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest`

  returns: Result of the UpdateSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest update-skill-group-request]
    (-> this (.updateSkillGroup update-skill-group-request))))

(defn associate-skill-group-with-room
  "Associates a skill group with a given room. This enables all skills in the associated skill group on all devices
   in the room.

  associate-skill-group-with-room-request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest`

  returns: Result of the AssociateSkillGroupWithRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest associate-skill-group-with-room-request]
    (-> this (.associateSkillGroupWithRoom associate-skill-group-with-room-request))))

(defn associate-skill-with-skill-group
  "Associates a skill with a skill group.

  associate-skill-with-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest`

  returns: Result of the AssociateSkillWithSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest associate-skill-with-skill-group-request]
    (-> this (.associateSkillWithSkillGroup associate-skill-with-skill-group-request))))

(defn delete-skill-authorization
  "Unlinks a third-party account from a skill.

  delete-skill-authorization-request - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest`

  returns: Result of the DeleteSkillAuthorization operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest delete-skill-authorization-request]
    (-> this (.deleteSkillAuthorization delete-skill-authorization-request))))

(defn update-device
  "Updates the device name by device ARN.

  update-device-request - `com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest`

  returns: Result of the UpdateDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest update-device-request]
    (-> this (.updateDevice update-device-request))))

(defn associate-device-with-network-profile
  "Associates a device with the specified network profile.

  associate-device-with-network-profile-request - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest`

  returns: Result of the AssociateDeviceWithNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest associate-device-with-network-profile-request]
    (-> this (.associateDeviceWithNetworkProfile associate-device-with-network-profile-request))))

(defn update-conference-provider
  "Updates an existing conference provider's settings.

  update-conference-provider-request - `com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest`

  returns: Result of the UpdateConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest update-conference-provider-request]
    (-> this (.updateConferenceProvider update-conference-provider-request))))

(defn create-skill-group
  "Creates a skill group with a specified name and description.

  create-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest`

  returns: Result of the CreateSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest create-skill-group-request]
    (-> this (.createSkillGroup create-skill-group-request))))

(defn create-business-report-schedule
  "Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or
   weekly interval.

  create-business-report-schedule-request - `com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest`

  returns: Result of the CreateBusinessReportSchedule operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleResult`

  throws: com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException - The resource being created already exists."
  (^com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest create-business-report-schedule-request]
    (-> this (.createBusinessReportSchedule create-business-report-schedule-request))))

(defn put-conference-preference
  "Sets the conference preferences on a specific conference provider at the account level.

  put-conference-preference-request - `com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest`

  returns: Result of the PutConferencePreference operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest put-conference-preference-request]
    (-> this (.putConferencePreference put-conference-preference-request))))

(defn search-rooms
  "Searches rooms and lists the ones that meet a set of filter and sort criteria.

  search-rooms-request - `com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest`

  returns: Result of the SearchRooms operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest search-rooms-request]
    (-> this (.searchRooms search-rooms-request))))

(defn disassociate-contact-from-address-book
  "Disassociates a contact from a given address book.

  disassociate-contact-from-address-book-request - `com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest`

  returns: Result of the DisassociateContactFromAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest disassociate-contact-from-address-book-request]
    (-> this (.disassociateContactFromAddressBook disassociate-contact-from-address-book-request))))

(defn delete-room
  "Deletes a room by the room ARN.

  delete-room-request - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest`

  returns: Result of the DeleteRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest delete-room-request]
    (-> this (.deleteRoom delete-room-request))))

(defn put-skill-authorization
  "Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role,
   the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the
   IAM role.

  put-skill-authorization-request - `com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest`

  returns: Result of the PutSkillAuthorization operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationResult`

  throws: com.amazonaws.services.alexaforbusiness.model.UnauthorizedException - The caller has no permissions to operate on the resource involved in the API call."
  (^com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest put-skill-authorization-request]
    (-> this (.putSkillAuthorization put-skill-authorization-request))))

(defn delete-contact
  "Deletes a contact by the contact ARN.

  delete-contact-request - `com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest`

  returns: Result of the DeleteContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteContactResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteContactResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest delete-contact-request]
    (-> this (.deleteContact delete-contact-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonAlexaForBusiness this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-conference-provider
  "Gets details about a specific conference provider.

  get-conference-provider-request - `com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest`

  returns: Result of the GetConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest get-conference-provider-request]
    (-> this (.getConferenceProvider get-conference-provider-request))))

(defn list-gateway-groups
  "Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.

  list-gateway-groups-request - `com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest`

  returns: Result of the ListGatewayGroups operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest list-gateway-groups-request]
    (-> this (.listGatewayGroups list-gateway-groups-request))))

(defn list-conference-providers
  "Lists conference providers under a specific AWS account.

  list-conference-providers-request - `com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest`

  returns: Result of the ListConferenceProviders operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest list-conference-providers-request]
    (-> this (.listConferenceProviders list-conference-providers-request))))

(defn get-profile
  "Gets the details of a room profile by profile ARN.

  get-profile-request - `com.amazonaws.services.alexaforbusiness.model.GetProfileRequest`

  returns: Result of the GetProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetProfileResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetProfileResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetProfileRequest get-profile-request]
    (-> this (.getProfile get-profile-request))))

(defn tag-resource
  "Adds metadata tags to a specified resource.

  tag-resource-request - `com.amazonaws.services.alexaforbusiness.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.TagResourceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.TagResourceResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn update-gateway-group
  "Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value
   is left unmodified.

  update-gateway-group-request - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest`

  returns: Result of the UpdateGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest update-gateway-group-request]
    (-> this (.updateGatewayGroup update-gateway-group-request))))

(defn search-skill-groups
  "Searches skill groups and lists the ones that meet a set of filter and sort criteria.

  search-skill-groups-request - `com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest`

  returns: Result of the SearchSkillGroups operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest search-skill-groups-request]
    (-> this (.searchSkillGroups search-skill-groups-request))))

(defn associate-contact-with-address-book
  "Associates a contact with a given address book.

  associate-contact-with-address-book-request - `com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest`

  returns: Result of the AssociateContactWithAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult`

  throws: com.amazonaws.services.alexaforbusiness.model.LimitExceededException - You are performing an action that would put you beyond your account's limits."
  (^com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest associate-contact-with-address-book-request]
    (-> this (.associateContactWithAddressBook associate-contact-with-address-book-request))))

(defn search-devices
  "Searches devices and lists the ones that meet a set of filter criteria.

  search-devices-request - `com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest`

  returns: Result of the SearchDevices operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest search-devices-request]
    (-> this (.searchDevices search-devices-request))))

(defn delete-skill-group
  "Deletes a skill group by skill group ARN.

  delete-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest`

  returns: Result of the DeleteSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest delete-skill-group-request]
    (-> this (.deleteSkillGroup delete-skill-group-request))))

(defn update-contact
  "Updates the contact details by the contact ARN.

  update-contact-request - `com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest`

  returns: Result of the UpdateContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateContactResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.UpdateContactResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest update-contact-request]
    (-> this (.updateContact update-contact-request))))

(defn disassociate-skill-group-from-room
  "Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in
   the room.

  disassociate-skill-group-from-room-request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest`

  returns: Result of the DisassociateSkillGroupFromRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult`

  throws: com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException - There is a concurrent modification of resources."
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest disassociate-skill-group-from-room-request]
    (-> this (.disassociateSkillGroupFromRoom disassociate-skill-group-from-room-request))))

(defn get-conference-preference
  "Retrieves the existing conference preferences.

  get-conference-preference-request - `com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest`

  returns: Result of the GetConferencePreference operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceResult`

  throws: com.amazonaws.services.alexaforbusiness.model.NotFoundException - The resource is not found."
  (^com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceResult [^AmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest get-conference-preference-request]
    (-> this (.getConferencePreference get-conference-preference-request))))

