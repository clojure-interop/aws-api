(ns com.amazonaws.services.medialive.AWSMediaLive
  "Interface for accessing MediaLive.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaLive instead.


  API for AWS Elemental MediaLive"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.medialive AWSMediaLive]))

(defn create-input-security-group
  "Creates a Input Security Group

  create-input-security-group-request - The IPv4 CIDRs to whitelist for this Input Security Group - `com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest`

  returns: Result of the CreateInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - The request to create an Input Security Group was Invalid"
  (^com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest create-input-security-group-request]
    (-> this (.createInputSecurityGroup create-input-security-group-request))))

(defn delete-tags
  "Removes tags for a resource

  delete-tags-request - Placeholder documentation for DeleteTagsRequest - `com.amazonaws.services.medialive.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteTagsResult`

  throws: com.amazonaws.services.medialive.model.NotFoundException - The arn was not found."
  (^com.amazonaws.services.medialive.model.DeleteTagsResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTags delete-tags-request))))

(defn purchase-offering
  "Purchase an offering and create a reservation.

  purchase-offering-request - Placeholder documentation for PurchaseOfferingRequest - `com.amazonaws.services.medialive.model.PurchaseOfferingRequest`

  returns: Result of the PurchaseOffering operation returned by the service. - `com.amazonaws.services.medialive.model.PurchaseOfferingResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.PurchaseOfferingResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.PurchaseOfferingRequest purchase-offering-request]
    (-> this (.purchaseOffering purchase-offering-request))))

(defn list-tags-for-resource
  "Produces list of tags that have been created for a resource

  list-tags-for-resource-request - Placeholder documentation for ListTagsForResourceRequest - `com.amazonaws.services.medialive.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.medialive.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.medialive.model.NotFoundException - The arn was not found"
  (^com.amazonaws.services.medialive.model.ListTagsForResourceResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn delete-schedule
  "Delete all schedule actions on a channel.

  delete-schedule-request - Placeholder documentation for DeleteScheduleRequest - `com.amazonaws.services.medialive.model.DeleteScheduleRequest`

  returns: Result of the DeleteSchedule operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteScheduleResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request to delete the schedule on this channel was invalid."
  (^com.amazonaws.services.medialive.model.DeleteScheduleResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteScheduleRequest delete-schedule-request]
    (-> this (.deleteSchedule delete-schedule-request))))

(defn list-inputs
  "Produces list of inputs that have been created

  list-inputs-request - Placeholder documentation for ListInputsRequest - `com.amazonaws.services.medialive.model.ListInputsRequest`

  returns: Result of the ListInputs operation returned by the service. - `com.amazonaws.services.medialive.model.ListInputsResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.ListInputsResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.ListInputsRequest list-inputs-request]
    (-> this (.listInputs list-inputs-request))))

(defn list-offerings
  "List offerings available for purchase.

  list-offerings-request - Placeholder documentation for ListOfferingsRequest - `com.amazonaws.services.medialive.model.ListOfferingsRequest`

  returns: Result of the ListOfferings operation returned by the service. - `com.amazonaws.services.medialive.model.ListOfferingsResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.ListOfferingsResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.ListOfferingsRequest list-offerings-request]
    (-> this (.listOfferings list-offerings-request))))

(defn waiters
  "returns: `com.amazonaws.services.medialive.waiters.AWSMediaLiveWaiters`"
  (^com.amazonaws.services.medialive.waiters.AWSMediaLiveWaiters [^AWSMediaLive this]
    (-> this (.waiters))))

(defn list-channels
  "Produces list of channels that have been created

  list-channels-request - Placeholder documentation for ListChannelsRequest - `com.amazonaws.services.medialive.model.ListChannelsRequest`

  returns: Result of the ListChannels operation returned by the service. - `com.amazonaws.services.medialive.model.ListChannelsResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.ListChannelsResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.ListChannelsRequest list-channels-request]
    (-> this (.listChannels list-channels-request))))

(defn create-input
  "Create an input

  create-input-request - The name of the input - `com.amazonaws.services.medialive.model.CreateInputRequest`

  returns: Result of the CreateInput operation returned by the service. - `com.amazonaws.services.medialive.model.CreateInputResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.CreateInputResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.CreateInputRequest create-input-request]
    (-> this (.createInput create-input-request))))

