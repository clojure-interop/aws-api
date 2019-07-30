(ns com.amazonaws.services.medialive.AWSMediaLiveAsync
  "Interface for accessing MediaLive asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaLiveAsync instead.


  API for AWS Elemental MediaLive"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.medialive AWSMediaLiveAsync]))

(defn stop-channel-async
  "Stops a running channel

  stop-channel-request - Placeholder documentation for StopChannelRequest - `com.amazonaws.services.medialive.model.StopChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.StopChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.StopChannelRequest stop-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopChannelAsync stop-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.StopChannelRequest stop-channel-request]
    (-> this (.stopChannelAsync stop-channel-request))))

(defn update-input-async
  "Updates an input.

  update-input-request - A request to update an input. - `com.amazonaws.services.medialive.model.UpdateInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.UpdateInputResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateInputRequest update-input-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInputAsync update-input-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateInputRequest update-input-request]
    (-> this (.updateInputAsync update-input-request))))

(defn start-channel-async
  "Starts an existing channel

  start-channel-request - Placeholder documentation for StartChannelRequest - `com.amazonaws.services.medialive.model.StartChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.StartChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.StartChannelRequest start-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startChannelAsync start-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.StartChannelRequest start-channel-request]
    (-> this (.startChannelAsync start-channel-request))))

(defn delete-reservation-async
  "Delete an expired reservation.

  delete-reservation-request - Placeholder documentation for DeleteReservationRequest - `com.amazonaws.services.medialive.model.DeleteReservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteReservationResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteReservationRequest delete-reservation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReservationAsync delete-reservation-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteReservationRequest delete-reservation-request]
    (-> this (.deleteReservationAsync delete-reservation-request))))

(defn delete-tags-async
  "Removes tags for a resource

  delete-tags-request - Placeholder documentation for DeleteTagsRequest - `com.amazonaws.services.medialive.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteTagsRequest delete-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync delete-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTagsAsync delete-tags-request))))

(defn delete-input-async
  "Deletes the input end point

  delete-input-request - Placeholder documentation for DeleteInputRequest - `com.amazonaws.services.medialive.model.DeleteInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteInputResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteInputRequest delete-input-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInputAsync delete-input-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteInputRequest delete-input-request]
    (-> this (.deleteInputAsync delete-input-request))))

(defn create-input-async
  "Create an input

  create-input-request - The name of the input - `com.amazonaws.services.medialive.model.CreateInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.CreateInputResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateInputRequest create-input-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInputAsync create-input-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateInputRequest create-input-request]
    (-> this (.createInputAsync create-input-request))))

(defn purchase-offering-async
  "Purchase an offering and create a reservation.

  purchase-offering-request - Placeholder documentation for PurchaseOfferingRequest - `com.amazonaws.services.medialive.model.PurchaseOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseOffering operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.PurchaseOfferingResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.PurchaseOfferingRequest purchase-offering-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseOfferingAsync purchase-offering-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.PurchaseOfferingRequest purchase-offering-request]
    (-> this (.purchaseOfferingAsync purchase-offering-request))))

(defn list-input-security-groups-async
  "Produces a list of Input Security Groups for an account

  list-input-security-groups-request - Placeholder documentation for ListInputSecurityGroupsRequest - `com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInputSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest list-input-security-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInputSecurityGroupsAsync list-input-security-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest list-input-security-groups-request]
    (-> this (.listInputSecurityGroupsAsync list-input-security-groups-request))))

(defn describe-reservation-async
  "Get details for a reservation.

  describe-reservation-request - Placeholder documentation for DescribeReservationRequest - `com.amazonaws.services.medialive.model.DescribeReservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeReservationResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeReservationRequest describe-reservation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservationAsync describe-reservation-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeReservationRequest describe-reservation-request]
    (-> this (.describeReservationAsync describe-reservation-request))))

(defn describe-channel-async
  "Gets details about a channel

  describe-channel-request - Placeholder documentation for DescribeChannelRequest - `com.amazonaws.services.medialive.model.DescribeChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeChannelRequest describe-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeChannelAsync describe-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeChannelRequest describe-channel-request]
    (-> this (.describeChannelAsync describe-channel-request))))

(defn delete-input-security-group-async
  "Deletes an Input Security Group

  delete-input-security-group-request - Placeholder documentation for DeleteInputSecurityGroupRequest - `com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInputSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest delete-input-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInputSecurityGroupAsync delete-input-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest delete-input-security-group-request]
    (-> this (.deleteInputSecurityGroupAsync delete-input-security-group-request))))

(defn list-reservations-async
  "List purchased reservations.

  list-reservations-request - Placeholder documentation for ListReservationsRequest - `com.amazonaws.services.medialive.model.ListReservationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListReservations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListReservationsResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListReservationsRequest list-reservations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listReservationsAsync list-reservations-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListReservationsRequest list-reservations-request]
    (-> this (.listReservationsAsync list-reservations-request))))

(defn describe-offering-async
  "Get details for an offering.

  describe-offering-request - Placeholder documentation for DescribeOfferingRequest - `com.amazonaws.services.medialive.model.DescribeOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOffering operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeOfferingResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeOfferingRequest describe-offering-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOfferingAsync describe-offering-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeOfferingRequest describe-offering-request]
    (-> this (.describeOfferingAsync describe-offering-request))))

(defn batch-update-schedule-async
  "Update a channel schedule

  batch-update-schedule-request - List of actions to create and list of actions to delete. - `com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUpdateSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.BatchUpdateScheduleResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest batch-update-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUpdateScheduleAsync batch-update-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.BatchUpdateScheduleRequest batch-update-schedule-request]
    (-> this (.batchUpdateScheduleAsync batch-update-schedule-request))))

(defn create-tags-async
  "Create tags for a resource

  create-tags-request - Placeholder documentation for CreateTagsRequest - `com.amazonaws.services.medialive.model.CreateTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateTagsRequest create-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync create-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateTagsRequest create-tags-request]
    (-> this (.createTagsAsync create-tags-request))))

