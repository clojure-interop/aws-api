(ns com.amazonaws.services.pinpoint.AmazonPinpointClient
  "Client for accessing Amazon Pinpoint. All service calls made using this client are blocking, and will not return
  until the service call completes.


  Doc Engage API - Amazon Pinpoint API"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpoint AmazonPinpointClient]))

(defn ->amazon-pinpoint-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonPinpointClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonPinpointClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonPinpointClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonPinpointClient aws-credentials client-configuration))
  (^AmazonPinpointClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonPinpointClient client-configuration))
  (^AmazonPinpointClient []
    (new AmazonPinpointClient )))

(defn *builder
  "returns: `com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder`"
  (^com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder []
    (AmazonPinpointClient/builder )))

(defn update-apns-sandbox-channel
  "Updates the APNs sandbox channel settings for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest`

  returns: Result of the UpdateApnsSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest request]
    (-> this (.updateApnsSandboxChannel request))))

(defn create-app
  "Creates an application.

  request - `com.amazonaws.services.pinpoint.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateAppResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.CreateAppResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.CreateAppRequest request]
    (-> this (.createApp request))))

(defn update-apns-voip-channel
  "Updates the APNs VoIP channel settings for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest`

  returns: Result of the UpdateApnsVoipChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest request]
    (-> this (.updateApnsVoipChannel request))))

(defn delete-sms-channel
  "Disables the SMS channel for an application and deletes any existing settings for the channel.

  request - `com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest`

  returns: Result of the DeleteSmsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest request]
    (-> this (.deleteSmsChannel request))))

(defn list-tags-for-resource
  "Retrieves all the tags (keys and values) that are associated with an application, campaign, or segment.

  request - `com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.pinpoint.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.pinpoint.model.ListTagsForResourceResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-voice-channel
  "Disables the voice channel for an application and deletes any existing settings for the channel.

  request - `com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest`

  returns: Result of the DeleteVoiceChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteVoiceChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteVoiceChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest request]
    (-> this (.deleteVoiceChannel request))))

(defn get-apns-channel
  "Retrieves information about the status and settings of the APNs channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetApnsChannelRequest`

  returns: Result of the GetApnsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApnsChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetApnsChannelRequest request]
    (-> this (.getApnsChannel request))))

(defn update-apns-channel
  "Updates the APNs channel settings for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest`

  returns: Result of the UpdateApnsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest request]
    (-> this (.updateApnsChannel request))))

(defn get-apps
  "Retrieves information about all of your applications.

  request - `com.amazonaws.services.pinpoint.model.GetAppsRequest`

  returns: Result of the GetApps operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetAppsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetAppsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetAppsRequest request]
    (-> this (.getApps request))))

(defn put-event-stream
  "Creates a new event stream for an application or updates the settings of an existing event stream for an
   application.

  request - `com.amazonaws.services.pinpoint.model.PutEventStreamRequest`

  returns: Result of the PutEventStream operation returned by the service. - `com.amazonaws.services.pinpoint.model.PutEventStreamResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.PutEventStreamResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.PutEventStreamRequest request]
    (-> this (.putEventStream request))))

(defn get-email-channel
  "Retrieves information about the status and settings of the email channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetEmailChannelRequest`

  returns: Result of the GetEmailChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetEmailChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetEmailChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetEmailChannelRequest request]
    (-> this (.getEmailChannel request))))

(defn get-apns-sandbox-channel
  "Retrieves information about the status and settings of the APNs sandbox channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest`

  returns: Result of the GetApnsSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest request]
    (-> this (.getApnsSandboxChannel request))))

(defn delete-endpoint
  "Deletes an endpoint from an application.

  request - `com.amazonaws.services.pinpoint.model.DeleteEndpointRequest`

  returns: Result of the DeleteEndpoint operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteEndpointResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteEndpointResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpoint request))))

(defn create-export-job
  "Creates a new export job for an application.

  request - `com.amazonaws.services.pinpoint.model.CreateExportJobRequest`

  returns: Result of the CreateExportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateExportJobResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.CreateExportJobResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.CreateExportJobRequest request]
    (-> this (.createExportJob request))))

