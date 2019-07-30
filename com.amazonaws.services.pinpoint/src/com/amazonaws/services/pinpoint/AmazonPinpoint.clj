(ns com.amazonaws.services.pinpoint.AmazonPinpoint
  "Interface for accessing Amazon Pinpoint.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPinpoint instead.



  Doc Engage API - Amazon Pinpoint API"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpoint AmazonPinpoint]))

(defn update-apns-sandbox-channel
  "Updates the APNs sandbox channel settings for an application.

  update-apns-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest`

  returns: Result of the UpdateApnsSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest update-apns-sandbox-channel-request]
    (-> this (.updateApnsSandboxChannel update-apns-sandbox-channel-request))))

(defn create-app
  "Creates an application.

  create-app-request - `com.amazonaws.services.pinpoint.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateAppResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.CreateAppResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.CreateAppRequest create-app-request]
    (-> this (.createApp create-app-request))))

(defn update-apns-voip-channel
  "Updates the APNs VoIP channel settings for an application.

  update-apns-voip-channel-request - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest`

  returns: Result of the UpdateApnsVoipChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest update-apns-voip-channel-request]
    (-> this (.updateApnsVoipChannel update-apns-voip-channel-request))))

(defn delete-sms-channel
  "Disables the SMS channel for an application and deletes any existing settings for the channel.

  delete-sms-channel-request - `com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest`

  returns: Result of the DeleteSmsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest delete-sms-channel-request]
    (-> this (.deleteSmsChannel delete-sms-channel-request))))

(defn list-tags-for-resource
  "Retrieves all the tags (keys and values) that are associated with an application, campaign, or segment.

  list-tags-for-resource-request - `com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.pinpoint.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.pinpoint.model.ListTagsForResourceResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn delete-voice-channel
  "Disables the voice channel for an application and deletes any existing settings for the channel.

  delete-voice-channel-request - `com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest`

  returns: Result of the DeleteVoiceChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteVoiceChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteVoiceChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest delete-voice-channel-request]
    (-> this (.deleteVoiceChannel delete-voice-channel-request))))

(defn get-apns-channel
  "Retrieves information about the status and settings of the APNs channel for an application.

  get-apns-channel-request - `com.amazonaws.services.pinpoint.model.GetApnsChannelRequest`

  returns: Result of the GetApnsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApnsChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApnsChannelRequest get-apns-channel-request]
    (-> this (.getApnsChannel get-apns-channel-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonPinpoint this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-apns-channel
  "Updates the APNs channel settings for an application.

  update-apns-channel-request - `com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest`

  returns: Result of the UpdateApnsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest update-apns-channel-request]
    (-> this (.updateApnsChannel update-apns-channel-request))))

(defn get-apps
  "Retrieves information about all of your applications.

  get-apps-request - `com.amazonaws.services.pinpoint.model.GetAppsRequest`

  returns: Result of the GetApps operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetAppsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetAppsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetAppsRequest get-apps-request]
    (-> this (.getApps get-apps-request))))

(defn put-event-stream
  "Creates a new event stream for an application or updates the settings of an existing event stream for an
   application.

  put-event-stream-request - `com.amazonaws.services.pinpoint.model.PutEventStreamRequest`

  returns: Result of the PutEventStream operation returned by the service. - `com.amazonaws.services.pinpoint.model.PutEventStreamResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.PutEventStreamResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.PutEventStreamRequest put-event-stream-request]
    (-> this (.putEventStream put-event-stream-request))))

(defn get-email-channel
  "Retrieves information about the status and settings of the email channel for an application.

  get-email-channel-request - `com.amazonaws.services.pinpoint.model.GetEmailChannelRequest`

  returns: Result of the GetEmailChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetEmailChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetEmailChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetEmailChannelRequest get-email-channel-request]
    (-> this (.getEmailChannel get-email-channel-request))))

(defn get-apns-sandbox-channel
  "Retrieves information about the status and settings of the APNs sandbox channel for an application.

  get-apns-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest`

  returns: Result of the GetApnsSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest get-apns-sandbox-channel-request]
    (-> this (.getApnsSandboxChannel get-apns-sandbox-channel-request))))

(defn delete-endpoint
  "Deletes an endpoint from an application.

  delete-endpoint-request - `com.amazonaws.services.pinpoint.model.DeleteEndpointRequest`

  returns: Result of the DeleteEndpoint operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteEndpointResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteEndpointResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteEndpointRequest delete-endpoint-request]
    (-> this (.deleteEndpoint delete-endpoint-request))))