(defn list-input-security-groups
  "Produces a list of Input Security Groups for an account

  list-input-security-groups-request - Placeholder documentation for ListInputSecurityGroupsRequest - `com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest`

  returns: Result of the ListInputSecurityGroups operation returned by the service. - `com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - The request to list Input Security Groups was invalid"
  (^com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest list-input-security-groups-request]
    (-> this (.listInputSecurityGroups list-input-security-groups-request))))

(defn update-channel
  "Updates a channel.

  update-channel-request - A request to update a channel. - `com.amazonaws.services.medialive.model.UpdateChannelRequest`

  returns: Result of the UpdateChannel operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.UpdateChannelResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.UpdateChannelRequest update-channel-request]
    (-> this (.updateChannel update-channel-request))))

(defn update-reservation
  "Update reservation.

  update-reservation-request - Request to update a reservation - `com.amazonaws.services.medialive.model.UpdateReservationRequest`

  returns: Result of the UpdateReservation operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateReservationResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.UpdateReservationResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.UpdateReservationRequest update-reservation-request]
    (-> this (.updateReservation update-reservation-request))))

(defn describe-schedule
  "Get a channel schedule

  describe-schedule-request - Placeholder documentation for DescribeScheduleRequest - `com.amazonaws.services.medialive.model.DescribeScheduleRequest`

  returns: Result of the DescribeSchedule operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeScheduleResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.DescribeScheduleResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeScheduleRequest describe-schedule-request]
    (-> this (.describeSchedule describe-schedule-request))))

(defn update-channel-class
  "Changes the class of the channel.

  update-channel-class-request - Channel class that the channel should be updated to. - `com.amazonaws.services.medialive.model.UpdateChannelClassRequest`

  returns: Result of the UpdateChannelClass operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateChannelClassResult`

  throws: com.amazonaws.services.medialive.model.ForbiddenException - You do not have permission to update the class of this channel."
  (^com.amazonaws.services.medialive.model.UpdateChannelClassResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.UpdateChannelClassRequest update-channel-class-request]
    (-> this (.updateChannelClass update-channel-class-request))))

(defn delete-reservation
  "Delete an expired reservation.

  delete-reservation-request - Placeholder documentation for DeleteReservationRequest - `com.amazonaws.services.medialive.model.DeleteReservationRequest`

  returns: Result of the DeleteReservation operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteReservationResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DeleteReservationResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteReservationRequest delete-reservation-request]
    (-> this (.deleteReservation delete-reservation-request))))

(defn update-input-security-group
  "Update an Input Security Group's Whilelists.

  update-input-security-group-request - The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input Security Group should allow. - `com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest`

  returns: Result of the UpdateInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - The request to update the Input Security Group was invalid"
  (^com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest update-input-security-group-request]
    (-> this (.updateInputSecurityGroup update-input-security-group-request))))

(defn list-reservations
  "List purchased reservations.

  list-reservations-request - Placeholder documentation for ListReservationsRequest - `com.amazonaws.services.medialive.model.ListReservationsRequest`

  returns: Result of the ListReservations operation returned by the service. - `com.amazonaws.services.medialive.model.ListReservationsResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.ListReservationsResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.ListReservationsRequest list-reservations-request]
    (-> this (.listReservations list-reservations-request))))

(defn create-tags
  "Create tags for a resource

  create-tags-request - Placeholder documentation for CreateTagsRequest - `com.amazonaws.services.medialive.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.medialive.model.CreateTagsResult`

  throws: com.amazonaws.services.medialive.model.NotFoundException - The arn was not found."
  (^com.amazonaws.services.medialive.model.CreateTagsResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.CreateTagsRequest create-tags-request]
    (-> this (.createTags create-tags-request))))

(defn create-channel
  "Creates a new channel

  create-channel-request - A request to create a channel - `com.amazonaws.services.medialive.model.CreateChannelRequest`

  returns: Result of the CreateChannel operation returned by the service. - `com.amazonaws.services.medialive.model.CreateChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.CreateChannelResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.CreateChannelRequest create-channel-request]
    (-> this (.createChannel create-channel-request))))

(defn describe-input-security-group
  "Produces a summary of an Input Security Group

  describe-input-security-group-request - Placeholder documentation for DescribeInputSecurityGroupRequest - `com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest`

  returns: Result of the DescribeInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - The request to describe an Input Security Group was Invalid"
  (^com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest describe-input-security-group-request]
    (-> this (.describeInputSecurityGroup describe-input-security-group-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSMediaLive this]
    (-> this (.shutdown))))

