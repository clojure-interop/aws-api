(ns com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusinessAsync
  "Interface for accessing Alexa For Business asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonAlexaForBusinessAsync instead.



  Alexa for Business helps you use Alexa in your organization. Alexa for Business provides you with the tools to manage
  Alexa devices, enroll your users, and assign skills, at scale. You can build your own context-aware voice skills
  using the Alexa Skills Kit and the Alexa for Business API operations. You can also make these available as private
  skills for your organization. Alexa for Business makes it efficient to voice-enable your products and services, thus
  providing context-aware voice experiences for your customers. Device makers building with the Alexa Voice Service
  (AVS) can create fully integrated solutions, register their products with Alexa for Business, and manage them as
  shared devices in their organization."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.alexaforbusiness AmazonAlexaForBusinessAsync]))

(defn untag-resource-async
  "Removes metadata tags from a specified resource.

  untag-resource-request - `com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn associate-skill-with-skill-group-async
  "Associates a skill with a skill group.

  associate-skill-with-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateSkillWithSkillGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest associate-skill-with-skill-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateSkillWithSkillGroupAsync associate-skill-with-skill-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithSkillGroupRequest associate-skill-with-skill-group-request]
    (-> this (.associateSkillWithSkillGroupAsync associate-skill-with-skill-group-request))))

(defn approve-skill-async
  "Associates a skill with the organization under the customer's AWS account. If a skill is private, the user
   implicitly accepts access to this skill during enablement.

  approve-skill-request - `com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApproveSkill operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ApproveSkillResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest approve-skill-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.approveSkillAsync approve-skill-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ApproveSkillRequest approve-skill-request]
    (-> this (.approveSkillAsync approve-skill-request))))

(defn get-device-async
  "Gets the details of a device by device ARN.

  get-device-request - `com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest get-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceAsync get-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetDeviceRequest get-device-request]
    (-> this (.getDeviceAsync get-device-request))))

(defn update-skill-group-async
  "Updates skill group details by skill group ARN.

  update-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSkillGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest update-skill-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSkillGroupAsync update-skill-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateSkillGroupRequest update-skill-group-request]
    (-> this (.updateSkillGroupAsync update-skill-group-request))))

(defn get-network-profile-async
  "Gets the network profile details by the network profile ARN.

  get-network-profile-request - `com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest get-network-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNetworkProfileAsync get-network-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetNetworkProfileRequest get-network-profile-request]
    (-> this (.getNetworkProfileAsync get-network-profile-request))))

(defn create-address-book-async
  "Creates an address book with the specified details.

  create-address-book-request - `com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAddressBook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest create-address-book-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAddressBookAsync create-address-book-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateAddressBookRequest create-address-book-request]
    (-> this (.createAddressBookAsync create-address-book-request))))

(defn update-address-book-async
  "Updates address book details by the address book ARN.

  update-address-book-request - `com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAddressBook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest update-address-book-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAddressBookAsync update-address-book-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateAddressBookRequest update-address-book-request]
    (-> this (.updateAddressBookAsync update-address-book-request))))

(defn associate-device-with-network-profile-async
  "Associates a device with the specified network profile.

  associate-device-with-network-profile-request - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDeviceWithNetworkProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest associate-device-with-network-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDeviceWithNetworkProfileAsync associate-device-with-network-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithNetworkProfileRequest associate-device-with-network-profile-request]
    (-> this (.associateDeviceWithNetworkProfileAsync associate-device-with-network-profile-request))))

