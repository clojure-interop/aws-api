(ns com.amazonaws.services.amplify.AWSAmplifyClient
  "Client for accessing Amplify. All service calls made using this client are blocking, and will not return until the
  service call completes.


  Amplify is a fully managed continuous deployment and hosting service for modern web apps."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.amplify AWSAmplifyClient]))

(defn *builder
  "returns: `com.amazonaws.services.amplify.AWSAmplifyClientBuilder`"
  (^com.amazonaws.services.amplify.AWSAmplifyClientBuilder []
    (AWSAmplifyClient/builder )))

(defn create-app
  "Creates a new Amplify App.

  request - `com.amazonaws.services.amplify.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.amplify.model.CreateAppResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.CreateAppResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.CreateAppRequest request]
    (-> this (.createApp request))))

(defn list-tags-for-resource
  "List tags for resource.

  request - `com.amazonaws.services.amplify.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.amplify.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.amplify.model.InternalFailureException - Exception thrown when the service fails to perform an operation due to an internal issue."
  (^com.amazonaws.services.amplify.model.ListTagsForResourceResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-webhook
  "Deletes a webhook.

  request - `com.amazonaws.services.amplify.model.DeleteWebhookRequest`

  returns: Result of the DeleteWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteWebhookResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.DeleteWebhookResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhook request))))

(defn get-job
  "Get a job for a branch, part of an Amplify App.

  request - `com.amazonaws.services.amplify.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.amplify.model.GetJobResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.GetJobResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.GetJobRequest request]
    (-> this (.getJob request))))

(defn get-webhook
  "Retrieves webhook info that corresponds to a webhookId.

  request - `com.amazonaws.services.amplify.model.GetWebhookRequest`

  returns: Result of the GetWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.GetWebhookResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.GetWebhookResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.GetWebhookRequest request]
    (-> this (.getWebhook request))))

(defn list-apps
  "Lists existing Amplify Apps.

  request - `com.amazonaws.services.amplify.model.ListAppsRequest`

  returns: Result of the ListApps operation returned by the service. - `com.amazonaws.services.amplify.model.ListAppsResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.ListAppsResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.ListAppsRequest request]
    (-> this (.listApps request))))

(defn create-branch
  "Creates a new Branch for an Amplify App.

  request - `com.amazonaws.services.amplify.model.CreateBranchRequest`

  returns: Result of the CreateBranch operation returned by the service. - `com.amazonaws.services.amplify.model.CreateBranchResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.CreateBranchResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.CreateBranchRequest request]
    (-> this (.createBranch request))))

(defn untag-resource
  "Untag resource with resourceArn.

  request - `com.amazonaws.services.amplify.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.amplify.model.UntagResourceResult`

  throws: com.amazonaws.services.amplify.model.InternalFailureException - Exception thrown when the service fails to perform an operation due to an internal issue."
  (^com.amazonaws.services.amplify.model.UntagResourceResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-domain-association
  "Create a new DomainAssociation on an App

  request - `com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest`

  returns: Result of the UpdateDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateDomainAssociationResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.UpdateDomainAssociationResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest request]
    (-> this (.updateDomainAssociation request))))

(defn update-branch
  "Updates a branch for an Amplify App.

  request - `com.amazonaws.services.amplify.model.UpdateBranchRequest`

  returns: Result of the UpdateBranch operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateBranchResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.UpdateBranchResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.UpdateBranchRequest request]
    (-> this (.updateBranch request))))

(defn delete-job
  "Delete a job, for an Amplify branch, part of Amplify App.

  request - `com.amazonaws.services.amplify.model.DeleteJobRequest`

  returns: Result of the DeleteJob operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteJobResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.DeleteJobResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.DeleteJobRequest request]
    (-> this (.deleteJob request))))

(defn get-branch
  "Retrieves a branch for an Amplify App.

  request - `com.amazonaws.services.amplify.model.GetBranchRequest`

  returns: Result of the GetBranch operation returned by the service. - `com.amazonaws.services.amplify.model.GetBranchResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.GetBranchResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.GetBranchRequest request]
    (-> this (.getBranch request))))

(defn delete-branch
  "Deletes a branch for an Amplify App.

  request - `com.amazonaws.services.amplify.model.DeleteBranchRequest`

  returns: Result of the DeleteBranch operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteBranchResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.DeleteBranchResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.DeleteBranchRequest request]
    (-> this (.deleteBranch request))))

(defn start-deployment
  "Start a deployment for manual deploy apps. (Apps are not connected to repository)

  request - `com.amazonaws.services.amplify.model.StartDeploymentRequest`

  returns: Result of the StartDeployment operation returned by the service. - `com.amazonaws.services.amplify.model.StartDeploymentResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.StartDeploymentResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.StartDeploymentRequest request]
    (-> this (.startDeployment request))))

(defn create-deployment
  "Create a deployment for manual deploy apps. (Apps are not connected to repository)

  request - `com.amazonaws.services.amplify.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.amplify.model.CreateDeploymentResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.CreateDeploymentResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn update-webhook
  "Update a webhook.

  request - `com.amazonaws.services.amplify.model.UpdateWebhookRequest`

  returns: Result of the UpdateWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateWebhookResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.UpdateWebhookResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.UpdateWebhookRequest request]
    (-> this (.updateWebhook request))))