(defn create-export-job
  "Creates a new export job for an application.

  create-export-job-request - `com.amazonaws.services.pinpoint.model.CreateExportJobRequest`

  returns: Result of the CreateExportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateExportJobResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.CreateExportJobResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.CreateExportJobRequest create-export-job-request]
    (-> this (.createExportJob create-export-job-request))))

(defn put-events
  "Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are
   associated with.

  put-events-request - `com.amazonaws.services.pinpoint.model.PutEventsRequest`

  returns: Result of the PutEvents operation returned by the service. - `com.amazonaws.services.pinpoint.model.PutEventsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.PutEventsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.PutEventsRequest put-events-request]
    (-> this (.putEvents put-events-request))))

(defn update-endpoint
  "Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an
   application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes
   properties) for an endpoint.

  update-endpoint-request - `com.amazonaws.services.pinpoint.model.UpdateEndpointRequest`

  returns: Result of the UpdateEndpoint operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateEndpointResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateEndpointResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateEndpointRequest update-endpoint-request]
    (-> this (.updateEndpoint update-endpoint-request))))

(defn update-adm-channel
  "Updates the ADM channel settings for an application.

  update-adm-channel-request - `com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest`

  returns: Result of the UpdateAdmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest update-adm-channel-request]
    (-> this (.updateAdmChannel update-adm-channel-request))))

(defn untag-resource
  "Removes one or more tags (keys and values) from an application, campaign, or segment.

  untag-resource-request - `com.amazonaws.services.pinpoint.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.pinpoint.model.UntagResourceResult`"
  (^com.amazonaws.services.pinpoint.model.UntagResourceResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn delete-apns-channel
  "Disables the APNs channel for an application and deletes any existing settings for the channel.

  delete-apns-channel-request - `com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest`

  returns: Result of the DeleteApnsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest delete-apns-channel-request]
    (-> this (.deleteApnsChannel delete-apns-channel-request))))

(defn get-import-jobs
  "Retrieves information about the status and settings of all the import jobs for an application.

  get-import-jobs-request - `com.amazonaws.services.pinpoint.model.GetImportJobsRequest`

  returns: Result of the GetImportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetImportJobsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetImportJobsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetImportJobsRequest get-import-jobs-request]
    (-> this (.getImportJobs get-import-jobs-request))))

(defn delete-email-channel
  "Disables the email channel for an application and deletes any existing settings for the channel.

  delete-email-channel-request - `com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest`

  returns: Result of the DeleteEmailChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest delete-email-channel-request]
    (-> this (.deleteEmailChannel delete-email-channel-request))))

(defn delete-campaign
  "Deletes a campaign from an application.

  delete-campaign-request - `com.amazonaws.services.pinpoint.model.DeleteCampaignRequest`

  returns: Result of the DeleteCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteCampaignResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteCampaignResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteCampaignRequest delete-campaign-request]
    (-> this (.deleteCampaign delete-campaign-request))))

(defn get-campaigns
  "Retrieves information about the status, configuration, and other settings for all the campaigns that are
   associated with an application.

  get-campaigns-request - `com.amazonaws.services.pinpoint.model.GetCampaignsRequest`

  returns: Result of the GetCampaigns operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignsRequest get-campaigns-request]
    (-> this (.getCampaigns get-campaigns-request))))

(defn get-application-settings
  "Retrieves information about the settings for an application.

  get-application-settings-request - `com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest`

  returns: Result of the GetApplicationSettings operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest get-application-settings-request]
    (-> this (.getApplicationSettings get-application-settings-request))))

(defn get-gcm-channel
  "Retrieves information about the status and settings of the GCM channel for an application.

  get-gcm-channel-request - `com.amazonaws.services.pinpoint.model.GetGcmChannelRequest`

  returns: Result of the GetGcmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetGcmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetGcmChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetGcmChannelRequest get-gcm-channel-request]
    (-> this (.getGcmChannel get-gcm-channel-request))))

(defn get-segment-export-jobs
  "Retrieves information about the status and settings of the export jobs for a segment.

  get-segment-export-jobs-request - `com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest`

  returns: Result of the GetSegmentExportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest get-segment-export-jobs-request]
    (-> this (.getSegmentExportJobs get-segment-export-jobs-request))))

(defn delete-apns-voip-sandbox-channel
  "Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.

  delete-apns-voip-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest`

  returns: Result of the DeleteApnsVoipSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest delete-apns-voip-sandbox-channel-request]
    (-> this (.deleteApnsVoipSandboxChannel delete-apns-voip-sandbox-channel-request))))