(defn disassociate-contact-from-address-book-async
  "Disassociates a contact from a given address book.

  disassociate-contact-from-address-book-request - `com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateContactFromAddressBook operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest disassociate-contact-from-address-book-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateContactFromAddressBookAsync disassociate-contact-from-address-book-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DisassociateContactFromAddressBookRequest disassociate-contact-from-address-book-request]
    (-> this (.disassociateContactFromAddressBookAsync disassociate-contact-from-address-book-request))))

(defn start-device-sync-async
  "Resets a device and its account to the known default settings. This clears all information and settings set by
   previous users in the following ways:




   Bluetooth - This unpairs all bluetooth devices paired with your echo device.




   Volume - This resets the echo device's volume to the default value.




   Notifications - This clears all notifications from your echo device.




   Lists - This clears all to-do items from your echo device.




   Settings - This internally syncs the room's profile (if the device is assigned to a room), contacts, address
   books, delegation access for account linking, and communications (if enabled on the room profile).

  start-device-sync-request - `com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDeviceSync operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest start-device-sync-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDeviceSyncAsync start-device-sync-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.StartDeviceSyncRequest start-device-sync-request]
    (-> this (.startDeviceSyncAsync start-device-sync-request))))

(defn get-skill-group-async
  "Gets skill group details by skill group ARN.

  get-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSkillGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest get-skill-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSkillGroupAsync get-skill-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetSkillGroupRequest get-skill-group-request]
    (-> this (.getSkillGroupAsync get-skill-group-request))))

(defn create-business-report-schedule-async
  "Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or
   weekly interval.

  create-business-report-schedule-request - `com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBusinessReportSchedule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest create-business-report-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBusinessReportScheduleAsync create-business-report-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateBusinessReportScheduleRequest create-business-report-schedule-request]
    (-> this (.createBusinessReportScheduleAsync create-business-report-schedule-request))))

(defn put-skill-authorization-async
  "Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role,
   the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the
   IAM role.

  put-skill-authorization-request - `com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSkillAuthorization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest put-skill-authorization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSkillAuthorizationAsync put-skill-authorization-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.PutSkillAuthorizationRequest put-skill-authorization-request]
    (-> this (.putSkillAuthorizationAsync put-skill-authorization-request))))

(defn list-device-events-async
  "Lists the device event history, including device connection status, for up to 30 days.

  list-device-events-request - `com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeviceEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest list-device-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeviceEventsAsync list-device-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListDeviceEventsRequest list-device-events-request]
    (-> this (.listDeviceEventsAsync list-device-events-request))))

(defn list-tags-async
  "Lists all tags for the specified resource.

  list-tags-request - `com.amazonaws.services.alexaforbusiness.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListTagsRequest list-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync list-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListTagsRequest list-tags-request]
    (-> this (.listTagsAsync list-tags-request))))

(defn send-announcement-async
  "Triggers an asynchronous flow to send text, SSML, or audio announcements to rooms that are identified by a search
   or filter.

  send-announcement-request - `com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendAnnouncement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SendAnnouncementResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest send-announcement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendAnnouncementAsync send-announcement-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SendAnnouncementRequest send-announcement-request]
    (-> this (.sendAnnouncementAsync send-announcement-request))))

(defn list-skills-store-categories-async
  "Lists all categories in the Alexa skill store.

  list-skills-store-categories-request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSkillsStoreCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest list-skills-store-categories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSkillsStoreCategoriesAsync list-skills-store-categories-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreCategoriesRequest list-skills-store-categories-request]
    (-> this (.listSkillsStoreCategoriesAsync list-skills-store-categories-request))))

(defn create-skill-group-async
  "Creates a skill group with a specified name and description.

  create-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSkillGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest create-skill-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSkillGroupAsync create-skill-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateSkillGroupRequest create-skill-group-request]
    (-> this (.createSkillGroupAsync create-skill-group-request))))

(defn create-profile-async
  "Creates a new room profile with the specified details.

  create-profile-request - `com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest create-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProfileAsync create-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateProfileRequest create-profile-request]
    (-> this (.createProfileAsync create-profile-request))))

(defn get-conference-preference-async
  "Retrieves the existing conference preferences.

  get-conference-preference-request - `com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConferencePreference operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest get-conference-preference-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConferencePreferenceAsync get-conference-preference-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetConferencePreferenceRequest get-conference-preference-request]
    (-> this (.getConferencePreferenceAsync get-conference-preference-request))))

(defn list-gateway-groups-async
  "Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.

  list-gateway-groups-request - `com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGatewayGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest list-gateway-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGatewayGroupsAsync list-gateway-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListGatewayGroupsRequest list-gateway-groups-request]
    (-> this (.listGatewayGroupsAsync list-gateway-groups-request))))

