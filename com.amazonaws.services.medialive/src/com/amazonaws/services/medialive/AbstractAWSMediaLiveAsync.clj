(ns com.amazonaws.services.medialive.AbstractAWSMediaLiveAsync
  "Abstract implementation of AWSMediaLiveAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.medialive AbstractAWSMediaLiveAsync]))

(defn stop-channel-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for StopChannelRequest - `com.amazonaws.services.medialive.model.StopChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.StopChannelResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.StopChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.StopChannelRequest request]
    (-> this (.stopChannelAsync request))))

(defn update-input-async
  "Description copied from interface: AWSMediaLiveAsync

  request - A request to update an input. - `com.amazonaws.services.medialive.model.UpdateInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.UpdateInputResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateInputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInputAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateInputRequest request]
    (-> this (.updateInputAsync request))))

(defn start-channel-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for StartChannelRequest - `com.amazonaws.services.medialive.model.StartChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.StartChannelResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.StartChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.StartChannelRequest request]
    (-> this (.startChannelAsync request))))

(defn delete-reservation-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DeleteReservationRequest - `com.amazonaws.services.medialive.model.DeleteReservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteReservationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteReservationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReservationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteReservationRequest request]
    (-> this (.deleteReservationAsync request))))

(defn delete-tags-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DeleteTagsRequest - `com.amazonaws.services.medialive.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn delete-input-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DeleteInputRequest - `com.amazonaws.services.medialive.model.DeleteInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteInputResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteInputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInputAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteInputRequest request]
    (-> this (.deleteInputAsync request))))

(defn create-input-async
  "Description copied from interface: AWSMediaLiveAsync

  request - The name of the input - `com.amazonaws.services.medialive.model.CreateInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.CreateInputResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateInputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInputAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateInputRequest request]
    (-> this (.createInputAsync request))))

(defn purchase-offering-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for PurchaseOfferingRequest - `com.amazonaws.services.medialive.model.PurchaseOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseOffering operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.PurchaseOfferingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.PurchaseOfferingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseOfferingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.PurchaseOfferingRequest request]
    (-> this (.purchaseOfferingAsync request))))

(defn list-input-security-groups-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for ListInputSecurityGroupsRequest - `com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInputSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInputSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest request]
    (-> this (.listInputSecurityGroupsAsync request))))

(defn describe-reservation-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DescribeReservationRequest - `com.amazonaws.services.medialive.model.DescribeReservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeReservationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeReservationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeReservationRequest request]
    (-> this (.describeReservationAsync request))))

(defn describe-channel-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DescribeChannelRequest - `com.amazonaws.services.medialive.model.DescribeChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeChannelResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeChannelRequest request]
    (-> this (.describeChannelAsync request))))

(defn delete-input-security-group-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DeleteInputSecurityGroupRequest - `com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInputSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInputSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest request]
    (-> this (.deleteInputSecurityGroupAsync request))))

(defn list-reservations-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for ListReservationsRequest - `com.amazonaws.services.medialive.model.ListReservationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListReservations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListReservationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListReservationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listReservationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListReservationsRequest request]
    (-> this (.listReservationsAsync request))))

(defn describe-offering-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DescribeOfferingRequest - `com.amazonaws.services.medialive.model.DescribeOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOffering operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeOfferingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeOfferingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOfferingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeOfferingRequest request]
    (-> this (.describeOfferingAsync request))))

(defn batch-update-schedule-async
  "Description copied from interface: AWSMediaLiveAsync

  request - List of actions to create and list of actions to delete. - `com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUpdateSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.BatchUpdateScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUpdateScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest request]
    (-> this (.batchUpdateScheduleAsync request))))

(defn create-tags-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for CreateTagsRequest - `com.amazonaws.services.medialive.model.CreateTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateTagsRequest request]
    (-> this (.createTagsAsync request))))

(defn update-channel-async
  "Description copied from interface: AWSMediaLiveAsync

  request - A request to update a channel. - `com.amazonaws.services.medialive.model.UpdateChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.UpdateChannelResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateChannelRequest request]
    (-> this (.updateChannelAsync request))))

(defn update-reservation-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Request to update a reservation - `com.amazonaws.services.medialive.model.UpdateReservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.UpdateReservationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateReservationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateReservationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateReservationRequest request]
    (-> this (.updateReservationAsync request))))

(defn describe-schedule-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DescribeScheduleRequest - `com.amazonaws.services.medialive.model.DescribeScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeScheduleRequest request]
    (-> this (.describeScheduleAsync request))))

(defn list-channels-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for ListChannelsRequest - `com.amazonaws.services.medialive.model.ListChannelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListChannels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListChannelsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListChannelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listChannelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListChannelsRequest request]
    (-> this (.listChannelsAsync request))))

(defn list-inputs-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for ListInputsRequest - `com.amazonaws.services.medialive.model.ListInputsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInputs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListInputsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListInputsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInputsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListInputsRequest request]
    (-> this (.listInputsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for ListTagsForResourceRequest - `com.amazonaws.services.medialive.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-channel-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DeleteChannelRequest - `com.amazonaws.services.medialive.model.DeleteChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteChannelResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteChannelRequest request]
    (-> this (.deleteChannelAsync request))))

(defn create-channel-async
  "Description copied from interface: AWSMediaLiveAsync

  request - A request to create a channel - `com.amazonaws.services.medialive.model.CreateChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.CreateChannelResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateChannelRequest request]
    (-> this (.createChannelAsync request))))

(defn update-channel-class-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Channel class that the channel should be updated to. - `com.amazonaws.services.medialive.model.UpdateChannelClassRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateChannelClass operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.UpdateChannelClassResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateChannelClassRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateChannelClassAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateChannelClassRequest request]
    (-> this (.updateChannelClassAsync request))))

(defn list-offerings-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for ListOfferingsRequest - `com.amazonaws.services.medialive.model.ListOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOfferings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListOfferingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListOfferingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOfferingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListOfferingsRequest request]
    (-> this (.listOfferingsAsync request))))

(defn delete-schedule-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DeleteScheduleRequest - `com.amazonaws.services.medialive.model.DeleteScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteScheduleRequest request]
    (-> this (.deleteScheduleAsync request))))

(defn create-input-security-group-async
  "Description copied from interface: AWSMediaLiveAsync

  request - The IPv4 CIDRs to whitelist for this Input Security Group - `com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInputSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInputSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest request]
    (-> this (.createInputSecurityGroupAsync request))))

(defn describe-input-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DescribeInputRequest - `com.amazonaws.services.medialive.model.DescribeInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeInputResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeInputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInputAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeInputRequest request]
    (-> this (.describeInputAsync request))))

(defn update-input-security-group-async
  "Description copied from interface: AWSMediaLiveAsync

  request - The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input Security Group should allow. - `com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInputSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInputSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest request]
    (-> this (.updateInputSecurityGroupAsync request))))

(defn describe-input-security-group-async
  "Description copied from interface: AWSMediaLiveAsync

  request - Placeholder documentation for DescribeInputSecurityGroupRequest - `com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInputSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInputSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest request]
    (-> this (.describeInputSecurityGroupAsync request))))

