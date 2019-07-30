(ns com.amazonaws.services.pinpoint.AmazonPinpointAsync
  "Interface for accessing Amazon Pinpoint asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPinpointAsync instead.



  Doc Engage API - Amazon Pinpoint API"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpoint AmazonPinpointAsync]))

(defn put-event-stream-async
  "Creates a new event stream for an application or updates the settings of an existing event stream for an
   application.

  put-event-stream-request - `com.amazonaws.services.pinpoint.model.PutEventStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEventStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.PutEventStreamResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.PutEventStreamRequest put-event-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventStreamAsync put-event-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.PutEventStreamRequest put-event-stream-request]
    (-> this (.putEventStreamAsync put-event-stream-request))))

(defn untag-resource-async
  "Removes one or more tags (keys and values) from an application, campaign, or segment.

  untag-resource-request - `com.amazonaws.services.pinpoint.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-app-async
  "Retrieves information about an application.

  get-app-request - `com.amazonaws.services.pinpoint.model.GetAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetAppResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetAppRequest get-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppAsync get-app-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetAppRequest get-app-request]
    (-> this (.getAppAsync get-app-request))))

(defn delete-campaign-async
  "Deletes a campaign from an application.

  delete-campaign-request - `com.amazonaws.services.pinpoint.model.DeleteCampaignRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteCampaignRequest delete-campaign-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCampaignAsync delete-campaign-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteCampaignRequest delete-campaign-request]
    (-> this (.deleteCampaignAsync delete-campaign-request))))

(defn get-export-job-async
  "Retrieves information about the status and settings of a specific export job for an application.

  get-export-job-request - `com.amazonaws.services.pinpoint.model.GetExportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetExportJobResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetExportJobRequest get-export-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExportJobAsync get-export-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetExportJobRequest get-export-job-request]
    (-> this (.getExportJobAsync get-export-job-request))))

(defn delete-gcm-channel-async
  "Disables the GCM channel for an application and deletes any existing settings for the channel.

  delete-gcm-channel-request - `com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGcmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest delete-gcm-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGcmChannelAsync delete-gcm-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest delete-gcm-channel-request]
    (-> this (.deleteGcmChannelAsync delete-gcm-channel-request))))

(defn delete-adm-channel-async
  "Disables the ADM channel for an application and deletes any existing settings for the channel.

  delete-adm-channel-request - `com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAdmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest delete-adm-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAdmChannelAsync delete-adm-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest delete-adm-channel-request]
    (-> this (.deleteAdmChannelAsync delete-adm-channel-request))))

(defn update-apns-voip-channel-async
  "Updates the APNs VoIP channel settings for an application.

  update-apns-voip-channel-request - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApnsVoipChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest update-apns-voip-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApnsVoipChannelAsync update-apns-voip-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest update-apns-voip-channel-request]
    (-> this (.updateApnsVoipChannelAsync update-apns-voip-channel-request))))

(defn get-channels-async
  "Retrieves information about the history and status of each channel for an application.

  get-channels-request - `com.amazonaws.services.pinpoint.model.GetChannelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetChannels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetChannelsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetChannelsRequest get-channels-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getChannelsAsync get-channels-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetChannelsRequest get-channels-request]
    (-> this (.getChannelsAsync get-channels-request))))

(defn phone-number-validate-async
  "Retrieves information about a phone number.

  phone-number-validate-request - `com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PhoneNumberValidate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.PhoneNumberValidateResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest phone-number-validate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.phoneNumberValidateAsync phone-number-validate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest phone-number-validate-request]
    (-> this (.phoneNumberValidateAsync phone-number-validate-request))))

(defn update-apns-channel-async
  "Updates the APNs channel settings for an application.

  update-apns-channel-request - `com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApnsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest update-apns-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApnsChannelAsync update-apns-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest update-apns-channel-request]
    (-> this (.updateApnsChannelAsync update-apns-channel-request))))

