(ns com.amazonaws.services.alexaforbusiness.AbstractAmazonAlexaForBusiness
  "Abstract implementation of AmazonAlexaForBusiness. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.alexaforbusiness AbstractAmazonAlexaForBusiness]))

(defn associate-device-with-room
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest`

  returns: Result of the AssociateDeviceWithRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult`"
  (^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest request]
    (-> this (.associateDeviceWithRoom request))))

(defn search-address-books
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest`

  returns: Result of the SearchAddressBooks operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest request]
    (-> this (.searchAddressBooks request))))

(defn search-contacts
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest`

  returns: Result of the SearchContacts operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchContactsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchContactsResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest request]
    (-> this (.searchContacts request))))

(defn delete-gateway-group
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest`

  returns: Result of the DeleteGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest request]
    (-> this (.deleteGatewayGroup request))))

(defn start-smart-home-appliance-discovery
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest`

  returns: Result of the StartSmartHomeApplianceDiscovery operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryResult`"
  (^com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest request]
    (-> this (.startSmartHomeApplianceDiscovery request))))

(defn disassociate-skill-from-users
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest`

  returns: Result of the DisassociateSkillFromUsers operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest request]
    (-> this (.disassociateSkillFromUsers request))))

(defn update-business-report-schedule
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest`

  returns: Result of the UpdateBusinessReportSchedule operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest request]
    (-> this (.updateBusinessReportSchedule request))))

(defn get-skill-group
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest`

  returns: Result of the GetSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest request]
    (-> this (.getSkillGroup request))))

(defn search-profiles
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest`

  returns: Result of the SearchProfiles operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest request]
    (-> this (.searchProfiles request))))

(defn start-device-sync
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest`

  returns: Result of the StartDeviceSync operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult`"
  (^com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest request]
    (-> this (.startDeviceSync request))))

(defn create-network-profile
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest`

  returns: Result of the CreateNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileResult`"
  (^com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest request]
    (-> this (.createNetworkProfile request))))

(defn send-announcement
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest`

  returns: Result of the SendAnnouncement operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SendAnnouncementResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SendAnnouncementResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest request]
    (-> this (.sendAnnouncement request))))

(defn create-room
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest`

  returns: Result of the CreateRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateRoomResult`"
  (^com.amazonaws.services.alexaforbusiness.model.CreateRoomResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest request]
    (-> this (.createRoom request))))

(defn list-tags
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListTagsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListTagsResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn update-address-book
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest`

  returns: Result of the UpdateAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest request]
    (-> this (.updateAddressBook request))))

(defn list-skills-store-categories
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest`

  returns: Result of the ListSkillsStoreCategories operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest request]
    (-> this (.listSkillsStoreCategories request))))

(defn delete-network-profile
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest`

  returns: Result of the DeleteNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest request]
    (-> this (.deleteNetworkProfile request))))

(defn get-gateway
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest`

  returns: Result of the GetGateway operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetGatewayResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetGatewayResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest request]
    (-> this (.getGateway request))))

(defn get-network-profile
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest`

  returns: Result of the GetNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest request]
    (-> this (.getNetworkProfile request))))

(defn get-invitation-configuration
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest`

  returns: Result of the GetInvitationConfiguration operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest request]
    (-> this (.getInvitationConfiguration request))))

(defn untag-resource
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UntagResourceResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UntagResourceResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn register-avs-device
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest`

  returns: Result of the RegisterAVSDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceResult`"
  (^com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest request]
    (-> this (.registerAVSDevice request))))

(defn update-network-profile
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest`

  returns: Result of the UpdateNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest request]
    (-> this (.updateNetworkProfile request))))

(defn list-device-events
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest`

  returns: Result of the ListDeviceEvents operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest request]
    (-> this (.listDeviceEvents request))))

(defn delete-device
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest`

  returns: Result of the DeleteDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest request]
    (-> this (.deleteDevice request))))

(defn get-gateway-group
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest`

  returns: Result of the GetGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest request]
    (-> this (.getGatewayGroup request))))

(defn update-room
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest`

  returns: Result of the UpdateRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest request]
    (-> this (.updateRoom request))))

(defn list-skills
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest`

  returns: Result of the ListSkills operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSkillsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListSkillsResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest request]
    (-> this (.listSkills request))))

(defn delete-profile
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest`

  returns: Result of the DeleteProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest request]
    (-> this (.deleteProfile request))))

(defn get-room-skill-parameter
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest`

  returns: Result of the GetRoomSkillParameter operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest request]
    (-> this (.getRoomSkillParameter request))))

(defn create-user
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateUserResult`"
  (^com.amazonaws.services.alexaforbusiness.model.CreateUserResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn list-skills-store-skills-by-category
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest`

  returns: Result of the ListSkillsStoreSkillsByCategory operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest request]
    (-> this (.listSkillsStoreSkillsByCategory request))))

(defn reject-skill
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest`

  returns: Result of the RejectSkill operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.RejectSkillResult`"
  (^com.amazonaws.services.alexaforbusiness.model.RejectSkillResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest request]
    (-> this (.rejectSkill request))))

