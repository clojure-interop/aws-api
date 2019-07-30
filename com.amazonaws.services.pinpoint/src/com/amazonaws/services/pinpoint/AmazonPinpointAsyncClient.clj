(ns com.amazonaws.services.pinpoint.AmazonPinpointAsyncClient
  "Client for accessing Amazon Pinpoint asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Doc Engage API - Amazon Pinpoint API"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpoint AmazonPinpointAsyncClient]))

(defn ->amazon-pinpoint-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonPinpointAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonPinpointAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonPinpointAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonPinpointAsyncClient aws-credentials executor-service))
  (^AmazonPinpointAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonPinpointAsyncClient client-configuration))
  (^AmazonPinpointAsyncClient []
    (new AmazonPinpointAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.pinpoint.AmazonPinpointAsyncClientBuilder`"
  (^com.amazonaws.services.pinpoint.AmazonPinpointAsyncClientBuilder []
    (AmazonPinpointAsyncClient/asyncBuilder )))

(defn put-event-stream-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.PutEventStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEventStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.PutEventStreamResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.PutEventStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.PutEventStreamRequest request]
    (-> this (.putEventStreamAsync request))))

(defn untag-resource-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-app-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetAppResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetAppRequest request]
    (-> this (.getAppAsync request))))

(defn delete-campaign-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteCampaignRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteCampaignRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCampaignAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteCampaignRequest request]
    (-> this (.deleteCampaignAsync request))))

(defn get-export-job-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetExportJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetExportJobResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetExportJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExportJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetExportJobRequest request]
    (-> this (.getExportJobAsync request))))

(defn delete-gcm-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGcmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteGcmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGcmChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteGcmChannelRequest request]
    (-> this (.deleteGcmChannelAsync request))))

(defn delete-adm-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAdmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteAdmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAdmChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteAdmChannelRequest request]
    (-> this (.deleteAdmChannelAsync request))))

(defn update-apns-voip-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApnsVoipChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApnsVoipChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipChannelRequest request]
    (-> this (.updateApnsVoipChannelAsync request))))

(defn get-channels-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetChannelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetChannels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetChannelsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetChannelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getChannelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetChannelsRequest request]
    (-> this (.getChannelsAsync request))))

(defn phone-number-validate-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PhoneNumberValidate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.PhoneNumberValidateResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.phoneNumberValidateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.PhoneNumberValidateRequest request]
    (-> this (.phoneNumberValidateAsync request))))

(defn update-apns-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApnsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateApnsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApnsChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsChannelRequest request]
    (-> this (.updateApnsChannelAsync request))))

(defn delete-apns-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApnsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteApnsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApnsChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsChannelRequest request]
    (-> this (.deleteApnsChannelAsync request))))

(defn update-application-settings-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplicationSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateApplicationSettingsRequest request]
    (-> this (.updateApplicationSettingsAsync request))))

(defn delete-apns-sandbox-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApnsSandboxChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApnsSandboxChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsSandboxChannelRequest request]
    (-> this (.deleteApnsSandboxChannelAsync request))))

(defn delete-apns-voip-sandbox-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApnsVoipSandboxChannel operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApnsVoipSandboxChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipSandboxChannelRequest request]
    (-> this (.deleteApnsVoipSandboxChannelAsync request))))

(defn create-segment-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.CreateSegmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSegment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.CreateSegmentResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.CreateSegmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSegmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.CreateSegmentRequest request]
    (-> this (.createSegmentAsync request))))

(defn delete-app-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteAppResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteAppRequest request]
    (-> this (.deleteAppAsync request))))

(defn get-application-date-range-kpi-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplicationDateRangeKpi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationDateRangeKpiAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApplicationDateRangeKpiRequest request]
    (-> this (.getApplicationDateRangeKpiAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonPinpointAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-email-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEmailChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteEmailChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEmailChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteEmailChannelRequest request]
    (-> this (.deleteEmailChannelAsync request))))

(defn get-apns-voip-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApnsVoipChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApnsVoipChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApnsVoipChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApnsVoipChannelRequest request]
    (-> this (.getApnsVoipChannelAsync request))))

(defn get-endpoint-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetEndpointRequest request]
    (-> this (.getEndpointAsync request))))

(defn get-segment-export-jobs-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegmentExportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentExportJobsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentExportJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentExportJobsRequest request]
    (-> this (.getSegmentExportJobsAsync request))))

(defn delete-baidu-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBaiduChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteBaiduChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBaiduChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteBaiduChannelRequest request]
    (-> this (.deleteBaiduChannelAsync request))))

(defn delete-user-endpoints-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteUserEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteUserEndpointsRequest request]
    (-> this (.deleteUserEndpointsAsync request))))

(defn get-voice-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVoiceChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetVoiceChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVoiceChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetVoiceChannelRequest request]
    (-> this (.getVoiceChannelAsync request))))

(defn get-segment-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetSegmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentRequest request]
    (-> this (.getSegmentAsync request))))

(defn update-apns-voip-sandbox-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApnsVoipSandboxChannel operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApnsVoipSandboxChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsVoipSandboxChannelRequest request]
    (-> this (.updateApnsVoipSandboxChannelAsync request))))

(defn get-apns-voip-sandbox-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApnsVoipSandboxChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApnsVoipSandboxChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApnsVoipSandboxChannelRequest request]
    (-> this (.getApnsVoipSandboxChannelAsync request))))

(defn get-campaign-activities-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaignActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignActivitiesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignActivitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignActivitiesRequest request]
    (-> this (.getCampaignActivitiesAsync request))))

(defn delete-endpoint-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpointAsync request))))

(defn send-users-messages-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendUsersMessages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.SendUsersMessagesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendUsersMessagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.SendUsersMessagesRequest request]
    (-> this (.sendUsersMessagesAsync request))))

(defn get-apps-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetAppsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetAppsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetAppsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetAppsRequest request]
    (-> this (.getAppsAsync request))))

(defn get-import-job-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetImportJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetImportJobResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetImportJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getImportJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetImportJobRequest request]
    (-> this (.getImportJobAsync request))))

(defn get-campaign-date-range-kpi-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaignDateRangeKpi operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignDateRangeKpiAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignDateRangeKpiRequest request]
    (-> this (.getCampaignDateRangeKpiAsync request))))

(defn get-segment-versions-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegmentVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionsRequest request]
    (-> this (.getSegmentVersionsAsync request))))

(defn create-campaign-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.CreateCampaignRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.CreateCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.CreateCampaignRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCampaignAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.CreateCampaignRequest request]
    (-> this (.createCampaignAsync request))))

(defn get-application-settings-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplicationSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApplicationSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApplicationSettingsRequest request]
    (-> this (.getApplicationSettingsAsync request))))

(defn get-apns-sandbox-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApnsSandboxChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApnsSandboxChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApnsSandboxChannelRequest request]
    (-> this (.getApnsSandboxChannelAsync request))))

(defn delete-voice-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVoiceChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteVoiceChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVoiceChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteVoiceChannelRequest request]
    (-> this (.deleteVoiceChannelAsync request))))

(defn send-messages-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.SendMessagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendMessages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.SendMessagesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.SendMessagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendMessagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.SendMessagesRequest request]
    (-> this (.sendMessagesAsync request))))

(defn get-gcm-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetGcmChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGcmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetGcmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetGcmChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGcmChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetGcmChannelRequest request]
    (-> this (.getGcmChannelAsync request))))

(defn update-gcm-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGcmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateGcmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGcmChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateGcmChannelRequest request]
    (-> this (.updateGcmChannelAsync request))))

(defn get-import-jobs-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetImportJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetImportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetImportJobsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetImportJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getImportJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetImportJobsRequest request]
    (-> this (.getImportJobsAsync request))))

(defn get-campaign-version-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaignVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignVersionResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionRequest request]
    (-> this (.getCampaignVersionAsync request))))

(defn delete-event-stream-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteEventStreamResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteEventStreamRequest request]
    (-> this (.deleteEventStreamAsync request))))

(defn put-events-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.PutEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.PutEventsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.PutEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.PutEventsRequest request]
    (-> this (.putEventsAsync request))))

(defn update-sms-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSmsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateSmsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSmsChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateSmsChannelRequest request]
    (-> this (.updateSmsChannelAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonPinpointAsyncClient this]
    (-> this (.shutdown))))

(defn update-segment-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateSegmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSegment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateSegmentResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateSegmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSegmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateSegmentRequest request]
    (-> this (.updateSegmentAsync request))))

(defn get-sms-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetSmsChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSmsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSmsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSmsChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSmsChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSmsChannelRequest request]
    (-> this (.getSmsChannelAsync request))))

(defn get-email-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetEmailChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEmailChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetEmailChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetEmailChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEmailChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetEmailChannelRequest request]
    (-> this (.getEmailChannelAsync request))))

(defn get-campaigns-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetCampaignsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaigns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignsRequest request]
    (-> this (.getCampaignsAsync request))))

(defn delete-segment-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteSegmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSegment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteSegmentResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteSegmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSegmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteSegmentRequest request]
    (-> this (.deleteSegmentAsync request))))

(defn get-segment-version-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegmentVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentVersionResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentVersionRequest request]
    (-> this (.getSegmentVersionAsync request))))

(defn update-email-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEmailChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateEmailChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEmailChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateEmailChannelRequest request]
    (-> this (.updateEmailChannelAsync request))))

(defn get-user-endpoints-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetUserEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetUserEndpointsRequest request]
    (-> this (.getUserEndpointsAsync request))))

(defn get-campaign-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetCampaignRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignRequest request]
    (-> this (.getCampaignAsync request))))

(defn update-baidu-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBaiduChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateBaiduChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBaiduChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateBaiduChannelRequest request]
    (-> this (.updateBaiduChannelAsync request))))

(defn update-voice-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVoiceChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateVoiceChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVoiceChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateVoiceChannelRequest request]
    (-> this (.updateVoiceChannelAsync request))))

(defn get-adm-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetAdmChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAdmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetAdmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetAdmChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAdmChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetAdmChannelRequest request]
    (-> this (.getAdmChannelAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn get-event-stream-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetEventStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEventStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetEventStreamResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetEventStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEventStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetEventStreamRequest request]
    (-> this (.getEventStreamAsync request))))

(defn delete-sms-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSmsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteSmsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSmsChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteSmsChannelRequest request]
    (-> this (.deleteSmsChannelAsync request))))

(defn update-campaign-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateCampaignRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateCampaignRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCampaignAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateCampaignRequest request]
    (-> this (.updateCampaignAsync request))))

(defn update-adm-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAdmChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateAdmChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAdmChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateAdmChannelRequest request]
    (-> this (.updateAdmChannelAsync request))))

(defn update-endpoints-batch-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpointsBatch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointsBatchAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateEndpointsBatchRequest request]
    (-> this (.updateEndpointsBatchAsync request))))

(defn create-import-job-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.CreateImportJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.CreateImportJobResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.CreateImportJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createImportJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.CreateImportJobRequest request]
    (-> this (.createImportJobAsync request))))

(defn get-campaign-versions-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCampaignVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetCampaignVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCampaignVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetCampaignVersionsRequest request]
    (-> this (.getCampaignVersionsAsync request))))

(defn get-baidu-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBaiduChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetBaiduChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBaiduChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetBaiduChannelRequest request]
    (-> this (.getBaiduChannelAsync request))))

(defn get-segment-import-jobs-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegmentImportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentImportJobsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentImportJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentImportJobsRequest request]
    (-> this (.getSegmentImportJobsAsync request))))

(defn get-export-jobs-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetExportJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetExportJobsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetExportJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExportJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetExportJobsRequest request]
    (-> this (.getExportJobsAsync request))))

(defn delete-apns-voip-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApnsVoipChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApnsVoipChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.DeleteApnsVoipChannelRequest request]
    (-> this (.deleteApnsVoipChannelAsync request))))

(defn create-app-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.CreateAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.CreateAppResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.CreateAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.CreateAppRequest request]
    (-> this (.createAppAsync request))))

(defn create-export-job-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.CreateExportJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateExportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.CreateExportJobResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.CreateExportJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createExportJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.CreateExportJobRequest request]
    (-> this (.createExportJobAsync request))))

(defn update-apns-sandbox-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApnsSandboxChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApnsSandboxChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateApnsSandboxChannelRequest request]
    (-> this (.updateApnsSandboxChannelAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn remove-attributes-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.RemoveAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.RemoveAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.RemoveAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.RemoveAttributesRequest request]
    (-> this (.removeAttributesAsync request))))

(defn get-apns-channel-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetApnsChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApnsChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetApnsChannelResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApnsChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApnsChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetApnsChannelRequest request]
    (-> this (.getApnsChannelAsync request))))

(defn get-segments-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.GetSegmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSegments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.GetSegmentsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSegmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.GetSegmentsRequest request]
    (-> this (.getSegmentsAsync request))))

(defn update-endpoint-async
  "Description copied from interface: AmazonPinpointAsync

  request - `com.amazonaws.services.pinpoint.model.UpdateEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpoint.model.UpdateEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointAsyncClient this ^com.amazonaws.services.pinpoint.model.UpdateEndpointRequest request]
    (-> this (.updateEndpointAsync request))))