(defn delete-apns-channel-async
  "Disables the APNs channel for an application and deletes any existing settings for the channel.

  delete-apns-channel-request - `com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApnsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest delete-apns-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApnsChannelAsync delete-apns-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest delete-apns-channel-request]
    (-> this (.deleteApnsChannelAsync delete-apns-channel-request))))

(defn update-application-settings-async
  "Updates the settings for an application.

  update-application-settings-request - `com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplicationSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest update-application-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationSettingsAsync update-application-settings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest update-application-settings-request]
    (-> this (.updateApplicationSettingsAsync update-application-settings-request))))

(defn delete-apns-sandbox-channel-async
  "Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.

  delete-apns-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApnsSandboxChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest delete-apns-sandbox-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApnsSandboxChannelAsync delete-apns-sandbox-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest delete-apns-sandbox-channel-request]
    (-> this (.deleteApnsSandboxChannelAsync delete-apns-sandbox-channel-request))))

(defn delete-apns-voip-sandbox-channel-async
  "Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.

  delete-apns-voip-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApnsVoipSandboxChannel operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest delete-apns-voip-sandbox-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApnsVoipSandboxChannelAsync delete-apns-voip-sandbox-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest delete-apns-voip-sandbox-channel-request]
    (-> this (.deleteApnsVoipSandboxChannelAsync delete-apns-voip-sandbox-channel-request))))

(defn create-segment-async
  "Creates a new segment for an application or updates the configuration, dimension, and other settings for an
   existing segment that's associated with an application.

  create-segment-request - `com.amazonaws.services.pinpoint.model.CreateSegmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSegment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.CreateSegmentResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.CreateSegmentRequest create-segment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSegmentAsync create-segment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.CreateSegmentRequest create-segment-request]
    (-> this (.createSegmentAsync create-segment-request))))

(defn delete-app-async
  "Deletes an application.

  delete-app-request - `com.amazonaws.services.pinpoint.model.DeleteAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteAppResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteAppRequest delete-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppAsync delete-app-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteAppRequest delete-app-request]
    (-> this (.deleteAppAsync delete-app-request))))

(defn get-application-date-range-kpi-async
  "Retrieves (queries) pre-aggregated data for a standard metric that applies to an application.

  get-application-date-range-kpi-request - `com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplicationDateRangeKpi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest get-application-date-range-kpi-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationDateRangeKpiAsync get-application-date-range-kpi-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest get-application-date-range-kpi-request]
    (-> this (.getApplicationDateRangeKpiAsync get-application-date-range-kpi-request))))

(defn delete-email-channel-async
  "Disables the email channel for an application and deletes any existing settings for the channel.

  delete-email-channel-request - `com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEmailChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest delete-email-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEmailChannelAsync delete-email-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest delete-email-channel-request]
    (-> this (.deleteEmailChannelAsync delete-email-channel-request))))

(defn get-apns-voip-channel-async
  "Retrieves information about the status and settings of the APNs VoIP channel for an application.

  get-apns-voip-channel-request - `com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApnsVoipChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest get-apns-voip-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApnsVoipChannelAsync get-apns-voip-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest get-apns-voip-channel-request]
    (-> this (.getApnsVoipChannelAsync get-apns-voip-channel-request))))

(defn get-endpoint-async
  "Retrieves information about the settings and attributes of a specific endpoint for an application.

  get-endpoint-request - `com.amazonaws.services.pinpoint.model.GetEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetEndpointRequest get-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEndpointAsync get-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetEndpointRequest get-endpoint-request]
    (-> this (.getEndpointAsync get-endpoint-request))))

(defn get-segment-export-jobs-async
  "Retrieves information about the status and settings of the export jobs for a segment.

  get-segment-export-jobs-request - `com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegmentExportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest get-segment-export-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentExportJobsAsync get-segment-export-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest get-segment-export-jobs-request]
    (-> this (.getSegmentExportJobsAsync get-segment-export-jobs-request))))

(defn delete-baidu-channel-async
  "Disables the Baidu channel for an application and deletes any existing settings for the channel.

  delete-baidu-channel-request - `com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBaiduChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest delete-baidu-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBaiduChannelAsync delete-baidu-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest delete-baidu-channel-request]
    (-> this (.deleteBaiduChannelAsync delete-baidu-channel-request))))

