(ns com.amazonaws.services.medialive.AWSMediaLiveClient
  "Client for accessing MediaLive. All service calls made using this client are blocking, and will not return until the
  service call completes.

  API for AWS Elemental MediaLive"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.medialive AWSMediaLiveClient]))

(defn *builder
  "returns: `com.amazonaws.services.medialive.AWSMediaLiveClientBuilder`"
  (^com.amazonaws.services.medialive.AWSMediaLiveClientBuilder []
    (AWSMediaLiveClient/builder )))

(defn create-input-security-group
  "Creates a Input Security Group

  request - `com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest`

  returns: Result of the CreateInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - The request to create an Input Security Group was Invalid"
  (^com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest request]
    (-> this (.createInputSecurityGroup request))))

(defn delete-tags
  "Removes tags for a resource

  request - `com.amazonaws.services.medialive.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteTagsResult`

  throws: com.amazonaws.services.medialive.model.NotFoundException - The arn was not found."
  (^com.amazonaws.services.medialive.model.DeleteTagsResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn purchase-offering
  "Purchase an offering and create a reservation.

  request - `com.amazonaws.services.medialive.model.PurchaseOfferingRequest`

  returns: Result of the PurchaseOffering operation returned by the service. - `com.amazonaws.services.medialive.model.PurchaseOfferingResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.PurchaseOfferingResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.PurchaseOfferingRequest request]
    (-> this (.purchaseOffering request))))

(defn list-tags-for-resource
  "Produces list of tags that have been created for a resource

  request - `com.amazonaws.services.medialive.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.medialive.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.medialive.model.NotFoundException - The arn was not found"
  (^com.amazonaws.services.medialive.model.ListTagsForResourceResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-schedule
  "Delete all schedule actions on a channel.

  request - `com.amazonaws.services.medialive.model.DeleteScheduleRequest`

  returns: Result of the DeleteSchedule operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteScheduleResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request to delete the schedule on this channel was invalid."
  (^com.amazonaws.services.medialive.model.DeleteScheduleResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DeleteScheduleRequest request]
    (-> this (.deleteSchedule request))))

(defn list-inputs
  "Produces list of inputs that have been created

  request - `com.amazonaws.services.medialive.model.ListInputsRequest`

  returns: Result of the ListInputs operation returned by the service. - `com.amazonaws.services.medialive.model.ListInputsResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.ListInputsResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.ListInputsRequest request]
    (-> this (.listInputs request))))

(defn list-offerings
  "List offerings available for purchase.

  request - `com.amazonaws.services.medialive.model.ListOfferingsRequest`

  returns: Result of the ListOfferings operation returned by the service. - `com.amazonaws.services.medialive.model.ListOfferingsResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.ListOfferingsResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.ListOfferingsRequest request]
    (-> this (.listOfferings request))))

(defn waiters
  "returns: `com.amazonaws.services.medialive.waiters.AWSMediaLiveWaiters`"
  (^com.amazonaws.services.medialive.waiters.AWSMediaLiveWaiters [^AWSMediaLiveClient this]
    (-> this (.waiters))))

(defn list-channels
  "Produces list of channels that have been created

  request - `com.amazonaws.services.medialive.model.ListChannelsRequest`

  returns: Result of the ListChannels operation returned by the service. - `com.amazonaws.services.medialive.model.ListChannelsResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.ListChannelsResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.ListChannelsRequest request]
    (-> this (.listChannels request))))

(defn create-input
  "Create an input

  request - `com.amazonaws.services.medialive.model.CreateInputRequest`

  returns: Result of the CreateInput operation returned by the service. - `com.amazonaws.services.medialive.model.CreateInputResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.CreateInputResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.CreateInputRequest request]
    (-> this (.createInput request))))

(defn list-input-security-groups
  "Produces a list of Input Security Groups for an account

  request - `com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest`

  returns: Result of the ListInputSecurityGroups operation returned by the service. - `com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - The request to list Input Security Groups was invalid"
  (^com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest request]
    (-> this (.listInputSecurityGroups request))))

(defn update-channel
  "Updates a channel.

  request - `com.amazonaws.services.medialive.model.UpdateChannelRequest`

  returns: Result of the UpdateChannel operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.UpdateChannelResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.UpdateChannelRequest request]
    (-> this (.updateChannel request))))

(defn update-reservation
  "Update reservation.

  request - `com.amazonaws.services.medialive.model.UpdateReservationRequest`

  returns: Result of the UpdateReservation operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateReservationResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.UpdateReservationResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.UpdateReservationRequest request]
    (-> this (.updateReservation request))))

(defn describe-schedule
  "Get a channel schedule

  request - `com.amazonaws.services.medialive.model.DescribeScheduleRequest`

  returns: Result of the DescribeSchedule operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeScheduleResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.DescribeScheduleResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DescribeScheduleRequest request]
    (-> this (.describeSchedule request))))

(defn update-channel-class
  "Changes the class of the channel.

  request - `com.amazonaws.services.medialive.model.UpdateChannelClassRequest`

  returns: Result of the UpdateChannelClass operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateChannelClassResult`

  throws: com.amazonaws.services.medialive.model.ForbiddenException - You do not have permission to update the class of this channel."
  (^com.amazonaws.services.medialive.model.UpdateChannelClassResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.UpdateChannelClassRequest request]
    (-> this (.updateChannelClass request))))