(defn put-events
  "Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are
   associated with.

  request - `com.amazonaws.services.pinpoint.model.PutEventsRequest`

  returns: Result of the PutEvents operation returned by the service. - `com.amazonaws.services.pinpoint.model.PutEventsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.PutEventsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.PutEventsRequest request]
    (-> this (.putEvents request))))

(defn update-endpoint
  "Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an
   application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes
   properties) for an endpoint.

  request - `com.amazonaws.services.pinpoint.model.UpdateEndpointRequest`

  returns: Result of the UpdateEndpoint operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateEndpointResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateEndpointResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateEndpointRequest request]
    (-> this (.updateEndpoint request))))

(defn update-adm-channel
  "Updates the ADM channel settings for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest`

  returns: Result of the UpdateAdmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest request]
    (-> this (.updateAdmChannel request))))

(defn untag-resource
  "Removes one or more tags (keys and values) from an application, campaign, or segment.

  request - `com.amazonaws.services.pinpoint.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.pinpoint.model.UntagResourceResult`"
  (^com.amazonaws.services.pinpoint.model.UntagResourceResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-apns-channel
  "Disables the APNs channel for an application and deletes any existing settings for the channel.

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest`

  returns: Result of the DeleteApnsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest request]
    (-> this (.deleteApnsChannel request))))

(defn get-import-jobs
  "Retrieves information about the status and settings of all the import jobs for an application.

  request - `com.amazonaws.services.pinpoint.model.GetImportJobsRequest`

  returns: Result of the GetImportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetImportJobsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetImportJobsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetImportJobsRequest request]
    (-> this (.getImportJobs request))))

(defn delete-email-channel
  "Disables the email channel for an application and deletes any existing settings for the channel.

  request - `com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest`

  returns: Result of the DeleteEmailChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest request]
    (-> this (.deleteEmailChannel request))))

(defn delete-campaign
  "Deletes a campaign from an application.

  request - `com.amazonaws.services.pinpoint.model.DeleteCampaignRequest`

  returns: Result of the DeleteCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteCampaignResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteCampaignResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteCampaignRequest request]
    (-> this (.deleteCampaign request))))

(defn get-campaigns
  "Retrieves information about the status, configuration, and other settings for all the campaigns that are
   associated with an application.

  request - `com.amazonaws.services.pinpoint.model.GetCampaignsRequest`

  returns: Result of the GetCampaigns operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetCampaignsRequest request]
    (-> this (.getCampaigns request))))

(defn get-application-settings
  "Retrieves information about the settings for an application.

  request - `com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest`

  returns: Result of the GetApplicationSettings operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest request]
    (-> this (.getApplicationSettings request))))

(defn get-gcm-channel
  "Retrieves information about the status and settings of the GCM channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetGcmChannelRequest`

  returns: Result of the GetGcmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetGcmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetGcmChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetGcmChannelRequest request]
    (-> this (.getGcmChannel request))))

(defn get-segment-export-jobs
  "Retrieves information about the status and settings of the export jobs for a segment.

  request - `com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest`

  returns: Result of the GetSegmentExportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest request]
    (-> this (.getSegmentExportJobs request))))

(defn delete-apns-voip-sandbox-channel
  "Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest`

  returns: Result of the DeleteApnsVoipSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest request]
    (-> this (.deleteApnsVoipSandboxChannel request))))

(defn get-voice-channel
  "Retrieves information about the status and settings of the voice channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest`

  returns: Result of the GetVoiceChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetVoiceChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetVoiceChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest request]
    (-> this (.getVoiceChannel request))))

(defn update-segment
  "Creates a new segment for an application or updates the configuration, dimension, and other settings for an
   existing segment that's associated with an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateSegmentRequest`

  returns: Result of the UpdateSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateSegmentResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateSegmentResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateSegmentRequest request]
    (-> this (.updateSegment request))))

(defn get-user-endpoints
  "Retrieves information about all the endpoints that are associated with a specific user ID.

  request - `com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest`

  returns: Result of the GetUserEndpoints operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetUserEndpointsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetUserEndpointsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest request]
    (-> this (.getUserEndpoints request))))

(defn get-channels
  "Retrieves information about the history and status of each channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetChannelsRequest`

  returns: Result of the GetChannels operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetChannelsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetChannelsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetChannelsRequest request]
    (-> this (.getChannels request))))

(defn delete-apns-voip-channel
  "Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest`

  returns: Result of the DeleteApnsVoipChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest request]
    (-> this (.deleteApnsVoipChannel request))))

