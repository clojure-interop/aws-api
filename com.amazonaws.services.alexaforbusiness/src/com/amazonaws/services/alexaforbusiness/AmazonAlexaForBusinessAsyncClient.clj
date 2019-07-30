(ns com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusinessAsyncClient
  "Client for accessing Alexa For Business asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Alexa for Business helps you use Alexa in your organization. Alexa for Business provides you with the tools to manage
  Alexa devices, enroll your users, and assign skills, at scale. You can build your own context-aware voice skills
  using the Alexa Skills Kit and the Alexa for Business API operations. You can also make these available as private
  skills for your organization. Alexa for Business makes it efficient to voice-enable your products and services, thus
  providing context-aware voice experiences for your customers. Device makers building with the Alexa Voice Service
  (AVS) can create fully integrated solutions, register their products with Alexa for Business, and manage them as
  shared devices in their organization."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.alexaforbusiness AmazonAlexaForBusinessAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusinessAsyncClientBuilder`"
  (^com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusinessAsyncClientBuilder []
    (AmazonAlexaForBusinessAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn associate-skill-with-skill-group-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateSkillWithSkillGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateSkillWithSkillGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest request]
    (-> this (.associateSkillWithSkillGroupAsync request))))

(defn approve-skill-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApproveSkill operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ApproveSkillResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.approveSkillAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest request]
    (-> this (.approveSkillAsync request))))

(defn get-device-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest request]
    (-> this (.getDeviceAsync request))))

(defn update-skill-group-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSkillGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSkillGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest request]
    (-> this (.updateSkillGroupAsync request))))

(defn get-network-profile-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNetworkProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest request]
    (-> this (.getNetworkProfileAsync request))))

(defn create-address-book-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAddressBook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAddressBookAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest request]
    (-> this (.createAddressBookAsync request))))

(defn update-address-book-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAddressBook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAddressBookAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest request]
    (-> this (.updateAddressBookAsync request))))

(defn associate-device-with-network-profile-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDeviceWithNetworkProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDeviceWithNetworkProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest request]
    (-> this (.associateDeviceWithNetworkProfileAsync request))))

(defn disassociate-contact-from-address-book-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateContactFromAddressBook operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateContactFromAddressBookAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest request]
    (-> this (.disassociateContactFromAddressBookAsync request))))

(defn start-device-sync-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDeviceSync operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDeviceSyncAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest request]
    (-> this (.startDeviceSyncAsync request))))

(defn get-skill-group-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSkillGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSkillGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest request]
    (-> this (.getSkillGroupAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonAlexaForBusinessAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-business-report-schedule-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBusinessReportSchedule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBusinessReportScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest request]
    (-> this (.createBusinessReportScheduleAsync request))))

(defn put-skill-authorization-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSkillAuthorization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSkillAuthorizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest request]
    (-> this (.putSkillAuthorizationAsync request))))

(defn list-device-events-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeviceEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeviceEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest request]
    (-> this (.listDeviceEventsAsync request))))

(defn list-tags-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ListTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn send-announcement-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendAnnouncement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SendAnnouncementResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendAnnouncementAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest request]
    (-> this (.sendAnnouncementAsync request))))

(defn list-skills-store-categories-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSkillsStoreCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSkillsStoreCategoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest request]
    (-> this (.listSkillsStoreCategoriesAsync request))))

(defn create-skill-group-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSkillGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSkillGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest request]
    (-> this (.createSkillGroupAsync request))))

(defn create-profile-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest request]
    (-> this (.createProfileAsync request))))

(defn get-conference-preference-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConferencePreference operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConferencePreferenceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest request]
    (-> this (.getConferencePreferenceAsync request))))

(defn list-gateway-groups-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGatewayGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGatewayGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest request]
    (-> this (.listGatewayGroupsAsync request))))

(defn delete-user-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest request]
    (-> this (.deleteUserAsync request))))

(defn get-profile-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetProfileRequest request]
    (-> this (.getProfileAsync request))))

(defn search-address-books-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchAddressBooks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchAddressBooksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest request]
    (-> this (.searchAddressBooksAsync request))))

(defn reject-skill-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectSkill operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.RejectSkillResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectSkillAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest request]
    (-> this (.rejectSkillAsync request))))

(defn get-address-book-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAddressBook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAddressBookAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest request]
    (-> this (.getAddressBookAsync request))))