(defn delete-user-endpoints-async
  "Deletes all the endpoints that are associated with a specific user ID.

  delete-user-endpoints-request - `com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteUserEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest delete-user-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserEndpointsAsync delete-user-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest delete-user-endpoints-request]
    (-> this (.deleteUserEndpointsAsync delete-user-endpoints-request))))

(defn get-voice-channel-async
  "Retrieves information about the status and settings of the voice channel for an application.

  get-voice-channel-request - `com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVoiceChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetVoiceChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest get-voice-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVoiceChannelAsync get-voice-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest get-voice-channel-request]
    (-> this (.getVoiceChannelAsync get-voice-channel-request))))

(defn get-segment-async
  "Retrieves information about the configuration, dimension, and other settings for a specific segment that's
   associated with an application.

  get-segment-request - `com.amazonaws.services.pinpoint.model.GetSegmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentRequest get-segment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentAsync get-segment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentRequest get-segment-request]
    (-> this (.getSegmentAsync get-segment-request))))

(defn update-apns-voip-sandbox-channel-async
  "Updates the settings for the APNs VoIP sandbox channel for an application.

  update-apns-voip-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApnsVoipSandboxChannel operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest update-apns-voip-sandbox-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApnsVoipSandboxChannelAsync update-apns-voip-sandbox-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest update-apns-voip-sandbox-channel-request]
    (-> this (.updateApnsVoipSandboxChannelAsync update-apns-voip-sandbox-channel-request))))

(defn get-apns-voip-sandbox-channel-async
  "Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.

  get-apns-voip-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApnsVoipSandboxChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest get-apns-voip-sandbox-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApnsVoipSandboxChannelAsync get-apns-voip-sandbox-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest get-apns-voip-sandbox-channel-request]
    (-> this (.getApnsVoipSandboxChannelAsync get-apns-voip-sandbox-channel-request))))

(defn get-campaign-activities-async
  "Retrieves information about the activity performed by a campaign.

  get-campaign-activities-request - `com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaignActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest get-campaign-activities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignActivitiesAsync get-campaign-activities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest get-campaign-activities-request]
    (-> this (.getCampaignActivitiesAsync get-campaign-activities-request))))

(defn delete-endpoint-async
  "Deletes an endpoint from an application.

  delete-endpoint-request - `com.amazonaws.services.pinpoint.model.DeleteEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteEndpointRequest delete-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointAsync delete-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteEndpointRequest delete-endpoint-request]
    (-> this (.deleteEndpointAsync delete-endpoint-request))))

(defn send-users-messages-async
  "Creates and sends a message to a list of users.

  send-users-messages-request - `com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendUsersMessages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.SendUsersMessagesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest send-users-messages-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendUsersMessagesAsync send-users-messages-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest send-users-messages-request]
    (-> this (.sendUsersMessagesAsync send-users-messages-request))))

(defn get-apps-async
  "Retrieves information about all of your applications.

  get-apps-request - `com.amazonaws.services.pinpoint.model.GetAppsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetAppsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetAppsRequest get-apps-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppsAsync get-apps-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetAppsRequest get-apps-request]
    (-> this (.getAppsAsync get-apps-request))))

(defn get-import-job-async
  "Retrieves information about the status and settings of a specific import job for an application.

  get-import-job-request - `com.amazonaws.services.pinpoint.model.GetImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetImportJobResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetImportJobRequest get-import-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getImportJobAsync get-import-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetImportJobRequest get-import-job-request]
    (-> this (.getImportJobAsync get-import-job-request))))