(defn get-apns-voip-sandbox-channel
  "Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest`

  returns: Result of the GetApnsVoipSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest request]
    (-> this (.getApnsVoipSandboxChannel request))))

(defn get-event-stream
  "Retrieves information about the event stream settings for an application.

  request - `com.amazonaws.services.pinpoint.model.GetEventStreamRequest`

  returns: Result of the GetEventStream operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetEventStreamResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetEventStreamResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetEventStreamRequest request]
    (-> this (.getEventStream request))))

(defn delete-event-stream
  "Deletes the event stream for an application.

  request - `com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest`

  returns: Result of the DeleteEventStream operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteEventStreamResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteEventStreamResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest request]
    (-> this (.deleteEventStream request))))

(defn get-baidu-channel
  "Retrieves information about the status and settings of the Baidu Cloud Push channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest`

  returns: Result of the GetBaiduChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetBaiduChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetBaiduChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest request]
    (-> this (.getBaiduChannel request))))

(defn get-export-job
  "Retrieves information about the status and settings of a specific export job for an application.

  request - `com.amazonaws.services.pinpoint.model.GetExportJobRequest`

  returns: Result of the GetExportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetExportJobResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetExportJobResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetExportJobRequest request]
    (-> this (.getExportJob request))))

(defn get-segment-version
  "Retrieves information about the configuration, dimension, and other settings for a specific version of a segment
   that's associated with an application.

  request - `com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest`

  returns: Result of the GetSegmentVersion operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentVersionResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentVersionResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest request]
    (-> this (.getSegmentVersion request))))

(defn update-application-settings
  "Updates the settings for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest`

  returns: Result of the UpdateApplicationSettings operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest request]
    (-> this (.updateApplicationSettings request))))

(defn create-import-job
  "Creates a new import job for an application.

  request - `com.amazonaws.services.pinpoint.model.CreateImportJobRequest`

  returns: Result of the CreateImportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateImportJobResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.CreateImportJobResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.CreateImportJobRequest request]
    (-> this (.createImportJob request))))

(defn create-campaign
  "Creates a new campaign for an application or updates the settings of an existing campaign for an application.

  request - `com.amazonaws.services.pinpoint.model.CreateCampaignRequest`

  returns: Result of the CreateCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateCampaignResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.CreateCampaignResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.CreateCampaignRequest request]
    (-> this (.createCampaign request))))

(defn delete-app
  "Deletes an application.

  request - `com.amazonaws.services.pinpoint.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteAppResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteAppResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteAppRequest request]
    (-> this (.deleteApp request))))

(defn get-segments
  "Retrieves information about the configuration, dimension, and other settings for all the segments that are
   associated with an application.

  request - `com.amazonaws.services.pinpoint.model.GetSegmentsRequest`

  returns: Result of the GetSegments operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetSegmentsRequest request]
    (-> this (.getSegments request))))

(defn delete-adm-channel
  "Disables the ADM channel for an application and deletes any existing settings for the channel.

  request - `com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest`

  returns: Result of the DeleteAdmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest request]
    (-> this (.deleteAdmChannel request))))

(defn get-app
  "Retrieves information about an application.

  request - `com.amazonaws.services.pinpoint.model.GetAppRequest`

  returns: Result of the GetApp operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetAppResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetAppResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetAppRequest request]
    (-> this (.getApp request))))

(defn delete-segment
  "Deletes a segment from an application.

  request - `com.amazonaws.services.pinpoint.model.DeleteSegmentRequest`

  returns: Result of the DeleteSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteSegmentResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteSegmentResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteSegmentRequest request]
    (-> this (.deleteSegment request))))

(defn send-messages
  "Creates and sends a direct message.

  request - `com.amazonaws.services.pinpoint.model.SendMessagesRequest`

  returns: Result of the SendMessages operation returned by the service. - `com.amazonaws.services.pinpoint.model.SendMessagesResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.SendMessagesResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.SendMessagesRequest request]
    (-> this (.sendMessages request))))

(defn update-gcm-channel
  "Updates the status and settings of the GCM channel for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest`

  returns: Result of the UpdateGcmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest request]
    (-> this (.updateGcmChannel request))))