(defn delete-user-async
  "Deletes a specified user by user ARN and enrollment ARN.

  delete-user-request - `com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUserAsync delete-user-request))))

(defn get-profile-async
  "Gets the details of a room profile by profile ARN.

  get-profile-request - `com.amazonaws.services.alexaforbusiness.model.GetProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetProfileRequest get-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProfileAsync get-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetProfileRequest get-profile-request]
    (-> this (.getProfileAsync get-profile-request))))

(defn search-address-books-async
  "Searches address books and lists the ones that meet a set of filter and sort criteria.

  search-address-books-request - `com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchAddressBooks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest search-address-books-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchAddressBooksAsync search-address-books-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchAddressBooksRequest search-address-books-request]
    (-> this (.searchAddressBooksAsync search-address-books-request))))

(defn reject-skill-async
  "Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves
   to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the
   ApproveSkill API.

  reject-skill-request - `com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectSkill operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.RejectSkillResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest reject-skill-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectSkillAsync reject-skill-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.RejectSkillRequest reject-skill-request]
    (-> this (.rejectSkillAsync reject-skill-request))))

(defn get-address-book-async
  "Gets address the book details by the address book ARN.

  get-address-book-request - `com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAddressBook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest get-address-book-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAddressBookAsync get-address-book-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetAddressBookRequest get-address-book-request]
    (-> this (.getAddressBookAsync get-address-book-request))))

(defn get-room-skill-parameter-async
  "Gets room skill parameter details by room, skill, and parameter key ARN.

  get-room-skill-parameter-request - `com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRoomSkillParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest get-room-skill-parameter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRoomSkillParameterAsync get-room-skill-parameter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetRoomSkillParameterRequest get-room-skill-parameter-request]
    (-> this (.getRoomSkillParameterAsync get-room-skill-parameter-request))))

(defn delete-gateway-group-async
  "Deletes a gateway group.

  delete-gateway-group-request - `com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGatewayGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest delete-gateway-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGatewayGroupAsync delete-gateway-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteGatewayGroupRequest delete-gateway-group-request]
    (-> this (.deleteGatewayGroupAsync delete-gateway-group-request))))

(defn associate-device-with-room-async
  "Associates a device with a given room. This applies all the settings from the room profile to the device, and all
   the skills in any skill groups added to that room. This operation requires the device to be online, or else a
   manual sync is required.

  associate-device-with-room-request - `com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDeviceWithRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest associate-device-with-room-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDeviceWithRoomAsync associate-device-with-room-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateDeviceWithRoomRequest associate-device-with-room-request]
    (-> this (.associateDeviceWithRoomAsync associate-device-with-room-request))))

(defn get-room-async
  "Gets room details by room ARN.

  get-room-request - `com.amazonaws.services.alexaforbusiness.model.GetRoomRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetRoomRequest get-room-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRoomAsync get-room-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetRoomRequest get-room-request]
    (-> this (.getRoomAsync get-room-request))))

(defn delete-skill-group-async
  "Deletes a skill group by skill group ARN.

  delete-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSkillGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest delete-skill-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSkillGroupAsync delete-skill-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillGroupRequest delete-skill-group-request]
    (-> this (.deleteSkillGroupAsync delete-skill-group-request))))

(defn create-room-async
  "Creates a room with the specified details.

  create-room-request - `com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest create-room-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRoomAsync create-room-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateRoomRequest create-room-request]
    (-> this (.createRoomAsync create-room-request))))

(defn put-invitation-configuration-async
  "Configures the email template for the user enrollment invitation with the specified attributes.

  put-invitation-configuration-request - `com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutInvitationConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest put-invitation-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putInvitationConfigurationAsync put-invitation-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.PutInvitationConfigurationRequest put-invitation-configuration-request]
    (-> this (.putInvitationConfigurationAsync put-invitation-configuration-request))))

(defn update-device-async
  "Updates the device name by device ARN.

  update-device-request - `com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest update-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeviceAsync update-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateDeviceRequest update-device-request]
    (-> this (.updateDeviceAsync update-device-request))))