(defn get-campaign-date-range-kpi-async
  "Retrieves (queries) pre-aggregated data for a standard metric that applies to a campaign.

  get-campaign-date-range-kpi-request - `com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaignDateRangeKpi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest get-campaign-date-range-kpi-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignDateRangeKpiAsync get-campaign-date-range-kpi-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest get-campaign-date-range-kpi-request]
    (-> this (.getCampaignDateRangeKpiAsync get-campaign-date-range-kpi-request))))

(defn get-segment-versions-async
  "Retrieves information about the configuration, dimension, and other settings for all versions of a specific
   segment that's associated with an application.

  get-segment-versions-request - `com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegmentVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest get-segment-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentVersionsAsync get-segment-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest get-segment-versions-request]
    (-> this (.getSegmentVersionsAsync get-segment-versions-request))))

(defn create-campaign-async
  "Creates a new campaign for an application or updates the settings of an existing campaign for an application.

  create-campaign-request - `com.amazonaws.services.pinpoint.model.CreateCampaignRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.CreateCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.CreateCampaignRequest create-campaign-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCampaignAsync create-campaign-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.CreateCampaignRequest create-campaign-request]
    (-> this (.createCampaignAsync create-campaign-request))))

(defn get-application-settings-async
  "Retrieves information about the settings for an application.

  get-application-settings-request - `com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplicationSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest get-application-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationSettingsAsync get-application-settings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest get-application-settings-request]
    (-> this (.getApplicationSettingsAsync get-application-settings-request))))

(defn get-apns-sandbox-channel-async
  "Retrieves information about the status and settings of the APNs sandbox channel for an application.

  get-apns-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApnsSandboxChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest get-apns-sandbox-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApnsSandboxChannelAsync get-apns-sandbox-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest get-apns-sandbox-channel-request]
    (-> this (.getApnsSandboxChannelAsync get-apns-sandbox-channel-request))))

(defn delete-voice-channel-async
  "Disables the voice channel for an application and deletes any existing settings for the channel.

  delete-voice-channel-request - `com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVoiceChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteVoiceChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest delete-voice-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVoiceChannelAsync delete-voice-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest delete-voice-channel-request]
    (-> this (.deleteVoiceChannelAsync delete-voice-channel-request))))

(defn send-messages-async
  "Creates and sends a direct message.

  send-messages-request - `com.amazonaws.services.pinpoint.model.SendMessagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendMessages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.SendMessagesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.SendMessagesRequest send-messages-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendMessagesAsync send-messages-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.SendMessagesRequest send-messages-request]
    (-> this (.sendMessagesAsync send-messages-request))))

(defn get-gcm-channel-async
  "Retrieves information about the status and settings of the GCM channel for an application.

  get-gcm-channel-request - `com.amazonaws.services.pinpoint.model.GetGcmChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGcmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetGcmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetGcmChannelRequest get-gcm-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGcmChannelAsync get-gcm-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetGcmChannelRequest get-gcm-channel-request]
    (-> this (.getGcmChannelAsync get-gcm-channel-request))))

(defn update-gcm-channel-async
  "Updates the status and settings of the GCM channel for an application.

  update-gcm-channel-request - `com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGcmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest update-gcm-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGcmChannelAsync update-gcm-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest update-gcm-channel-request]
    (-> this (.updateGcmChannelAsync update-gcm-channel-request))))

(defn get-import-jobs-async
  "Retrieves information about the status and settings of all the import jobs for an application.

  get-import-jobs-request - `com.amazonaws.services.pinpoint.model.GetImportJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetImportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetImportJobsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetImportJobsRequest get-import-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getImportJobsAsync get-import-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetImportJobsRequest get-import-jobs-request]
    (-> this (.getImportJobsAsync get-import-jobs-request))))

(defn get-campaign-version-async
  "Retrieves information about the status, configuration, and other settings for a specific version of a campaign.

  get-campaign-version-request - `com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaignVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignVersionResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest get-campaign-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignVersionAsync get-campaign-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest get-campaign-version-request]
    (-> this (.getCampaignVersionAsync get-campaign-version-request))))

