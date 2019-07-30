(ns com.amazonaws.services.medialive.AbstractAWSMediaLive
  "Abstract implementation of AWSMediaLive. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.medialive AbstractAWSMediaLive]))

(defn create-input-security-group
  "Description copied from interface: AWSMediaLive

  request - The IPv4 CIDRs to whitelist for this Input Security Group - `com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest`

  returns: Result of the CreateInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult`"
  (^com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest request]
    (-> this (.createInputSecurityGroup request))))

(defn delete-tags
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DeleteTagsRequest - `com.amazonaws.services.medialive.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteTagsResult`"
  (^com.amazonaws.services.medialive.model.DeleteTagsResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn purchase-offering
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for PurchaseOfferingRequest - `com.amazonaws.services.medialive.model.PurchaseOfferingRequest`

  returns: Result of the PurchaseOffering operation returned by the service. - `com.amazonaws.services.medialive.model.PurchaseOfferingResult`"
  (^com.amazonaws.services.medialive.model.PurchaseOfferingResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.PurchaseOfferingRequest request]
    (-> this (.purchaseOffering request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for ListTagsForResourceRequest - `com.amazonaws.services.medialive.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.medialive.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.medialive.model.ListTagsForResourceResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-schedule
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DeleteScheduleRequest - `com.amazonaws.services.medialive.model.DeleteScheduleRequest`

  returns: Result of the DeleteSchedule operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteScheduleResult`"
  (^com.amazonaws.services.medialive.model.DeleteScheduleResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteScheduleRequest request]
    (-> this (.deleteSchedule request))))

(defn list-inputs
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for ListInputsRequest - `com.amazonaws.services.medialive.model.ListInputsRequest`

  returns: Result of the ListInputs operation returned by the service. - `com.amazonaws.services.medialive.model.ListInputsResult`"
  (^com.amazonaws.services.medialive.model.ListInputsResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.ListInputsRequest request]
    (-> this (.listInputs request))))

(defn list-offerings
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for ListOfferingsRequest - `com.amazonaws.services.medialive.model.ListOfferingsRequest`

  returns: Result of the ListOfferings operation returned by the service. - `com.amazonaws.services.medialive.model.ListOfferingsResult`"
  (^com.amazonaws.services.medialive.model.ListOfferingsResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.ListOfferingsRequest request]
    (-> this (.listOfferings request))))

(defn waiters
  "returns: `com.amazonaws.services.medialive.waiters.AWSMediaLiveWaiters`"
  (^com.amazonaws.services.medialive.waiters.AWSMediaLiveWaiters [^AbstractAWSMediaLive this]
    (-> this (.waiters))))

(defn list-channels
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for ListChannelsRequest - `com.amazonaws.services.medialive.model.ListChannelsRequest`

  returns: Result of the ListChannels operation returned by the service. - `com.amazonaws.services.medialive.model.ListChannelsResult`"
  (^com.amazonaws.services.medialive.model.ListChannelsResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.ListChannelsRequest request]
    (-> this (.listChannels request))))

(defn create-input
  "Description copied from interface: AWSMediaLive

  request - The name of the input - `com.amazonaws.services.medialive.model.CreateInputRequest`

  returns: Result of the CreateInput operation returned by the service. - `com.amazonaws.services.medialive.model.CreateInputResult`"
  (^com.amazonaws.services.medialive.model.CreateInputResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.CreateInputRequest request]
    (-> this (.createInput request))))

(defn list-input-security-groups
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for ListInputSecurityGroupsRequest - `com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest`

  returns: Result of the ListInputSecurityGroups operation returned by the service. - `com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult`"
  (^com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest request]
    (-> this (.listInputSecurityGroups request))))

(defn update-channel
  "Description copied from interface: AWSMediaLive

  request - A request to update a channel. - `com.amazonaws.services.medialive.model.UpdateChannelRequest`

  returns: Result of the UpdateChannel operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateChannelResult`"
  (^com.amazonaws.services.medialive.model.UpdateChannelResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.UpdateChannelRequest request]
    (-> this (.updateChannel request))))

(defn update-reservation
  "Description copied from interface: AWSMediaLive

  request - Request to update a reservation - `com.amazonaws.services.medialive.model.UpdateReservationRequest`

  returns: Result of the UpdateReservation operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateReservationResult`"
  (^com.amazonaws.services.medialive.model.UpdateReservationResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.UpdateReservationRequest request]
    (-> this (.updateReservation request))))

(defn describe-schedule
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DescribeScheduleRequest - `com.amazonaws.services.medialive.model.DescribeScheduleRequest`

  returns: Result of the DescribeSchedule operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeScheduleResult`"
  (^com.amazonaws.services.medialive.model.DescribeScheduleResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeScheduleRequest request]
    (-> this (.describeSchedule request))))

(defn update-channel-class
  "Description copied from interface: AWSMediaLive

  request - Channel class that the channel should be updated to. - `com.amazonaws.services.medialive.model.UpdateChannelClassRequest`

  returns: Result of the UpdateChannelClass operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateChannelClassResult`"
  (^com.amazonaws.services.medialive.model.UpdateChannelClassResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.UpdateChannelClassRequest request]
    (-> this (.updateChannelClass request))))

(defn delete-reservation
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DeleteReservationRequest - `com.amazonaws.services.medialive.model.DeleteReservationRequest`

  returns: Result of the DeleteReservation operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteReservationResult`"
  (^com.amazonaws.services.medialive.model.DeleteReservationResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteReservationRequest request]
    (-> this (.deleteReservation request))))