(defn create-contact-async
  "Creates a contact with the specified details.

  create-contact-request - `com.amazonaws.services.alexaforbusiness.model.CreateContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateContactResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateContactRequest create-contact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createContactAsync create-contact-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateContactRequest create-contact-request]
    (-> this (.createContactAsync create-contact-request))))

(defn delete-network-profile-async
  "Deletes a network profile by the network profile ARN.

  delete-network-profile-request - `com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest delete-network-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkProfileAsync delete-network-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteNetworkProfileRequest delete-network-profile-request]
    (-> this (.deleteNetworkProfileAsync delete-network-profile-request))))

(defn update-gateway-group-async
  "Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value
   is left unmodified.

  update-gateway-group-request - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGatewayGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest update-gateway-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGatewayGroupAsync update-gateway-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayGroupRequest update-gateway-group-request]
    (-> this (.updateGatewayGroupAsync update-gateway-group-request))))

(defn delete-room-skill-parameter-async
  "Deletes room skill parameter details by room, skill, and parameter key ID.

  delete-room-skill-parameter-request - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoomSkillParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest delete-room-skill-parameter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRoomSkillParameterAsync delete-room-skill-parameter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomSkillParameterRequest delete-room-skill-parameter-request]
    (-> this (.deleteRoomSkillParameterAsync delete-room-skill-parameter-request))))

(defn search-rooms-async
  "Searches rooms and lists the ones that meet a set of filter and sort criteria.

  search-rooms-request - `com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchRooms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchRoomsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest search-rooms-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchRoomsAsync search-rooms-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchRoomsRequest search-rooms-request]
    (-> this (.searchRoomsAsync search-rooms-request))))

(defn search-profiles-async
  "Searches room profiles and lists the ones that meet a set of filter criteria.

  search-profiles-request - `com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest search-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchProfilesAsync search-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchProfilesRequest search-profiles-request]
    (-> this (.searchProfilesAsync search-profiles-request))))

(defn update-conference-provider-async
  "Updates an existing conference provider's settings.

  update-conference-provider-request - `com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConferenceProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest update-conference-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConferenceProviderAsync update-conference-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateConferenceProviderRequest update-conference-provider-request]
    (-> this (.updateConferenceProviderAsync update-conference-provider-request))))

(defn list-business-report-schedules-async
  "Lists the details of the schedules that a user configured.

  list-business-report-schedules-request - `com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBusinessReportSchedules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest list-business-report-schedules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBusinessReportSchedulesAsync list-business-report-schedules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListBusinessReportSchedulesRequest list-business-report-schedules-request]
    (-> this (.listBusinessReportSchedulesAsync list-business-report-schedules-request))))

(defn list-gateways-async
  "Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional
   gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that
   gateway group ARN.

  list-gateways-request - `com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest list-gateways-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGatewaysAsync list-gateways-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListGatewaysRequest list-gateways-request]
    (-> this (.listGatewaysAsync list-gateways-request))))

(defn update-profile-async
  "Updates an existing room profile by room profile ARN.

  update-profile-request - `com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest update-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProfileAsync update-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateProfileRequest update-profile-request]
    (-> this (.updateProfileAsync update-profile-request))))

(defn delete-skill-authorization-async
  "Unlinks a third-party account from a skill.

  delete-skill-authorization-request - `com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSkillAuthorization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest delete-skill-authorization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSkillAuthorizationAsync delete-skill-authorization-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteSkillAuthorizationRequest delete-skill-authorization-request]
    (-> this (.deleteSkillAuthorizationAsync delete-skill-authorization-request))))

(defn update-gateway-async
  "Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left
   unmodified.

  update-gateway-request - `com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest update-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGatewayAsync update-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateGatewayRequest update-gateway-request]
    (-> this (.updateGatewayAsync update-gateway-request))))