(defn get-voice-channel
  "Retrieves information about the status and settings of the voice channel for an application.

  get-voice-channel-request - `com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest`

  returns: Result of the GetVoiceChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetVoiceChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetVoiceChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest get-voice-channel-request]
    (-> this (.getVoiceChannel get-voice-channel-request))))

(defn update-segment
  "Creates a new segment for an application or updates the configuration, dimension, and other settings for an
   existing segment that's associated with an application.

  update-segment-request - `com.amazonaws.services.pinpoint.model.UpdateSegmentRequest`

  returns: Result of the UpdateSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateSegmentResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateSegmentResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateSegmentRequest update-segment-request]
    (-> this (.updateSegment update-segment-request))))

(defn get-user-endpoints
  "Retrieves information about all the endpoints that are associated with a specific user ID.

  get-user-endpoints-request - `com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest`

  returns: Result of the GetUserEndpoints operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetUserEndpointsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetUserEndpointsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest get-user-endpoints-request]
    (-> this (.getUserEndpoints get-user-endpoints-request))))

(defn get-channels
  "Retrieves information about the history and status of each channel for an application.

  get-channels-request - `com.amazonaws.services.pinpoint.model.GetChannelsRequest`

  returns: Result of the GetChannels operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetChannelsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetChannelsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetChannelsRequest get-channels-request]
    (-> this (.getChannels get-channels-request))))

(defn delete-apns-voip-channel
  "Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.

  delete-apns-voip-channel-request - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest`

  returns: Result of the DeleteApnsVoipChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest delete-apns-voip-channel-request]
    (-> this (.deleteApnsVoipChannel delete-apns-voip-channel-request))))

(defn get-apns-voip-sandbox-channel
  "Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.

  get-apns-voip-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest`

  returns: Result of the GetApnsVoipSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest get-apns-voip-sandbox-channel-request]
    (-> this (.getApnsVoipSandboxChannel get-apns-voip-sandbox-channel-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonPinpoint this]
    (-> this (.shutdown))))

(defn get-event-stream
  "Retrieves information about the event stream settings for an application.

  get-event-stream-request - `com.amazonaws.services.pinpoint.model.GetEventStreamRequest`

  returns: Result of the GetEventStream operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetEventStreamResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetEventStreamResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetEventStreamRequest get-event-stream-request]
    (-> this (.getEventStream get-event-stream-request))))

(defn delete-event-stream
  "Deletes the event stream for an application.

  delete-event-stream-request - `com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest`

  returns: Result of the DeleteEventStream operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteEventStreamResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteEventStreamResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest delete-event-stream-request]
    (-> this (.deleteEventStream delete-event-stream-request))))

(defn get-baidu-channel
  "Retrieves information about the status and settings of the Baidu Cloud Push channel for an application.

  get-baidu-channel-request - `com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest`

  returns: Result of the GetBaiduChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetBaiduChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetBaiduChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest get-baidu-channel-request]
    (-> this (.getBaiduChannel get-baidu-channel-request))))

(defn get-export-job
  "Retrieves information about the status and settings of a specific export job for an application.

  get-export-job-request - `com.amazonaws.services.pinpoint.model.GetExportJobRequest`

  returns: Result of the GetExportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetExportJobResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetExportJobResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetExportJobRequest get-export-job-request]
    (-> this (.getExportJob get-export-job-request))))

(defn get-segment-version
  "Retrieves information about the configuration, dimension, and other settings for a specific version of a segment
   that's associated with an application.

  get-segment-version-request - `com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest`

  returns: Result of the GetSegmentVersion operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentVersionResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentVersionResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest get-segment-version-request]
    (-> this (.getSegmentVersion get-segment-version-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"pinpoint.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://pinpoint.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonPinpoint this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-application-settings
  "Updates the settings for an application.

  update-application-settings-request - `com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest`

  returns: Result of the UpdateApplicationSettings operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest update-application-settings-request]
    (-> this (.updateApplicationSettings update-application-settings-request))))