(defn delete-event-stream-async
  "Deletes the event stream for an application.

  delete-event-stream-request - `com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteEventStreamResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest delete-event-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventStreamAsync delete-event-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest delete-event-stream-request]
    (-> this (.deleteEventStreamAsync delete-event-stream-request))))

(defn put-events-async
  "Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are
   associated with.

  put-events-request - `com.amazonaws.services.pinpoint.model.PutEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.PutEventsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.PutEventsRequest put-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventsAsync put-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.PutEventsRequest put-events-request]
    (-> this (.putEventsAsync put-events-request))))

(defn update-sms-channel-async
  "Updates the status and settings of the SMS channel for an application.

  update-sms-channel-request - `com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSmsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest update-sms-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSmsChannelAsync update-sms-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest update-sms-channel-request]
    (-> this (.updateSmsChannelAsync update-sms-channel-request))))

(defn update-segment-async
  "Creates a new segment for an application or updates the configuration, dimension, and other settings for an
   existing segment that's associated with an application.

  update-segment-request - `com.amazonaws.services.pinpoint.model.UpdateSegmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSegment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateSegmentResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateSegmentRequest update-segment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSegmentAsync update-segment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateSegmentRequest update-segment-request]
    (-> this (.updateSegmentAsync update-segment-request))))

(defn get-sms-channel-async
  "Retrieves information about the status and settings of the SMS channel for an application.

  get-sms-channel-request - `com.amazonaws.services.pinpoint.model.GetSmsChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSmsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSmsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSmsChannelRequest get-sms-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSmsChannelAsync get-sms-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSmsChannelRequest get-sms-channel-request]
    (-> this (.getSmsChannelAsync get-sms-channel-request))))

(defn get-email-channel-async
  "Retrieves information about the status and settings of the email channel for an application.

  get-email-channel-request - `com.amazonaws.services.pinpoint.model.GetEmailChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEmailChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetEmailChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetEmailChannelRequest get-email-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEmailChannelAsync get-email-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetEmailChannelRequest get-email-channel-request]
    (-> this (.getEmailChannelAsync get-email-channel-request))))

(defn get-campaigns-async
  "Retrieves information about the status, configuration, and other settings for all the campaigns that are
   associated with an application.

  get-campaigns-request - `com.amazonaws.services.pinpoint.model.GetCampaignsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaigns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignsRequest get-campaigns-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignsAsync get-campaigns-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignsRequest get-campaigns-request]
    (-> this (.getCampaignsAsync get-campaigns-request))))

(defn delete-segment-async
  "Deletes a segment from an application.

  delete-segment-request - `com.amazonaws.services.pinpoint.model.DeleteSegmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSegment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteSegmentResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteSegmentRequest delete-segment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSegmentAsync delete-segment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteSegmentRequest delete-segment-request]
    (-> this (.deleteSegmentAsync delete-segment-request))))

(defn get-segment-version-async
  "Retrieves information about the configuration, dimension, and other settings for a specific version of a segment
   that's associated with an application.

  get-segment-version-request - `com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegmentVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentVersionResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest get-segment-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentVersionAsync get-segment-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest get-segment-version-request]
    (-> this (.getSegmentVersionAsync get-segment-version-request))))

(defn update-email-channel-async
  "Updates the status and settings of the email channel for an application.

  update-email-channel-request - `com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEmailChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest update-email-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEmailChannelAsync update-email-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest update-email-channel-request]
    (-> this (.updateEmailChannelAsync update-email-channel-request))))

(defn get-user-endpoints-async
  "Retrieves information about all the endpoints that are associated with a specific user ID.

  get-user-endpoints-request - `com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetUserEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest get-user-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserEndpointsAsync get-user-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest get-user-endpoints-request]
    (-> this (.getUserEndpointsAsync get-user-endpoints-request))))

(defn get-campaign-async
  "Retrieves information about the status, configuration, and other settings for a campaign.

  get-campaign-request - `com.amazonaws.services.pinpoint.model.GetCampaignRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignRequest get-campaign-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignAsync get-campaign-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignRequest get-campaign-request]
    (-> this (.getCampaignAsync get-campaign-request))))