(defn disassociate-device-from-room-async
  "Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is
   still registered to the account. The device settings and skills are removed from the room.

  disassociate-device-from-room-request - `com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDeviceFromRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest disassociate-device-from-room-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDeviceFromRoomAsync disassociate-device-from-room-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DisassociateDeviceFromRoomRequest disassociate-device-from-room-request]
    (-> this (.disassociateDeviceFromRoomAsync disassociate-device-from-room-request))))

(defn put-conference-preference-async
  "Sets the conference preferences on a specific conference provider at the account level.

  put-conference-preference-request - `com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConferencePreference operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest put-conference-preference-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConferencePreferenceAsync put-conference-preference-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.PutConferencePreferenceRequest put-conference-preference-request]
    (-> this (.putConferencePreferenceAsync put-conference-preference-request))))

(defn delete-business-report-schedule-async
  "Deletes the recurring report delivery schedule with the specified schedule ARN.

  delete-business-report-schedule-request - `com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBusinessReportSchedule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest delete-business-report-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBusinessReportScheduleAsync delete-business-report-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteBusinessReportScheduleRequest delete-business-report-schedule-request]
    (-> this (.deleteBusinessReportScheduleAsync delete-business-report-schedule-request))))

(defn associate-skill-with-users-async
  "Makes a private skill available for enrolled users to enable on their devices.

  associate-skill-with-users-request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateSkillWithUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest associate-skill-with-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateSkillWithUsersAsync associate-skill-with-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillWithUsersRequest associate-skill-with-users-request]
    (-> this (.associateSkillWithUsersAsync associate-skill-with-users-request))))

(defn create-user-async
  "Creates a user.

  create-user-request - `com.amazonaws.services.alexaforbusiness.model.CreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateUserRequest create-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync create-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateUserRequest create-user-request]
    (-> this (.createUserAsync create-user-request))))

(defn disassociate-skill-group-from-room-async
  "Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in
   the room.

  disassociate-skill-group-from-room-request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateSkillGroupFromRoom operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest disassociate-skill-group-from-room-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateSkillGroupFromRoomAsync disassociate-skill-group-from-room-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillGroupFromRoomRequest disassociate-skill-group-from-room-request]
    (-> this (.disassociateSkillGroupFromRoomAsync disassociate-skill-group-from-room-request))))

(defn update-network-profile-async
  "Updates a network profile by the network profile ARN.

  update-network-profile-request - `com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest update-network-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNetworkProfileAsync update-network-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateNetworkProfileRequest update-network-profile-request]
    (-> this (.updateNetworkProfileAsync update-network-profile-request))))

(defn delete-conference-provider-async
  "Deletes a conference provider.

  delete-conference-provider-request - `com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConferenceProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest delete-conference-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConferenceProviderAsync delete-conference-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteConferenceProviderRequest delete-conference-provider-request]
    (-> this (.deleteConferenceProviderAsync delete-conference-provider-request))))

(defn update-room-async
  "Updates room details by room ARN.

  update-room-request - `com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest update-room-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRoomAsync update-room-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateRoomRequest update-room-request]
    (-> this (.updateRoomAsync update-room-request))))

(defn list-conference-providers-async
  "Lists conference providers under a specific AWS account.

  list-conference-providers-request - `com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConferenceProviders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest list-conference-providers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConferenceProvidersAsync list-conference-providers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListConferenceProvidersRequest list-conference-providers-request]
    (-> this (.listConferenceProvidersAsync list-conference-providers-request))))

(defn get-gateway-group-async
  "Retrieves the details of a gateway group.

  get-gateway-group-request - `com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGatewayGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest get-gateway-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGatewayGroupAsync get-gateway-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayGroupRequest get-gateway-group-request]
    (-> this (.getGatewayGroupAsync get-gateway-group-request))))

(defn forget-smart-home-appliances-async
  "Forgets smart home appliances associated to a room.

  forget-smart-home-appliances-request - `com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ForgetSmartHomeAppliances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest forget-smart-home-appliances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.forgetSmartHomeAppliancesAsync forget-smart-home-appliances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ForgetSmartHomeAppliancesRequest forget-smart-home-appliances-request]
    (-> this (.forgetSmartHomeAppliancesAsync forget-smart-home-appliances-request))))