(defn create-import-job
  "Creates a new import job for an application.

  create-import-job-request - `com.amazonaws.services.pinpoint.model.CreateImportJobRequest`

  returns: Result of the CreateImportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateImportJobResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.CreateImportJobResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.CreateImportJobRequest create-import-job-request]
    (-> this (.createImportJob create-import-job-request))))

(defn create-campaign
  "Creates a new campaign for an application or updates the settings of an existing campaign for an application.

  create-campaign-request - `com.amazonaws.services.pinpoint.model.CreateCampaignRequest`

  returns: Result of the CreateCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateCampaignResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.CreateCampaignResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.CreateCampaignRequest create-campaign-request]
    (-> this (.createCampaign create-campaign-request))))

(defn delete-app
  "Deletes an application.

  delete-app-request - `com.amazonaws.services.pinpoint.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteAppResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteAppResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteAppRequest delete-app-request]
    (-> this (.deleteApp delete-app-request))))

(defn get-segments
  "Retrieves information about the configuration, dimension, and other settings for all the segments that are
   associated with an application.

  get-segments-request - `com.amazonaws.services.pinpoint.model.GetSegmentsRequest`

  returns: Result of the GetSegments operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentsRequest get-segments-request]
    (-> this (.getSegments get-segments-request))))

(defn delete-adm-channel
  "Disables the ADM channel for an application and deletes any existing settings for the channel.

  delete-adm-channel-request - `com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest`

  returns: Result of the DeleteAdmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest delete-adm-channel-request]
    (-> this (.deleteAdmChannel delete-adm-channel-request))))

(defn get-app
  "Retrieves information about an application.

  get-app-request - `com.amazonaws.services.pinpoint.model.GetAppRequest`

  returns: Result of the GetApp operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetAppResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetAppResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetAppRequest get-app-request]
    (-> this (.getApp get-app-request))))

(defn delete-segment
  "Deletes a segment from an application.

  delete-segment-request - `com.amazonaws.services.pinpoint.model.DeleteSegmentRequest`

  returns: Result of the DeleteSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteSegmentResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteSegmentResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteSegmentRequest delete-segment-request]
    (-> this (.deleteSegment delete-segment-request))))

(defn send-messages
  "Creates and sends a direct message.

  send-messages-request - `com.amazonaws.services.pinpoint.model.SendMessagesRequest`

  returns: Result of the SendMessages operation returned by the service. - `com.amazonaws.services.pinpoint.model.SendMessagesResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.SendMessagesResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.SendMessagesRequest send-messages-request]
    (-> this (.sendMessages send-messages-request))))

(defn update-gcm-channel
  "Updates the status and settings of the GCM channel for an application.

  update-gcm-channel-request - `com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest`

  returns: Result of the UpdateGcmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest update-gcm-channel-request]
    (-> this (.updateGcmChannel update-gcm-channel-request))))

(defn get-endpoint
  "Retrieves information about the settings and attributes of a specific endpoint for an application.

  get-endpoint-request - `com.amazonaws.services.pinpoint.model.GetEndpointRequest`

  returns: Result of the GetEndpoint operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetEndpointResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetEndpointResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetEndpointRequest get-endpoint-request]
    (-> this (.getEndpoint get-endpoint-request))))

(defn get-apns-voip-channel
  "Retrieves information about the status and settings of the APNs VoIP channel for an application.

  get-apns-voip-channel-request - `com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest`

  returns: Result of the GetApnsVoipChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest get-apns-voip-channel-request]
    (-> this (.getApnsVoipChannel get-apns-voip-channel-request))))

(defn remove-attributes
  "Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an
   application.

  remove-attributes-request - `com.amazonaws.services.pinpoint.model.RemoveAttributesRequest`

  returns: Result of the RemoveAttributes operation returned by the service. - `com.amazonaws.services.pinpoint.model.RemoveAttributesResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.RemoveAttributesResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.RemoveAttributesRequest remove-attributes-request]
    (-> this (.removeAttributes remove-attributes-request))))

(defn update-campaign
  "Updates the settings for a campaign.

  update-campaign-request - `com.amazonaws.services.pinpoint.model.UpdateCampaignRequest`

  returns: Result of the UpdateCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateCampaignResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateCampaignResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateCampaignRequest update-campaign-request]
    (-> this (.updateCampaign update-campaign-request))))

(defn delete-baidu-channel
  "Disables the Baidu channel for an application and deletes any existing settings for the channel.

  delete-baidu-channel-request - `com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest`

  returns: Result of the DeleteBaiduChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest delete-baidu-channel-request]
    (-> this (.deleteBaiduChannel delete-baidu-channel-request))))

(defn get-segment-import-jobs
  "Retrieves information about the status and settings of the import jobs for a segment.

  get-segment-import-jobs-request - `com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest`

  returns: Result of the GetSegmentImportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest get-segment-import-jobs-request]
    (-> this (.getSegmentImportJobs get-segment-import-jobs-request))))

(defn update-apns-voip-sandbox-channel
  "Updates the settings for the APNs VoIP sandbox channel for an application.

  update-apns-voip-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest`

  returns: Result of the UpdateApnsVoipSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest update-apns-voip-sandbox-channel-request]
    (-> this (.updateApnsVoipSandboxChannel update-apns-voip-sandbox-channel-request))))

