(ns com.amazonaws.services.pinpoint.AbstractAmazonPinpoint
  "Abstract implementation of AmazonPinpoint. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpoint AbstractAmazonPinpoint]))

(defn update-apns-sandbox-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest`

  returns: Result of the UpdateApnsSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest request]
    (-> this (.updateApnsSandboxChannel request))))

(defn create-app
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateAppResult`"
  (^com.amazonaws.services.pinpoint.model.CreateAppResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.CreateAppRequest request]
    (-> this (.createApp request))))

(defn update-apns-voip-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest`

  returns: Result of the UpdateApnsVoipChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest request]
    (-> this (.updateApnsVoipChannel request))))

(defn delete-sms-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest`

  returns: Result of the DeleteSmsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest request]
    (-> this (.deleteSmsChannel request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.pinpoint.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.pinpoint.model.ListTagsForResourceResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-voice-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest`

  returns: Result of the DeleteVoiceChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteVoiceChannelResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteVoiceChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest request]
    (-> this (.deleteVoiceChannel request))))

(defn get-apns-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetApnsChannelRequest`

  returns: Result of the GetApnsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsChannelResult`"
  (^com.amazonaws.services.pinpoint.model.GetApnsChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApnsChannelRequest request]
    (-> this (.getApnsChannel request))))

(defn set-region
  "Description copied from interface: AmazonPinpoint

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonPinpoint this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-apns-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest`

  returns: Result of the UpdateApnsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest request]
    (-> this (.updateApnsChannel request))))

(defn get-apps
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetAppsRequest`

  returns: Result of the GetApps operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetAppsResult`"
  (^com.amazonaws.services.pinpoint.model.GetAppsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetAppsRequest request]
    (-> this (.getApps request))))

(defn put-event-stream
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.PutEventStreamRequest`

  returns: Result of the PutEventStream operation returned by the service. - `com.amazonaws.services.pinpoint.model.PutEventStreamResult`"
  (^com.amazonaws.services.pinpoint.model.PutEventStreamResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.PutEventStreamRequest request]
    (-> this (.putEventStream request))))

(defn get-email-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetEmailChannelRequest`

  returns: Result of the GetEmailChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetEmailChannelResult`"
  (^com.amazonaws.services.pinpoint.model.GetEmailChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetEmailChannelRequest request]
    (-> this (.getEmailChannel request))))

(defn get-apns-sandbox-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest`

  returns: Result of the GetApnsSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult`"
  (^com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest request]
    (-> this (.getApnsSandboxChannel request))))

(defn delete-endpoint
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteEndpointRequest`

  returns: Result of the DeleteEndpoint operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteEndpointResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteEndpointResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpoint request))))

(defn create-export-job
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.CreateExportJobRequest`

  returns: Result of the CreateExportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateExportJobResult`"
  (^com.amazonaws.services.pinpoint.model.CreateExportJobResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.CreateExportJobRequest request]
    (-> this (.createExportJob request))))

(defn put-events
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.PutEventsRequest`

  returns: Result of the PutEvents operation returned by the service. - `com.amazonaws.services.pinpoint.model.PutEventsResult`"
  (^com.amazonaws.services.pinpoint.model.PutEventsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.PutEventsRequest request]
    (-> this (.putEvents request))))

(defn update-endpoint
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateEndpointRequest`

  returns: Result of the UpdateEndpoint operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateEndpointResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateEndpointResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateEndpointRequest request]
    (-> this (.updateEndpoint request))))

(defn update-adm-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest`

  returns: Result of the UpdateAdmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest request]
    (-> this (.updateAdmChannel request))))

(defn untag-resource
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.pinpoint.model.UntagResourceResult`"
  (^com.amazonaws.services.pinpoint.model.UntagResourceResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-apns-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest`

  returns: Result of the DeleteApnsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest request]
    (-> this (.deleteApnsChannel request))))

(defn get-import-jobs
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetImportJobsRequest`

  returns: Result of the GetImportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetImportJobsResult`"
  (^com.amazonaws.services.pinpoint.model.GetImportJobsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetImportJobsRequest request]
    (-> this (.getImportJobs request))))

(defn delete-email-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest`

  returns: Result of the DeleteEmailChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest request]
    (-> this (.deleteEmailChannel request))))