(defn update-channel-async
  "Updates a channel.

  update-channel-request - A request to update a channel. - `com.amazonaws.services.medialive.model.UpdateChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.UpdateChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateChannelRequest update-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateChannelAsync update-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateChannelRequest update-channel-request]
    (-> this (.updateChannelAsync update-channel-request))))

(defn update-reservation-async
  "Update reservation.

  update-reservation-request - Request to update a reservation - `com.amazonaws.services.medialive.model.UpdateReservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.UpdateReservationResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateReservationRequest update-reservation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateReservationAsync update-reservation-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateReservationRequest update-reservation-request]
    (-> this (.updateReservationAsync update-reservation-request))))

(defn describe-schedule-async
  "Get a channel schedule

  describe-schedule-request - Placeholder documentation for DescribeScheduleRequest - `com.amazonaws.services.medialive.model.DescribeScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeScheduleResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeScheduleRequest describe-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduleAsync describe-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeScheduleRequest describe-schedule-request]
    (-> this (.describeScheduleAsync describe-schedule-request))))

(defn list-channels-async
  "Produces list of channels that have been created

  list-channels-request - Placeholder documentation for ListChannelsRequest - `com.amazonaws.services.medialive.model.ListChannelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListChannels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListChannelsResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListChannelsRequest list-channels-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listChannelsAsync list-channels-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListChannelsRequest list-channels-request]
    (-> this (.listChannelsAsync list-channels-request))))

(defn list-inputs-async
  "Produces list of inputs that have been created

  list-inputs-request - Placeholder documentation for ListInputsRequest - `com.amazonaws.services.medialive.model.ListInputsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInputs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListInputsResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListInputsRequest list-inputs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInputsAsync list-inputs-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListInputsRequest list-inputs-request]
    (-> this (.listInputsAsync list-inputs-request))))

(defn list-tags-for-resource-async
  "Produces list of tags that have been created for a resource

  list-tags-for-resource-request - Placeholder documentation for ListTagsForResourceRequest - `com.amazonaws.services.medialive.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn delete-channel-async
  "Starts deletion of channel. The associated outputs are also deleted.

  delete-channel-request - Placeholder documentation for DeleteChannelRequest - `com.amazonaws.services.medialive.model.DeleteChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteChannelRequest delete-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteChannelAsync delete-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteChannelRequest delete-channel-request]
    (-> this (.deleteChannelAsync delete-channel-request))))

(defn create-channel-async
  "Creates a new channel

  create-channel-request - A request to create a channel - `com.amazonaws.services.medialive.model.CreateChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.CreateChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateChannelRequest create-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createChannelAsync create-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateChannelRequest create-channel-request]
    (-> this (.createChannelAsync create-channel-request))))

(defn update-channel-class-async
  "Changes the class of the channel.

  update-channel-class-request - Channel class that the channel should be updated to. - `com.amazonaws.services.medialive.model.UpdateChannelClassRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateChannelClass operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.UpdateChannelClassResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateChannelClassRequest update-channel-class-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateChannelClassAsync update-channel-class-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateChannelClassRequest update-channel-class-request]
    (-> this (.updateChannelClassAsync update-channel-class-request))))

(defn list-offerings-async
  "List offerings available for purchase.

  list-offerings-request - Placeholder documentation for ListOfferingsRequest - `com.amazonaws.services.medialive.model.ListOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOfferings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.ListOfferingsResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListOfferingsRequest list-offerings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOfferingsAsync list-offerings-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.ListOfferingsRequest list-offerings-request]
    (-> this (.listOfferingsAsync list-offerings-request))))

(defn delete-schedule-async
  "Delete all schedule actions on a channel.

  delete-schedule-request - Placeholder documentation for DeleteScheduleRequest - `com.amazonaws.services.medialive.model.DeleteScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DeleteScheduleResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteScheduleRequest delete-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScheduleAsync delete-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DeleteScheduleRequest delete-schedule-request]
    (-> this (.deleteScheduleAsync delete-schedule-request))))

(defn create-input-security-group-async
  "Creates a Input Security Group

  create-input-security-group-request - The IPv4 CIDRs to whitelist for this Input Security Group - `com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInputSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest create-input-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInputSecurityGroupAsync create-input-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest create-input-security-group-request]
    (-> this (.createInputSecurityGroupAsync create-input-security-group-request))))

(defn describe-input-async
  "Produces details about an input

  describe-input-request - Placeholder documentation for DescribeInputRequest - `com.amazonaws.services.medialive.model.DescribeInputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeInputResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeInputRequest describe-input-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInputAsync describe-input-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeInputRequest describe-input-request]
    (-> this (.describeInputAsync describe-input-request))))

(defn update-input-security-group-async
  "Update an Input Security Group's Whilelists.

  update-input-security-group-request - The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input Security Group should allow. - `com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInputSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest update-input-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInputSecurityGroupAsync update-input-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest update-input-security-group-request]
    (-> this (.updateInputSecurityGroupAsync update-input-security-group-request))))

(defn describe-input-security-group-async
  "Produces a summary of an Input Security Group

  describe-input-security-group-request - Placeholder documentation for DescribeInputSecurityGroupRequest - `com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInputSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest describe-input-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInputSecurityGroupAsync describe-input-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaLiveAsync this ^com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest describe-input-security-group-request]
    (-> this (.describeInputSecurityGroupAsync describe-input-security-group-request))))