(defn list-domain-associations
  "List domains with an app

  request - `com.amazonaws.services.amplify.model.ListDomainAssociationsRequest`

  returns: Result of the ListDomainAssociations operation returned by the service. - `com.amazonaws.services.amplify.model.ListDomainAssociationsResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.ListDomainAssociationsResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.ListDomainAssociationsRequest request]
    (-> this (.listDomainAssociations request))))

(defn delete-app
  "Delete an existing Amplify App by appId.

  request - `com.amazonaws.services.amplify.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteAppResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.DeleteAppResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.DeleteAppRequest request]
    (-> this (.deleteApp request))))

(defn list-jobs
  "List Jobs for a branch, part of an Amplify App.

  request - `com.amazonaws.services.amplify.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.amplify.model.ListJobsResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.ListJobsResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn get-app
  "Retrieves an existing Amplify App by appId.

  request - `com.amazonaws.services.amplify.model.GetAppRequest`

  returns: Result of the GetApp operation returned by the service. - `com.amazonaws.services.amplify.model.GetAppResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.GetAppResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.GetAppRequest request]
    (-> this (.getApp request))))

(defn list-webhooks
  "List webhooks with an app.

  request - `com.amazonaws.services.amplify.model.ListWebhooksRequest`

  returns: Result of the ListWebhooks operation returned by the service. - `com.amazonaws.services.amplify.model.ListWebhooksResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.ListWebhooksResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.ListWebhooksRequest request]
    (-> this (.listWebhooks request))))

(defn get-domain-association
  "Retrieves domain info that corresponds to an appId and domainName.

  request - `com.amazonaws.services.amplify.model.GetDomainAssociationRequest`

  returns: Result of the GetDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.GetDomainAssociationResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.GetDomainAssociationResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.GetDomainAssociationRequest request]
    (-> this (.getDomainAssociation request))))

(defn delete-domain-association
  "Deletes a DomainAssociation.

  request - `com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest`

  returns: Result of the DeleteDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.DeleteDomainAssociationResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.DeleteDomainAssociationResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest request]
    (-> this (.deleteDomainAssociation request))))

(defn stop-job
  "Stop a job that is in progress, for an Amplify branch, part of Amplify App.

  request - `com.amazonaws.services.amplify.model.StopJobRequest`

  returns: Result of the StopJob operation returned by the service. - `com.amazonaws.services.amplify.model.StopJobResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.StopJobResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.StopJobRequest request]
    (-> this (.stopJob request))))

(defn create-webhook
  "Create a new webhook on an App.

  request - `com.amazonaws.services.amplify.model.CreateWebhookRequest`

  returns: Result of the CreateWebhook operation returned by the service. - `com.amazonaws.services.amplify.model.CreateWebhookResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.CreateWebhookResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.CreateWebhookRequest request]
    (-> this (.createWebhook request))))

(defn list-branches
  "Lists branches for an Amplify App.

  request - `com.amazonaws.services.amplify.model.ListBranchesRequest`

  returns: Result of the ListBranches operation returned by the service. - `com.amazonaws.services.amplify.model.ListBranchesResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.ListBranchesResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.ListBranchesRequest request]
    (-> this (.listBranches request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSAmplifyClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-app
  "Updates an existing Amplify App.

  request - `com.amazonaws.services.amplify.model.UpdateAppRequest`

  returns: Result of the UpdateApp operation returned by the service. - `com.amazonaws.services.amplify.model.UpdateAppResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.UpdateAppResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.UpdateAppRequest request]
    (-> this (.updateApp request))))

(defn create-domain-association
  "Create a new DomainAssociation on an App

  request - `com.amazonaws.services.amplify.model.CreateDomainAssociationRequest`

  returns: Result of the CreateDomainAssociation operation returned by the service. - `com.amazonaws.services.amplify.model.CreateDomainAssociationResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.CreateDomainAssociationResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.CreateDomainAssociationRequest request]
    (-> this (.createDomainAssociation request))))

(defn tag-resource
  "Tag resource with tag key and value.

  request - `com.amazonaws.services.amplify.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.amplify.model.TagResourceResult`

  throws: com.amazonaws.services.amplify.model.InternalFailureException - Exception thrown when the service fails to perform an operation due to an internal issue."
  (^com.amazonaws.services.amplify.model.TagResourceResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn start-job
  "Starts a new job for a branch, part of an Amplify App.

  request - `com.amazonaws.services.amplify.model.StartJobRequest`

  returns: Result of the StartJob operation returned by the service. - `com.amazonaws.services.amplify.model.StartJobResult`

  throws: com.amazonaws.services.amplify.model.BadRequestException - Exception thrown when a request contains unexpected data."
  (^com.amazonaws.services.amplify.model.StartJobResult [^AWSAmplifyClient this ^com.amazonaws.services.amplify.model.StartJobRequest request]
    (-> this (.startJob request))))

