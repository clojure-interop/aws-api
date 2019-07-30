(ns com.amazonaws.services.amplify.AbstractAWSAmplify
  "Abstract implementation of AWSAmplify. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.amplify AbstractAWSAmplify]))

(defn create-app
  "Description copied from interface: AWSAmplify

  request - Request structure used to create Apps in Amplify. - `com.amazonaws.services.amplify.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.amplify.model.CreateAppResult`"
  (^com.amazonaws.services.amplify.model.CreateAppResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.CreateAppRequest request]
    (-> this (.createApp request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSAmplify

  request - Request structure used to list tags for resource. - `com.amazonaws.services.amplify.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.amplify.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.amplify.model.ListTagsForResourceResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-webhook
  "Description copied from interface: AWSAmplify

  request - Request structure for the delete webhook request. - `com.amazonaws.services.amplify.model.DeleteWebhookRequest`

  returns: Result of the DeleteWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteWebhookResult`"
  (^com.amazonaws.services.amplify.model.DeleteWebhookResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhook request))))

(defn get-job
  "Description copied from interface: AWSAmplify

  request - Request structure for get job request. - `com.amazonaws.services.amplify.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.amplify.model.GetJobResult`"
  (^com.amazonaws.services.amplify.model.GetJobResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.GetJobRequest request]
    (-> this (.getJob request))))

(defn get-webhook
  "Description copied from interface: AWSAmplify

  request - Request structure for the get webhook request. - `com.amazonaws.services.amplify.model.GetWebhookRequest`

  returns: Result of the GetWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.GetWebhookResult`"
  (^com.amazonaws.services.amplify.model.GetWebhookResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.GetWebhookRequest request]
    (-> this (.getWebhook request))))

(defn list-apps
  "Description copied from interface: AWSAmplify

  request - Request structure for an Amplify App list request. - `com.amazonaws.services.amplify.model.ListAppsRequest`

  returns: Result of the ListApps operation returned by the service. - `com.amazonaws.services.amplify.model.ListAppsResult`"
  (^com.amazonaws.services.amplify.model.ListAppsResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.ListAppsRequest request]
    (-> this (.listApps request))))

(defn create-branch
  "Description copied from interface: AWSAmplify

  request - Request structure for a branch create request. - `com.amazonaws.services.amplify.model.CreateBranchRequest`

  returns: Result of the CreateBranch operation returned by the service. - `com.amazonaws.services.amplify.model.CreateBranchResult`"
  (^com.amazonaws.services.amplify.model.CreateBranchResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.CreateBranchRequest request]
    (-> this (.createBranch request))))

(defn untag-resource
  "Description copied from interface: AWSAmplify

  request - Request structure used to untag resource. - `com.amazonaws.services.amplify.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.amplify.model.UntagResourceResult`"
  (^com.amazonaws.services.amplify.model.UntagResourceResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-domain-association
  "Description copied from interface: AWSAmplify

  request - Request structure for update Domain Association request. - `com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest`

  returns: Result of the UpdateDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateDomainAssociationResult`"
  (^com.amazonaws.services.amplify.model.UpdateDomainAssociationResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest request]
    (-> this (.updateDomainAssociation request))))

(defn update-branch
  "Description copied from interface: AWSAmplify

  request - Request structure for update branch request. - `com.amazonaws.services.amplify.model.UpdateBranchRequest`

  returns: Result of the UpdateBranch operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateBranchResult`"
  (^com.amazonaws.services.amplify.model.UpdateBranchResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.UpdateBranchRequest request]
    (-> this (.updateBranch request))))

(defn delete-job
  "Description copied from interface: AWSAmplify

  request - Request structure for delete job request. - `com.amazonaws.services.amplify.model.DeleteJobRequest`

  returns: Result of the DeleteJob operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteJobResult`"
  (^com.amazonaws.services.amplify.model.DeleteJobResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.DeleteJobRequest request]
    (-> this (.deleteJob request))))

(defn get-branch
  "Description copied from interface: AWSAmplify

  request - Result structure for get branch request. - `com.amazonaws.services.amplify.model.GetBranchRequest`

  returns: Result of the GetBranch operation returned by the service. - `com.amazonaws.services.amplify.model.GetBranchResult`"
  (^com.amazonaws.services.amplify.model.GetBranchResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.GetBranchRequest request]
    (-> this (.getBranch request))))

(defn delete-branch
  "Description copied from interface: AWSAmplify

  request - Request structure for delete branch request. - `com.amazonaws.services.amplify.model.DeleteBranchRequest`

  returns: Result of the DeleteBranch operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteBranchResult`"
  (^com.amazonaws.services.amplify.model.DeleteBranchResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.DeleteBranchRequest request]
    (-> this (.deleteBranch request))))

(defn start-deployment
  "Description copied from interface: AWSAmplify

  request - Request structure for start a deployment. - `com.amazonaws.services.amplify.model.StartDeploymentRequest`

  returns: Result of the StartDeployment operation returned by the service. - `com.amazonaws.services.amplify.model.StartDeploymentResult`"
  (^com.amazonaws.services.amplify.model.StartDeploymentResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.StartDeploymentRequest request]
    (-> this (.startDeployment request))))

(defn create-deployment
  "Description copied from interface: AWSAmplify

  request - Request structure for create a new deployment. - `com.amazonaws.services.amplify.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.amplify.model.CreateDeploymentResult`"
  (^com.amazonaws.services.amplify.model.CreateDeploymentResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn shutdown
  "Description copied from interface: AWSAmplify"
  ([^AbstractAWSAmplify this]
    (-> this (.shutdown))))

(defn update-webhook
  "Description copied from interface: AWSAmplify

  request - Request structure for update webhook request. - `com.amazonaws.services.amplify.model.UpdateWebhookRequest`

  returns: Result of the UpdateWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateWebhookResult`"
  (^com.amazonaws.services.amplify.model.UpdateWebhookResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.UpdateWebhookRequest request]
    (-> this (.updateWebhook request))))