(defn delete-campaign
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteCampaignRequest`

  returns: Result of the DeleteCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteCampaignResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteCampaignResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteCampaignRequest request]
    (-> this (.deleteCampaign request))))

(defn get-campaigns
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetCampaignsRequest`

  returns: Result of the GetCampaigns operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignsResult`"
  (^com.amazonaws.services.pinpoint.model.GetCampaignsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignsRequest request]
    (-> this (.getCampaigns request))))

(defn get-application-settings
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest`

  returns: Result of the GetApplicationSettings operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult`"
  (^com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest request]
    (-> this (.getApplicationSettings request))))

(defn get-gcm-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetGcmChannelRequest`

  returns: Result of the GetGcmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetGcmChannelResult`"
  (^com.amazonaws.services.pinpoint.model.GetGcmChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetGcmChannelRequest request]
    (-> this (.getGcmChannel request))))

(defn get-segment-export-jobs
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest`

  returns: Result of the GetSegmentExportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult`"
  (^com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest request]
    (-> this (.getSegmentExportJobs request))))

(defn delete-apns-voip-sandbox-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest`

  returns: Result of the DeleteApnsVoipSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest request]
    (-> this (.deleteApnsVoipSandboxChannel request))))

(defn get-voice-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest`

  returns: Result of the GetVoiceChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetVoiceChannelResult`"
  (^com.amazonaws.services.pinpoint.model.GetVoiceChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest request]
    (-> this (.getVoiceChannel request))))

(defn update-segment
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateSegmentRequest`

  returns: Result of the UpdateSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateSegmentResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateSegmentResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateSegmentRequest request]
    (-> this (.updateSegment request))))

(defn get-user-endpoints
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest`

  returns: Result of the GetUserEndpoints operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetUserEndpointsResult`"
  (^com.amazonaws.services.pinpoint.model.GetUserEndpointsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest request]
    (-> this (.getUserEndpoints request))))

(defn get-channels
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetChannelsRequest`

  returns: Result of the GetChannels operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetChannelsResult`"
  (^com.amazonaws.services.pinpoint.model.GetChannelsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetChannelsRequest request]
    (-> this (.getChannels request))))

(defn delete-apns-voip-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest`

  returns: Result of the DeleteApnsVoipChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest request]
    (-> this (.deleteApnsVoipChannel request))))

(defn get-apns-voip-sandbox-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest`

  returns: Result of the GetApnsVoipSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult`"
  (^com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest request]
    (-> this (.getApnsVoipSandboxChannel request))))

(defn shutdown
  "Description copied from interface: AmazonPinpoint"
  ([^AbstractAmazonPinpoint this]
    (-> this (.shutdown))))

(defn get-event-stream
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetEventStreamRequest`

  returns: Result of the GetEventStream operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetEventStreamResult`"
  (^com.amazonaws.services.pinpoint.model.GetEventStreamResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetEventStreamRequest request]
    (-> this (.getEventStream request))))

(defn delete-event-stream
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest`

  returns: Result of the DeleteEventStream operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteEventStreamResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteEventStreamResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest request]
    (-> this (.deleteEventStream request))))

(defn get-baidu-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest`

  returns: Result of the GetBaiduChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetBaiduChannelResult`"
  (^com.amazonaws.services.pinpoint.model.GetBaiduChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest request]
    (-> this (.getBaiduChannel request))))

(defn get-export-job
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetExportJobRequest`

  returns: Result of the GetExportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetExportJobResult`"
  (^com.amazonaws.services.pinpoint.model.GetExportJobResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetExportJobRequest request]
    (-> this (.getExportJob request))))

(defn get-segment-version
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest`

  returns: Result of the GetSegmentVersion operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentVersionResult`"
  (^com.amazonaws.services.pinpoint.model.GetSegmentVersionResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest request]
    (-> this (.getSegmentVersion request))))

(defn set-endpoint
  "Description copied from interface: AmazonPinpoint

  endpoint - The endpoint (ex: \"pinpoint.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://pinpoint.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonPinpoint this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-application-settings
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest`

  returns: Result of the UpdateApplicationSettings operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest request]
    (-> this (.updateApplicationSettings request))))

(defn create-import-job
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.CreateImportJobRequest`

  returns: Result of the CreateImportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateImportJobResult`"
  (^com.amazonaws.services.pinpoint.model.CreateImportJobResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.CreateImportJobRequest request]
    (-> this (.createImportJob request))))