(defn delete-reservation
  "Delete an expired reservation.

  request - `com.amazonaws.services.medialive.model.DeleteReservationRequest`

  returns: Result of the DeleteReservation operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteReservationResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DeleteReservationResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DeleteReservationRequest request]
    (-> this (.deleteReservation request))))

(defn update-input-security-group
  "Update an Input Security Group's Whilelists.

  request - `com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest`

  returns: Result of the UpdateInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - The request to update the Input Security Group was invalid"
  (^com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest request]
    (-> this (.updateInputSecurityGroup request))))

(defn list-reservations
  "List purchased reservations.

  request - `com.amazonaws.services.medialive.model.ListReservationsRequest`

  returns: Result of the ListReservations operation returned by the service. - `com.amazonaws.services.medialive.model.ListReservationsResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.ListReservationsResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.ListReservationsRequest request]
    (-> this (.listReservations request))))

(defn create-tags
  "Create tags for a resource

  request - `com.amazonaws.services.medialive.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.medialive.model.CreateTagsResult`

  throws: com.amazonaws.services.medialive.model.NotFoundException - The arn was not found."
  (^com.amazonaws.services.medialive.model.CreateTagsResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn create-channel
  "Creates a new channel

  request - `com.amazonaws.services.medialive.model.CreateChannelRequest`

  returns: Result of the CreateChannel operation returned by the service. - `com.amazonaws.services.medialive.model.CreateChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.CreateChannelResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.CreateChannelRequest request]
    (-> this (.createChannel request))))

(defn describe-input-security-group
  "Produces a summary of an Input Security Group

  request - `com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest`

  returns: Result of the DescribeInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - The request to describe an Input Security Group was Invalid"
  (^com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest request]
    (-> this (.describeInputSecurityGroup request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AWSMediaLiveClient this]
    (-> this (.shutdown))))

(defn batch-update-schedule
  "Update a channel schedule

  request - `com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest`

  returns: Result of the BatchUpdateSchedule operation returned by the service. - `com.amazonaws.services.medialive.model.BatchUpdateScheduleResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.BatchUpdateScheduleResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest request]
    (-> this (.batchUpdateSchedule request))))

(defn delete-input-security-group
  "Deletes an Input Security Group

  request - `com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest`

  returns: Result of the DeleteInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - The request to delete the Input Security Group was Invalid"
  (^com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest request]
    (-> this (.deleteInputSecurityGroup request))))

(defn describe-input
  "Produces details about an input

  request - `com.amazonaws.services.medialive.model.DescribeInputRequest`

  returns: Result of the DescribeInput operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeInputResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DescribeInputResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DescribeInputRequest request]
    (-> this (.describeInput request))))

(defn describe-reservation
  "Get details for a reservation.

  request - `com.amazonaws.services.medialive.model.DescribeReservationRequest`

  returns: Result of the DescribeReservation operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeReservationResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DescribeReservationResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DescribeReservationRequest request]
    (-> this (.describeReservation request))))

(defn describe-offering
  "Get details for an offering.

  request - `com.amazonaws.services.medialive.model.DescribeOfferingRequest`

  returns: Result of the DescribeOffering operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeOfferingResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DescribeOfferingResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DescribeOfferingRequest request]
    (-> this (.describeOffering request))))

(defn update-input
  "Updates an input.

  request - `com.amazonaws.services.medialive.model.UpdateInputRequest`

  returns: Result of the UpdateInput operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateInputResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request to update the input was invalid."
  (^com.amazonaws.services.medialive.model.UpdateInputResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.UpdateInputRequest request]
    (-> this (.updateInput request))))

(defn start-channel
  "Starts an existing channel

  request - `com.amazonaws.services.medialive.model.StartChannelRequest`

  returns: Result of the StartChannel operation returned by the service. - `com.amazonaws.services.medialive.model.StartChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.StartChannelResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.StartChannelRequest request]
    (-> this (.startChannel request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaLiveClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-input
  "Deletes the input end point

  request - `com.amazonaws.services.medialive.model.DeleteInputRequest`

  returns: Result of the DeleteInput operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteInputResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DeleteInputResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DeleteInputRequest request]
    (-> this (.deleteInput request))))

(defn delete-channel
  "Starts deletion of channel. The associated outputs are also deleted.

  request - `com.amazonaws.services.medialive.model.DeleteChannelRequest`

  returns: Result of the DeleteChannel operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DeleteChannelResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DeleteChannelRequest request]
    (-> this (.deleteChannel request))))

(defn stop-channel
  "Stops a running channel

  request - `com.amazonaws.services.medialive.model.StopChannelRequest`

  returns: Result of the StopChannel operation returned by the service. - `com.amazonaws.services.medialive.model.StopChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid."
  (^com.amazonaws.services.medialive.model.StopChannelResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.StopChannelRequest request]
    (-> this (.stopChannel request))))

(defn describe-channel
  "Gets details about a channel

  request - `com.amazonaws.services.medialive.model.DescribeChannelRequest`

  returns: Result of the DescribeChannel operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeChannelResult`

  throws: com.amazonaws.services.medialive.model.BadRequestException - This request was invalid"
  (^com.amazonaws.services.medialive.model.DescribeChannelResult [^AWSMediaLiveClient this ^com.amazonaws.services.medialive.model.DescribeChannelRequest request]
    (-> this (.describeChannel request))))