(defn get-endpoint
  "Retrieves information about the settings and attributes of a specific endpoint for an application.

  request - `com.amazonaws.services.pinpoint.model.GetEndpointRequest`

  returns: Result of the GetEndpoint operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetEndpointResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetEndpointResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetEndpointRequest request]
    (-> this (.getEndpoint request))))

(defn get-apns-voip-channel
  "Retrieves information about the status and settings of the APNs VoIP channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest`

  returns: Result of the GetApnsVoipChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest request]
    (-> this (.getApnsVoipChannel request))))

(defn remove-attributes
  "Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an
   application.

  request - `com.amazonaws.services.pinpoint.model.RemoveAttributesRequest`

  returns: Result of the RemoveAttributes operation returned by the service. - `com.amazonaws.services.pinpoint.model.RemoveAttributesResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.RemoveAttributesResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.RemoveAttributesRequest request]
    (-> this (.removeAttributes request))))

(defn update-campaign
  "Updates the settings for a campaign.

  request - `com.amazonaws.services.pinpoint.model.UpdateCampaignRequest`

  returns: Result of the UpdateCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateCampaignResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateCampaignResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateCampaignRequest request]
    (-> this (.updateCampaign request))))

(defn delete-baidu-channel
  "Disables the Baidu channel for an application and deletes any existing settings for the channel.

  request - `com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest`

  returns: Result of the DeleteBaiduChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest request]
    (-> this (.deleteBaiduChannel request))))

(defn get-segment-import-jobs
  "Retrieves information about the status and settings of the import jobs for a segment.

  request - `com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest`

  returns: Result of the GetSegmentImportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest request]
    (-> this (.getSegmentImportJobs request))))

(defn update-apns-voip-sandbox-channel
  "Updates the settings for the APNs VoIP sandbox channel for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest`

  returns: Result of the UpdateApnsVoipSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest request]
    (-> this (.updateApnsVoipSandboxChannel request))))

(defn get-export-jobs
  "Retrieves information about the status and settings of all the export jobs for an application.

  request - `com.amazonaws.services.pinpoint.model.GetExportJobsRequest`

  returns: Result of the GetExportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetExportJobsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetExportJobsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetExportJobsRequest request]
    (-> this (.getExportJobs request))))

(defn get-campaign-date-range-kpi
  "Retrieves (queries) pre-aggregated data for a standard metric that applies to a campaign.

  request - `com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest`

  returns: Result of the GetCampaignDateRangeKpi operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest request]
    (-> this (.getCampaignDateRangeKpi request))))

(defn get-campaign
  "Retrieves information about the status, configuration, and other settings for a campaign.

  request - `com.amazonaws.services.pinpoint.model.GetCampaignRequest`

  returns: Result of the GetCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetCampaignRequest request]
    (-> this (.getCampaign request))))

(defn get-import-job
  "Retrieves information about the status and settings of a specific import job for an application.

  request - `com.amazonaws.services.pinpoint.model.GetImportJobRequest`

  returns: Result of the GetImportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetImportJobResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetImportJobResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetImportJobRequest request]
    (-> this (.getImportJob request))))

(defn delete-user-endpoints
  "Deletes all the endpoints that are associated with a specific user ID.

  request - `com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest`

  returns: Result of the DeleteUserEndpoints operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteUserEndpointsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteUserEndpointsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest request]
    (-> this (.deleteUserEndpoints request))))

(defn get-campaign-versions
  "Retrieves information about the status, configuration, and other settings for all versions of a specific
   campaign.

  request - `com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest`

  returns: Result of the GetCampaignVersions operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest request]
    (-> this (.getCampaignVersions request))))

(defn create-segment
  "Creates a new segment for an application or updates the configuration, dimension, and other settings for an
   existing segment that's associated with an application.

  request - `com.amazonaws.services.pinpoint.model.CreateSegmentRequest`

  returns: Result of the CreateSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateSegmentResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.CreateSegmentResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.CreateSegmentRequest request]
    (-> this (.createSegment request))))

(defn get-sms-channel
  "Retrieves information about the status and settings of the SMS channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetSmsChannelRequest`

  returns: Result of the GetSmsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSmsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSmsChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetSmsChannelRequest request]
    (-> this (.getSmsChannel request))))