(defn create-campaign
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.CreateCampaignRequest`

  returns: Result of the CreateCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateCampaignResult`"
  (^com.amazonaws.services.pinpoint.model.CreateCampaignResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.CreateCampaignRequest request]
    (-> this (.createCampaign request))))

(defn delete-app
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteAppResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteAppResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteAppRequest request]
    (-> this (.deleteApp request))))

(defn get-segments
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetSegmentsRequest`

  returns: Result of the GetSegments operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentsResult`"
  (^com.amazonaws.services.pinpoint.model.GetSegmentsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentsRequest request]
    (-> this (.getSegments request))))

(defn delete-adm-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest`

  returns: Result of the DeleteAdmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest request]
    (-> this (.deleteAdmChannel request))))

(defn get-app
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetAppRequest`

  returns: Result of the GetApp operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetAppResult`"
  (^com.amazonaws.services.pinpoint.model.GetAppResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetAppRequest request]
    (-> this (.getApp request))))

(defn delete-segment
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteSegmentRequest`

  returns: Result of the DeleteSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteSegmentResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteSegmentResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteSegmentRequest request]
    (-> this (.deleteSegment request))))

(defn send-messages
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.SendMessagesRequest`

  returns: Result of the SendMessages operation returned by the service. - `com.amazonaws.services.pinpoint.model.SendMessagesResult`"
  (^com.amazonaws.services.pinpoint.model.SendMessagesResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.SendMessagesRequest request]
    (-> this (.sendMessages request))))

(defn update-gcm-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest`

  returns: Result of the UpdateGcmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest request]
    (-> this (.updateGcmChannel request))))

(defn get-endpoint
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetEndpointRequest`

  returns: Result of the GetEndpoint operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetEndpointResult`"
  (^com.amazonaws.services.pinpoint.model.GetEndpointResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetEndpointRequest request]
    (-> this (.getEndpoint request))))

(defn get-apns-voip-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest`

  returns: Result of the GetApnsVoipChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult`"
  (^com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest request]
    (-> this (.getApnsVoipChannel request))))

(defn remove-attributes
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.RemoveAttributesRequest`

  returns: Result of the RemoveAttributes operation returned by the service. - `com.amazonaws.services.pinpoint.model.RemoveAttributesResult`"
  (^com.amazonaws.services.pinpoint.model.RemoveAttributesResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.RemoveAttributesRequest request]
    (-> this (.removeAttributes request))))

(defn update-campaign
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateCampaignRequest`

  returns: Result of the UpdateCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateCampaignResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateCampaignResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateCampaignRequest request]
    (-> this (.updateCampaign request))))

(defn delete-baidu-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest`

  returns: Result of the DeleteBaiduChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest request]
    (-> this (.deleteBaiduChannel request))))

(defn get-segment-import-jobs
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest`

  returns: Result of the GetSegmentImportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult`"
  (^com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest request]
    (-> this (.getSegmentImportJobs request))))

(defn update-apns-voip-sandbox-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest`

  returns: Result of the UpdateApnsVoipSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest request]
    (-> this (.updateApnsVoipSandboxChannel request))))

(defn get-export-jobs
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetExportJobsRequest`

  returns: Result of the GetExportJobs operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetExportJobsResult`"
  (^com.amazonaws.services.pinpoint.model.GetExportJobsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetExportJobsRequest request]
    (-> this (.getExportJobs request))))

(defn get-campaign-date-range-kpi
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest`

  returns: Result of the GetCampaignDateRangeKpi operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiResult`"
  (^com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest request]
    (-> this (.getCampaignDateRangeKpi request))))

(defn get-campaign
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetCampaignRequest`

  returns: Result of the GetCampaign operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignResult`"
  (^com.amazonaws.services.pinpoint.model.GetCampaignResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignRequest request]
    (-> this (.getCampaign request))))

(defn get-import-job
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetImportJobRequest`

  returns: Result of the GetImportJob operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetImportJobResult`"
  (^com.amazonaws.services.pinpoint.model.GetImportJobResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetImportJobRequest request]
    (-> this (.getImportJob request))))

