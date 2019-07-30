(ns com.amazonaws.services.amplify.AWSAmplify
  "Interface for accessing Amplify.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSAmplify instead.



  Amplify is a fully managed continuous deployment and hosting service for modern web apps."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.amplify AWSAmplify]))

(defn create-app
  "Creates a new Amplify App.

  create-app-request - Request structure used to create Apps in Amplify. - `com.amazonaws.services.amplify.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.amplify.model.CreateAppResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.CreateAppResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.CreateAppRequest create-app-request]
    (-> this (.createApp create-app-request))))

(defn list-tags-for-resource
  "List tags for resource.

  list-tags-for-resource-request - Request structure used to list tags for resource. - `com.amazonaws.services.amplify.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.amplify.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.amplify.model.InternalFailureException - Exception thrown when the service fails to perform an operation due to an internal issue."
  (^com.amazonaws.services.amplify.model.ListTagsForResourceResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn delete-webhook
  "Deletes a webhook.

  delete-webhook-request - Request structure for the delete webhook request. - `com.amazonaws.services.amplify.model.DeleteWebhookRequest`

  returns: Result of the DeleteWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteWebhookResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.DeleteWebhookResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.DeleteWebhookRequest delete-webhook-request]
    (-> this (.deleteWebhook delete-webhook-request))))

(defn get-job
  "Get a job for a branch, part of an Amplify App.

  get-job-request - Request structure for get job request. - `com.amazonaws.services.amplify.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.amplify.model.GetJobResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.GetJobResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.GetJobRequest get-job-request]
    (-> this (.getJob get-job-request))))

(defn get-webhook
  "Retrieves webhook info that corresponds to a webhookId.

  get-webhook-request - Request structure for the get webhook request. - `com.amazonaws.services.amplify.model.GetWebhookRequest`

  returns: Result of the GetWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.GetWebhookResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.GetWebhookResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.GetWebhookRequest get-webhook-request]
    (-> this (.getWebhook get-webhook-request))))

(defn list-apps
  "Lists existing Amplify Apps.

  list-apps-request - Request structure for an Amplify App list request. - `com.amazonaws.services.amplify.model.ListAppsRequest`

  returns: Result of the ListApps operation returned by the service. - `com.amazonaws.services.amplify.model.ListAppsResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.ListAppsResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.ListAppsRequest list-apps-request]
    (-> this (.listApps list-apps-request))))

(defn create-branch
  "Creates a new Branch for an Amplify App.

  create-branch-request - Request structure for a branch create request. - `com.amazonaws.services.amplify.model.CreateBranchRequest`

  returns: Result of the CreateBranch operation returned by the service. - `com.amazonaws.services.amplify.model.CreateBranchResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.CreateBranchResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.CreateBranchRequest create-branch-request]
    (-> this (.createBranch create-branch-request))))

(defn untag-resource
  "Untag resource with resourceArn.

  untag-resource-request - Request structure used to untag resource. - `com.amazonaws.services.amplify.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.amplify.model.UntagResourceResult`

  throws: com.amazonaws.services.amplify.model.InternalFailureException - Exception thrown when the service fails to perform an operation due to an internal issue."
  (^com.amazonaws.services.amplify.model.UntagResourceResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn update-domain-association
  "Create a new DomainAssociation on an App

  update-domain-association-request - Request structure for update Domain Association request. - `com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest`

  returns: Result of the UpdateDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateDomainAssociationResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.UpdateDomainAssociationResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest update-domain-association-request]
    (-> this (.updateDomainAssociation update-domain-association-request))))

(defn update-branch
  "Updates a branch for an Amplify App.

  update-branch-request - Request structure for update branch request. - `com.amazonaws.services.amplify.model.UpdateBranchRequest`

  returns: Result of the UpdateBranch operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateBranchResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.UpdateBranchResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.UpdateBranchRequest update-branch-request]
    (-> this (.updateBranch update-branch-request))))

(defn delete-job
  "Delete a job, for an Amplify branch, part of Amplify App.

  delete-job-request - Request structure for delete job request. - `com.amazonaws.services.amplify.model.DeleteJobRequest`

  returns: Result of the DeleteJob operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteJobResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.DeleteJobResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.DeleteJobRequest delete-job-request]
    (-> this (.deleteJob delete-job-request))))

(defn get-branch
  "Retrieves a branch for an Amplify App.

  get-branch-request - Result structure for get branch request. - `com.amazonaws.services.amplify.model.GetBranchRequest`

  returns: Result of the GetBranch operation returned by the service. - `com.amazonaws.services.amplify.model.GetBranchResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.GetBranchResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.GetBranchRequest get-branch-request]
    (-> this (.getBranch get-branch-request))))