(defn update-baidu-channel
  "Updates the settings of the Baidu channel for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest`

  returns: Result of the UpdateBaiduChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest request]
    (-> this (.updateBaiduChannel request))))

(defn update-email-channel
  "Updates the status and settings of the email channel for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest`

  returns: Result of the UpdateEmailChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest request]
    (-> this (.updateEmailChannel request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPinpointClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-sms-channel
  "Updates the status and settings of the SMS channel for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest`

  returns: Result of the UpdateSmsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest request]
    (-> this (.updateSmsChannel request))))

(defn get-adm-channel
  "Retrieves information about the status and settings of the ADM channel for an application.

  request - `com.amazonaws.services.pinpoint.model.GetAdmChannelRequest`

  returns: Result of the GetAdmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetAdmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetAdmChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetAdmChannelRequest request]
    (-> this (.getAdmChannel request))))

(defn phone-number-validate
  "Retrieves information about a phone number.

  request - `com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest`

  returns: Result of the PhoneNumberValidate operation returned by the service. - `com.amazonaws.services.pinpoint.model.PhoneNumberValidateResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.PhoneNumberValidateResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest request]
    (-> this (.phoneNumberValidate request))))

(defn get-application-date-range-kpi
  "Retrieves (queries) pre-aggregated data for a standard metric that applies to an application.

  request - `com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest`

  returns: Result of the GetApplicationDateRangeKpi operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest request]
    (-> this (.getApplicationDateRangeKpi request))))

(defn update-endpoints-batch
  "Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing
   endpoints for an application. You can also use this operation to define custom attributes (Attributes, Metrics,
   and UserAttributes properties) for a batch of endpoints.

  request - `com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest`

  returns: Result of the UpdateEndpointsBatch operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest request]
    (-> this (.updateEndpointsBatch request))))

(defn send-users-messages
  "Creates and sends a message to a list of users.

  request - `com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest`

  returns: Result of the SendUsersMessages operation returned by the service. - `com.amazonaws.services.pinpoint.model.SendUsersMessagesResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.SendUsersMessagesResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest request]
    (-> this (.sendUsersMessages request))))

(defn get-campaign-activities
  "Retrieves information about the activity performed by a campaign.

  request - `com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest`

  returns: Result of the GetCampaignActivities operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest request]
    (-> this (.getCampaignActivities request))))

(defn get-segment-versions
  "Retrieves information about the configuration, dimension, and other settings for all versions of a specific
   segment that's associated with an application.

  request - `com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest`

  returns: Result of the GetSegmentVersions operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest request]
    (-> this (.getSegmentVersions request))))

(defn tag-resource
  "Adds one or more tags (keys and values) to an application, campaign, or segment.

  request - `com.amazonaws.services.pinpoint.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.pinpoint.model.TagResourceResult`"
  (^com.amazonaws.services.pinpoint.model.TagResourceResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-apns-sandbox-channel
  "Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest`

  returns: Result of the DeleteApnsSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest request]
    (-> this (.deleteApnsSandboxChannel request))))

(defn delete-gcm-channel
  "Disables the GCM channel for an application and deletes any existing settings for the channel.

  request - `com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest`

  returns: Result of the DeleteGcmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest request]
    (-> this (.deleteGcmChannel request))))

(defn update-voice-channel
  "Updates the status and settings of the voice channel for an application.

  request - `com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest`

  returns: Result of the UpdateVoiceChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateVoiceChannelResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.UpdateVoiceChannelResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest request]
    (-> this (.updateVoiceChannel request))))

(defn get-segment
  "Retrieves information about the configuration, dimension, and other settings for a specific segment that's
   associated with an application.

  request - `com.amazonaws.services.pinpoint.model.GetSegmentRequest`

  returns: Result of the GetSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetSegmentResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetSegmentRequest request]
    (-> this (.getSegment request))))

(defn get-campaign-version
  "Retrieves information about the status, configuration, and other settings for a specific version of a campaign.

  request - `com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest`

  returns: Result of the GetCampaignVersion operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignVersionResult`

  throws: com.amazonaws.services.pinpoint.model.BadRequestException - The request contains a syntax error (BadRequestException)."
  (^com.amazonaws.services.pinpoint.model.GetCampaignVersionResult [^AmazonPinpointClient this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest request]
    (-> this (.getCampaignVersion request))))