(defn delete-profile-async
  "Deletes a room profile by the profile ARN.

  delete-profile-request - `com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest delete-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProfileAsync delete-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteProfileRequest delete-profile-request]
    (-> this (.deleteProfileAsync delete-profile-request))))

(defn create-conference-provider-async
  "Adds a new conference provider under the user's AWS account.

  create-conference-provider-request - `com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConferenceProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest create-conference-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConferenceProviderAsync create-conference-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateConferenceProviderRequest create-conference-provider-request]
    (-> this (.createConferenceProviderAsync create-conference-provider-request))))

(defn register-avs-device-async
  "Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service
   (AVS).

  register-avs-device-request - `com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterAVSDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest register-avs-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerAVSDeviceAsync register-avs-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.RegisterAVSDeviceRequest register-avs-device-request]
    (-> this (.registerAVSDeviceAsync register-avs-device-request))))

(defn list-skills-store-skills-by-category-async
  "Lists all skills in the Alexa skill store by category.

  list-skills-store-skills-by-category-request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSkillsStoreSkillsByCategory operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest list-skills-store-skills-by-category-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSkillsStoreSkillsByCategoryAsync list-skills-store-skills-by-category-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsStoreSkillsByCategoryRequest list-skills-store-skills-by-category-request]
    (-> this (.listSkillsStoreSkillsByCategoryAsync list-skills-store-skills-by-category-request))))

(defn delete-address-book-async
  "Deletes an address book by the address book ARN.

  delete-address-book-request - `com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAddressBook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest delete-address-book-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAddressBookAsync delete-address-book-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteAddressBookRequest delete-address-book-request]
    (-> this (.deleteAddressBookAsync delete-address-book-request))))

(defn get-contact-async
  "Gets the contact details by the contact ARN.

  get-contact-request - `com.amazonaws.services.alexaforbusiness.model.GetContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetContactResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetContactRequest get-contact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContactAsync get-contact-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetContactRequest get-contact-request]
    (-> this (.getContactAsync get-contact-request))))

(defn delete-device-usage-data-async
  "When this action is called for a specified shared device, it allows authorized users to delete the device's
   entire previous history of voice input data and associated response data. This action can be called once every 24
   hours for a specific shared device.


   When this action is called for a specified shared device, it allows authorized users to delete the device's
   entire previous history of voice input data. This action can be called once every 24 hours for a specific shared
   device.

  delete-device-usage-data-request - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeviceUsageData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest delete-device-usage-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeviceUsageDataAsync delete-device-usage-data-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceUsageDataRequest delete-device-usage-data-request]
    (-> this (.deleteDeviceUsageDataAsync delete-device-usage-data-request))))

(defn delete-contact-async
  "Deletes a contact by the contact ARN.

  delete-contact-request - `com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteContactResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest delete-contact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteContactAsync delete-contact-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteContactRequest delete-contact-request]
    (-> this (.deleteContactAsync delete-contact-request))))

(defn search-network-profiles-async
  "Searches network profiles and lists the ones that meet a set of filter and sort criteria.

  search-network-profiles-request - `com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchNetworkProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest search-network-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchNetworkProfilesAsync search-network-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchNetworkProfilesRequest search-network-profiles-request]
    (-> this (.searchNetworkProfilesAsync search-network-profiles-request))))

(defn send-invitation-async
  "Sends an enrollment invitation email with a URL to a user. The URL is valid for 30 days or until you call this
   operation again, whichever comes first.

  send-invitation-request - `com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendInvitation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SendInvitationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest send-invitation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendInvitationAsync send-invitation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SendInvitationRequest send-invitation-request]
    (-> this (.sendInvitationAsync send-invitation-request))))