(defn get-export-jobs
  "Retrieves information about the status and settings of all the export jobs for an application.

  get-export-jobs-request - `com.amazonaws.services.pinpoint.model.GetExportJobsRequest`

  returns: Result of the GetExportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetExportJobsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetExportJobsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetExportJobsRequest get-export-jobs-request]
    (-> this (.getExportJobs get-export-jobs-request))))

(defn get-campaign-date-range-kpi
  "Retrieves (queries) pre-aggregated data for a standard metric that applies to a campaign.

  get-campaign-date-range-kpi-request - `com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest`

  returns: Result of the GetCampaignDateRangeKpi operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest get-campaign-date-range-kpi-request]
    (-> this (.getCampaignDateRangeKpi get-campaign-date-range-kpi-request))))

(defn get-campaign
  "Retrieves information about the status, configuration, and other settings for a campaign.

  get-campaign-request - `com.amazonaws.services.pinpoint.model.GetCampaignRequest`

  returns: Result of the GetCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignRequest get-campaign-request]
    (-> this (.getCampaign get-campaign-request))))

(defn get-import-job
  "Retrieves information about the status and settings of a specific import job for an application.

  get-import-job-request - `com.amazonaws.services.pinpoint.model.GetImportJobRequest`

  returns: Result of the GetImportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetImportJobResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetImportJobResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetImportJobRequest get-import-job-request]
    (-> this (.getImportJob get-import-job-request))))

(defn delete-user-endpoints
  "Deletes all the endpoints that are associated with a specific user ID.

  delete-user-endpoints-request - `com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest`

  returns: Result of the DeleteUserEndpoints operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteUserEndpointsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteUserEndpointsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest delete-user-endpoints-request]
    (-> this (.deleteUserEndpoints delete-user-endpoints-request))))

(defn get-campaign-versions
  "Retrieves information about the status, configuration, and other settings for all versions of a specific
   campaign.

  get-campaign-versions-request - `com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest`

  returns: Result of the GetCampaignVersions operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest get-campaign-versions-request]
    (-> this (.getCampaignVersions get-campaign-versions-request))))

(defn create-segment
  "Creates a new segment for an application or updates the configuration, dimension, and other settings for an
   existing segment that's associated with an application.

  create-segment-request - `com.amazonaws.services.pinpoint.model.CreateSegmentRequest`

  returns: Result of the CreateSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateSegmentResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.CreateSegmentResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.CreateSegmentRequest create-segment-request]
    (-> this (.createSegment create-segment-request))))

(defn get-sms-channel
  "Retrieves information about the status and settings of the SMS channel for an application.

  get-sms-channel-request - `com.amazonaws.services.pinpoint.model.GetSmsChannelRequest`

  returns: Result of the GetSmsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSmsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSmsChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSmsChannelRequest get-sms-channel-request]
    (-> this (.getSmsChannel get-sms-channel-request))))

(defn update-baidu-channel
  "Updates the settings of the Baidu channel for an application.

  update-baidu-channel-request - `com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest`

  returns: Result of the UpdateBaiduChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest update-baidu-channel-request]
    (-> this (.updateBaiduChannel update-baidu-channel-request))))

(defn update-email-channel
  "Updates the status and settings of the email channel for an application.

  update-email-channel-request - `com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest`

  returns: Result of the UpdateEmailChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest update-email-channel-request]
    (-> this (.updateEmailChannel update-email-channel-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPinpoint this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-sms-channel
  "Updates the status and settings of the SMS channel for an application.

  update-sms-channel-request - `com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest`

  returns: Result of the UpdateSmsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest update-sms-channel-request]
    (-> this (.updateSmsChannel update-sms-channel-request))))