(defn create-conference-provider
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest`

  returns: Result of the CreateConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderResult`"
  (^com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest request]
    (-> this (.createConferenceProvider request))))

(defn delete-user
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteUserResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteUserResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn delete-address-book
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest`

  returns: Result of the DeleteAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest request]
    (-> this (.deleteAddressBook request))))

(defn revoke-invitation
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest`

  returns: Result of the RevokeInvitation operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult`"
  (^com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest request]
    (-> this (.revokeInvitation request))))

(defn create-profile
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest`

  returns: Result of the CreateProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateProfileResult`"
  (^com.amazonaws.services.alexaforbusiness.model.CreateProfileResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest request]
    (-> this (.createProfile request))))

(defn search-network-profiles
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest`

  returns: Result of the SearchNetworkProfiles operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest request]
    (-> this (.searchNetworkProfiles request))))

(defn put-room-skill-parameter
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest`

  returns: Result of the PutRoomSkillParameter operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult`"
  (^com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest request]
    (-> this (.putRoomSkillParameter request))))

(defn forget-smart-home-appliances
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest`

  returns: Result of the ForgetSmartHomeAppliances operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest request]
    (-> this (.forgetSmartHomeAppliances request))))

(defn delete-device-usage-data
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest`

  returns: Result of the DeleteDeviceUsageData operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest request]
    (-> this (.deleteDeviceUsageData request))))

(defn list-smart-home-appliances
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest`

  returns: Result of the ListSmartHomeAppliances operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest request]
    (-> this (.listSmartHomeAppliances request))))

(defn list-business-report-schedules
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest`

  returns: Result of the ListBusinessReportSchedules operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest request]
    (-> this (.listBusinessReportSchedules request))))

(defn send-invitation
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest`

  returns: Result of the SendInvitation operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SendInvitationResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SendInvitationResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest request]
    (-> this (.sendInvitation request))))

(defn get-room
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetRoomRequest`

  returns: Result of the GetRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetRoomResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetRoomResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetRoomRequest request]
    (-> this (.getRoom request))))

(defn delete-conference-provider
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest`

  returns: Result of the DeleteConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest request]
    (-> this (.deleteConferenceProvider request))))

(defn create-gateway-group
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest`

  returns: Result of the CreateGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupResult`"
  (^com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest request]
    (-> this (.createGatewayGroup request))))

(defn delete-business-report-schedule
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest`

  returns: Result of the DeleteBusinessReportSchedule operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest request]
    (-> this (.deleteBusinessReportSchedule request))))

(defn shutdown
  "Description copied from interface: AmazonAlexaForBusiness"
  ([^AbstractAmazonAlexaForBusiness this]
    (-> this (.shutdown))))

(defn resolve-room
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest`

  returns: Result of the ResolveRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest request]
    (-> this (.resolveRoom request))))

(defn disassociate-device-from-room
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest`

  returns: Result of the DisassociateDeviceFromRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest request]
    (-> this (.disassociateDeviceFromRoom request))))

(defn list-gateways
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest`

  returns: Result of the ListGateways operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListGatewaysResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListGatewaysResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest request]
    (-> this (.listGateways request))))

(defn search-users
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest`

  returns: Result of the SearchUsers operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchUsersResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchUsersResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest request]
    (-> this (.searchUsers request))))

(defn disassociate-skill-from-skill-group
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest`

  returns: Result of the DisassociateSkillFromSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest request]
    (-> this (.disassociateSkillFromSkillGroup request))))

(defn update-profile
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest`

  returns: Result of the UpdateProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest request]
    (-> this (.updateProfile request))))

(defn approve-skill
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest`

  returns: Result of the ApproveSkill operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ApproveSkillResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ApproveSkillResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest request]
    (-> this (.approveSkill request))))

(defn delete-room-skill-parameter
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest`

  returns: Result of the DeleteRoomSkillParameter operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest request]
    (-> this (.deleteRoomSkillParameter request))))

(defn get-device
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest`

  returns: Result of the GetDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetDeviceResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetDeviceResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest request]
    (-> this (.getDevice request))))

(defn get-address-book
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest`

  returns: Result of the GetAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest request]
    (-> this (.getAddressBook request))))

(defn get-contact
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetContactRequest`

  returns: Result of the GetContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetContactResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetContactResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetContactRequest request]
    (-> this (.getContact request))))

(defn put-invitation-configuration
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest`

  returns: Result of the PutInvitationConfiguration operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationResult`"
  (^com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest request]
    (-> this (.putInvitationConfiguration request))))

(defn create-contact
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.CreateContactRequest`

  returns: Result of the CreateContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateContactResult`"
  (^com.amazonaws.services.alexaforbusiness.model.CreateContactResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateContactRequest request]
    (-> this (.createContact request))))

(defn create-address-book
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest`

  returns: Result of the CreateAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult`"
  (^com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest request]
    (-> this (.createAddressBook request))))

(defn update-gateway
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest`

  returns: Result of the UpdateGateway operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest request]
    (-> this (.updateGateway request))))