(defn associate-skill-group-with-room-async
  "Associates a skill group with a given room. This enables all skills in the associated skill group on all devices
   in the room.

  associate-skill-group-with-room-request - `com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateSkillGroupWithRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest associate-skill-group-with-room-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateSkillGroupWithRoomAsync associate-skill-group-with-room-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateSkillGroupWithRoomRequest associate-skill-group-with-room-request]
    (-> this (.associateSkillGroupWithRoomAsync associate-skill-group-with-room-request))))

(defn list-skills-async
  "Lists all enabled skills in a specific skill group.

  list-skills-request - `com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSkills operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListSkillsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest list-skills-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSkillsAsync list-skills-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListSkillsRequest list-skills-request]
    (-> this (.listSkillsAsync list-skills-request))))

(defn get-gateway-async
  "Retrieves the details of a gateway.

  get-gateway-request - `com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest get-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGatewayAsync get-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetGatewayRequest get-gateway-request]
    (-> this (.getGatewayAsync get-gateway-request))))

(defn start-smart-home-appliance-discovery-async
  "Initiates the discovery of any smart home appliances associated with the room.

  start-smart-home-appliance-discovery-request - `com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSmartHomeApplianceDiscovery operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest start-smart-home-appliance-discovery-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSmartHomeApplianceDiscoveryAsync start-smart-home-appliance-discovery-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.StartSmartHomeApplianceDiscoveryRequest start-smart-home-appliance-discovery-request]
    (-> this (.startSmartHomeApplianceDiscoveryAsync start-smart-home-appliance-discovery-request))))

(defn resolve-room-async
  "Determines the details for the room from which a skill request was invoked. This operation is used by skill
   developers.

  resolve-room-request - `com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResolveRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ResolveRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest resolve-room-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resolveRoomAsync resolve-room-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ResolveRoomRequest resolve-room-request]
    (-> this (.resolveRoomAsync resolve-room-request))))

(defn put-room-skill-parameter-async
  "Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill
   parameter.

  put-room-skill-parameter-request - `com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRoomSkillParameter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest put-room-skill-parameter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRoomSkillParameterAsync put-room-skill-parameter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.PutRoomSkillParameterRequest put-room-skill-parameter-request]
    (-> this (.putRoomSkillParameterAsync put-room-skill-parameter-request))))

(defn get-conference-provider-async
  "Gets details about a specific conference provider.

  get-conference-provider-request - `com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConferenceProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest get-conference-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConferenceProviderAsync get-conference-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetConferenceProviderRequest get-conference-provider-request]
    (-> this (.getConferenceProviderAsync get-conference-provider-request))))

(defn search-contacts-async
  "Searches contacts and lists the ones that meet a set of filter and sort criteria.

  search-contacts-request - `com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchContacts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchContactsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest search-contacts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchContactsAsync search-contacts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchContactsRequest search-contacts-request]
    (-> this (.searchContactsAsync search-contacts-request))))

(defn disassociate-skill-from-skill-group-async
  "Disassociates a skill from a skill group.

  disassociate-skill-from-skill-group-request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateSkillFromSkillGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest disassociate-skill-from-skill-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateSkillFromSkillGroupAsync disassociate-skill-from-skill-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromSkillGroupRequest disassociate-skill-from-skill-group-request]
    (-> this (.disassociateSkillFromSkillGroupAsync disassociate-skill-from-skill-group-request))))

(defn search-devices-async
  "Searches devices and lists the ones that meet a set of filter criteria.

  search-devices-request - `com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchDevicesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest search-devices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchDevicesAsync search-devices-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchDevicesRequest search-devices-request]
    (-> this (.searchDevicesAsync search-devices-request))))

(defn search-skill-groups-async
  "Searches skill groups and lists the ones that meet a set of filter and sort criteria.

  search-skill-groups-request - `com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchSkillGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest search-skill-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchSkillGroupsAsync search-skill-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchSkillGroupsRequest search-skill-groups-request]
    (-> this (.searchSkillGroupsAsync search-skill-groups-request))))