(defn batch-update-schedule
  "Update a channel schedule

  batch-update-schedule-request - List of actions to create and list of actions to delete. - `com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest`

  returns: Result of the BatchUpdateSchedule operation returned by the service. - `com.amazonaws.services.medialive.model.BatchUpdateScheduleResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.BatchUpdateScheduleResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest batch-update-schedule-request]
    (-> this (.batchUpdateSchedule batch-update-schedule-request))))

(defn delete-input-security-group
  "Deletes an Input Security Group

  delete-input-security-group-request - Placeholder documentation for DeleteInputSecurityGroupRequest - `com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest`

  returns: Result of the DeleteInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - The request to delete the Input Security Group was Invalid"
  (^com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest delete-input-security-group-request]
    (-> this (.deleteInputSecurityGroup delete-input-security-group-request))))

(defn describe-input
  "Produces details about an input

  describe-input-request - Placeholder documentation for DescribeInputRequest - `com.amazonaws.services.medialive.model.DescribeInputRequest`

  returns: Result of the DescribeInput operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeInputResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DescribeInputResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeInputRequest describe-input-request]
    (-> this (.describeInput describe-input-request))))

(defn describe-reservation
  "Get details for a reservation.

  describe-reservation-request - Placeholder documentation for DescribeReservationRequest - `com.amazonaws.services.medialive.model.DescribeReservationRequest`

  returns: Result of the DescribeReservation operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeReservationResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DescribeReservationResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeReservationRequest describe-reservation-request]
    (-> this (.describeReservation describe-reservation-request))))

(defn describe-offering
  "Get details for an offering.

  describe-offering-request - Placeholder documentation for DescribeOfferingRequest - `com.amazonaws.services.medialive.model.DescribeOfferingRequest`

  returns: Result of the DescribeOffering operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeOfferingResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DescribeOfferingResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeOfferingRequest describe-offering-request]
    (-> this (.describeOffering describe-offering-request))))

(defn update-input
  "Updates an input.

  update-input-request - A request to update an input. - `com.amazonaws.services.medialive.model.UpdateInputRequest`

  returns: Result of the UpdateInput operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateInputResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request to update the input was invalid."
  (^com.amazonaws.services.medialive.model.UpdateInputResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.UpdateInputRequest update-input-request]
    (-> this (.updateInput update-input-request))))

(defn start-channel
  "Starts an existing channel

  start-channel-request - Placeholder documentation for StartChannelRequest - `com.amazonaws.services.medialive.model.StartChannelRequest`

  returns: Result of the StartChannel operation returned by the service. - `com.amazonaws.services.medialive.model.StartChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.StartChannelResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.StartChannelRequest start-channel-request]
    (-> this (.startChannel start-channel-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaLive this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-input
  "Deletes the input end point

  delete-input-request - Placeholder documentation for DeleteInputRequest - `com.amazonaws.services.medialive.model.DeleteInputRequest`

  returns: Result of the DeleteInput operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteInputResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DeleteInputResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteInputRequest delete-input-request]
    (-> this (.deleteInput delete-input-request))))

(defn delete-channel
  "Starts deletion of channel. The associated outputs are also deleted.

  delete-channel-request - Placeholder documentation for DeleteChannelRequest - `com.amazonaws.services.medialive.model.DeleteChannelRequest`

  returns: Result of the DeleteChannel operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DeleteChannelResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteChannelRequest delete-channel-request]
    (-> this (.deleteChannel delete-channel-request))))

(defn stop-channel
  "Stops a running channel

  stop-channel-request - Placeholder documentation for StopChannelRequest - `com.amazonaws.services.medialive.model.StopChannelRequest`

  returns: Result of the StopChannel operation returned by the service. - `com.amazonaws.services.medialive.model.StopChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.StopChannelResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.StopChannelRequest stop-channel-request]
    (-> this (.stopChannel stop-channel-request))))

(defn describe-channel
  "Gets details about a channel

  describe-channel-request - Placeholder documentation for DescribeChannelRequest - `com.amazonaws.services.medialive.model.DescribeChannelRequest`

  returns: Result of the DescribeChannel operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DescribeChannelResult [^AWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeChannelRequest describe-channel-request]
    (-> this (.describeChannel describe-channel-request))))