(defn update-baidu-channel-async
  "Updates the settings of the Baidu channel for an application.

  update-baidu-channel-request - `com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBaiduChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest update-baidu-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBaiduChannelAsync update-baidu-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest update-baidu-channel-request]
    (-> this (.updateBaiduChannelAsync update-baidu-channel-request))))

(defn update-voice-channel-async
  "Updates the status and settings of the voice channel for an application.

  update-voice-channel-request - `com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVoiceChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateVoiceChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest update-voice-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVoiceChannelAsync update-voice-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest update-voice-channel-request]
    (-> this (.updateVoiceChannelAsync update-voice-channel-request))))

(defn get-adm-channel-async
  "Retrieves information about the status and settings of the ADM channel for an application.

  get-adm-channel-request - `com.amazonaws.services.pinpoint.model.GetAdmChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAdmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetAdmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetAdmChannelRequest get-adm-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAdmChannelAsync get-adm-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetAdmChannelRequest get-adm-channel-request]
    (-> this (.getAdmChannelAsync get-adm-channel-request))))

(defn list-tags-for-resource-async
  "Retrieves all the tags (keys and values) that are associated with an application, campaign, or segment.

  list-tags-for-resource-request - `com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn get-event-stream-async
  "Retrieves information about the event stream settings for an application.

  get-event-stream-request - `com.amazonaws.services.pinpoint.model.GetEventStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEventStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetEventStreamResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetEventStreamRequest get-event-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEventStreamAsync get-event-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetEventStreamRequest get-event-stream-request]
    (-> this (.getEventStreamAsync get-event-stream-request))))

(defn delete-sms-channel-async
  "Disables the SMS channel for an application and deletes any existing settings for the channel.

  delete-sms-channel-request - `com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSmsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest delete-sms-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSmsChannelAsync delete-sms-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest delete-sms-channel-request]
    (-> this (.deleteSmsChannelAsync delete-sms-channel-request))))

(defn update-campaign-async
  "Updates the settings for a campaign.

  update-campaign-request - `com.amazonaws.services.pinpoint.model.UpdateCampaignRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateCampaignRequest update-campaign-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCampaignAsync update-campaign-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateCampaignRequest update-campaign-request]
    (-> this (.updateCampaignAsync update-campaign-request))))

(defn update-adm-channel-async
  "Updates the ADM channel settings for an application.

  update-adm-channel-request - `com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAdmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest update-adm-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAdmChannelAsync update-adm-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest update-adm-channel-request]
    (-> this (.updateAdmChannelAsync update-adm-channel-request))))

(defn update-endpoints-batch-async
  "Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing
   endpoints for an application. You can also use this operation to define custom attributes (Attributes, Metrics,
   and UserAttributes properties) for a batch of endpoints.

  update-endpoints-batch-request - `com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpointsBatch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest update-endpoints-batch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointsBatchAsync update-endpoints-batch-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest update-endpoints-batch-request]
    (-> this (.updateEndpointsBatchAsync update-endpoints-batch-request))))

(defn create-import-job-async
  "Creates a new import job for an application.

  create-import-job-request - `com.amazonaws.services.pinpoint.model.CreateImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.CreateImportJobResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.CreateImportJobRequest create-import-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createImportJobAsync create-import-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.CreateImportJobRequest create-import-job-request]
    (-> this (.createImportJobAsync create-import-job-request))))

(defn get-campaign-versions-async
  "Retrieves information about the status, configuration, and other settings for all versions of a specific
   campaign.

  get-campaign-versions-request - `com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaignVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest get-campaign-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignVersionsAsync get-campaign-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest get-campaign-versions-request]
    (-> this (.getCampaignVersionsAsync get-campaign-versions-request))))

(defn get-baidu-channel-async
  "Retrieves information about the status and settings of the Baidu Cloud Push channel for an application.

  get-baidu-channel-request - `com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBaiduChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetBaiduChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest get-baidu-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBaiduChannelAsync get-baidu-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest get-baidu-channel-request]
    (-> this (.getBaiduChannelAsync get-baidu-channel-request))))