(defn associate-skill-with-users
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest`

  returns: Result of the AssociateSkillWithUsers operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersResult`"
  (^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest request]
    (-> this (.associateSkillWithUsers request))))

(defn update-skill-group
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest`

  returns: Result of the UpdateSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest request]
    (-> this (.updateSkillGroup request))))

(defn associate-skill-group-with-room
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest`

  returns: Result of the AssociateSkillGroupWithRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult`"
  (^com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest request]
    (-> this (.associateSkillGroupWithRoom request))))

(defn associate-skill-with-skill-group
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest`

  returns: Result of the AssociateSkillWithSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupResult`"
  (^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest request]
    (-> this (.associateSkillWithSkillGroup request))))

(defn delete-skill-authorization
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest`

  returns: Result of the DeleteSkillAuthorization operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest request]
    (-> this (.deleteSkillAuthorization request))))

(defn update-device
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest`

  returns: Result of the UpdateDevice operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest request]
    (-> this (.updateDevice request))))

(defn associate-device-with-network-profile
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest`

  returns: Result of the AssociateDeviceWithNetworkProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileResult`"
  (^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest request]
    (-> this (.associateDeviceWithNetworkProfile request))))

(defn update-conference-provider
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest`

  returns: Result of the UpdateConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest request]
    (-> this (.updateConferenceProvider request))))

(defn create-skill-group
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest`

  returns: Result of the CreateSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult`"
  (^com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest request]
    (-> this (.createSkillGroup request))))

(defn create-business-report-schedule
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest`

  returns: Result of the CreateBusinessReportSchedule operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleResult`"
  (^com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest request]
    (-> this (.createBusinessReportSchedule request))))

(defn put-conference-preference
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest`

  returns: Result of the PutConferencePreference operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceResult`"
  (^com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest request]
    (-> this (.putConferencePreference request))))

(defn search-rooms
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest`

  returns: Result of the SearchRooms operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest request]
    (-> this (.searchRooms request))))

(defn disassociate-contact-from-address-book
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest`

  returns: Result of the DisassociateContactFromAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest request]
    (-> this (.disassociateContactFromAddressBook request))))

(defn delete-room
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest`

  returns: Result of the DeleteRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest request]
    (-> this (.deleteRoom request))))

(defn put-skill-authorization
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest`

  returns: Result of the PutSkillAuthorization operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationResult`"
  (^com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest request]
    (-> this (.putSkillAuthorization request))))

(defn delete-contact
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest`

  returns: Result of the DeleteContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteContactResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteContactResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest request]
    (-> this (.deleteContact request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonAlexaForBusiness

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-conference-provider
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest`

  returns: Result of the GetConferenceProvider operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest request]
    (-> this (.getConferenceProvider request))))

(defn list-gateway-groups
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest`

  returns: Result of the ListGatewayGroups operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest request]
    (-> this (.listGatewayGroups request))))

(defn list-conference-providers
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest`

  returns: Result of the ListConferenceProviders operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersResult`"
  (^com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest request]
    (-> this (.listConferenceProviders request))))

(defn get-profile
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetProfileRequest`

  returns: Result of the GetProfile operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetProfileResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetProfileResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetProfileRequest request]
    (-> this (.getProfile request))))

(defn tag-resource
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.TagResourceResult`"
  (^com.amazonaws.services.alexaforbusiness.model.TagResourceResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn update-gateway-group
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest`

  returns: Result of the UpdateGatewayGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest request]
    (-> this (.updateGatewayGroup request))))

(defn search-skill-groups
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest`

  returns: Result of the SearchSkillGroups operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest request]
    (-> this (.searchSkillGroups request))))

(defn associate-contact-with-address-book
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest`

  returns: Result of the AssociateContactWithAddressBook operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult`"
  (^com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest request]
    (-> this (.associateContactWithAddressBook request))))

(defn search-devices
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest`

  returns: Result of the SearchDevices operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult`"
  (^com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest request]
    (-> this (.searchDevices request))))

(defn delete-skill-group
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest`

  returns: Result of the DeleteSkillGroup operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest request]
    (-> this (.deleteSkillGroup request))))

(defn update-contact
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest`

  returns: Result of the UpdateContact operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.UpdateContactResult`"
  (^com.amazonaws.services.alexaforbusiness.model.UpdateContactResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest request]
    (-> this (.updateContact request))))

(defn disassociate-skill-group-from-room
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest`

  returns: Result of the DisassociateSkillGroupFromRoom operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult`"
  (^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest request]
    (-> this (.disassociateSkillGroupFromRoom request))))

(defn get-conference-preference
  "Description copied from interface: AmazonAlexaForBusiness

  request - `com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest`

  returns: Result of the GetConferencePreference operation returned by the service. - `com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceResult`"
  (^com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceResult [^AbstractAmazonAlexaForBusiness this ^com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest request]
    (-> this (.getConferencePreference request))))