(defn get-room-skill-parameter-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRoomSkillParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRoomSkillParameterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest request]
    (-> this (.getRoomSkillParameterAsync request))))

(defn delete-gateway-group-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGatewayGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGatewayGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest request]
    (-> this (.deleteGatewayGroupAsync request))))

(defn associate-device-with-room-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDeviceWithRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDeviceWithRoomAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest request]
    (-> this (.associateDeviceWithRoomAsync request))))

(defn get-room-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetRoomRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetRoomRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRoomAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetRoomRequest request]
    (-> this (.getRoomAsync request))))

(defn delete-skill-group-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSkillGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSkillGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest request]
    (-> this (.deleteSkillGroupAsync request))))

(defn create-room-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRoomAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest request]
    (-> this (.createRoomAsync request))))

(defn put-invitation-configuration-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutInvitationConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putInvitationConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest request]
    (-> this (.putInvitationConfigurationAsync request))))

(defn update-device-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest request]
    (-> this (.updateDeviceAsync request))))

(defn create-contact-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.CreateContactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateContactResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateContactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createContactAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateContactRequest request]
    (-> this (.createContactAsync request))))

(defn delete-network-profile-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest request]
    (-> this (.deleteNetworkProfileAsync request))))

(defn update-gateway-group-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGatewayGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGatewayGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest request]
    (-> this (.updateGatewayGroupAsync request))))

(defn delete-room-skill-parameter-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoomSkillParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRoomSkillParameterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest request]
    (-> this (.deleteRoomSkillParameterAsync request))))

(defn search-rooms-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchRooms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchRoomsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest request]
    (-> this (.searchRoomsAsync request))))

(defn search-profiles-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest request]
    (-> this (.searchProfilesAsync request))))

(defn update-conference-provider-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConferenceProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConferenceProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest request]
    (-> this (.updateConferenceProviderAsync request))))

(defn list-business-report-schedules-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBusinessReportSchedules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBusinessReportSchedulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest request]
    (-> this (.listBusinessReportSchedulesAsync request))))

(defn list-gateways-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGatewaysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest request]
    (-> this (.listGatewaysAsync request))))

(defn update-profile-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest request]
    (-> this (.updateProfileAsync request))))

(defn delete-skill-authorization-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSkillAuthorization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSkillAuthorizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest request]
    (-> this (.deleteSkillAuthorizationAsync request))))

(defn update-gateway-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest request]
    (-> this (.updateGatewayAsync request))))

(defn disassociate-device-from-room-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDeviceFromRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDeviceFromRoomAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest request]
    (-> this (.disassociateDeviceFromRoomAsync request))))

(defn put-conference-preference-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConferencePreference operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConferencePreferenceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest request]
    (-> this (.putConferencePreferenceAsync request))))

(defn delete-business-report-schedule-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBusinessReportSchedule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBusinessReportScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest request]
    (-> this (.deleteBusinessReportScheduleAsync request))))

(defn associate-skill-with-users-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateSkillWithUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateSkillWithUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest request]
    (-> this (.associateSkillWithUsersAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonAlexaForBusinessAsyncClient this]
    (-> this (.shutdown))))

(defn create-user-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.CreateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateUserRequest request]
    (-> this (.createUserAsync request))))

(defn disassociate-skill-group-from-room-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateSkillGroupFromRoom operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateSkillGroupFromRoomAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest request]
    (-> this (.disassociateSkillGroupFromRoomAsync request))))

(defn update-network-profile-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNetworkProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest request]
    (-> this (.updateNetworkProfileAsync request))))

(defn delete-conference-provider-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConferenceProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConferenceProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest request]
    (-> this (.deleteConferenceProviderAsync request))))

(defn update-room-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRoomAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest request]
    (-> this (.updateRoomAsync request))))

(defn list-conference-providers-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConferenceProviders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConferenceProvidersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest request]
    (-> this (.listConferenceProvidersAsync request))))

(defn get-gateway-group-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGatewayGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGatewayGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest request]
    (-> this (.getGatewayGroupAsync request))))

(defn forget-smart-home-appliances-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ForgetSmartHomeAppliances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.forgetSmartHomeAppliancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest request]
    (-> this (.forgetSmartHomeAppliancesAsync request))))

(defn delete-profile-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest request]
    (-> this (.deleteProfileAsync request))))