(defn delete-branch
  "Deletes a branch for an Amplify App.

  delete-branch-request - Request structure for delete branch request. - `com.amazonaws.services.amplify.model.DeleteBranchRequest`

  returns: Result of the DeleteBranch operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteBranchResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.DeleteBranchResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.DeleteBranchRequest delete-branch-request]
    (-> this (.deleteBranch delete-branch-request))))

(defn start-deployment
  "Start a deployment for manual deploy apps. (Apps are not connected to repository)

  start-deployment-request - Request structure for start a deployment. - `com.amazonaws.services.amplify.model.StartDeploymentRequest`

  returns: Result of the StartDeployment operation returned by the service. - `com.amazonaws.services.amplify.model.StartDeploymentResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.StartDeploymentResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.StartDeploymentRequest start-deployment-request]
    (-> this (.startDeployment start-deployment-request))))

(defn create-deployment
  "Create a deployment for manual deploy apps. (Apps are not connected to repository)

  create-deployment-request - Request structure for create a new deployment. - `com.amazonaws.services.amplify.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.amplify.model.CreateDeploymentResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.CreateDeploymentResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeployment create-deployment-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSAmplify this]
    (-> this (.shutdown))))

(defn update-webhook
  "Update a webhook.

  update-webhook-request - Request structure for update webhook request. - `com.amazonaws.services.amplify.model.UpdateWebhookRequest`

  returns: Result of the UpdateWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateWebhookResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.UpdateWebhookResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.UpdateWebhookRequest update-webhook-request]
    (-> this (.updateWebhook update-webhook-request))))

(defn list-domain-associations
  "List domains with an app

  list-domain-associations-request - Request structure for the list Domain Associations request. - `com.amazonaws.services.amplify.model.ListDomainAssociationsRequest`

  returns: Result of the ListDomainAssociations operation returned by the service. - `com.amazonaws.services.amplify.model.ListDomainAssociationsResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.ListDomainAssociationsResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.ListDomainAssociationsRequest list-domain-associations-request]
    (-> this (.listDomainAssociations list-domain-associations-request))))

(defn delete-app
  "Delete an existing Amplify App by appId.

  delete-app-request - Request structure for an Amplify App delete request. - `com.amazonaws.services.amplify.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteAppResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.DeleteAppResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.DeleteAppRequest delete-app-request]
    (-> this (.deleteApp delete-app-request))))

(defn list-jobs
  "List Jobs for a branch, part of an Amplify App.

  list-jobs-request - Request structure for list job request. - `com.amazonaws.services.amplify.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.amplify.model.ListJobsResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.ListJobsResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobs list-jobs-request))))

(defn get-app
  "Retrieves an existing Amplify App by appId.

  get-app-request - Request structure for get App request. - `com.amazonaws.services.amplify.model.GetAppRequest`

  returns: Result of the GetApp operation returned by the service. - `com.amazonaws.services.amplify.model.GetAppResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.GetAppResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.GetAppRequest get-app-request]
    (-> this (.getApp get-app-request))))