(defn get-invitation-configuration-async
  "Retrieves the configured values for the user enrollment invitation email template.

  get-invitation-configuration-request - `com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInvitationConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest get-invitation-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInvitationConfigurationAsync get-invitation-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.GetInvitationConfigurationRequest get-invitation-configuration-request]
    (-> this (.getInvitationConfigurationAsync get-invitation-configuration-request))))

(defn associate-contact-with-address-book-async
  "Associates a contact with a given address book.

  associate-contact-with-address-book-request - `com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateContactWithAddressBook operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest associate-contact-with-address-book-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateContactWithAddressBookAsync associate-contact-with-address-book-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.AssociateContactWithAddressBookRequest associate-contact-with-address-book-request]
    (-> this (.associateContactWithAddressBookAsync associate-contact-with-address-book-request))))

(defn update-contact-async
  "Updates the contact details by the contact ARN.

  update-contact-request - `com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateContactResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest update-contact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateContactAsync update-contact-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateContactRequest update-contact-request]
    (-> this (.updateContactAsync update-contact-request))))

(defn delete-device-async
  "Removes a device from Alexa For Business.

  delete-device-request - `com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest delete-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeviceAsync delete-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteDeviceRequest delete-device-request]
    (-> this (.deleteDeviceAsync delete-device-request))))

(defn tag-resource-async
  "Adds metadata tags to a specified resource.

  tag-resource-request - `com.amazonaws.services.alexaforbusiness.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn delete-room-async
  "Deletes a room by the room ARN.

  delete-room-request - `com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoom operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DeleteRoomResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest delete-room-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRoomAsync delete-room-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DeleteRoomRequest delete-room-request]
    (-> this (.deleteRoomAsync delete-room-request))))

(defn list-smart-home-appliances-async
  "Lists all of the smart home appliances associated with a room.

  list-smart-home-appliances-request - `com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSmartHomeAppliances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest list-smart-home-appliances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSmartHomeAppliancesAsync list-smart-home-appliances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.ListSmartHomeAppliancesRequest list-smart-home-appliances-request]
    (-> this (.listSmartHomeAppliancesAsync list-smart-home-appliances-request))))

(defn search-users-async
  "Searches users and lists the ones that meet a set of filter and sort criteria.

  search-users-request - `com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.SearchUsersResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest search-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchUsersAsync search-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.SearchUsersRequest search-users-request]
    (-> this (.searchUsersAsync search-users-request))))

(defn update-business-report-schedule-async
  "Updates the configuration of the report delivery schedule with the specified schedule ARN.

  update-business-report-schedule-request - `com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBusinessReportSchedule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest update-business-report-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBusinessReportScheduleAsync update-business-report-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.UpdateBusinessReportScheduleRequest update-business-report-schedule-request]
    (-> this (.updateBusinessReportScheduleAsync update-business-report-schedule-request))))

(defn disassociate-skill-from-users-async
  "Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.

  disassociate-skill-from-users-request - `com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateSkillFromUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest disassociate-skill-from-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateSkillFromUsersAsync disassociate-skill-from-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.DisassociateSkillFromUsersRequest disassociate-skill-from-users-request]
    (-> this (.disassociateSkillFromUsersAsync disassociate-skill-from-users-request))))

(defn create-gateway-group-async
  "Creates a gateway group with the specified details.

  create-gateway-group-request - `com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGatewayGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest create-gateway-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGatewayGroupAsync create-gateway-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateGatewayGroupRequest create-gateway-group-request]
    (-> this (.createGatewayGroupAsync create-gateway-group-request))))

(defn revoke-invitation-async
  "Revokes an invitation and invalidates the enrollment URL.

  revoke-invitation-request - `com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeInvitation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.RevokeInvitationResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest revoke-invitation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeInvitationAsync revoke-invitation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.RevokeInvitationRequest revoke-invitation-request]
    (-> this (.revokeInvitationAsync revoke-invitation-request))))

(defn create-network-profile-async
  "Creates a network profile with the specified details.

  create-network-profile-request - `com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest create-network-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkProfileAsync create-network-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAlexaForBusinessAsync this ^com.amazonaws.services.alexaforbusiness.model.CreateNetworkProfileRequest create-network-profile-request]
    (-> this (.createNetworkProfileAsync create-network-profile-request))))