(defn create-conference-provider-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConferenceProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConferenceProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest request]
    (-> this (.createConferenceProviderAsync request))))

(defn register-avs-device-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterAVSDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerAVSDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest request]
    (-> this (.registerAVSDeviceAsync request))))

(defn list-skills-store-skills-by-category-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSkillsStoreSkillsByCategory operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSkillsStoreSkillsByCategoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest request]
    (-> this (.listSkillsStoreSkillsByCategoryAsync request))))

(defn delete-address-book-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAddressBook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAddressBookAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest request]
    (-> this (.deleteAddressBookAsync request))))

(defn get-contact-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetContactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetContactResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetContactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContactAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetContactRequest request]
    (-> this (.getContactAsync request))))

(defn delete-device-usage-data-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeviceUsageData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeviceUsageDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest request]
    (-> this (.deleteDeviceUsageDataAsync request))))

(defn delete-contact-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteContactResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteContactAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest request]
    (-> this (.deleteContactAsync request))))

(defn search-network-profiles-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchNetworkProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchNetworkProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest request]
    (-> this (.searchNetworkProfilesAsync request))))

(defn send-invitation-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendInvitation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SendInvitationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendInvitationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest request]
    (-> this (.sendInvitationAsync request))))

(defn associate-skill-group-with-room-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateSkillGroupWithRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateSkillGroupWithRoomAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest request]
    (-> this (.associateSkillGroupWithRoomAsync request))))

(defn list-skills-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSkills operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListSkillsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSkillsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest request]
    (-> this (.listSkillsAsync request))))

(defn get-gateway-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest request]
    (-> this (.getGatewayAsync request))))

(defn start-smart-home-appliance-discovery-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSmartHomeApplianceDiscovery operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSmartHomeApplianceDiscoveryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest request]
    (-> this (.startSmartHomeApplianceDiscoveryAsync request))))

(defn resolve-room-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResolveRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resolveRoomAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest request]
    (-> this (.resolveRoomAsync request))))

(defn put-room-skill-parameter-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRoomSkillParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRoomSkillParameterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest request]
    (-> this (.putRoomSkillParameterAsync request))))

(defn get-conference-provider-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConferenceProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConferenceProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest request]
    (-> this (.getConferenceProviderAsync request))))

(defn search-contacts-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchContacts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchContactsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchContactsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest request]
    (-> this (.searchContactsAsync request))))

(defn disassociate-skill-from-skill-group-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateSkillFromSkillGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateSkillFromSkillGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest request]
    (-> this (.disassociateSkillFromSkillGroupAsync request))))

(defn search-devices-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchDevicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest request]
    (-> this (.searchDevicesAsync request))))

(defn search-skill-groups-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchSkillGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchSkillGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest request]
    (-> this (.searchSkillGroupsAsync request))))

(defn get-invitation-configuration-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInvitationConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInvitationConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest request]
    (-> this (.getInvitationConfigurationAsync request))))

(defn associate-contact-with-address-book-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateContactWithAddressBook operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateContactWithAddressBookAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest request]
    (-> this (.associateContactWithAddressBookAsync request))))

(defn update-contact-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateContactResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateContactAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest request]
    (-> this (.updateContactAsync request))))

(defn delete-device-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest request]
    (-> this (.deleteDeviceAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn delete-room-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRoomAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest request]
    (-> this (.deleteRoomAsync request))))

(defn list-smart-home-appliances-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSmartHomeAppliances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSmartHomeAppliancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest request]
    (-> this (.listSmartHomeAppliancesAsync request))))

(defn search-users-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchUsersResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest request]
    (-> this (.searchUsersAsync request))))

(defn update-business-report-schedule-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBusinessReportSchedule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBusinessReportScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest request]
    (-> this (.updateBusinessReportScheduleAsync request))))

(defn disassociate-skill-from-users-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateSkillFromUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateSkillFromUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest request]
    (-> this (.disassociateSkillFromUsersAsync request))))

(defn create-gateway-group-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGatewayGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGatewayGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest request]
    (-> this (.createGatewayGroupAsync request))))

(defn revoke-invitation-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeInvitation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeInvitationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest request]
    (-> this (.revokeInvitationAsync request))))

(defn create-network-profile-async
  "Description copied from interface: AmazonAlexaForBusinessAsync

  request - `com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsyncClient this ^com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest request]
    (-> this (.createNetworkProfileAsync request))))