(defn update-input-security-group
  "Description copied from interface: AWSMediaLive

  request - The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input Security Group should allow. - `com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest`

  returns: Result of the UpdateInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult`"
  (^com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest request]
    (-> this (.updateInputSecurityGroup request))))

(defn list-reservations
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for ListReservationsRequest - `com.amazonaws.services.medialive.model.ListReservationsRequest`

  returns: Result of the ListReservations operation returned by the service. - `com.amazonaws.services.medialive.model.ListReservationsResult`"
  (^com.amazonaws.services.medialive.model.ListReservationsResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.ListReservationsRequest request]
    (-> this (.listReservations request))))

(defn create-tags
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for CreateTagsRequest - `com.amazonaws.services.medialive.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.medialive.model.CreateTagsResult`"
  (^com.amazonaws.services.medialive.model.CreateTagsResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn create-channel
  "Description copied from interface: AWSMediaLive

  request - A request to create a channel - `com.amazonaws.services.medialive.model.CreateChannelRequest`

  returns: Result of the CreateChannel operation returned by the service. - `com.amazonaws.services.medialive.model.CreateChannelResult`"
  (^com.amazonaws.services.medialive.model.CreateChannelResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.CreateChannelRequest request]
    (-> this (.createChannel request))))

(defn describe-input-security-group
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DescribeInputSecurityGroupRequest - `com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest`

  returns: Result of the DescribeInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult`"
  (^com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest request]
    (-> this (.describeInputSecurityGroup request))))

(defn shutdown
  "Description copied from interface: AWSMediaLive"
  ([^AbstractAWSMediaLive this]
    (-> this (.shutdown))))

(defn batch-update-schedule
  "Description copied from interface: AWSMediaLive

  request - List of actions to create and list of actions to delete. - `com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest`

  returns: Result of the BatchUpdateSchedule operation returned by the service. - `com.amazonaws.services.medialive.model.BatchUpdateScheduleResult`"
  (^com.amazonaws.services.medialive.model.BatchUpdateScheduleResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest request]
    (-> this (.batchUpdateSchedule request))))

(defn delete-input-security-group
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DeleteInputSecurityGroupRequest - `com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest`

  returns: Result of the DeleteInputSecurityGroup operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult`"
  (^com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest request]
    (-> this (.deleteInputSecurityGroup request))))

(defn describe-input
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DescribeInputRequest - `com.amazonaws.services.medialive.model.DescribeInputRequest`

  returns: Result of the DescribeInput operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeInputResult`"
  (^com.amazonaws.services.medialive.model.DescribeInputResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeInputRequest request]
    (-> this (.describeInput request))))

(defn describe-reservation
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DescribeReservationRequest - `com.amazonaws.services.medialive.model.DescribeReservationRequest`

  returns: Result of the DescribeReservation operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeReservationResult`"
  (^com.amazonaws.services.medialive.model.DescribeReservationResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeReservationRequest request]
    (-> this (.describeReservation request))))

(defn describe-offering
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DescribeOfferingRequest - `com.amazonaws.services.medialive.model.DescribeOfferingRequest`

  returns: Result of the DescribeOffering operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeOfferingResult`"
  (^com.amazonaws.services.medialive.model.DescribeOfferingResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeOfferingRequest request]
    (-> this (.describeOffering request))))

(defn update-input
  "Description copied from interface: AWSMediaLive

  request - A request to update an input. - `com.amazonaws.services.medialive.model.UpdateInputRequest`

  returns: Result of the UpdateInput operation returned by the service. - `com.amazonaws.services.medialive.model.UpdateInputResult`"
  (^com.amazonaws.services.medialive.model.UpdateInputResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.UpdateInputRequest request]
    (-> this (.updateInput request))))

(defn start-channel
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for StartChannelRequest - `com.amazonaws.services.medialive.model.StartChannelRequest`

  returns: Result of the StartChannel operation returned by the service. - `com.amazonaws.services.medialive.model.StartChannelResult`"
  (^com.amazonaws.services.medialive.model.StartChannelResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.StartChannelRequest request]
    (-> this (.startChannel request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMediaLive

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMediaLive this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-input
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DeleteInputRequest - `com.amazonaws.services.medialive.model.DeleteInputRequest`

  returns: Result of the DeleteInput operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteInputResult`"
  (^com.amazonaws.services.medialive.model.DeleteInputResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteInputRequest request]
    (-> this (.deleteInput request))))

(defn delete-channel
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DeleteChannelRequest - `com.amazonaws.services.medialive.model.DeleteChannelRequest`

  returns: Result of the DeleteChannel operation returned by the service. - `com.amazonaws.services.medialive.model.DeleteChannelResult`"
  (^com.amazonaws.services.medialive.model.DeleteChannelResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DeleteChannelRequest request]
    (-> this (.deleteChannel request))))

(defn stop-channel
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for StopChannelRequest - `com.amazonaws.services.medialive.model.StopChannelRequest`

  returns: Result of the StopChannel operation returned by the service. - `com.amazonaws.services.medialive.model.StopChannelResult`"
  (^com.amazonaws.services.medialive.model.StopChannelResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.StopChannelRequest request]
    (-> this (.stopChannel request))))

(defn describe-channel
  "Description copied from interface: AWSMediaLive

  request - Placeholder documentation for DescribeChannelRequest - `com.amazonaws.services.medialive.model.DescribeChannelRequest`

  returns: Result of the DescribeChannel operation returned by the service. - `com.amazonaws.services.medialive.model.DescribeChannelResult`"
  (^com.amazonaws.services.medialive.model.DescribeChannelResult [^AbstractAWSMediaLive this ^com.amazonaws.services.medialive.model.DescribeChannelRequest request]
    (-> this (.describeChannel request))))

