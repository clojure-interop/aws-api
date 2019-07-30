(ns com.amazonaws.services.amplify.AbstractAWSAmplifyAsync
  "Abstract implementation of AWSAmplifyAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.amplify AbstractAWSAmplifyAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure used to untag resource. - `com.amazonaws.services.amplify.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-app-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for get App request. - `com.amazonaws.services.amplify.model.GetAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.GetAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetAppRequest request]
    (-> this (.getAppAsync request))))

(defn create-branch-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for a branch create request. - `com.amazonaws.services.amplify.model.CreateBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.CreateBranchResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateBranchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBranchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateBranchRequest request]
    (-> this (.createBranchAsync request))))

(defn delete-job-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for delete job request. - `com.amazonaws.services.amplify.model.DeleteJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.DeleteJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteJobRequest request]
    (-> this (.deleteJobAsync request))))

(defn delete-app-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for an Amplify App delete request. - `com.amazonaws.services.amplify.model.DeleteAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.DeleteAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteAppRequest request]
    (-> this (.deleteAppAsync request))))

(defn delete-domain-association-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for the delete Domain Association request. - `com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomainAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.DeleteDomainAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest request]
    (-> this (.deleteDomainAssociationAsync request))))

(defn get-webhook-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for the get webhook request. - `com.amazonaws.services.amplify.model.GetWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.GetWebhookResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetWebhookRequest request]
    (-> this (.getWebhookAsync request))))

(defn list-jobs-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for list job request. - `com.amazonaws.services.amplify.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListJobsRequest request]
    (-> this (.listJobsAsync request))))

(defn update-app-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for update App request. - `com.amazonaws.services.amplify.model.UpdateAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.UpdateAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateAppRequest request]
    (-> this (.updateAppAsync request))))

(defn delete-branch-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for delete branch request. - `com.amazonaws.services.amplify.model.DeleteBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.DeleteBranchResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteBranchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBranchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteBranchRequest request]
    (-> this (.deleteBranchAsync request))))

(defn create-webhook-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for create webhook request. - `com.amazonaws.services.amplify.model.CreateWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.CreateWebhookResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateWebhookRequest request]
    (-> this (.createWebhookAsync request))))

(defn list-apps-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for an Amplify App list request. - `com.amazonaws.services.amplify.model.ListAppsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListAppsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListAppsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAppsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListAppsRequest request]
    (-> this (.listAppsAsync request))))

(defn list-branches-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for list branches request. - `com.amazonaws.services.amplify.model.ListBranchesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBranches operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListBranchesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListBranchesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBranchesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListBranchesRequest request]
    (-> this (.listBranchesAsync request))))

(defn update-webhook-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for update webhook request. - `com.amazonaws.services.amplify.model.UpdateWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.UpdateWebhookResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateWebhookRequest request]
    (-> this (.updateWebhookAsync request))))

(defn delete-webhook-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for the delete webhook request. - `com.amazonaws.services.amplify.model.DeleteWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.DeleteWebhookResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhookAsync request))))

(defn update-domain-association-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for update Domain Association request. - `com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.UpdateDomainAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest request]
    (-> this (.updateDomainAssociationAsync request))))

(defn get-branch-async
  "Description copied from interface: AWSAmplifyAsync

  request - Result structure for get branch request. - `com.amazonaws.services.amplify.model.GetBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.GetBranchResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetBranchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBranchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetBranchRequest request]
    (-> this (.getBranchAsync request))))

(defn list-domain-associations-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for the list Domain Associations request. - `com.amazonaws.services.amplify.model.ListDomainAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomainAssociations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListDomainAssociationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListDomainAssociationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainAssociationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListDomainAssociationsRequest request]
    (-> this (.listDomainAssociationsAsync request))))

(defn start-job-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for Start job request. - `com.amazonaws.services.amplify.model.StartJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.StartJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StartJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StartJobRequest request]
    (-> this (.startJobAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure used to list tags for resource. - `com.amazonaws.services.amplify.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn create-domain-association-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for create Domain Association request. - `com.amazonaws.services.amplify.model.CreateDomainAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomainAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.CreateDomainAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateDomainAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateDomainAssociationRequest request]
    (-> this (.createDomainAssociationAsync request))))

(defn update-branch-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for update branch request. - `com.amazonaws.services.amplify.model.UpdateBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.UpdateBranchResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateBranchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBranchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateBranchRequest request]
    (-> this (.updateBranchAsync request))))

(defn create-deployment-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for create a new deployment. - `com.amazonaws.services.amplify.model.CreateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateDeploymentRequest request]
    (-> this (.createDeploymentAsync request))))

(defn get-domain-association-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for the get Domain Association request. - `com.amazonaws.services.amplify.model.GetDomainAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.GetDomainAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetDomainAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetDomainAssociationRequest request]
    (-> this (.getDomainAssociationAsync request))))

(defn create-app-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure used to create Apps in Amplify. - `com.amazonaws.services.amplify.model.CreateAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.CreateAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateAppRequest request]
    (-> this (.createAppAsync request))))

(defn list-webhooks-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for the list webhooks request. - `com.amazonaws.services.amplify.model.ListWebhooksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWebhooks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListWebhooksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListWebhooksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWebhooksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListWebhooksRequest request]
    (-> this (.listWebhooksAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure used to tag resource. - `com.amazonaws.services.amplify.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn get-job-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for get job request. - `com.amazonaws.services.amplify.model.GetJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.GetJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetJobRequest request]
    (-> this (.getJobAsync request))))

(defn stop-job-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for stop job request. - `com.amazonaws.services.amplify.model.StopJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.StopJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StopJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StopJobRequest request]
    (-> this (.stopJobAsync request))))

(defn start-deployment-async
  "Description copied from interface: AWSAmplifyAsync

  request - Request structure for start a deployment. - `com.amazonaws.services.amplify.model.StartDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.StartDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StartDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StartDeploymentRequest request]
    (-> this (.startDeploymentAsync request))))