(defn delete-user-endpoints
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest`

  returns: Result of the DeleteUserEndpoints operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteUserEndpointsResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteUserEndpointsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest request]
    (-> this (.deleteUserEndpoints request))))

(defn get-campaign-versions
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest`

  returns: Result of the GetCampaignVersions operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult`"
  (^com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest request]
    (-> this (.getCampaignVersions request))))

(defn create-segment
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.CreateSegmentRequest`

  returns: Result of the CreateSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.CreateSegmentResult`"
  (^com.amazonaws.services.pinpoint.model.CreateSegmentResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.CreateSegmentRequest request]
    (-> this (.createSegment request))))

(defn get-sms-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetSmsChannelRequest`

  returns: Result of the GetSmsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSmsChannelResult`"
  (^com.amazonaws.services.pinpoint.model.GetSmsChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSmsChannelRequest request]
    (-> this (.getSmsChannel request))))

(defn update-baidu-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest`

  returns: Result of the UpdateBaiduChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest request]
    (-> this (.updateBaiduChannel request))))

(defn update-email-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest`

  returns: Result of the UpdateEmailChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest request]
    (-> this (.updateEmailChannel request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonPinpoint

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonPinpoint this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-sms-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest`

  returns: Result of the UpdateSmsChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest request]
    (-> this (.updateSmsChannel request))))

(defn get-adm-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetAdmChannelRequest`

  returns: Result of the GetAdmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetAdmChannelResult`"
  (^com.amazonaws.services.pinpoint.model.GetAdmChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetAdmChannelRequest request]
    (-> this (.getAdmChannel request))))

(defn phone-number-validate
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest`

  returns: Result of the PhoneNumberValidate operation returned by the service. - `com.amazonaws.services.pinpoint.model.PhoneNumberValidateResult`"
  (^com.amazonaws.services.pinpoint.model.PhoneNumberValidateResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest request]
    (-> this (.phoneNumberValidate request))))

(defn get-application-date-range-kpi
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest`

  returns: Result of the GetApplicationDateRangeKpi operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiResult`"
  (^com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest request]
    (-> this (.getApplicationDateRangeKpi request))))

(defn update-endpoints-batch
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest`

  returns: Result of the UpdateEndpointsBatch operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest request]
    (-> this (.updateEndpointsBatch request))))

(defn send-users-messages
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest`

  returns: Result of the SendUsersMessages operation returned by the service. - `com.amazonaws.services.pinpoint.model.SendUsersMessagesResult`"
  (^com.amazonaws.services.pinpoint.model.SendUsersMessagesResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest request]
    (-> this (.sendUsersMessages request))))

(defn get-campaign-activities
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest`

  returns: Result of the GetCampaignActivities operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult`"
  (^com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest request]
    (-> this (.getCampaignActivities request))))

(defn get-segment-versions
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest`

  returns: Result of the GetSegmentVersions operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult`"
  (^com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest request]
    (-> this (.getSegmentVersions request))))

(defn tag-resource
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.pinpoint.model.TagResourceResult`"
  (^com.amazonaws.services.pinpoint.model.TagResourceResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-apns-sandbox-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest`

  returns: Result of the DeleteApnsSandboxChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest request]
    (-> this (.deleteApnsSandboxChannel request))))

(defn delete-gcm-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest`

  returns: Result of the DeleteGcmChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult`"
  (^com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest request]
    (-> this (.deleteGcmChannel request))))

(defn update-voice-channel
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest`

  returns: Result of the UpdateVoiceChannel operation returned by the service. - `com.amazonaws.services.pinpoint.model.UpdateVoiceChannelResult`"
  (^com.amazonaws.services.pinpoint.model.UpdateVoiceChannelResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest request]
    (-> this (.updateVoiceChannel request))))

(defn get-segment
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetSegmentRequest`

  returns: Result of the GetSegment operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetSegmentResult`"
  (^com.amazonaws.services.pinpoint.model.GetSegmentResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetSegmentRequest request]
    (-> this (.getSegment request))))

(defn get-campaign-version
  "Description copied from interface: AmazonPinpoint

  request - `com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest`

  returns: Result of the GetCampaignVersion operation returned by the service. - `com.amazonaws.services.pinpoint.model.GetCampaignVersionResult`"
  (^com.amazonaws.services.pinpoint.model.GetCampaignVersionResult [^AbstractAmazonPinpoint this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest request]
    (-> this (.getCampaignVersion request))))