(defn get-adm-channel
  "Retrieves information about the status and settings of the ADM channel for an application.

  get-adm-channel-request - `com.amazonaws.services.pinpoint.model.GetAdmChannelRequest`

  returns: Result of the GetAdmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetAdmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetAdmChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetAdmChannelRequest get-adm-channel-request]
    (-> this (.getAdmChannel get-adm-channel-request))))

(defn phone-number-validate
  "Retrieves information about a phone number.

  phone-number-validate-request - `com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest`

  returns: Result of the PhoneNumberValidate operation returned by the service. - `com.amazonaws.services.pinpoint.model.PhoneNumberValidateResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.PhoneNumberValidateResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest phone-number-validate-request]
    (-> this (.phoneNumberValidate phone-number-validate-request))))

(defn get-application-date-range-kpi
  "Retrieves (queries) pre-aggregated data for a standard metric that applies to an application.

  get-application-date-range-kpi-request - `com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest`

  returns: Result of the GetApplicationDateRangeKpi operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest get-application-date-range-kpi-request]
    (-> this (.getApplicationDateRangeKpi get-application-date-range-kpi-request))))

(defn update-endpoints-batch
  "Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing
   endpoints for an application. You can also use this operation to define custom attributes (Attributes, Metrics,
   and UserAttributes properties) for a batch of endpoints.

  update-endpoints-batch-request - `com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest`

  returns: Result of the UpdateEndpointsBatch operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest update-endpoints-batch-request]
    (-> this (.updateEndpointsBatch update-endpoints-batch-request))))

(defn send-users-messages
  "Creates and sends a message to a list of users.

  send-users-messages-request - `com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest`

  returns: Result of the SendUsersMessages operation returned by the service. - `com.amazonaws.services.pinpoint.model.SendUsersMessagesResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.SendUsersMessagesResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest send-users-messages-request]
    (-> this (.sendUsersMessages send-users-messages-request))))

(defn get-campaign-activities
  "Retrieves information about the activity performed by a campaign.

  get-campaign-activities-request - `com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest`

  returns: Result of the GetCampaignActivities operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest get-campaign-activities-request]
    (-> this (.getCampaignActivities get-campaign-activities-request))))

(defn get-segment-versions
  "Retrieves information about the configuration, dimension, and other settings for all versions of a specific
   segment that's associated with an application.

  get-segment-versions-request - `com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest`

  returns: Result of the GetSegmentVersions operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest get-segment-versions-request]
    (-> this (.getSegmentVersions get-segment-versions-request))))

(defn tag-resource
  "Adds one or more tags (keys and values) to an application, campaign, or segment.

  tag-resource-request - `com.amazonaws.services.pinpoint.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.pinpoint.model.TagResourceResult`"
  (^com.amazonaws.services.pinpoint.model.TagResourceResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn delete-apns-sandbox-channel
  "Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.

  delete-apns-sandbox-channel-request - `com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest`

  returns: Result of the DeleteApnsSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest delete-apns-sandbox-channel-request]
    (-> this (.deleteApnsSandboxChannel delete-apns-sandbox-channel-request))))

(defn delete-gcm-channel
  "Disables the GCM channel for an application and deletes any existing settings for the channel.

  delete-gcm-channel-request - `com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest`

  returns: Result of the DeleteGcmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest delete-gcm-channel-request]
    (-> this (.deleteGcmChannel delete-gcm-channel-request))))

(defn update-voice-channel
  "Updates the status and settings of the voice channel for an application.

  update-voice-channel-request - `com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest`

  returns: Result of the UpdateVoiceChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateVoiceChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateVoiceChannelResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest update-voice-channel-request]
    (-> this (.updateVoiceChannel update-voice-channel-request))))

(defn get-segment
  "Retrieves information about the configuration, dimension, and other settings for a specific segment that's
   associated with an application.

  get-segment-request - `com.amazonaws.services.pinpoint.model.GetSegmentRequest`

  returns: Result of the GetSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentRequest get-segment-request]
    (-> this (.getSegment get-segment-request))))

(defn get-campaign-version
  "Retrieves information about the status, configuration, and other settings for a specific version of a campaign.

  get-campaign-version-request - `com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest`

  returns: Result of the GetCampaignVersion operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignVersionResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignVersionResult [^AmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest get-campaign-version-request]
    (-> this (.getCampaignVersion get-campaign-version-request))))