(defn list-domain-associations
  "Description copied from interface: AWSAmplify

  request - Request structure for the list Domain Associations request. - `com.amazonaws.services.amplify.model.ListDomainAssociationsRequest`

  returns: Result of the ListDomainAssociations operation returned by the service. - `com.amazonaws.services.amplify.model.ListDomainAssociationsResult`"
  (^com.amazonaws.services.amplify.model.ListDomainAssociationsResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.ListDomainAssociationsRequest request]
    (-> this (.listDomainAssociations request))))

(defn delete-app
  "Description copied from interface: AWSAmplify

  request - Request structure for an Amplify App delete request. - `com.amazonaws.services.amplify.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteAppResult`"
  (^com.amazonaws.services.amplify.model.DeleteAppResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.DeleteAppRequest request]
    (-> this (.deleteApp request))))

(defn list-jobs
  "Description copied from interface: AWSAmplify

  request - Request structure for list job request. - `com.amazonaws.services.amplify.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.amplify.model.ListJobsResult`"
  (^com.amazonaws.services.amplify.model.ListJobsResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn get-app
  "Description copied from interface: AWSAmplify

  request - Request structure for get App request. - `com.amazonaws.services.amplify.model.GetAppRequest`

  returns: Result of the GetApp operation returned by the service. - `com.amazonaws.services.amplify.model.GetAppResult`"
  (^com.amazonaws.services.amplify.model.GetAppResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.GetAppRequest request]
    (-> this (.getApp request))))

(defn list-webhooks
  "Description copied from interface: AWSAmplify

  request - Request structure for the list webhooks request. - `com.amazonaws.services.amplify.model.ListWebhooksRequest`

  returns: Result of the ListWebhooks operation returned by the service. - `com.amazonaws.services.amplify.model.ListWebhooksResult`"
  (^com.amazonaws.services.amplify.model.ListWebhooksResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.ListWebhooksRequest request]
    (-> this (.listWebhooks request))))

(defn get-domain-association
  "Description copied from interface: AWSAmplify

  request - Request structure for the get Domain Association request. - `com.amazonaws.services.amplify.model.GetDomainAssociationRequest`

  returns: Result of the GetDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.GetDomainAssociationResult`"
  (^com.amazonaws.services.amplify.model.GetDomainAssociationResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.GetDomainAssociationRequest request]
    (-> this (.getDomainAssociation request))))

(defn delete-domain-association
  "Description copied from interface: AWSAmplify

  request - Request structure for the delete Domain Association request. - `com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest`

  returns: Result of the DeleteDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteDomainAssociationResult`"
  (^com.amazonaws.services.amplify.model.DeleteDomainAssociationResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest request]
    (-> this (.deleteDomainAssociation request))))

(defn stop-job
  "Description copied from interface: AWSAmplify

  request - Request structure for stop job request. - `com.amazonaws.services.amplify.model.StopJobRequest`

  returns: Result of the StopJob operation returned by the service. - `com.amazonaws.services.amplify.model.StopJobResult`"
  (^com.amazonaws.services.amplify.model.StopJobResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.StopJobRequest request]
    (-> this (.stopJob request))))

(defn create-webhook
  "Description copied from interface: AWSAmplify

  request - Request structure for create webhook request. - `com.amazonaws.services.amplify.model.CreateWebhookRequest`

  returns: Result of the CreateWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.CreateWebhookResult`"
  (^com.amazonaws.services.amplify.model.CreateWebhookResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.CreateWebhookRequest request]
    (-> this (.createWebhook request))))

(defn list-branches
  "Description copied from interface: AWSAmplify

  request - Request structure for list branches request. - `com.amazonaws.services.amplify.model.ListBranchesRequest`

  returns: Result of the ListBranches operation returned by the service. - `com.amazonaws.services.amplify.model.ListBranchesResult`"
  (^com.amazonaws.services.amplify.model.ListBranchesResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.ListBranchesRequest request]
    (-> this (.listBranches request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSAmplify

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSAmplify this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-app
  "Description copied from interface: AWSAmplify

  request - Request structure for update App request. - `com.amazonaws.services.amplify.model.UpdateAppRequest`

  returns: Result of the UpdateApp operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateAppResult`"
  (^com.amazonaws.services.amplify.model.UpdateAppResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.UpdateAppRequest request]
    (-> this (.updateApp request))))

(defn create-domain-association
  "Description copied from interface: AWSAmplify

  request - Request structure for create Domain Association request. - `com.amazonaws.services.amplify.model.CreateDomainAssociationRequest`

  returns: Result of the CreateDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.CreateDomainAssociationResult`"
  (^com.amazonaws.services.amplify.model.CreateDomainAssociationResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.CreateDomainAssociationRequest request]
    (-> this (.createDomainAssociation request))))

(defn tag-resource
  "Description copied from interface: AWSAmplify

  request - Request structure used to tag resource. - `com.amazonaws.services.amplify.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.amplify.model.TagResourceResult`"
  (^com.amazonaws.services.amplify.model.TagResourceResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn start-job
  "Description copied from interface: AWSAmplify

  request - Request structure for Start job request. - `com.amazonaws.services.amplify.model.StartJobRequest`

  returns: Result of the StartJob operation returned by the service. - `com.amazonaws.services.amplify.model.StartJobResult`"
  (^com.amazonaws.services.amplify.model.StartJobResult [^AbstractAWSAmplify this ^com.amazonaws.services.amplify.model.StartJobRequest request]
    (-> this (.startJob request))))