(defn get-segment-import-jobs-async
  "Retrieves information about the status and settings of the import jobs for a segment.

  get-segment-import-jobs-request - `com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegmentImportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest get-segment-import-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentImportJobsAsync get-segment-import-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest get-segment-import-jobs-request]
    (-> this (.getSegmentImportJobsAsync get-segment-import-jobs-request))))

(defn get-export-jobs-async
  "Retrieves information about the status and settings of all the export jobs for an application.

  get-export-jobs-request - `com.amazonaws.services.pinpoint.model.GetExportJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetExportJobsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetExportJobsRequest get-export-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExportJobsAsync get-export-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetExportJobsRequest get-export-jobs-request]
    (-> this (.getExportJobsAsync get-export-jobs-request))))

(defn delete-apns-voip-channel-async
  "Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.

  delete-apns-voip-channel-request - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApnsVoipChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest delete-apns-voip-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApnsVoipChannelAsync delete-apns-voip-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest delete-apns-voip-channel-request]
    (-> this (.deleteApnsVoipChannelAsync delete-apns-voip-channel-request))))

(defn create-app-async
  "Creates an application.

  create-app-request - `com.amazonaws.services.pinpoint.model.CreateAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.CreateAppResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.CreateAppRequest create-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAppAsync create-app-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.CreateAppRequest create-app-request]
    (-> this (.createAppAsync create-app-request))))

(defn create-export-job-async
  "Creates a new export job for an application.

  create-export-job-request - `com.amazonaws.services.pinpoint.model.CreateExportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateExportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.CreateExportJobResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.CreateExportJobRequest create-export-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createExportJobAsync create-export-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.CreateExportJobRequest create-export-job-request]
    (-> this (.createExportJobAsync create-export-job-request))))

(defn update-apns-sandbox-channel-async
  "Updates the APNs sandbox channel settings for an application.

  update-apns-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApnsSandboxChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest update-apns-sandbox-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApnsSandboxChannelAsync update-apns-sandbox-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest update-apns-sandbox-channel-request]
    (-> this (.updateApnsSandboxChannelAsync update-apns-sandbox-channel-request))))

(defn tag-resource-async
  "Adds one or more tags (keys and values) to an application, campaign, or segment.

  tag-resource-request - `com.amazonaws.services.pinpoint.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn remove-attributes-async
  "Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an
   application.

  remove-attributes-request - `com.amazonaws.services.pinpoint.model.RemoveAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.RemoveAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.RemoveAttributesRequest remove-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeAttributesAsync remove-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.RemoveAttributesRequest remove-attributes-request]
    (-> this (.removeAttributesAsync remove-attributes-request))))

(defn get-apns-channel-async
  "Retrieves information about the status and settings of the APNs channel for an application.

  get-apns-channel-request - `com.amazonaws.services.pinpoint.model.GetApnsChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApnsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApnsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApnsChannelRequest get-apns-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApnsChannelAsync get-apns-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetApnsChannelRequest get-apns-channel-request]
    (-> this (.getApnsChannelAsync get-apns-channel-request))))

(defn get-segments-async
  "Retrieves information about the configuration, dimension, and other settings for all the segments that are
   associated with an application.

  get-segments-request - `com.amazonaws.services.pinpoint.model.GetSegmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentsRequest get-segments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentsAsync get-segments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.GetSegmentsRequest get-segments-request]
    (-> this (.getSegmentsAsync get-segments-request))))

(defn update-endpoint-async
  "Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an
   application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes
   properties) for an endpoint.

  update-endpoint-request - `com.amazonaws.services.pinpoint.model.UpdateEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateEndpointRequest update-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointAsync update-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsync this ^com.amazonaws.services.pinpoint.model.UpdateEndpointRequest update-endpoint-request]
    (-> this (.updateEndpointAsync update-endpoint-request))))