(defn list-webhooks
  "List webhooks with an app.

  list-webhooks-request - Request structure for the list webhooks request. - `com.amazonaws.services.amplify.model.ListWebhooksRequest`

  returns: Result of the ListWebhooks operation returned by the service. - `com.amazonaws.services.amplify.model.ListWebhooksResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.ListWebhooksResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.ListWebhooksRequest list-webhooks-request]
    (-> this (.listWebhooks list-webhooks-request))))

(defn get-domain-association
  "Retrieves domain info that corresponds to an appId and domainName.

  get-domain-association-request - Request structure for the get Domain Association request. - `com.amazonaws.services.amplify.model.GetDomainAssociationRequest`

  returns: Result of the GetDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.GetDomainAssociationResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.GetDomainAssociationResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.GetDomainAssociationRequest get-domain-association-request]
    (-> this (.getDomainAssociation get-domain-association-request))))

(defn delete-domain-association
  "Deletes a DomainAssociation.

  delete-domain-association-request - Request structure for the delete Domain Association request. - `com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest`

  returns: Result of the DeleteDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteDomainAssociationResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.DeleteDomainAssociationResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest delete-domain-association-request]
    (-> this (.deleteDomainAssociation delete-domain-association-request))))

(defn stop-job
  "Stop a job that is in progress, for an Amplify branch, part of Amplify App.

  stop-job-request - Request structure for stop job request. - `com.amazonaws.services.amplify.model.StopJobRequest`

  returns: Result of the StopJob operation returned by the service. - `com.amazonaws.services.amplify.model.StopJobResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.StopJobResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.StopJobRequest stop-job-request]
    (-> this (.stopJob stop-job-request))))

(defn create-webhook
  "Create a new webhook on an App.

  create-webhook-request - Request structure for create webhook request. - `com.amazonaws.services.amplify.model.CreateWebhookRequest`

  returns: Result of the CreateWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.CreateWebhookResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.CreateWebhookResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.CreateWebhookRequest create-webhook-request]
    (-> this (.createWebhook create-webhook-request))))

(defn list-branches
  "Lists branches for an Amplify App.

  list-branches-request - Request structure for list branches request. - `com.amazonaws.services.amplify.model.ListBranchesRequest`

  returns: Result of the ListBranches operation returned by the service. - `com.amazonaws.services.amplify.model.ListBranchesResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.ListBranchesResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.ListBranchesRequest list-branches-request]
    (-> this (.listBranches list-branches-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSAmplify this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-app
  "Updates an existing Amplify App.

  update-app-request - Request structure for update App request. - `com.amazonaws.services.amplify.model.UpdateAppRequest`

  returns: Result of the UpdateApp operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateAppResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.UpdateAppResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.UpdateAppRequest update-app-request]
    (-> this (.updateApp update-app-request))))

(defn create-domain-association
  "Create a new DomainAssociation on an App

  create-domain-association-request - Request structure for create Domain Association request. - `com.amazonaws.services.amplify.model.CreateDomainAssociationRequest`

  returns: Result of the CreateDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.CreateDomainAssociationResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.CreateDomainAssociationResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.CreateDomainAssociationRequest create-domain-association-request]
    (-> this (.createDomainAssociation create-domain-association-request))))

(defn tag-resource
  "Tag resource with tag key and value.

  tag-resource-request - Request structure used to tag resource. - `com.amazonaws.services.amplify.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.amplify.model.TagResourceResult`

  throws: com.amazonaws.services.amplify.model.InternalFailureException - Exception thrown when the service fails to perform an operation due to an internal issue."
  (^com.amazonaws.services.amplify.model.TagResourceResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn start-job
  "Starts a new job for a branch, part of an Amplify App.

  start-job-request - Request structure for Start job request. - `com.amazonaws.services.amplify.model.StartJobRequest`

  returns: Result of the StartJob operation returned by the service. - `com.amazonaws.services.amplify.model.StartJobResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.StartJobResult [^AWSAmplify this ^com.amazonaws.services.amplify.model.StartJobRequest start-job-request]
    (-> this (.startJob start-job-request))))

